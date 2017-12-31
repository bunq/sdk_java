package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import org.junit.AfterClass;
import org.junit.Test;

import java.util.HashMap;

/**
 * Tests:
 * MonetaryAccountBank
 */
public class MonetaryAccountBankTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static final int userId = Config.getUserId();

  private static final ApiContext apiContext = getApiContext();

  private static final String CANCELLED_STATUS = "CANCELLED";
  private static final String SUB_STATUS = "REDEMPTION_VOLUNTARY";
  private static final String REASON = "OTHER";
  private static final String REASON_DESCRIPTION = "Because this is a test";
  private static final String CURRENCY = "EUR";
  private static final String MONETARY_ACCOUNT_DESCRIPTION = "Test Java monetary account";

  /**
   * The id of the newly created monetary account which should be closed after the tests completes
   */
  private static Integer monetaryAccountIdToClose;

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

  /**
   * Tests the creation of a new monetary account. This account will be deleted after test exited
   * with code 0
   * <p>
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void createNewMonetaryAccountTest() throws Exception {
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(MonetaryAccountBank.FIELD_CURRENCY, CURRENCY);
    requestMap.put(MonetaryAccountBank.FIELD_DESCRIPTION, MONETARY_ACCOUNT_DESCRIPTION);

    monetaryAccountIdToClose = MonetaryAccountBank.create(apiContext, requestMap, userId)
        .getValue();
  }

}
