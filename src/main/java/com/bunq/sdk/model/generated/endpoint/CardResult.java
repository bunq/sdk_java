package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelCard;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Endpoint for Card result requests (failed and successful transactions).
 */
public class CardResult extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/card-result/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/card-result";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CardResult";

  /**
   * The id of the monetary account this card result links to.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The id of the card this card result links to.
   */
  @Expose
  @SerializedName("card_id")
  private Integer cardId;

  /**
   * The original amount of the message.
   */
  @Expose
  @SerializedName("amount_original")
  private Amount amountOriginal;

  /**
   * The final amount of the message to be booked to the account.
   */
  @Expose
  @SerializedName("amount_final")
  private Amount amountFinal;

  /**
   * Why the transaction was denied, if it was denied, or just ALLOWED.
   */
  @Expose
  @SerializedName("decision")
  private String decision;

  /**
   * Empty if allowed, otherwise a textual explanation of why it was denied.
   */
  @Expose
  @SerializedName("decision_description")
  private String decisionDescription;

  /**
   * Empty if allowed, otherwise a textual explanation of why it was denied in user's language.
   */
  @Expose
  @SerializedName("decision_description_translated")
  private String decisionDescriptionTranslated;

  /**
   * The description for this transaction to display.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The type of message that this card result is created for.
   */
  @Expose
  @SerializedName("message_type")
  private String messageType;

  /**
   * The way the cardholder was authorised to the POS or ATM.
   */
  @Expose
  @SerializedName("authorisation_type")
  private String authorisationType;

  /**
   * The city where the message originates from.
   */
  @Expose
  @SerializedName("city")
  private String city;

  /**
   * The monetary account label of the account that this result is created for.
   */
  @Expose
  @SerializedName("alias")
  private MonetaryAccountReference alias;

  /**
   * The monetary account label of the counterparty.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private MonetaryAccountReference counterpartyAlias;

  /**
   * The label of the card.
   */
  @Expose
  @SerializedName("label_card")
  private LabelCard labelCard;

  /**
   * The status of the reservation if the transaction is a reservation.
   */
  @Expose
  @SerializedName("reservation_status")
  private String reservationStatus;

  /**
   * The moment the reservation will expire.
   */
  @Expose
  @SerializedName("reservation_expiry_time")
  private String reservationExpiryTime;

  /**
   */
  public static BunqResponse<CardResult> get(Integer cardResultId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cardResultId), params, customHeaders);

    return fromJson(CardResult.class, responseRaw, OBJECT_TYPE_GET);
  }
  public static BunqResponse<CardResult> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<CardResult> get(Integer cardResultId) {
    return get(cardResultId, null, null, null);
  }

  public static BunqResponse<CardResult> get(Integer cardResultId, Integer monetaryAccountId) {
    return get(cardResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<CardResult> get(Integer cardResultId, Integer monetaryAccountId, Map<String, String> params) {
    return get(cardResultId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<List<CardResult>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(CardResult.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CardResult>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<CardResult>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<CardResult>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The id of the monetary account this card result links to.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The id of the card this card result links to.
   */
  public Integer getCardId() {
    return this.cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  /**
   * The original amount of the message.
   */
  public Amount getAmountOriginal() {
    return this.amountOriginal;
  }

  public void setAmountOriginal(Amount amountOriginal) {
    this.amountOriginal = amountOriginal;
  }

  /**
   * The final amount of the message to be booked to the account.
   */
  public Amount getAmountFinal() {
    return this.amountFinal;
  }

  public void setAmountFinal(Amount amountFinal) {
    this.amountFinal = amountFinal;
  }

  /**
   * Why the transaction was denied, if it was denied, or just ALLOWED.
   */
  public String getDecision() {
    return this.decision;
  }

  public void setDecision(String decision) {
    this.decision = decision;
  }

  /**
   * Empty if allowed, otherwise a textual explanation of why it was denied.
   */
  public String getDecisionDescription() {
    return this.decisionDescription;
  }

  public void setDecisionDescription(String decisionDescription) {
    this.decisionDescription = decisionDescription;
  }

  /**
   * Empty if allowed, otherwise a textual explanation of why it was denied in user's language.
   */
  public String getDecisionDescriptionTranslated() {
    return this.decisionDescriptionTranslated;
  }

  public void setDecisionDescriptionTranslated(String decisionDescriptionTranslated) {
    this.decisionDescriptionTranslated = decisionDescriptionTranslated;
  }

  /**
   * The description for this transaction to display.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The type of message that this card result is created for.
   */
  public String getMessageType() {
    return this.messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  /**
   * The way the cardholder was authorised to the POS or ATM.
   */
  public String getAuthorisationType() {
    return this.authorisationType;
  }

  public void setAuthorisationType(String authorisationType) {
    this.authorisationType = authorisationType;
  }

  /**
   * The city where the message originates from.
   */
  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The monetary account label of the account that this result is created for.
   */
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The monetary account label of the counterparty.
   */
  public MonetaryAccountReference getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(MonetaryAccountReference counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
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
   * The status of the reservation if the transaction is a reservation.
   */
  public String getReservationStatus() {
    return this.reservationStatus;
  }

  public void setReservationStatus(String reservationStatus) {
    this.reservationStatus = reservationStatus;
  }

  /**
   * The moment the reservation will expire.
   */
  public String getReservationExpiryTime() {
    return this.reservationExpiryTime;
  }

  public void setReservationExpiryTime(String reservationExpiryTime) {
    this.reservationExpiryTime = reservationExpiryTime;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.cardId != null) {
      return false;
    }

    if (this.amountOriginal != null) {
      return false;
    }

    if (this.amountFinal != null) {
      return false;
    }

    if (this.decision != null) {
      return false;
    }

    if (this.decisionDescription != null) {
      return false;
    }

    if (this.decisionDescriptionTranslated != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.messageType != null) {
      return false;
    }

    if (this.authorisationType != null) {
      return false;
    }

    if (this.city != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.labelCard != null) {
      return false;
    }

    if (this.reservationStatus != null) {
      return false;
    }

    if (this.reservationExpiryTime != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardResult fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardResult.class, reader);
  }

}
