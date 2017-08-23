package com.bunq.sdk.context;

import static org.junit.Assert.assertEquals;

import com.bunq.sdk.BunqSdkTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests:
 * ApiConfig
 */
public class ApiConfigTest extends BunqSdkTestBase {

  /**
   * Path to a temporary context file.
   */
  private static final String CONTEXT_FILENAME_TEST = "context-save-restore-test.conf";

  private static ApiContext apiContext;

  @BeforeClass
  public static void setUpBeforeClass() {
    apiContext = getApiContext();
  }

  @Test
  public void apiContextSerializeDeserializeTest() {
    String apiContextJson = apiContext.toJson();
    ApiContext apiContextDeSerialised = ApiContext.fromJson(apiContextJson);

    assertEquals(apiContextJson, apiContextDeSerialised.toJson());
  }

  @Test
  public void apiContextSaveRestoreTest() {
    String apiContextJson = apiContext.toJson();
    apiContext.save(CONTEXT_FILENAME_TEST);
    ApiContext apiContextRestored = ApiContext.restore(CONTEXT_FILENAME_TEST);

    assertEquals(apiContextJson, apiContextRestored.toJson());
  }

}
