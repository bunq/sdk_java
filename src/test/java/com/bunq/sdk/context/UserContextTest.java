package com.bunq.sdk.context;

import com.bunq.sdk.BunqSdkTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class UserContextTest extends BunqSdkTestBase {

    @Test
    public void buildUserContext() {
        ApiContext context = getApiContext();

        UserContext userContext = new UserContext(context);

        assertNotNull(userContext.getUserId());
        assertNotNull(userContext.getMainMonetaryAccountId());
    }
}
