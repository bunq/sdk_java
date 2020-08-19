package com.bunq.sdk.context;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.SessionServer;
import com.bunq.sdk.model.generated.endpoint.UserApiKey;
import com.bunq.sdk.model.generated.endpoint.UserCompany;
import com.bunq.sdk.model.generated.endpoint.UserPaymentServiceProvider;
import com.bunq.sdk.model.generated.endpoint.UserPerson;
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

    /**
     * @param sessionServer Object containing the session info.
     */
    SessionContext(SessionServer sessionServer) {
        this.token = sessionServer.getSessionToken().getToken();
        this.expiryTime = calculateExpiryTime(sessionServer);
        this.userId = getUserId(sessionServer.getReferencedUser());
    }

    private int getUserId(BunqModel user) {
        if (user instanceof UserPerson) {
            return ((UserPerson) user).getId();
        } else if (user instanceof UserCompany) {
            return ((UserCompany) user).getId();
        } else if (user instanceof UserApiKey) {
            return ((UserApiKey) user).getId();
        } else if (user instanceof UserPaymentServiceProvider) {
            return ((UserPaymentServiceProvider) user).getId();
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

        if (user instanceof UserApiKey) {
            BunqModel referencedUser = ((UserApiKey) user).getRequestedByUser().getReferencedObject();

            return getSessionTimeOutFromUser(referencedUser);
        } else {
            return getSessionTimeOutFromUser(user);
        }
    }

    private static int getSessionTimeOutFromUser(BunqModel user) {
        if (user instanceof UserCompany) {
            return ((UserCompany) user).getSessionTimeout();
        } else if (user instanceof UserPerson) {
            return ((UserPerson) user).getSessionTimeout();
        } else if (user instanceof UserPaymentServiceProvider) {
            return ((UserPaymentServiceProvider) user).getSessionTimeout();
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
}
