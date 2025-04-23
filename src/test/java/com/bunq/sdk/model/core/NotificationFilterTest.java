package com.bunq.sdk.model.core;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountBankApiObject;
import com.bunq.sdk.model.generated.object.NotificationFilterPushObject;
import com.bunq.sdk.model.generated.object.NotificationFilterUrlObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests:
 * NotificationFilterUrlMonetaryAccountInternal
 * NotificationFilterUrlUserInternal
 * NotificationFilterPushUserInternal
 */
public class NotificationFilterTest extends BunqSdkTestBase {

    /**
     * Filter constants.
     */
    private static final String FILTER_CATEGORY_MUTATION = "MUTATION";
    private static final String FILTER_CALLBACK_URL = "https://test.com/callback";

    /**
     * Test NotificationFilterUrlMonetaryAccount creation.
     */
    @Test
    public void testNotificationFilterUrlMonetaryAccount() {
        NotificationFilterUrlObject notificationFilter = getNotificationFilterUrl();
        List<NotificationFilterUrlObject> allNotificationFilter = new ArrayList<>();
        allNotificationFilter.add(notificationFilter);

        List<NotificationFilterUrlObject> allCreatedNotificationFilter = NotificationFilterUrlMonetaryAccountInternal.createWithListResponse(
                getPrimaryMonetaryAccount().getId(),
                allNotificationFilter
        ).getValue();

        Assert.assertEquals(1, allCreatedNotificationFilter.size());
    }

    /**
     * Test NotificationFilterUrlUser creation.
     */
    @Test
    public void testNotificationFilterUrlUser() {
        NotificationFilterUrlObject notificationFilter = getNotificationFilterUrl();
        List<NotificationFilterUrlObject> allNotificationFilter = new ArrayList<>();
        allNotificationFilter.add(notificationFilter);

        List<NotificationFilterUrlObject> allCreatedNotificationFilter = NotificationFilterUrlUserInternal.createWithListResponse(
                allNotificationFilter
        ).getValue();

        Assert.assertEquals(1, allCreatedNotificationFilter.size());
    }

    /**
     * Test NotificationFilterPushUser creation.
     */
    @Test
    public void testNotificationFilterPushUser() {
        NotificationFilterPushObject notificationFilter = getNotificationFilterPush();
        List<NotificationFilterPushObject> allNotificationFilter = new ArrayList<>();
        allNotificationFilter.add(notificationFilter);

        List<NotificationFilterPushObject> allCreatedNotificationFilter = NotificationFilterPushUserInternal.createWithListResponse(
                allNotificationFilter
        ).getValue();

        Assert.assertTrue(allCreatedNotificationFilter.size() > 0);
    }

    /**
     * @return NotificationFilterUrl
     */
    private NotificationFilterUrlObject getNotificationFilterUrl() {
        return new NotificationFilterUrlObject(FILTER_CATEGORY_MUTATION, FILTER_CALLBACK_URL);
    }

    /**
     * @return NotificationFilterPush
     */
    private static NotificationFilterPushObject getNotificationFilterPush() {
        return new NotificationFilterPushObject(FILTER_CATEGORY_MUTATION);
    }

    /**
     * @return MonetaryAccountBank
     */
    private static MonetaryAccountBankApiObject getPrimaryMonetaryAccount() {
        return BunqContext.getUserContext().getPrimaryMonetaryAccountBank();
    }
}
