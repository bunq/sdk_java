package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.Pagination;
import com.bunq.sdk.model.generated.Payment;
import java.util.HashMap;
import java.util.List;

/**
 * Restore previously saved API context from a file and use it for Payment listing call.
 */
public class PaymentListExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
  private static final int USER_ITEM_ID = 0; // Put your user ID here
  private static final int MONETARY_ACCOUNT_ITEM_ID = 0; // Put your monetary account ID here

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);
    HashMap<String, String> params = new HashMap<>();
    params.put(Pagination.PARAM_COUNT, "3");
    List<Payment> payments = Payment.list(
        apiContext,
        USER_ITEM_ID,
        MONETARY_ACCOUNT_ITEM_ID,
        params
    ).getValue();
    printPayments(payments);
  }

  private static void printPayments(List<Payment> payments) {
    for (Payment payment : payments) {
      System.out.println(payment);
    }
  }

}
