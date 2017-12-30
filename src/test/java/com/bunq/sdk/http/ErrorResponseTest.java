package com.bunq.sdk.http;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.exception.ApiException;
import com.bunq.sdk.model.generated.endpoint.UserPerson;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ErrorResponseTest extends BunqSdkTestBase {
  /**
   * Invalid user id to trigger BadRequestException
   */
  private static final int INVALID_USER_PERSON_ID = 0;

  /**
   */
  @Test
  public void badRequestWitResponseIdTest()
  {
    ApiException caughtException = null;

    try {
      UserPerson.get(getApiContext(), INVALID_USER_PERSON_ID);
    } catch (ApiException $exception) {
      caughtException = $exception;
    }

    assertNotNull(caughtException);
    assertNotNull(caughtException.getResponseId());
  }
}
