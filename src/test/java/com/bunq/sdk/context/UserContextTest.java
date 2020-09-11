package com.bunq.sdk.context;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.model.core.UserContextHelper;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class UserContextTest extends BunqSdkTestBase {

    @Test
    public void buildUserContext() {
        ApiContext apiContext = getApiContext();

        UserContext userContext = new UserContext(apiContext);
        userContext.initMainMonetaryAccount(new UserContextHelper(apiContext));

        assertNotNull(userContext.getUserId());
        assertNotNull(userContext.getMainMonetaryAccountId());
    }
}
