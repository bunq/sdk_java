package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.exception.ForbiddenException;
import org.junit.After;
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
  private static final int SECONDS_TO_SLEEP = 2;

  /**
   * Tests deletion of the current session
   */
  @Test()
  public void deleteSessionTest() {
    Session.delete(SESSION_ID_DUMMY);
    User.list();
  }

  /**
   * Resets the session context after the test has ran.
   */
  @After
  public void after() {
    try {
      TimeUnit.SECONDS.sleep(SECONDS_TO_SLEEP);
    } catch (InterruptedException exception) {
      throw new BunqException(exception.getMessage());
    }

    getApiContext().resetSession();
    getApiContext().save(TEST_CONFIG_PATH);
  }

}
