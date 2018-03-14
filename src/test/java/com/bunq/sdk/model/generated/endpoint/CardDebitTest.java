package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.CardPinAssignment;
import com.bunq.sdk.model.generated.object.Pointer;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Tests:
 * CardName
 * User
 * CardDebit
 */
public class CardDebitTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static final int userId = Config.getUserId();

  private static final ApiContext apiContext = getApiContext();

  private static final String PIN_CODE = "4045";
  private static final int RADIX_DIGITS_AND_LATIN_LETTERS = 36;
  private static final int NUM_BITS_23_DECIMAL_DIGITS = 76;
  private static final int FIRST_INDEX = 0;
  private static final String CARD_PIN_ASSIGNMENT_TYPE_PRIMARY = "PRIMARY";

  /**
   * The name that is going to be shown on the card
   */
  private static String nameOnCard;

  /**
   * The alias which this card will be linked to
   */
  private static Pointer alias;

  @BeforeClass
  public static void setUp() {
    List<CardName> cardName = CardName.list(apiContext, userId).getValue();
    List cardNameList = cardName.get(FIRST_INDEX).getPossibleCardNameArray();

    User user = User.get(apiContext, userId).getValue();

    alias = user.getUserCompany().getAlias().get(FIRST_INDEX);
    nameOnCard = cardNameList.get(new Random().nextInt(cardNameList.size())).toString();
  }

  private static String generateRandomSecondLine() {
    return new BigInteger(NUM_BITS_23_DECIMAL_DIGITS, new SecureRandom())
        .toString(RADIX_DIGITS_AND_LATIN_LETTERS);
  }

  /**
   * Tests ordering a new card and checks if the fields we have entered are indeed correct by
   * retrieving the card from the card endpoint and checks this date against the data we have
   * submitted
   */
  @Test
  public void orderNewMaestroCardTest() throws Exception {
    String secondLine = generateRandomSecondLine();

    CardPinAssignment cardPinAssignment = new CardPinAssignment(
        CARD_PIN_ASSIGNMENT_TYPE_PRIMARY,
        PIN_CODE,
        Config.getMonetaryAccountId()
    );

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(CardDebit.FIELD_SECOND_LINE, secondLine);
    requestMap.put(CardDebit.FIELD_NAME_ON_CARD, nameOnCard);
    requestMap.put(CardDebit.FIELD_PIN_CODE_ASSIGNMENT, new CardPinAssignment[]{cardPinAssignment});
    requestMap.put(CardDebit.FIELD_ALIAS, alias);
    CardDebit cardDebit = CardDebit.create(apiContext, requestMap, userId).getValue();

    Card cardFromCardEndpoint = getCard(cardDebit.getId());

    assertEquals(nameOnCard, cardFromCardEndpoint.getNameOnCard());
    assertEquals(secondLine, cardFromCardEndpoint.getSecondLine());
    assertEquals(cardDebit.getCreated(), cardFromCardEndpoint.getCreated());
  }

  private Card getCard(Integer cardId) {
    return Card.get(apiContext, userId, cardId).getValue();
  }

}
