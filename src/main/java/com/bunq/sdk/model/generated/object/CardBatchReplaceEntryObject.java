package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class CardBatchReplaceEntryObject extends BunqModel {

  /**
   * The ID of the card that needs to be replaced.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Integer idFieldForRequest;

  /**
   * The user's name as it will be on the card. Check 'card-name' for the available card names for
   * a user.
   */
  @Expose
  @SerializedName("name_on_card_field_for_request")
  private String nameOnCardFieldForRequest;

  /**
   * Array of Types, PINs, account IDs assigned to the card.
   */
  @Expose
  @SerializedName("pin_code_assignment_field_for_request")
  private List<CardPinAssignmentObject> pinCodeAssignmentFieldForRequest;

  /**
   * The second line on the card.
   */
  @Expose
  @SerializedName("second_line_field_for_request")
  private String secondLineFieldForRequest;

  public CardBatchReplaceEntryObject() {
  this(null, null, null, null);
  }

  public CardBatchReplaceEntryObject(Integer id) {
  this(id, null, null, null);
  }

  public CardBatchReplaceEntryObject(Integer id, String nameOnCard) {
  this(id, nameOnCard, null, null);
  }

  public CardBatchReplaceEntryObject(Integer id, String nameOnCard, List<CardPinAssignmentObject> pinCodeAssignment) {
  this(id, nameOnCard, pinCodeAssignment, null);
  }

  public CardBatchReplaceEntryObject(Integer id, String nameOnCard, List<CardPinAssignmentObject> pinCodeAssignment, String secondLine) {
    this.idFieldForRequest = id;
    this.nameOnCardFieldForRequest = nameOnCard;
    this.pinCodeAssignmentFieldForRequest = pinCodeAssignment;
    this.secondLineFieldForRequest = secondLine;
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static CardBatchReplaceEntryObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardBatchReplaceEntryObject.class, reader);
  }

}
