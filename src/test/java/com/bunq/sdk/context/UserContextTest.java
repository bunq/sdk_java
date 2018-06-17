package com.bunq.sdk.context;

import com.bunq.sdk.BunqSdkTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class UserContextTest extends BunqSdkTestBase {
    
    @Test
    public void testConstruct() {
        ApiContext context = getApiContext();

        UserContext sut = new UserContext(context);

        assertNotNull(sut.getUserId());
        assertNotNull(sut.getMainMonetaryAccountId());
    }
}
