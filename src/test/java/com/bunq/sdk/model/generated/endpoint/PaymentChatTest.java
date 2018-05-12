package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;

/**
 * Tests:
 * Payment
 * PaymentChat
 * ChatMessageText
 */
public class PaymentChatTest extends BunqSdkTestBase {

  private static final String AMOUNT_EUR = "0.01";
  private static final String CURRENCY = "EUR";
  private static final String PAYMENT_DESCRIPTION = "Payment From Java Test";
  private static final String MESSAGE_TEXT = "test msg send from java test";

  /**
   * The id of the newly created payment and where the payment chat is being sent to
   */
  private static Integer paymentId;

  @BeforeClass
  public static void setUp() {
    paymentId = Payment.create(new Amount(AMOUNT_EUR, CURRENCY), getPointerBravo(), PAYMENT_DESCRIPTION).getValue();
  }

  private static void sendMessage(Integer chat_id) {
    ChatMessageText.create(chat_id, MESSAGE_TEXT);
  }

  /**
   * Test sending a chat payment to a newly created payment.
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void sendPaymentMessageTest() {
    Integer chat_id = PaymentChat
        .create(paymentId)
        .getValue();
    sendMessage(chat_id);
  }

}
