package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.ApiEnvironmentType;
import com.bunq.sdk.exception.ApiException;
import com.bunq.sdk.exception.BunqException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Checks if the sessionToken stored in the conf file is still valid, if not it will generate a new
 * one
 */
public class ApiContextHandler {

  /**
   * Config fields
   */
  private static final String DEVICE_DESCRIPTION = "Java test case";
  private static final String FIELD_API_KEY = "API_KEY";
  private static final String FIELD_PERMITTED_IPS = "PERMITTED_IPS";
  private static final String FIELD_API_CONFIG_PATH = "API_CONFIG_PATH";
  private static final String DELIMITER_IPS = ", ";
  private static Properties config = TestConfig.prop();

  private static String apiKey = config.getProperty(FIELD_API_KEY);
  private static String[] permittedIps = config.getProperty(FIELD_PERMITTED_IPS).split(
      DELIMITER_IPS);
  private static String apiConfigPath = config.getProperty(FIELD_API_CONFIG_PATH);

  /**
   * Based on the result of isSessionActive will create a new ApiContext or restore an old conf
   * file
   */
  public static ApiContext getApiContext() {
    ApiContext apiContext;

    if (isSessionActive()) {
      apiContext = ApiContext.restore(apiConfigPath);
    } else {
      List<String> ips = Arrays.asList(permittedIps);
      apiContext = ApiContext.create(ApiEnvironmentType.SANDBOX, apiKey, DEVICE_DESCRIPTION, ips);
      apiContext.save();
    }

    return apiContext;
  }

  /**
   * Checks if the session is active by making an API call and see if an Api/Bunq exception is
   * thrown
   */
  private static boolean isSessionActive() {
    try {
      User.list(ApiContext.restore(apiConfigPath));

      return true;
    } catch (ApiException|BunqException exception) {
      return false;
    }
  }

} 
