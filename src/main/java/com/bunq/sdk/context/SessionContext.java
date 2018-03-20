package com.bunq.sdk.context;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.SessionServer;
import com.bunq.sdk.model.generated.endpoint.UserCompany;
import com.bunq.sdk.model.generated.endpoint.UserPerson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

/**
 * Context of your current bunq Public API session.
 */
class SessionContext implements java.io.Serializable {

  /**
   * Error constants.
   */
  private static final String ERROR_UNEXPECTED_USER_TYPE = "Unexpected user type.";

  /**
   * Default assumed value for session timeout.
   */
  private static final int SESSION_TIMEOUT_DEFAULT = 0;

  /**
   * Constant for converting milliseconds to seconds.
   */
  private static final int MILLISECONDS_IN_SECOND = 1000;

  /**
   * Session token returned as a response to POST /session-server.
   */
  @Expose
  @SerializedName("token")
  private String token;

  /**
   * The time the session will expire.
   */
  @Expose
  @SerializedName("expiry_time")
  private Date expiryTime;

  @Expose
  @SerializedName("user_id")
  private Integer userId;

  /**
   * @param sessionServer Object containing the session info.
   */
  SessionContext(SessionServer sessionServer) {
    this.token = sessionServer.getSessionToken().getToken();
    this.expiryTime = calculateExpiryTime(sessionServer);
    this.userId = getUserId(sessionServer.getReferencedObject());
  }

  private Integer getUserId(BunqModel user) {
    if (user instanceof UserPerson) {
      return ((UserPerson) user).getId();
    } else if (user instanceof UserCompany) {
      return  ((UserCompany) user).getId();
    } else {
      throw new BunqException(ERROR_UNEXPECTED_USER_TYPE);
    }
  }

  private static Date calculateExpiryTime(SessionServer sessionServer) {
    Date expiryTime = new Date();
    long sessionTimeoutMilliseconds = getSessionTimeout(sessionServer) * MILLISECONDS_IN_SECOND;
    expiryTime.setTime(expiryTime.getTime() + sessionTimeoutMilliseconds);

    return expiryTime;
  }

  private static int getSessionTimeout(SessionServer sessionServer) {
    UserCompany userCompany = sessionServer.getUserCompany();

    if (userCompany != null) {
      return userCompany.getSessionTimeout();
    }

    UserPerson userPerson = sessionServer.getUserPerson();

    if (userPerson != null) {
      return userPerson.getSessionTimeout();
    }

    return SESSION_TIMEOUT_DEFAULT;
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
