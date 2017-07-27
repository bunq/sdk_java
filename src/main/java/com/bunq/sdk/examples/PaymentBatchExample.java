package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.Payment;
import com.bunq.sdk.model.generated.PaymentBatch;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
  private static final int USER_ITEM_ID = 0; // Put your user ID here
  private static final int MONETARY_ACCOUNT_ITEM_ID = 0; // Put your monetary account ID here

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);

    Map<String, Object> paymentMap = new HashMap<>();
    paymentMap.put(
        Payment.FIELD_AMOUNT,
        new Amount(PAYMENT_AMOUNT, PAYMENT_CURRENCY)
    );
    paymentMap.put(
        Payment.FIELD_COUNTERPARTY_ALIAS,
        new Pointer(COUNTERPARTY_POINTER_TYPE, COUNTERPARTY_EMAIL)
    );
    paymentMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);

    List<Object> payments = new ArrayList<>();
    payments.add(paymentMap);

    Map<String, Object> paymentBatchMap = new HashMap<>();
    paymentBatchMap.put(PaymentBatch.FIELD_PAYMENTS, payments);

    Integer paymentBatchId = PaymentBatch.create(
        apiContext,
        paymentBatchMap,
        USER_ITEM_ID,
        MONETARY_ACCOUNT_ITEM_ID
    );

    System.out.println(
        PaymentBatch.get(apiContext, USER_ITEM_ID, MONETARY_ACCOUNT_ITEM_ID, paymentBatchId)
    );
  }

}
