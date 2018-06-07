package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.LabelCard;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * View for the pin change.
 */
public class CardPinChange extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/card/%s/pin-change";
  protected static final String ENDPOINT_URL_READ = "user/%s/card/%s/pin-change/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CardPinChange";

  /**
   * The id of the pin change.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The label of the card.
   */
  @Expose
  @SerializedName("label_card")
  private LabelCard labelCard;

  /**
   * The monetary account this card was ordered on and the label user that owns the card.
   */
  @Expose
  @SerializedName("label_monetary_account_current")
  private LabelMonetaryAccount labelMonetaryAccountCurrent;

  /**
   * The request date of the pin change.
   */
  @Expose
  @SerializedName("time_request")
  private String timeRequest;

  /**
   * The acceptance date of the pin change.
   */
  @Expose
  @SerializedName("time_accept")
  private String timeAccept;

  /**
   * The status of the pin change request, PIN_UPDATE_REQUESTED or PIN_UPDATE_ACCEPTED
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   */
  public static BunqResponse<List<CardPinChange>> list(Integer cardId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), cardId), params, customHeaders);

    return fromJsonList(CardPinChange.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CardPinChange>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<CardPinChange>> list(Integer cardId) {
    return list(cardId, null, null);
  }

  public static BunqResponse<List<CardPinChange>> list(Integer cardId, Map<String, String> params) {
    return list(cardId, params, null);
  }

  /**
   */
  public static BunqResponse<CardPinChange> get(Integer cardId, Integer cardPinChangeId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), cardId, cardPinChangeId), params, customHeaders);

    return fromJson(CardPinChange.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CardPinChange> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<CardPinChange> get(Integer cardId) {
    return get(cardId, null, null, null);
  }

  public static BunqResponse<CardPinChange> get(Integer cardId, Integer cardPinChangeId) {
    return get(cardId, cardPinChangeId, null, null);
  }

  public static BunqResponse<CardPinChange> get(Integer cardId, Integer cardPinChangeId, Map<String, String> params) {
    return get(cardId, cardPinChangeId, params, null);
  }

  /**
   * The id of the pin change.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The label of the card.
   */
  public LabelCard getLabelCard() {
    return this.labelCard;
  }

  public void setLabelCard(LabelCard labelCard) {
    this.labelCard = labelCard;
  }

  /**
   * The monetary account this card was ordered on and the label user that owns the card.
   */
  public LabelMonetaryAccount getLabelMonetaryAccountCurrent() {
    return this.labelMonetaryAccountCurrent;
  }

  public void setLabelMonetaryAccountCurrent(LabelMonetaryAccount labelMonetaryAccountCurrent) {
    this.labelMonetaryAccountCurrent = labelMonetaryAccountCurrent;
  }

  /**
   * The request date of the pin change.
   */
  public String getTimeRequest() {
    return this.timeRequest;
  }

  public void setTimeRequest(String timeRequest) {
    this.timeRequest = timeRequest;
  }

  /**
   * The acceptance date of the pin change.
   */
  public String getTimeAccept() {
    return this.timeAccept;
  }

  public void setTimeAccept(String timeAccept) {
    this.timeAccept = timeAccept;
  }

  /**
   * The status of the pin change request, PIN_UPDATE_REQUESTED or PIN_UPDATE_ACCEPTED
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.labelCard != null) {
      return false;
    }

    if (this.labelMonetaryAccountCurrent != null) {
      return false;
    }

    if (this.timeRequest != null) {
      return false;
    }

    if (this.timeAccept != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardPinChange fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardPinChange.class, reader);
  }

}
