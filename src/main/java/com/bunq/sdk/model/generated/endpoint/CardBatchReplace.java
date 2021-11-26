package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.BunqId;
import com.bunq.sdk.model.generated.object.CardBatchReplaceEntry;
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
public class CardBatchReplace extends BunqModel {

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
  private List<BunqId> updatedCardIds;

  /**
   * The cards that need to be replaced.
   */
  @Expose
  @SerializedName("cards_field_for_request")
  private List<CardBatchReplaceEntry> cardsFieldForRequest;

  public CardBatchReplace() {
  this(null);
  }

  public CardBatchReplace(List<CardBatchReplaceEntry> cards) {
    this.cardsFieldForRequest = cards;
  }  /**
   * @param cards The cards that need to be replaced.
   */
  public static BunqResponse<CardBatchReplace> create(List<CardBatchReplaceEntry> cards, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CARDS, cards);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(CardBatchReplace.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<CardBatchReplace> create() {
    return create(null, null);
  }

  public static BunqResponse<CardBatchReplace> create(List<CardBatchReplaceEntry> cards) {
    return create(cards, null);
  }

  /**
   * The ids of the cards that have been replaced.
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

  /**
   */
  public static CardBatchReplace fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardBatchReplace.class, reader);
  }

}
