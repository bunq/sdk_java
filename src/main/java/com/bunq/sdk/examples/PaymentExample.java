package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;

/**
 * Initiate a payment and get its info.
 */
public class PaymentExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
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
    BunqContext.loadApiContext(ApiContext.restore(API_CONTEXT_FILE_PATH));

    Integer paymentId = Payment.create(
        new Amount(PAYMENT_AMOUNT, PAYMENT_CURRENCY),
        new Pointer(COUNTERPARTY_POINTER_TYPE, COUNTERPARTY_EMAIL),
        PAYMENT_DESCRIPTION,
        MONETARY_ACCOUNT_ITEM_ID
    ).getValue();
    Payment payment = Payment.get(paymentId).getValue();
    System.out.println(payment);

    // Save the API context to account for all the changes that might have occurred to it during
    // the example execution
    BunqContext.getApiContext().save(API_CONTEXT_FILE_PATH);
  }
}
