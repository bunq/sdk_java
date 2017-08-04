package com.bunq.sdk.model.generated;

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
   * Config value
   */
  private static final Integer SESSION_ID_DUMMY = 0;

  private ApiContext apiContext = getApiContext();

  /**
   * Tests deletion of the current session
   */
  @Test(expected = ApiException.class)
  public void deleteSessionTest() throws Exception {
    Session.delete(apiContext, SESSION_ID_DUMMY);
    User.list(apiContext);
  }

}
