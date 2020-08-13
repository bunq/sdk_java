package com.bunq.sdk.model.core;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.model.generated.endpoint.OauthClient;
import org.junit.Assert;
import org.junit.Test;

public class OauthAuthorizationUriTest extends BunqSdkTestBase {
    /**
     * Test constants.
     */
    private static final String TEST_EXPECT_URI = "https://oauth.sandbox.bunq.com/auth?redirect_uri=redirecturi&response_type=code&state=state";
    private static final String TEST_REDIRECT_URI = "redirecturi";
    private static final String TEST_STATUS = "status";
    private static final String TEST_STATE = "state";

    @Test
    public void testOauthAuthorizationUriCreate() {
        final String uri = OauthAuthorizationUri.create(
                OauthResponseType.CODE, TEST_REDIRECT_URI, new OauthClient(TEST_STATUS), TEST_STATE
        ).getAuthorizationUri();

        Assert.assertEquals(TEST_EXPECT_URI, uri);
    }
}
