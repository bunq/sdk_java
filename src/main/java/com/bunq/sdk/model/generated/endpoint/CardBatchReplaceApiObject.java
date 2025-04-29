package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.BunqIdObject;
import com.bunq.sdk.model.generated.object.CardBatchReplaceEntryObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Used to replace multiple cards in a batch.
 */
public class CardBatchReplaceApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/card-batch-replace";

  /**
   * Field constants.
   */
  public static final String FIELD_CARDS = "cards";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "CardBatchReplace";

  /**
   * The ids of the cards that have been replaced.
   */
  @Expose
  @SerializedName("updated_card_ids")
  private List<BunqIdObject> updatedCardIds;

  /**
   * The cards that need to be replaced.
   */
  @Expose
  @SerializedName("cards_field_for_request")
  private List<CardBatchReplaceEntryObject> cardsFieldForRequest;

  public CardBatchReplaceApiObject() {
  this(null);
  }

  public CardBatchReplaceApiObject(List<CardBatchReplaceEntryObject> cards) {
    this.cardsFieldForRequest = cards;
  }  /**
   * @param cards The cards that need to be replaced.
   */
  public static BunqResponse<CardBatchReplaceApiObject> create(List<CardBatchReplaceEntryObject> cards, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CARDS, cards);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(CardBatchReplaceApiObject.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<CardBatchReplaceApiObject> create() {
    return create(null, null);
  }

  public static BunqResponse<CardBatchReplaceApiObject> create(List<CardBatchReplaceEntryObject> cards) {
    return create(cards, null);
  }

  /**
   * The ids of the cards that have been replaced.
   */
  public List<BunqIdObject> getUpdatedCardIds() {
    return this.updatedCardIds;
  }

  public void setUpdatedCardIds(List<BunqIdObject> updatedCardIds) {
    this.updatedCardIds = updatedCardIds;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.updatedCardIds != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardBatchReplaceApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardBatchReplaceApiObject.class, reader);
  }

}
