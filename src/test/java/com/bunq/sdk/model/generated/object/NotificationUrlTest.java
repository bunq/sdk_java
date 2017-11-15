package com.bunq.sdk.model.generated.object;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.endpoint.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

public class NotificationUrlTest extends BunqSdkTestBase {
    /**
     * Getter string constants
     */

    /**
     * Assertion errors.
     */
    private static final String ASSERT_SHOULD_NOT_REACH_THIS_CODE_ERROR = "Congratulations you've reached unreachable code.";
    private static final String ASSERT_JSON_DECODE_ERROR = "Error accorded while decoding the JSON file.";
    private static final String ASSERT_OBJECT_IS_NULL_ERROR = "The field object of NotificationUrl is null.";
    private static final String GETTER_PAYMENT = "getPayment";
    private static final String GETTER_BUNQ_ME_TAB = "getBunqMeTab";
    private static final String GETTER_CHAT_MESSAGE_ANNOUNCEMENT = "getChatMessageAnnouncement";
    private static final String GETTER_DRAFT_PAYMENT = "getDraftPayment";
    private static final String GETTER_MASTER_CARD_ACTION = "getMasterCardAction";
    private static final String GETTER_MONETARY_ACCOUNT_BANK = "getMonetaryAccountBank";
    private static final String GETTER_PAYMENT_BATCH = "getPaymentBatch";
    private static final String GETTER_REQUEST_INQUIRY = "getRequestInquiry";
    private static final String GETTER_REQUEST_RESPONSE = "getRequestResponse";
    private static final String GETTER_SCHEDULE_PAYMENT = "getScheduledPayment";
    private static final String GETTER_SCHEDULE_INSTANCE = "getScheduledInstance";
    private static final String GETTER_SHARE_INVITE_BANK_INQUIRY = "getShareInviteBankInquiry";
    private static final String GETTER_SHARE_INVITE_BANK_RESPONSE = "getShareInviteBankResponse";

    /**
     * Model json paths constants.
     */
    private static final String BASE_PATH_JSON_MODEL = "src/test/Recourse/NotificationUrlJsons";
    private static final String JSON_PATH_MUTATION_MODEL = BASE_PATH_JSON_MODEL + "/Mutation.json";
    private static final String JSON_PATH_BUNQ_ME_TAB_MODEL = BASE_PATH_JSON_MODEL + "/BunqMeTab.json";
    private static final String JSON_PATH_CHAT_MESSAGE_ANNOUNCEMENT_MODEL = BASE_PATH_JSON_MODEL +
            "/ChatMessageAnnouncement.json";
    private static final String JSON_PATH_DRAFT_PAYMENT_MODEL = BASE_PATH_JSON_MODEL + "/DraftPayment.json";
    private static final String JSON_PATH_MASTER_CARD_ACTION_MODEL = BASE_PATH_JSON_MODEL + "/MasterCardAction.json";
    private static final String JSON_PATH_MONETARY_ACCOUNT_BANK_MODEL = BASE_PATH_JSON_MODEL +
            "/MonetaryAccountBank.json";
    private static final String JSON_PATH_PAYMENT_BATCH_MODEL = BASE_PATH_JSON_MODEL + "/PaymentBatch.json";
    private static final String JSON_PATH_REQUEST_INQUIRY_MODEL = BASE_PATH_JSON_MODEL + "/RequestInquiry.json";
    private static final String JSON_PATH_REQUEST_RESPONSE_MODEL = BASE_PATH_JSON_MODEL + "/RequestResponse.json";
    private static final String JSON_PATH_SCHEDULE_PAYMENT_MODEL = BASE_PATH_JSON_MODEL + "/ScheduledPayment.json";
    private static final String JSON_PATH_SCHEDULE_INSTANCE_MODEL = BASE_PATH_JSON_MODEL + "/ScheduledInstance.json";
    private static final String JSON_PATH_SHARE_INVITE_BANK_INQUIRY_MODEL = BASE_PATH_JSON_MODEL +
            "/ShareInviteBankInquiry.json";
    private static final String JSON_PATH_SHARE_INVITE_BANK_RESPONSE_MODEL = BASE_PATH_JSON_MODEL +
            "/ShareInviteBankResponse.json";

