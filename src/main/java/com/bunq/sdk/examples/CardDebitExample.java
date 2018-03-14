package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.endpoint.CardDebit;
import com.bunq.sdk.model.generated.object.CardPinAssignment;
import com.bunq.sdk.model.generated.object.Pointer;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;

/**
 * Request a debit card via the encrypted POST card-debit call.
 */
public class CardDebitExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
  private static final String NAME_YOUR_COMPANY = "Company Name"; // Put your user name here
  private static final String PIN_CODE = "0461";
  private static final String POINTER_TYPE_EMAIL = "EMAIL";
  private static final String EMAIL_YOUR_COMPANY = "at@at.at"; // Put your user email here
  private static final String POINTER_NAME_TEST = "test pointer";
  private static final int USER_ITEM_ID = 0; // Put your user ID here
  private static final int MONETARY_ACCOUNT_ID = 0; // Put your monetary account ID here
  private static final int NUM_BITS_20_DECIMAL_DIGITS = 66;
  private static final int RADIX_DIGITS_AND_LATIN_LETTERS = 36;
  private static final String CARD_PIN_ASSIGNMENT_TYPE_PRIMARY = "PRIMARY";

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) throws IOException {
    ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);

    CardPinAssignment cardPinAssignment = new CardPinAssignment(
        CARD_PIN_ASSIGNMENT_TYPE_PRIMARY,
        PIN_CODE,
        MONETARY_ACCOUNT_ID
    );

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(CardDebit.FIELD_NAME_ON_CARD, NAME_YOUR_COMPANY);
    requestMap.put(CardDebit.FIELD_SECOND_LINE, generateRandomSecondLine());
    requestMap.put(CardDebit.FIELD_PIN_CODE_ASSIGNMENT, new CardPinAssignment[]{cardPinAssignment});
    Pointer pointer = new Pointer(POINTER_TYPE_EMAIL, EMAIL_YOUR_COMPANY);
    pointer.setName(POINTER_NAME_TEST);
    requestMap.put(CardDebit.FIELD_ALIAS, pointer);

    System.out.println(CardDebit.create(apiContext, requestMap, USER_ITEM_ID).getValue().getId());
  }

  private static String generateRandomSecondLine() {
    return new BigInteger(NUM_BITS_20_DECIMAL_DIGITS, new SecureRandom())
        .toString(RADIX_DIGITS_AND_LATIN_LETTERS);
  }

}
