package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.generated.object.CardPinAssignment;
import com.bunq.sdk.model.generated.object.Pointer;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
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
  private static final String PIN_CODE = "4045";
  private static final int RADIX_DIGITS_AND_LATIN_LETTERS = 36;
  private static final int NUM_BITS_23_DECIMAL_DIGITS = 76;
  private static final int INDEX_FIRST = 0;
  private static final String PIN_ASSIGNMENT_TYPE_PRIMARY = "PRIMARY";
  private static final String CARD_DEBIT_TYPE_MAESTRO = "MAESTRO";

  /**
   * The name that is going to be shown on the card
   */
  private static String nameOnCard;

  /**
   * The alias which this card will be linked to
   */
  private static Pointer alias;

  @BeforeClass
  public static void setUpBeforeClass() {
    BunqSdkTestBase.setUpBeforeClass();

    List<CardName> cardName = CardName.list().getValue();
    List cardNameList = cardName.get(INDEX_FIRST).getPossibleCardNameArray();

    alias = BunqContext.getUserContext().getUserPerson().getAlias().get(INDEX_FIRST);
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
  public void orderNewMaestroCardTest() {
    String secondLine = generateRandomSecondLine();

    List<CardPinAssignment> cardPinAssignmentList = new ArrayList<>();
    cardPinAssignmentList.add(
        new CardPinAssignment(
            PIN_ASSIGNMENT_TYPE_PRIMARY,
            PIN_CODE,
            BunqContext.getUserContext().getPrimaryMonetaryAccountBank().getId()
        )
    );

    CardDebit cardDebit = CardDebit.create(
        secondLine,
        nameOnCard,
        CARD_DEBIT_TYPE_MAESTRO,
        alias,
        cardPinAssignmentList
    ).getValue();

    Card cardFromCardEndpoint = getCard(cardDebit.getId());

    assertEquals(nameOnCard, cardFromCardEndpoint.getNameOnCard());
    assertEquals(secondLine, cardFromCardEndpoint.getSecondLine());
    assertEquals(cardDebit.getCreated(), cardFromCardEndpoint.getCreated());
  }

  private Card getCard(Integer cardId) {
    return Card.get(cardId).getValue();
  }

}
