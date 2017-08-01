package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import java.util.HashMap;
import java.util.Properties;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests:
 *  Payment
 *  PaymentChat
 *  ChatMessageText
 */
public class PaymentChatTest {

  /**
   * Config fields
   */
  private static final String FIELD_USER_ID = "USER_ID";
  private static final String FIELD_MONETARY_ACCOUNT_ID = "MA_ID";
  private static final String FIELD_COUNTER_PARTY_TYPE = "SAME_USER_OTHER_ACCOUNT_TYPE";
  private static final String FIELD_COUNTER_PARTY_ALIAS = "SAME_USER_OTHER_ACCOUNT_ALIAS";

  /**
   * Config values
   */
  private static final String AMOUNT_IN_EUR = "0.01";
  private static final String CURRENCY = "EUR";
  private static final String PAYMENT_DESCRIPTION = "Payment From Java Test";
  private static final String MESSAGE_TEXT = "test msg send from java test";
  private static Properties config = TestConfig.prop();
  private static Integer userId = Integer.parseInt(config.getProperty(FIELD_USER_ID));
  private static Integer maId = Integer.parseInt(config.getProperty(FIELD_MONETARY_ACCOUNT_ID));
  private static String counterPartyType = config.getProperty(FIELD_COUNTER_PARTY_TYPE);
  private static String counterPartyAlias = config.getProperty(FIELD_COUNTER_PARTY_ALIAS);

  private static ApiContext apiContext = ApiContextHandler.getApiContext();

  /**
   * The id of the newly created payment and where the payment chat is being sent to
   */
  private static Integer paymentId;

  @BeforeClass
  public static void setUp() throws Exception {
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, new Pointer(counterPartyType,
        counterPartyAlias));
    requestMap.put(Payment.FIELD_AMOUNT, new Amount(AMOUNT_IN_EUR, CURRENCY));
    requestMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);
    paymentId = Payment.create(apiContext, requestMap, userId, maId);
  }

  private static void sendMessage(Integer chat_id) {
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(ChatMessageText.FIELD_TEXT, MESSAGE_TEXT);

    ChatMessageText.create(apiContext, requestMap, userId, chat_id);
  }

  /**
   * Test sending a chat payment to a newly created payment.
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void sendPaymentMessageTest() throws Exception {
    HashMap<String, Object> requestMap = new HashMap<>();

    Integer chat_id = PaymentChat.create(apiContext, requestMap, userId, maId, paymentId);
    sendMessage(chat_id);
  }

}
