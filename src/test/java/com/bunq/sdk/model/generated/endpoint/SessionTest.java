package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.ApiException;
import org.junit.Test;

/**
 * Tests:
 * Session
 */
public class SessionTest extends BunqSdkTestBase {

  /**
   * Config value.
   */
  private static final int SESSION_ID_DUMMY = 0;

  private static final ApiContext apiContext = getApiContext();

  /**
   * Tests deletion of the current session
   */
  @Test(expected = ApiException.class)
  public void deleteSessionTest() throws Exception {
    Session.delete(apiContext, SESSION_ID_DUMMY);
    User.list(apiContext);
  }

}
