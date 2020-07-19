package com.bunq.sdk.model.core;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.model.generated.endpoint.OauthClient;
import org.junit.Assert;
import org.junit.Test;

public class OauthAuthorizationUriTest extends BunqSdkTestBase {
    @Test
    public void testAdditionalOathUriParams() {
        final String uri = OauthAuthorizationUri.create(OauthResponseType.CODE, "redirecturi",
                new OauthClient("status"), "state"
        ).getAuthorizationUri();

        Assert.assertTrue("Additional oauth uri params are not correctly constructed",
                uri.contains("&client_id=null&state=state"));
    }
}
