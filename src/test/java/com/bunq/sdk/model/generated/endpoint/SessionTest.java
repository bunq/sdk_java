package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.context.SessionContext;
import com.bunq.sdk.exception.ApiException;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.exception.ForbiddenException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

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
  @Test
  public void deleteSessionTest() {
    SessionContext context = BunqContext.getApiContext().getSessionContext();
    Session.delete(SESSION_ID_DUMMY);
    ApiException bunqException = null;

    try {
      User.list();
    } catch (ForbiddenException exception) {
      bunqException = exception;
    }

    Assert.assertNotNull(bunqException);
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
