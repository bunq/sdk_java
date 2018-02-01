package com.bunq.sdk.http;

import com.bunq.sdk.exception.BunqException;

public enum HttpMethod {
  GET("GET"), POST("POST"), PUT("PUT"), DELETE("DELETE");

  private String method;

  HttpMethod(String method) {
    this.method = method;
  }

  public String getMethodSrring() {
    return method;
  }

  public static HttpMethod createFromMethodString(String methodString) {
    switch (methodString) {
      case "GET":
        return HttpMethod.GET;
      case "POST":
        return HttpMethod.POST;
      case "DELETE":
        return HttpMethod.DELETE;
      case "PUT":
        return HttpMethod.PUT;
      default:
        throw new BunqException(String.format("The method \"%s\" is unexpected", methodString));
    }
  }
}
