package com.bunq.sdk.http;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.exception.ApiException;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccount;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ErrorResponseIdTest extends BunqSdkTestBase {

  /**
   * Invalid user id to trigger BadRequestException
   */
  private static final int INVALID_MONETARY_ACCOUNT_ID = 0;

  /**
   */
  @Test
  public void badRequestWitResponseIdTest()
  {
    ApiException caughtException = null;

    try {
      MonetaryAccount.get(INVALID_MONETARY_ACCOUNT_ID);
    } catch (ApiException $exception) {
      caughtException = $exception;
    }

    assertNotNull(caughtException);
    assertNotNull(caughtException.getResponseId());
  }

}
