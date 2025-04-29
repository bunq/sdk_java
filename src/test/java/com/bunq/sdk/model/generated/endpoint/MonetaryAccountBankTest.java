package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests:
 * MonetaryAccountBank
 */
public class MonetaryAccountBankTest extends BunqSdkTestBase {

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
  public static void tearDown() {
    if (monetaryAccountIdToClose != null) {
      MonetaryAccountBankApiObject.update(monetaryAccountIdToClose,
          null,
          null,
          null,
          CANCELLED_STATUS,
          SUB_STATUS,
          REASON,
          REASON_DESCRIPTION
      );
    }
  }

  /**
   * Tests the creation of a new monetary account. This account will be deleted after test exited
   * with code 0
   */
  @Test
  public void createNewMonetaryAccountTest() {
    monetaryAccountIdToClose = MonetaryAccountBankApiObject.create(CURRENCY, MONETARY_ACCOUNT_DESCRIPTION)
        .getValue();

    Assert.assertNotNull(monetaryAccountIdToClose);
  }
}
