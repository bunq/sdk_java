package com.bunq.sdk.model.generated;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.TestConfig;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import java.util.HashMap;
import java.util.Properties;
import org.junit.Test;

/**
 * Tests:
 * Payment
 */
public class PaymentTest extends BunqSdkTestBase {

  /**
   * Config fields
   */
  private static final String FIELD_USER_ID = "USER_ID";
  private static final String FIELD_MONETARY_ACCOUNT_ID = "MONETARY_ACCOUNT_ID";
  private static final String FIELD_COUNTER_PARTY_ALIAS = "COUNTER_PARTY_ALIAS";
  private static final String FIELD_COUNTER_PARTY_TYPE = "COUNTER_PARTY_TYPE";
  private static final String FIELD_SAME_USER_OTHER_ACCOUNT_TYPE = "SAME_USER_OTHER_ACCOUNT_TYPE";
  private static final String FIELD_SAME_USER_OTHER_ACCOUNT_ALIAS = "SAME_USER_OTHER_ACCOUNT_ALIAS";

  /**
   * Config values
   */
  private static final String AMOUNT_IN_EUR = "00.01";
  private static final String CURRENCY = "EUR";
  private static final String PAYMENT_DESCRIPTION = "Java test Payment";
  private static Properties config = TestConfig.prop();
  private static Integer userId = Integer.parseInt(config.getProperty(FIELD_USER_ID));
  private static Integer monetaryAccountID = Integer.parseInt(config.getProperty(
      FIELD_MONETARY_ACCOUNT_ID));
  private static String counterPartyAlias = config.getProperty(FIELD_COUNTER_PARTY_ALIAS);
  private static String counterPartyType = config.getProperty(FIELD_COUNTER_PARTY_TYPE);
  private static String counterTypeSameUserOtherAccount = config.getProperty(
      FIELD_SAME_USER_OTHER_ACCOUNT_TYPE);
  private static String counterAliasSameUserOtherAccount = config.getProperty(
      FIELD_SAME_USER_OTHER_ACCOUNT_ALIAS);

  private static ApiContext apiContext = getApiContext();

  /**
   * Tests making a payment to another sandbox user
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void makePaymentToOtherUser() throws Exception {
    Pointer counterPartyAlias = new Pointer(counterPartyType, PaymentTest.counterPartyAlias);

    Amount amount = new Amount(AMOUNT_IN_EUR, CURRENCY);

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(Payment.FIELD_AMOUNT, amount);
    requestMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, counterPartyAlias);
    requestMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);

    Payment.create(apiContext, requestMap, userId, monetaryAccountID);
  }

  /**
   * Tests making a payment to another monetary account of the same user
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void makePaymentToOtherAccount() throws Exception {
    Pointer counterPartyAlias = new Pointer(counterTypeSameUserOtherAccount,
        counterAliasSameUserOtherAccount);

    Amount amount = new Amount(AMOUNT_IN_EUR, CURRENCY);

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);
    requestMap.put(Payment.FIELD_AMOUNT, amount);
    requestMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, counterPartyAlias);

    Payment.create(apiContext, requestMap, userId, monetaryAccountID);
  }

}
