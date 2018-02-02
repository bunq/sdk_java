package com.bunq.sdk.http;

import com.bunq.sdk.exception.BunqException;

public enum HttpMethod {
  GET("GET"), POST("POST"), PUT("PUT"), DELETE("DELETE");

  /**
   * Error constant.
   */
  private static final String ERROR_UNEXPECTED_METHOD = "The method \"%s\" is unexpected";

  /**
   * Http method constants.
   */
  private static final String HTTP_METHOD_GET = "GET";
  private static final String HTTP_METHOD_POST = "POST";
  private static final String HTTP_METHOD_DELETE = "DELETE";
  private static final String HTTP_METHOD_PUT = "PUT";

  private String method;

  HttpMethod(String method) {
    this.method = method;
  }

  public String getMethodSrring() {
    return method;
  }

  public static HttpMethod createFromMethodString(String methodString) {
    switch (methodString) {
      case HTTP_METHOD_GET:
        return HttpMethod.GET;
      case HTTP_METHOD_POST:
        return HttpMethod.POST;
      case HTTP_METHOD_DELETE:
        return HttpMethod.DELETE;
      case HTTP_METHOD_PUT:
        return HttpMethod.PUT;
      default:
        throw new BunqException(String.format(ERROR_UNEXPECTED_METHOD, methodString));
    }
  }
}
