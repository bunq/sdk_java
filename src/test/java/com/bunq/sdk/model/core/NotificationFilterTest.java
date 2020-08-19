package com.bunq.sdk.model.core;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountBank;
import com.bunq.sdk.model.generated.object.NotificationFilterPush;
import com.bunq.sdk.model.generated.object.NotificationFilterUrl;
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
        NotificationFilterUrl notificationFilter = getNotificationFilterUrl();
        List<NotificationFilterUrl> allNotificationFilter = new ArrayList<>();
        allNotificationFilter.add(notificationFilter);

        List<NotificationFilterUrl> allCreatedNotificationFilter = NotificationFilterUrlMonetaryAccountInternal.createWithListResponse(
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
        NotificationFilterUrl notificationFilter = getNotificationFilterUrl();
        List<NotificationFilterUrl> allNotificationFilter = new ArrayList<>();
        allNotificationFilter.add(notificationFilter);

        List<NotificationFilterUrl> allCreatedNotificationFilter = NotificationFilterUrlUserInternal.createWithListResponse(
                allNotificationFilter
        ).getValue();

        Assert.assertEquals(1, allCreatedNotificationFilter.size());
    }

    /**
     * Test NotificationFilterPushUser creation.
     */
    @Test
    public void testNotificationFilterPushUser() {
        NotificationFilterPush notificationFilter = getNotificationFilterPush();
        List<NotificationFilterPush> allNotificationFilter = new ArrayList<>();
        allNotificationFilter.add(notificationFilter);

        List<NotificationFilterPush> allCreatedNotificationFilter = NotificationFilterPushUserInternal.createWithListResponse(
                allNotificationFilter
        ).getValue();

        Assert.assertEquals(1, allCreatedNotificationFilter.size());
    }

    /**
     * Test clear all filters.
     */
    @Test
    public void testNotificationFilterClear() {
        List<NotificationFilterPush> allCreatedNotificationFilterPushUser =
                NotificationFilterPushUserInternal.createWithListResponse().getValue();
        List<NotificationFilterUrl> allCreatedNotificationFilterUrlUser =
                NotificationFilterUrlUserInternal.createWithListResponse().getValue();
        List<NotificationFilterUrl> allCreatedNotificationFilterUrlMonetaryAccount =
                NotificationFilterUrlMonetaryAccountInternal.createWithListResponse().getValue();

        Assert.assertTrue(allCreatedNotificationFilterPushUser.isEmpty());
        Assert.assertTrue(allCreatedNotificationFilterUrlUser.isEmpty());
        Assert.assertTrue(allCreatedNotificationFilterUrlMonetaryAccount.isEmpty());

        Assert.assertEquals(0, NotificationFilterPushUserInternal.list().getValue().size());
        Assert.assertEquals(0, NotificationFilterUrlUserInternal.list().getValue().size());
        Assert.assertEquals(0, NotificationFilterUrlMonetaryAccountInternal.list().getValue().size());
    }

    /**
     * @return NotificationFilterUrl
     */
    private NotificationFilterUrl getNotificationFilterUrl() {
        return new NotificationFilterUrl(FILTER_CATEGORY_MUTATION, FILTER_CALLBACK_URL);
    }

    /**
     * @return NotificationFilterPush
     */
    private static NotificationFilterPush getNotificationFilterPush() {
        return new NotificationFilterPush(FILTER_CATEGORY_MUTATION);
    }

    /**
     * @return MonetaryAccountBank
     */
    private static MonetaryAccountBank getPrimaryMonetaryAccount() {
        return BunqContext.getUserContext().getPrimaryMonetaryAccountBank();
    }
}
