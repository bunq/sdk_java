package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.BunqId;
import com.bunq.sdk.model.generated.object.CardBatchEntry;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to update multiple cards in a batch.
 */
public class CardBatch extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CARDS = "cards";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/card-batch";
  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "CardBatch";

  /**
   * The ids of the cards that have been updated.
   */
  @Expose
  @SerializedName("updated_card_ids")
  private List<BunqId> updatedCardIds;

  /**
   * The cards that need to be updated.
   */
  @Expose
  @SerializedName("cards_field_for_request")
  private List<CardBatchEntry> cardsFieldForRequest;

  public CardBatch() {
    this(null);
  }

  public CardBatch(List<CardBatchEntry> cards) {
    this.cardsFieldForRequest = cards;
  }

  /**
   * @param cards The cards that need to be updated.
   */
  public static BunqResponse<CardBatch> create(List<CardBatchEntry> cards, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CARDS, cards);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(CardBatch.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<CardBatch> create() {
    return create(null, null);
  }

  public static BunqResponse<CardBatch> create(List<CardBatchEntry> cards) {
    return create(cards, null);
  }

  /**
   */
  public static CardBatch fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardBatch.class, reader);
  }

  /**
   * The ids of the cards that have been updated.
   */
  public List<BunqId> getUpdatedCardIds() {
    return this.updatedCardIds;
  }

  public void setUpdatedCardIds(List<BunqId> updatedCardIds) {
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

}
