package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.bunq.sdk.model.generated.endpoint.PaymentBatch;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;

import java.util.ArrayList;
import java.util.List;

/**
 * Initiate a payment batch and get its info.
 */
public class PaymentBatchExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
  private static final String PAYMENT_AMOUNT = "12.30";
  private static final String PAYMENT_CURRENCY = "EUR";
  private static final String COUNTERPARTY_POINTER_TYPE = "EMAIL";
  private static final String COUNTERPARTY_EMAIL = "bravo@bunq.com";
  private static final String PAYMENT_DESCRIPTION = "This is a generated payment batch!";

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    BunqContext.loadApiContext(ApiContext.restore(API_CONTEXT_FILE_PATH));

    Payment payment = new Payment();
    payment.setAmount(new Amount(PAYMENT_AMOUNT, PAYMENT_CURRENCY));
    payment.setCounterpartyAlias(
        new MonetaryAccountReference(new Pointer(COUNTERPARTY_POINTER_TYPE, COUNTERPARTY_EMAIL))
    );
    payment.setDescription(PAYMENT_DESCRIPTION);

    List<Payment> payments = new ArrayList<>();
    payments.add(payment);

    Integer paymentBatchId = PaymentBatch.create(payments).getValue();

    System.out.println(PaymentBatch.get(paymentBatchId).getValue());
  }

}
