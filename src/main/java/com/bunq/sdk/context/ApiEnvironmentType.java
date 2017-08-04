package com.bunq.sdk.context;

import com.bunq.sdk.exception.UncaughtExceptionError;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Enum for the API environment types and their URIs.
 */
public enum ApiEnvironmentType {

  PRODUCTION("https://api.bunq.com/v1/"),
  SANDBOX("https://sandbox.public.api.bunq.com/v1/");

  /**
   * Base URI of each given environment.
   */
  private String baseUri;

  ApiEnvironmentType(String baseUri) {
    this.baseUri = baseUri;
  }

  /**
   * @return Base URI of the environment.
   */
  URI getBaseUri() {
    try {
      return new URI(this.baseUri);
    } catch (URISyntaxException exception) {
      throw new UncaughtExceptionError(exception);
    }
  }

}