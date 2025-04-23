package com.bunq.sdk.context;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.SessionServer;
import com.bunq.sdk.model.generated.endpoint.UserApiKeyApiObject;
import com.bunq.sdk.model.generated.endpoint.UserCompanyApiObject;
import com.bunq.sdk.model.generated.endpoint.UserPaymentServiceProviderApiObject;
import com.bunq.sdk.model.generated.endpoint.UserPersonApiObject;
import com.bunq.sdk.util.BunqUtil;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Context of your current bunq Public API session.
 */
public class SessionContext implements java.io.Serializable {

    /**
     * Error constants.
     */
    private static final String ERROR_UNEXPECTED_USER_TYPE = "'%s' is an unexpected user type.";

    /**
     * Constant for converting milliseconds to seconds.
     */
    private static final int MILLISECONDS_IN_SECOND = 1000;

    /**
     * Session token returned as a response to POST /session-server.
     */
    @Expose
    @SerializedName("token")
    private final String token;

    /**
     * The time the session will expire.
     */
    @Expose
    @SerializedName("expiry_time")
    private final Date expiryTime;

    @Expose
    @SerializedName("user_id")
    private final Integer userId;

    @Expose
    @SerializedName("user_person")
    private final UserPersonApiObject userPerson;

    @Expose
    @SerializedName("user_company")
    private final UserCompanyApiObject userCompany;

    @Expose
    @SerializedName("user_api_key")
    private final UserApiKeyApiObject userApiKey;

    @Expose
    @SerializedName("user_payment_service_provider")
    private final UserPaymentServiceProviderApiObject userPaymentServiceProvider;

    /**
     * @param sessionServer Object containing the session info.
     */
    SessionContext(SessionServer sessionServer) {
        this.token = sessionServer.getSessionToken().getToken();
        this.expiryTime = calculateExpiryTime(sessionServer);
        this.userId = getUserId(sessionServer.getReferencedUser());
        this.userPerson = sessionServer.getUserPersonOrNull();
        this.userCompany = sessionServer.getUserCompanyOrNull();
        this.userApiKey = sessionServer.getUserApiKeyOrNull();
        this.userPaymentServiceProvider = sessionServer.getUserPaymentServiceProviderOrNull();
    }

    private int getUserId(BunqModel user) {
        if (user instanceof UserPersonApiObject) {
            return ((UserPersonApiObject) user).getId();
        } else if (user instanceof UserCompanyApiObject) {
            return ((UserCompanyApiObject) user).getId();
        } else if (user instanceof UserApiKeyApiObject) {
            return ((UserApiKeyApiObject) user).getId();
        } else if (user instanceof UserPaymentServiceProviderApiObject) {
            return ((UserPaymentServiceProviderApiObject) user).getId();
        } else {
            throw new BunqException(String.format(ERROR_UNEXPECTED_USER_TYPE, user.getClass().toString()));
        }
    }

    private static Date calculateExpiryTime(SessionServer sessionServer) {
        Date expiryTime = new Date();
        long sessionTimeoutMilliseconds = getSessionTimeout(sessionServer) * MILLISECONDS_IN_SECOND;
        expiryTime.setTime(expiryTime.getTime() + sessionTimeoutMilliseconds);

        return expiryTime;
    }

    private static int getSessionTimeout(SessionServer sessionServer) {
        BunqModel user = sessionServer.getReferencedUser();

        if (user instanceof UserApiKeyApiObject) {
            BunqModel referencedUser = ((UserApiKeyApiObject) user).getRequestedByUser().getReferencedObject();

            return getSessionTimeOutFromUser(referencedUser);
        } else {
            return getSessionTimeOutFromUser(user);
        }
    }

    private static int getSessionTimeOutFromUser(BunqModel user) {
        if (user instanceof UserCompanyApiObject) {
            return ((UserCompanyApiObject) user).getSessionTimeout();
        } else if (user instanceof UserPersonApiObject) {
            return ((UserPersonApiObject) user).getSessionTimeout();
        } else if (user instanceof UserPaymentServiceProviderApiObject) {
            return ((UserPaymentServiceProviderApiObject) user).getSessionTimeout();
        } else {
            throw new BunqException(ERROR_UNEXPECTED_USER_TYPE);
        }
    }

    String getToken() {
        return token;
    }

    Date getExpiryTime() {
        return expiryTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public BunqModel getUserReference() {
        return BunqUtil.getReferencedUser(userPerson, userCompany, userApiKey, userPaymentServiceProvider);
    }
}
