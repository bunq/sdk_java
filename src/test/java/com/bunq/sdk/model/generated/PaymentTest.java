package com.bunq.sdk.model.generated;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.TestConfig;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import java.util.HashMap;
import org.junit.Test;

/**
 * Tests:
 * Payment
 */
public class PaymentTest extends BunqSdkTestBase {

  /**
   * Config values
   */
  private static final int userId = TestConfig.getUserId();
  private static final int monetaryAccountId = TestConfig.getMonetaryAccountId();
  private static final Pointer counterPartyAliasOther = TestConfig.getCounterPartyAliasOther();
  private static final Pointer counterPartyAliasSelf = TestConfig.getCounterPartyAliasSelf();

  private static final ApiContext apiContext = getApiContext();

  private static final String AMOUNT_IN_EUR = "00.01";
  private static final String CURRENCY = "EUR";
  private static final String PAYMENT_DESCRIPTION = "Java test Payment";

  /**
   * Tests making a payment to another sandbox user
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void makePaymentToOtherUser() throws Exception {
    Amount amount = new Amount(AMOUNT_IN_EUR, CURRENCY);

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(Payment.FIELD_AMOUNT, amount);
    requestMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, counterPartyAliasSelf);
    requestMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);

    Payment.create(apiContext, requestMap, userId, monetaryAccountId);
  }

  /**
   * Tests making a payment to another monetary account of the same user
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void makePaymentToOtherAccount() throws Exception {
    Amount amount = new Amount(AMOUNT_IN_EUR, CURRENCY);

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);
    requestMap.put(Payment.FIELD_AMOUNT, amount);
    requestMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, counterPartyAliasOther);

    Payment.create(apiContext, requestMap, userId, monetaryAccountId);
  }

}