    /**
     * Model root key.
     */
    private static final String KEY_NOTIFICATION_URL_MODEL = "NotificationUrl";

    private static final Type NOTIFICATION_URL_TYPE = new TypeToken<NotificationUrl>(){}.getType();

    private void executeNotificationUrlTest(
            String expectedJsonFileName,
            String classNameExpected,
            String referencedObjectGetterName) throws FileNotFoundException, NoSuchMethodException,
            InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        JsonReader jsonReader = new JsonReader(new FileReader(expectedJsonFileName));
        NotificationUrl notificationUrl = new Gson().fromJson(jsonReader, NOTIFICATION_URL_TYPE);

       assertNotNull(notificationUrl);
       assertNotNull(notificationUrl.getObject());

        Object model = notificationUrl.getObject().getClass().getDeclaredMethod(referencedObjectGetterName).invoke(
                notificationUrl.getObject()
        );
        BunqModel referencedModel = notificationUrl.getObject().getReferencedObject();

        assertNotNull(model);
        assertNotNull(referencedModel);
        assertTrue(Class.forName(classNameExpected).isInstance(referencedModel));
    }

    @Test
    public void mutationModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_MUTATION_MODEL,
                Payment.class.getName(),
                GETTER_PAYMENT
        );
    }

    @Test
    public void bunqMeTabModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_BUNQ_ME_TAB_MODEL,
                BunqMeTab.class.getName(),
                GETTER_BUNQ_ME_TAB
        );
    }

    @Test
    public void chatMessageAnnouncementModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_CHAT_MESSAGE_ANNOUNCEMENT_MODEL,
                ChatMessageAnnouncement.class.getName(),
                GETTER_CHAT_MESSAGE_ANNOUNCEMENT
        );
    }

    @Test
    public void draftPaymentModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_DRAFT_PAYMENT_MODEL,
                DraftPayment.class.getName(),
                GETTER_DRAFT_PAYMENT
        );
    }

    @Test
    public void masterCardActionModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_MASTER_CARD_ACTION_MODEL,
                MasterCardAction.class.getName(),
                GETTER_MASTER_CARD_ACTION
        );
    }

    @Test
    public void monetaryAccountModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_MONETARY_ACCOUNT_BANK_MODEL,
                MonetaryAccountBank.class.getName(),
                GETTER_MONETARY_ACCOUNT_BANK
        );
    }

    @Test
    public void paymentBatchModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_PAYMENT_BATCH_MODEL,
                PaymentBatch.class.getName(),
                GETTER_PAYMENT_BATCH
        );
    }

    @Test
    public void requestInquiryModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_REQUEST_INQUIRY_MODEL,
                RequestInquiry.class.getName(),
                GETTER_REQUEST_INQUIRY
        );
    }

    @Test
    public void requestResponseModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_REQUEST_RESPONSE_MODEL,
                RequestResponse.class.getName(),
                GETTER_REQUEST_RESPONSE
        );
    }

    @Test
    public void scheduledInstanceModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_SCHEDULE_INSTANCE_MODEL,
                ScheduleInstance.class.getName(),
                GETTER_SCHEDULE_INSTANCE
        );
    }

    @Test
    public void scheduledPaymentModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_SCHEDULE_PAYMENT_MODEL,
                SchedulePayment.class.getName(),
                GETTER_SCHEDULE_PAYMENT
        );
    }

    @Test
    public void shareInviteBankInquiryModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_SHARE_INVITE_BANK_INQUIRY_MODEL,
                ShareInviteBankInquiry.class.getName(),
                GETTER_SHARE_INVITE_BANK_INQUIRY
        );
    }

    @Test
    public void shareInviteBankResponseModelTest() throws InvocationTargetException, FileNotFoundException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException {
        executeNotificationUrlTest(
                JSON_PATH_SHARE_INVITE_BANK_RESPONSE_MODEL,
                ShareInviteBankResponse.class.getName(),
                GETTER_SHARE_INVITE_BANK_RESPONSE
        );
    }

}
