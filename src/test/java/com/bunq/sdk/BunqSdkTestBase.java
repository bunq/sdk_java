package com.bunq.sdk;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.ApiEnvironmentType;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.exception.BunqException;
import org.junit.BeforeClass;

import java.util.Arrays;
import java.util.List;

/**
 * Base class for the Bunq SDK tests.
 */
public class BunqSdkTestBase {

  /**
   * Description of the test device for Java SDK.
   */
  private static final String DEVICE_DESCRIPTION = "Java test device";

  /**
   * Individual properties.
   */
  private static String apiKey = Config.getApiKey();
  private static String[] permittedIps = Config.getPermittedIps();
  private static String apiConfigPath = Config.getApiConfigPath();

  @BeforeClass
  public static void setUp() {
    BunqContext.loadApiContext(getApiContext());
  }

  /**
   * Based on the result of isSessionActive will create a new ApiContext or restore an old conf
   * file
   */
  protected static ApiContext getApiContext() {
    ApiContext apiContext;

    try {
      apiContext = ApiContext.restore(apiConfigPath);
      apiContext.ensureSessionActive();
    } catch (BunqException exception) {
      List<String> ips = Arrays.asList(permittedIps);
      apiContext = ApiContext.create(ApiEnvironmentType.SANDBOX, apiKey, DEVICE_DESCRIPTION, ips);
    }

    apiContext.save(apiConfigPath);

    return apiContext;
  }

} 
