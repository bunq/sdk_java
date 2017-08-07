package com.bunq.sdk.model.generated;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.TestConfig;
import com.bunq.sdk.context.ApiContext;
import java.util.HashMap;
import java.util.Properties;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * Tests:
 * MonetaryAccountBank
 */
public class MonetaryAccountBankTest extends BunqSdkTestBase {

  /**
   * Config fields
   */
  private static final String FIELD_USER_ID = "USER_ID";

  /**
   * Config values
   */
  private static final String CANCELLED_STATUS = "CANCELLED";
  private static final String SUB_STATUS = "REDEMPTION_VOLUNTARY";
  private static final String REASON = "OTHER";
  private static final String REASON_DESCRIPTION = "Because this is a test";
  private static final String CURRENCY = "EUR";
  private static final String MONETARY_ACCOUNT_DESCRIPTION = "Test Java monetary account";
  private static Properties config = TestConfig.prop();
  private static Integer userId = Integer.parseInt(config.getProperty(FIELD_USER_ID));

  private static ApiContext apiContext = getApiContext();

  /**
   * The id of the newly created monetary account which should be closed after the tests completes
   */
  private static Integer monetaryAccountIdToClose;

  /**
   * Tests the creation of a new monetary account. This account will be deleted after test exited
   * with code 0
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void createNewMonetaryAccountTest() throws Exception {
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(MonetaryAccountBank.FIELD_CURRENCY, CURRENCY);
    requestMap.put(MonetaryAccountBank.FIELD_DESCRIPTION, MONETARY_ACCOUNT_DESCRIPTION);

    monetaryAccountIdToClose = MonetaryAccountBank.create(apiContext, requestMap, userId);
  }

  @AfterClass
  public static void tearDown() throws Exception {
    if (monetaryAccountIdToClose != null) {
      HashMap<String, Object> requestMap = new HashMap<>();
      requestMap.put(MonetaryAccountBank.FIELD_STATUS, CANCELLED_STATUS);
      requestMap.put(MonetaryAccountBank.FIELD_SUB_STATUS, SUB_STATUS);
      requestMap.put(MonetaryAccountBank.FIELD_REASON, REASON);
      requestMap.put(MonetaryAccountBank.FIELD_REASON_DESCRIPTION, REASON_DESCRIPTION);

      MonetaryAccountBank.update(apiContext, requestMap, userId, monetaryAccountIdToClose);
    }
  }

}
