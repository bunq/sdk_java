package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Tests:
 * RequestInquiry
 */
public class RequestInquiryTest extends BunqSdkTestBase {

  private static final String ACCEPTED_STATUS = "ACCEPTED";
  private static final String AMOUNT_EUR = "0.01";
  private static final String CURRENCY = "EUR";
  private static final String REQUEST_DESCRIPTION = "Java Test Payment";
  private static final int INDEX_FIRST = 0;
  /**
   * Config values.
   */
  private static int userId = Config.getUserId();
  private static int monetaryAccountId = Config.getMonetaryAccountId();
  private static int monetaryAccountId2 = Config.getMonetaryAccountId2();
  private static Pointer counterPartyAliasSelf = Config.getCounterPartyAliasSelf();
  private static ApiContext apiContext = getApiContext();

  private static String acceptRequest() {
    List<RequestResponse> responses = RequestResponse.list(apiContext, userId,
        monetaryAccountId2).getValue();

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(RequestResponse.FIELD_STATUS, ACCEPTED_STATUS);

    RequestResponse acceptRequest = RequestResponse.update(apiContext, requestMap, userId,
        monetaryAccountId2, responses.get(INDEX_FIRST).getId()).getValue();

    return acceptRequest.getStatus();
  }

  /**
   * Tests sending a request from monetary account 1 to monetary account 2 and accepting this
   * request
   */
  @Test
  public void createRequestInquiryTest() throws Exception {
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(RequestInquiry.FIELD_COUNTERPARTY_ALIAS, counterPartyAliasSelf);
    requestMap.put(RequestInquiry.FIELD_AMOUNT_INQUIRED, new Amount(AMOUNT_EUR, CURRENCY));
    requestMap.put(RequestInquiry.FIELD_DESCRIPTION, REQUEST_DESCRIPTION);
    requestMap.put(RequestInquiry.FIELD_ALLOW_BUNQME, false);

    RequestInquiry.create(apiContext, requestMap, userId, monetaryAccountId);

    assertEquals(ACCEPTED_STATUS, acceptRequest());
  }

}
