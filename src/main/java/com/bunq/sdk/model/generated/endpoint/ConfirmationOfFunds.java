package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Used to confirm availability of funds on an account.
 */
public class ConfirmationOfFunds extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_POINTER_IBAN = "pointer_iban";
  public static final String FIELD_AMOUNT = "amount";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/confirmation-of-funds";
  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "ConfirmationOfFunds";

  /**
   * Whether the account has sufficient funds.
   */
  @Expose
  @SerializedName("has_sufficient_funds")
  private Boolean hasSufficientFunds;

  /**
   * The pointer (IBAN) of the account we're querying.
   */
  @Expose
  @SerializedName("pointer_iban_field_for_request")
  private Pointer pointerIbanFieldForRequest;

  /**
   * The amount we want to check for.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private Amount amountFieldForRequest;

  public ConfirmationOfFunds() {
    this(null, null);
  }

  public ConfirmationOfFunds(Pointer pointerIban) {
    this(pointerIban, null);
  }

  public ConfirmationOfFunds(Pointer pointerIban, Amount amount) {
    this.pointerIbanFieldForRequest = pointerIban;
    this.amountFieldForRequest = amount;
  }

  /**
   * @param pointerIban The pointer (IBAN) of the account we're querying.
   * @param amount      The amount we want to check for.
   */
  public static BunqResponse<ConfirmationOfFunds> create(Pointer pointerIban, Amount amount, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_POINTER_IBAN, pointerIban);
    requestMap.put(FIELD_AMOUNT, amount);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(ConfirmationOfFunds.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<ConfirmationOfFunds> create() {
    return create(null, null, null);
  }

  public static BunqResponse<ConfirmationOfFunds> create(Pointer pointerIban) {
    return create(pointerIban, null, null);
  }

  public static BunqResponse<ConfirmationOfFunds> create(Pointer pointerIban, Amount amount) {
    return create(pointerIban, amount, null);
  }

  /**
   */
  public static ConfirmationOfFunds fromJsonReader(JsonReader reader) {
    return fromJsonReader(ConfirmationOfFunds.class, reader);
  }

  /**
   * Whether the account has sufficient funds.
   */
  public Boolean getHasSufficientFunds() {
    return this.hasSufficientFunds;
  }

  public void setHasSufficientFunds(Boolean hasSufficientFunds) {
    this.hasSufficientFunds = hasSufficientFunds;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.hasSufficientFunds != null) {
      return false;
    }

    return true;
  }

}
