package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.Pagination;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * Tests:
 * Payment
 */
public class PaymentTest extends BunqSdkTestBase {

  /**
   * Payment field value constants.
   */
  private static final String AMOUNT_EUR = "0.01";
  private static final String CURRENCY = "EUR";
  private static final String PAYMENT_DESCRIPTION = "Java test Payment";
  private static final int PAGE_SIZE = 100;

  /**
   * Number constants.
   */
  private static final int NUMBER_ZERO = 0;

  /**
   * Comparison constants.
   */
  private static final int COMPARE_EQUAL = 0;

  /**
   * String constants.
   */
  private static final String STRING_NULL = "null";
  private static final int INDEX_FIRST = 0;

  /**
   * Tests making a payment to another sandbox user
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void makePaymentToOtherUser() {
    Amount amount = new Amount(AMOUNT_EUR, CURRENCY);

    Payment.create(
        amount,
        secondMonetaryAccountBank.getAlias().get(INDEX_FIRST),
        PAYMENT_DESCRIPTION,
        null
    );
  }

  /**
   * Tests making a payment to another monetary account of the same user
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void makePaymentToOtherAccount() {
    Amount amount = new Amount(AMOUNT_EUR, CURRENCY);

    Payment.create(amount, getPointerBravo(),PAYMENT_DESCRIPTION);
  }

  @Test
  public void counterPartyAliasNotNullTest() {
    Pagination pagination = new Pagination();
    pagination.setCount(PAGE_SIZE);

    List<Payment> allPayment = Payment.list(
        null,
        pagination.getUrlParamsCountOnly()
    ).getValue();

    for (Payment payment : allPayment) {
      Assert.assertNotNull(payment.getCounterpartyAlias());
      Assert.assertFalse(payment.getCounterpartyAlias().isAllFieldNull());
      Assert.assertNotEquals(payment.getCounterpartyAlias().toString(), STRING_NULL);
    }
  }

}
