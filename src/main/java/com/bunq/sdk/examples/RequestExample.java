package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.generated.endpoint.RequestInquiry;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;

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
  private static final int MONETARY_ACCOUNT_ITEM_ID = 0; // Put your monetary account ID here
  private static final String STATUS_REVOKED = "REVOKED";

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    BunqContext.loadApiContext(ApiContext.restore(API_CONTEXT_FILE_PATH));

    Integer requestId = RequestInquiry.create(
        new Amount(REQUEST_AMOUNT, REQUEST_CURRENCY),
        new Pointer(COUNTERPARTY_POINTER_TYPE, COUNTERPARTY_EMAIL),
        REQUEST_DESCRIPTION,
        true
    ).getValue();

    System.out.println(RequestInquiry.get(requestId).getValue());

    System.out.println(RequestInquiry.update(requestId, MONETARY_ACCOUNT_ITEM_ID, STATUS_REVOKED).getValue());
  }

}
