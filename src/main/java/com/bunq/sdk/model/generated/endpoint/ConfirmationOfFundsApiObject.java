package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.PointerObject;
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
 * Used to confirm availability of funds on an account.
 */
public class ConfirmationOfFundsApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/confirmation-of-funds";

  /**
   * Field constants.
   */
  public static final String FIELD_POINTER_IBAN = "pointer_iban";
  public static final String FIELD_AMOUNT = "amount";

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
  private PointerObject pointerIbanFieldForRequest;

  /**
   * The amount we want to check for.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private AmountObject amountFieldForRequest;

  public ConfirmationOfFundsApiObject() {
  this(null, null);
  }

  public ConfirmationOfFundsApiObject(PointerObject pointerIban) {
  this(pointerIban, null);
  }

  public ConfirmationOfFundsApiObject(PointerObject pointerIban, AmountObject amount) {
    this.pointerIbanFieldForRequest = pointerIban;
    this.amountFieldForRequest = amount;
  }  /**
   * @param pointerIban The pointer (IBAN) of the account we're querying.
   * @param amount The amount we want to check for.
   */
  public static BunqResponse<ConfirmationOfFundsApiObject> create(PointerObject pointerIban, AmountObject amount, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_POINTER_IBAN, pointerIban);
requestMap.put(FIELD_AMOUNT, amount);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(ConfirmationOfFundsApiObject.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<ConfirmationOfFundsApiObject> create() {
    return create(null, null, null);
  }

  public static BunqResponse<ConfirmationOfFundsApiObject> create(PointerObject pointerIban) {
    return create(pointerIban, null, null);
  }

  public static BunqResponse<ConfirmationOfFundsApiObject> create(PointerObject pointerIban, AmountObject amount) {
    return create(pointerIban, amount, null);
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

  /**
   */
  public static ConfirmationOfFundsApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(ConfirmationOfFundsApiObject.class, reader);
  }

}
