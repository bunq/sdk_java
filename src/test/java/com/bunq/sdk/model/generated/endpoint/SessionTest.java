package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.ForbiddenException;
import java.util.concurrent.TimeUnit;
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

  private static String apiConfigPath = Config.getApiConfigPath();

  private static final ApiContext apiContext = getApiContext();

  /**
   * Tests deletion of the current session
   */
  @Test(expected = ForbiddenException.class)
  public void deleteSessionTest() throws Exception {
    Session.delete(apiContext, SESSION_ID_DUMMY);
    User.list(apiContext);
  }

  /**
   * Resets the session context after the test has ran.
   */
  @After
  public void after() {
    try {
      TimeUnit.SECONDS.sleep(SECONDS_TO_SLEEP);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    apiContext.resetSession();
    apiContext.save(apiConfigPath);
  }

}
