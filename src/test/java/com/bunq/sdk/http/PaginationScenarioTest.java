package com.bunq.sdk.http;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.TestConfig;
import com.bunq.sdk.model.generated.object.Pointer;

/**
 * Tests:
 * Pagination
 */
public class PaginationScenarioTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static final Integer userId = TestConfig.getUserId();
  private static final Integer monetaryAccountId = TestConfig.getMonetaryAccountId();
  private static final Pointer counterPartyAliasOther = TestConfig.getCounterPartyAliasOther();

  /**
   * Constants for scenario testing.
   */
  private final static int PAYMENT_LISTING_PAGE_SIZE = 2;
  private final static int PAYMENT_REQUIRED_COUNT_MINIMUM = PAYMENT_LISTING_PAGE_SIZE * 2;
  private final static int NUMBER_ZERO = 0;

  /**
   * Constants for payment creation.
   */
  private final static String AMOUNT_IN_EUR = "0.01";
  private final static String FIELD_CURRENCY = "EUR";
  private final static String FIELD_PAYMENT_DESCRIPTION = "C# test Payment";

}
