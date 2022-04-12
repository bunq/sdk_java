package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
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
import javax.lang.model.type.NullType;

/**
 * View for getting the dPAN of the card.
 */
public class CardDigitalPrimaryAccountNumber extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/card/%s/digital-primary-account-number";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CardDigitalPrimaryAccountNumber";

  /**
   * The digital PAN of the card.
   */
  @Expose
  @SerializedName("digital_primary_account_number")
  private String digitalPrimaryAccountNumber;

  /**
   * The expiry date.
   */
  @Expose
  @SerializedName("expiry_date")
  private String expiryDate;

  /**
   * The sequence number.
   */
  @Expose
  @SerializedName("sequence_number")
  private String sequenceNumber;

  /**
   * Unique reference given by MDES.
   */
  @Expose
  @SerializedName("token_unique_reference")
  private String tokenUniqueReference;

  /**
   * Status code of the token given by MDES.
   */
  @Expose
  @SerializedName("token_status_code")
  private String tokenStatusCode;

  /**
   */
  public static BunqResponse<List<CardDigitalPrimaryAccountNumber>> list(Integer cardId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), cardId), params, customHeaders);

    return fromJsonList(CardDigitalPrimaryAccountNumber.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CardDigitalPrimaryAccountNumber>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<CardDigitalPrimaryAccountNumber>> list(Integer cardId) {
    return list(cardId, null, null);
  }

  public static BunqResponse<List<CardDigitalPrimaryAccountNumber>> list(Integer cardId, Map<String, String> params) {
    return list(cardId, params, null);
  }

  /**
   * The digital PAN of the card.
   */
  public String getDigitalPrimaryAccountNumber() {
    return this.digitalPrimaryAccountNumber;
  }

  public void setDigitalPrimaryAccountNumber(String digitalPrimaryAccountNumber) {
    this.digitalPrimaryAccountNumber = digitalPrimaryAccountNumber;
  }

  /**
   * The expiry date.
   */
  public String getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   * The sequence number.
   */
  public String getSequenceNumber() {
    return this.sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  /**
   * Unique reference given by MDES.
   */
  public String getTokenUniqueReference() {
    return this.tokenUniqueReference;
  }

  public void setTokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
  }

  /**
   * Status code of the token given by MDES.
   */
  public String getTokenStatusCode() {
    return this.tokenStatusCode;
  }

  public void setTokenStatusCode(String tokenStatusCode) {
    this.tokenStatusCode = tokenStatusCode;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.digitalPrimaryAccountNumber != null) {
      return false;
    }

    if (this.expiryDate != null) {
      return false;
    }

    if (this.sequenceNumber != null) {
      return false;
    }

    if (this.tokenUniqueReference != null) {
      return false;
    }

    if (this.tokenStatusCode != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardDigitalPrimaryAccountNumber fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardDigitalPrimaryAccountNumber.class, reader);
  }

}
