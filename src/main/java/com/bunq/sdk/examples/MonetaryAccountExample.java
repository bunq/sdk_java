package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.MonetaryAccount;

/**
 * Get info of a monetary account.
 */
public class MonetaryAccountExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
  private static final int USER_ITEM_ID = 0; // Put your user ID here
  private static final int MONETARY_ACCOUNT_ITEM_ID = 0; // Put your monetary account ID here

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);
    MonetaryAccount monetaryAccount = MonetaryAccount.get(
        apiContext,
        USER_ITEM_ID,
        MONETARY_ACCOUNT_ITEM_ID
    );

    System.out.println(monetaryAccount.getMonetaryAccountBank());
  }

}
