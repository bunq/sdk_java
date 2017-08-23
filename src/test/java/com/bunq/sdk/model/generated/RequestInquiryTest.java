package com.bunq.sdk.model.generated;

import static org.junit.Assert.assertEquals;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.TestConfig;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import org.junit.Test;

/**
 * Tests:
 * RequestInquiry
 */
public class RequestInquiryTest extends BunqSdkTestBase {

  /**
   * Config fields
   */
  private static final String FIELD_USER_ID = "USER_ID";
  private static final String FIELD_MONETARY_ACCOUNT_ID = "MONETARY_ACCOUNT_ID";
  private static final String FIELD_SAME_USER_OTHER_ACCOUNT_TYPE = "SAME_USER_OTHER_ACCOUNT_TYPE";
  private static final String FIELD_SAME_USER_OTHER_ACCOUNT_ALIAS = "SAME_USER_OTHER_ACCOUNT_ALIAS";
  private static final String FIELD_MONETARY_ACCOUNT_ID_2 = "MONETARY_ACCOUNT_ID2";

  /**
   * Config values
   */
  private static final String ACCEPTED_STATUS = "ACCEPTED";
  private static final String AMOUNT_IN_EUR = "0.01";
  private static final String CURRENCY = "EUR";
  private static final String REQUEST_DESCRIPTION = "Java Test Payment";
  private static final Integer FIRST_INDEX = 0;
  private static Properties config = TestConfig.prop();
  private static Integer userId = Integer.parseInt(config.getProperty(FIELD_USER_ID));
  private static Integer monetaryAccountId = Integer.parseInt(config.getProperty(
      FIELD_MONETARY_ACCOUNT_ID));
  private static String sameUserOtherAccountType = config.getProperty(
      FIELD_SAME_USER_OTHER_ACCOUNT_TYPE);
  private static String sameUserOtherAccountAlias = config.getProperty(
      FIELD_SAME_USER_OTHER_ACCOUNT_ALIAS);
  private static Integer monetaryAccountId2 = Integer.parseInt(config.getProperty(
      FIELD_MONETARY_ACCOUNT_ID_2));

  private static ApiContext apiContext = getApiContext();

  /**
   * Tests sending a request from monetary account 1 to monetary account 2 and accepting this
   * request
   */
  @Test
  public void createRequestInquiryTest() throws Exception {
    Pointer counterPartyAlias = new Pointer(sameUserOtherAccountType, sameUserOtherAccountAlias);
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(RequestInquiry.FIELD_COUNTERPARTY_ALIAS, counterPartyAlias);
    requestMap.put(RequestInquiry.FIELD_AMOUNT_INQUIRED, new Amount(AMOUNT_IN_EUR, CURRENCY));
    requestMap.put(RequestInquiry.FIELD_DESCRIPTION, REQUEST_DESCRIPTION);
    requestMap.put(RequestInquiry.FIELD_ALLOW_BUNQME, false);

    RequestInquiry.create(apiContext, requestMap, userId, monetaryAccountId);

    assertEquals(ACCEPTED_STATUS, acceptRequest());
  }

  private static String acceptRequest() {
    List<RequestResponse> responses = RequestResponse.list(apiContext, userId,
        monetaryAccountId2).getValue();

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(RequestResponse.FIELD_STATUS, ACCEPTED_STATUS);

    RequestResponse acceptRequest = RequestResponse.update(apiContext, requestMap, userId,
        monetaryAccountId2, responses.get(FIRST_INDEX).getId()).getValue();

    return acceptRequest.getStatus();
  }

}
