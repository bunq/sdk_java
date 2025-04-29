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
 * Endpoint for managing currency conversions.
 */
public class CurrencyCloudPaymentQuoteApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/currency-cloud-payment-quote";

  /**
   * Field constants.
   */
  public static final String FIELD_POINTERS = "pointers";

  /**
   * The amount that we'll charge the user with.
   */
  @Expose
  @SerializedName("amount_fee")
  private AmountObject amountFee;

  /**
   * The points we want to know the fees for.
   */
  @Expose
  @SerializedName("pointers_field_for_request")
  private List<PointerObject> pointersFieldForRequest;

  public CurrencyCloudPaymentQuoteApiObject() {
  this(null);
  }

  public CurrencyCloudPaymentQuoteApiObject(List<PointerObject> pointers) {
    this.pointersFieldForRequest = pointers;
  }  /**
   * @param pointers The points we want to know the fees for.
   */
  public static BunqResponse<Integer> create(List<PointerObject> pointers, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_POINTERS, pointers);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null);
  }

  public static BunqResponse<Integer> create(List<PointerObject> pointers) {
    return create(pointers, null, null);
  }

  public static BunqResponse<Integer> create(List<PointerObject> pointers, Integer monetaryAccountId) {
    return create(pointers, monetaryAccountId, null);
  }

  /**
   * The amount that we'll charge the user with.
   */
  public AmountObject getAmountFee() {
    return this.amountFee;
  }

  public void setAmountFee(AmountObject amountFee) {
    this.amountFee = amountFee;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.amountFee != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CurrencyCloudPaymentQuoteApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CurrencyCloudPaymentQuoteApiObject.class, reader);
  }

}
