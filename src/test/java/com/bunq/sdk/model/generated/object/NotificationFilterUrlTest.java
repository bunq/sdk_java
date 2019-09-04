package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.model.generated.endpoint.NotificationFilterUrlUser;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class NotificationFilterUrlTest extends BunqSdkTestBase {

    @Test
    public void testNotificationFilterUrl() {
        final NotificationFilterUrl notificationFilter = new NotificationFilterUrl("MUTATION", "http://google.com/test");
        BunqResponse<Integer> filterIdResponse = NotificationFilterUrlUser.create(
                new ArrayList<NotificationFilterUrl>() {{
                    add(notificationFilter);
                }},
                new HashMap<String, String>()
        );

        Assert.assertNotNull(filterIdResponse.getValue());
        System.out.println(filterIdResponse.getValue());
    }

}
