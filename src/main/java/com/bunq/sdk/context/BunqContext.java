package com.bunq.sdk.context;

import com.bunq.sdk.exception.BunqException;

public final class BunqContext {

  /**
   * Error constatns.
   */
  private static final String ERROR_API_CONTEXT_HAS_NOT_BEEN_SET = "Api context has not been set";
  private static final String ERROR_USER_CONTEXT_HAS_NOT_BEEN_SET = "UserContext has not been set";

  private static ApiContext apiContext;
  private static UserContext userContext;

  public static void loadApiContext(ApiContext apiContext) {
    BunqContext.apiContext = apiContext;
    BunqContext.userContext = new UserContext(apiContext);
  }

  public static ApiContext getApiContext() {
    if (apiContext == null) {
      throw new BunqException(ERROR_API_CONTEXT_HAS_NOT_BEEN_SET);
    }

    return apiContext;
  }

  public static UserContext getUserContext() {
    if (userContext == null) {
      throw new BunqException(ERROR_USER_CONTEXT_HAS_NOT_BEEN_SET);
    }

    return userContext;
  }
}
