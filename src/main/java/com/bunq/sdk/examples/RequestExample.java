package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.RequestInquiry;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import java.util.HashMap;
import java.util.Map;

/**
 * Create a Request Inquiry, get its info and revoke it.
 */
public class RequestExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
  private static final String REQUEST_AMOUNT = "12.30";
  private static final String REQUEST_CURRENCY = "EUR";
  private static final String COUNTERPARTY_POINTER_TYPE = "EMAIL";
  private static final String COUNTERPARTY_EMAIL = "bravo@bunq.com";
  private static final String REQUEST_DESCRIPTION = "This is a generated request!";
  private static final int USER_ITEM_ID = 0; // Put your user ID here
  private static final int MONETARY_ACCOUNT_ITEM_ID = 0; // Put your monetary account ID here
  private static final String STATUS_REVOKED = "REVOKED";

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);

    Map<String, Object> requestMap = new HashMap<>();
    requestMap.put(
        RequestInquiry.FIELD_AMOUNT_INQUIRED,
        new Amount(REQUEST_AMOUNT, REQUEST_CURRENCY)
    );
    requestMap.put(
        RequestInquiry.FIELD_COUNTERPARTY_ALIAS,
        new Pointer(COUNTERPARTY_POINTER_TYPE, COUNTERPARTY_EMAIL)
    );
    requestMap.put(RequestInquiry.FIELD_DESCRIPTION, REQUEST_DESCRIPTION);
    requestMap.put(RequestInquiry.FIELD_ALLOW_BUNQME, true);

    Integer requestId = RequestInquiry.create(
        apiContext,
        requestMap,
        USER_ITEM_ID,
        MONETARY_ACCOUNT_ITEM_ID
    );

    System.out.println(
        RequestInquiry.get(apiContext, USER_ITEM_ID, MONETARY_ACCOUNT_ITEM_ID, requestId)
    );

    Map<String, Object> requestMapUpdate = new HashMap<>();
    requestMapUpdate.put(RequestInquiry.FIELD_STATUS, STATUS_REVOKED);

    System.out.println(
        RequestInquiry.update(
            apiContext,
            requestMapUpdate,
            USER_ITEM_ID,
            MONETARY_ACCOUNT_ITEM_ID,
            requestId
        )
    );
  }

}
