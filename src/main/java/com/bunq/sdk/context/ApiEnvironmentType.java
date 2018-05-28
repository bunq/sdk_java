package com.bunq.sdk.context;

/**
 * Enum for the API environment types and their URIs.
 */
public enum ApiEnvironmentType {

  PRODUCTION("api.bunq.com", "v1"),
  SANDBOX("sandbox.public.api.bunq.com", "v1");

  /**
   * Base URI of each given environment.
   */
  private String baseUri;
  private String apiVersion;

  ApiEnvironmentType(String baseUri, String apiVersion) {
    this.baseUri = baseUri;
    this.apiVersion = apiVersion;
  }

  /**
   * @return Base URI of the environment.
   */
  public String getBaseUri() {
    return this.baseUri;
  }

  public String getApiVersion() {
    return this.apiVersion;
  }

}