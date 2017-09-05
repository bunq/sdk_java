package com.bunq.sdk.model.generated;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import java.util.HashMap;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests:
 * Payment
 * PaymentChat
 * ChatMessageText
 */
public class PaymentChatTest extends BunqSdkTestBase {

  /**
   * Config values
   */
  private static final int userId = Config.getUserId();
  private static final int monetaryAccountId = Config.getMonetaryAccountId();
  private static final Pointer counterPartyAliasOther = Config.getCounterPartyAliasOther();

  private static final ApiContext apiContext = getApiContext();

  private static final String AMOUNT_IN_EUR = "0.01";
  private static final String CURRENCY = "EUR";
  private static final String PAYMENT_DESCRIPTION = "Payment From Java Test";
  private static final String MESSAGE_TEXT = "test msg send from java test";

  /**
   * The id of the newly created payment and where the payment chat is being sent to
   */
  private static Integer paymentId;

  @BeforeClass
  public static void setUp() throws Exception {
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, counterPartyAliasOther);
    requestMap.put(Payment.FIELD_AMOUNT, new Amount(AMOUNT_IN_EUR, CURRENCY));
    requestMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);
    paymentId = Payment.create(apiContext, requestMap, userId, monetaryAccountId).getValue();
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

    Integer chat_id = PaymentChat
        .create(apiContext, requestMap, userId, monetaryAccountId, paymentId)
        .getValue();
    sendMessage(chat_id);
  }

}
