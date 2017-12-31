package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.Pagination;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * Tests:
 * Payment
 */
public class PaymentTest extends BunqSdkTestBase {

  /**
   * Config values
   */
  private static final int userId = Config.getUserId();
  private static final int monetaryAccountId = Config.getMonetaryAccountId();
  private static final Pointer counterPartyAliasOther = Config.getCounterPartyAliasOther();
  private static final Pointer counterPartyAliasSelf = Config.getCounterPartyAliasSelf();

  private static final ApiContext apiContext = getApiContext();

  private static final String AMOUNT_EUR = "00.01";
  private static final String CURRENCY = "EUR";
  private static final String PAYMENT_DESCRIPTION = "Java test Payment";

  /**
   * Tests making a payment to another sandbox user
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void makePaymentToOtherUser() throws Exception {
    Amount amount = new Amount(AMOUNT_EUR, CURRENCY);

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
    Amount amount = new Amount(AMOUNT_EUR, CURRENCY);

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);
    requestMap.put(Payment.FIELD_AMOUNT, amount);
    requestMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, counterPartyAliasOther);

    Payment.create(apiContext, requestMap, userId, monetaryAccountId);
  }

}
