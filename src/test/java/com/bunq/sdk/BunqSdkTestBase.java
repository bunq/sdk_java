package com.bunq.sdk;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.ApiEnvironmentType;
import com.bunq.sdk.exception.ApiException;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.generated.User;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Base class for the Bunq SDK tests.
 */
public class BunqSdkTestBase {

  /**
   * Description of the test device for Java SDK.
   */
  private static final String DEVICE_DESCRIPTION = "Java test device";

  /**
   * Config fields.
   */
  private static final String FIELD_API_KEY = "API_KEY";
  private static final String FIELD_PERMITTED_IPS = "PERMITTED_IPS";
  private static final String FIELD_API_CONFIG_PATH = "API_CONFIG_PATH";

  /**
   * Delimiter between the IP addresses in the PERMITTED_IPS field.
   */
  private static final String DELIMITER_IPS = ", ";

  /**
   * Properties for the tests.
   */
  private static Properties config = TestConfig.prop();

  /**
   * Individual properties.
   */
  private static String apiKey = config.getProperty(FIELD_API_KEY);
  private static String[] permittedIps = config.getProperty(FIELD_PERMITTED_IPS).split(
      DELIMITER_IPS);
  private static String apiConfigPath = config.getProperty(FIELD_API_CONFIG_PATH);

  /**
   * Based on the result of isSessionActive will create a new ApiContext or restore an old conf
   * file
   */
  protected static ApiContext getApiContext() {
    ApiContext apiContext;

    try {
      apiContext = ApiContext.restore(apiConfigPath);
      User.list(apiContext);
    } catch (ApiException | BunqException exception) {
      List<String> ips = Arrays.asList(permittedIps);
      apiContext = ApiContext.create(ApiEnvironmentType.SANDBOX, apiKey, DEVICE_DESCRIPTION, ips);
    }

    apiContext.save();

    return apiContext;
  }

} 
