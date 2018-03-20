package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.generated.endpoint.CardDebit;
import com.bunq.sdk.model.generated.object.Pointer;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Request a debit card via the encrypted POST card-debit call.
 */
public class CardDebitExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
  private static final String NAME_YOUR_COMPANY = "Company Name"; // Put your user name here
  private static final String POINTER_TYPE_EMAIL = "EMAIL";
  private static final String EMAIL_YOUR_COMPANY = "at@at.at"; // Put your user email here
  private static final String POINTER_NAME_TEST = "test pointer";
  private static final int NUM_BITS_20_DECIMAL_DIGITS = 66;
  private static final int RADIX_DIGITS_AND_LATIN_LETTERS = 36;

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) throws IOException {
    BunqContext.loadApiContext(ApiContext.restore(API_CONTEXT_FILE_PATH));

    Pointer pointer = new Pointer(POINTER_TYPE_EMAIL, EMAIL_YOUR_COMPANY);
    pointer.setName(POINTER_NAME_TEST);

    System.out.println(CardDebit.create(generateRandomSecondLine(), NAME_YOUR_COMPANY, pointer).getValue().getId());
  }

  private static String generateRandomSecondLine() {
    return new BigInteger(NUM_BITS_20_DECIMAL_DIGITS, new SecureRandom())
        .toString(RADIX_DIGITS_AND_LATIN_LETTERS);
  }

}
