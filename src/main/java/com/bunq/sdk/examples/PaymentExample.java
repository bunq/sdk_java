package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.Payment;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import java.util.HashMap;
import java.util.Map;

/**
 * Initiate a payment and get its info.
 */
public class PaymentExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
  private static final int USER_ITEM_ID = 0; // Put your user ID here
  private static final int MONETARY_ACCOUNT_ITEM_ID = 0; // Put your monetary account ID here
  private static final String PAYMENT_AMOUNT = "12.30";
  private static final String PAYMENT_CURRENCY = "EUR";
  private static final String COUNTERPARTY_POINTER_TYPE = "EMAIL";
  private static final String COUNTERPARTY_EMAIL = "bravo@bunq.com";
  private static final String PAYMENT_DESCRIPTION = "This is a generated payment!";

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);

    Integer paymentId = Payment.create(
        apiContext,
        generateExamplePaymentMap(),
        USER_ITEM_ID,
        MONETARY_ACCOUNT_ITEM_ID
    ).getValue();
    Payment payment = Payment.get(apiContext, USER_ITEM_ID, MONETARY_ACCOUNT_ITEM_ID, paymentId)
        .getValue();
    System.out.println(payment);
    
    // Save the API context to account for all the changes that might have occurred to it during
    // the example execution
    apiContext.save(API_CONTEXT_FILE_PATH);
  }

  private static Map<String, Object> generateExamplePaymentMap() {
    Map<String, Object> paymentMap = new HashMap<>();

    Amount paymentAmount = new Amount(PAYMENT_AMOUNT, PAYMENT_CURRENCY);
    paymentMap.put(Payment.FIELD_AMOUNT, paymentAmount);
    Pointer pointerCounterparty = new Pointer(COUNTERPARTY_POINTER_TYPE, COUNTERPARTY_EMAIL);
    paymentMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, pointerCounterparty);
    paymentMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);

    return paymentMap;
  }

}
