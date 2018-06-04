package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqEndpoint;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.AttachmentMonetaryAccountPayment;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.model.generated.object.RequestInquiryReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Using Payment, you can send payments to bunq and non-bunq users from your bunq
 * MonetaryAccounts. This can be done using bunq Aliases or IBAN Aliases. When transferring
 * money to other bunq MonetaryAccounts you can also refer to Attachments. These will be
 * received by the counter-party as part of the Payment. You can also retrieve a single Payment
 * or all executed Payments of a specific monetary account.
 */
public class Payment extends BunqEndpoint<com.bunq.sdk.model.generated.object.Payment> {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/payment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/payment";

  /**
   * Field constants.
   */
  public static final String FIELD_AMOUNT = "amount";
  public static final String FIELD_COUNTERPARTY_ALIAS = "counterparty_alias";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_ATTACHMENT = "attachment";
  public static final String FIELD_MERCHANT_REFERENCE = "merchant_reference";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Payment";

  public Payment() {
    this(BunqContext.getApiContext());
  }

  public Payment(ApiContext apiContext) {
    super(apiContext, com.bunq.sdk.model.generated.object.Payment.class);
  }

  /**
   * Create a new Payment.
   * @param amount The Amount to transfer with the Payment. Must be bigger than 0 and smaller than
   * the MonetaryAccount's balance.
   * @param counterpartyAlias The Alias of the party we are transferring the money to. Can be an
   * Alias of type EMAIL or PHONE_NUMBER (for bunq MonetaryAccounts or bunq.to payments) or IBAN
   * (for external bank account).
   * @param description The description for the Payment. Maximum 140 characters for Payments to
   * external IBANs, 9000 characters for Payments to only other bunq MonetaryAccounts. Field is
   * required but can be an empty string.
   * @param attachment The Attachments to attach to the Payment.
   * @param merchantReference Optional data to be included with the Payment specific to the
   * merchant.
   */
  public BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description, Integer monetaryAccountId, List<AttachmentMonetaryAccountPayment> attachment, String merchantReference, Map<String, String> customHeaders) {
    ApiClient apiClient = getApiClient();

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_AMOUNT, amount);
    requestMap.put(FIELD_COUNTERPARTY_ALIAS, counterpartyAlias);
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_ATTACHMENT, attachment);
    requestMap.put(FIELD_MERCHANT_REFERENCE, merchantReference);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null);
  }

  public BunqResponse<Integer> create(Amount amount) {
    return create(amount, null, null, null, null, null, null);
  }

  public BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias) {
    return create(amount, counterpartyAlias, null, null, null, null, null);
  }

  public BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description) {
    return create(amount, counterpartyAlias, description, null, null, null, null);
  }

  public BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description, Integer monetaryAccountId) {
    return create(amount, counterpartyAlias, description, monetaryAccountId, null, null, null);
  }

  public BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description, Integer monetaryAccountId, List<AttachmentMonetaryAccountPayment> attachment) {
    return create(amount, counterpartyAlias, description, monetaryAccountId, attachment, null, null);
  }

  public BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description, Integer monetaryAccountId, List<AttachmentMonetaryAccountPayment> attachment, String merchantReference) {
    return create(amount, counterpartyAlias, description, monetaryAccountId, attachment, merchantReference, null);
  }

  /**
   * Get a specific previous Payment.
   */
  public BunqResponse<com.bunq.sdk.model.generated.object.Payment> get(Integer paymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentId), params, customHeaders);

    return fromJson(responseRaw, OBJECT_TYPE_GET);
  }

  public BunqResponse<com.bunq.sdk.model.generated.object.Payment> get() {
    return get(null, null, null, null);
  }

  public BunqResponse<com.bunq.sdk.model.generated.object.Payment> get(Integer paymentId) {
    return get(paymentId, null, null, null);
  }

  public BunqResponse<com.bunq.sdk.model.generated.object.Payment> get(Integer paymentId, Integer monetaryAccountId) {
    return get(paymentId, monetaryAccountId, null, null);
  }

  public BunqResponse<com.bunq.sdk.model.generated.object.Payment> get(Integer paymentId, Integer monetaryAccountId, Map<String, String> params) {
    return get(paymentId, monetaryAccountId, params, null);
  }

  /**
   * Get a listing of all Payments performed on a given MonetaryAccount (incoming and outgoing).
   */
  public BunqResponse<List<com.bunq.sdk.model.generated.object.Payment>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = getApiClient();
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);
    return fromJsonList(responseRaw, OBJECT_TYPE_GET);
  }

  public BunqResponse<List<com.bunq.sdk.model.generated.object.Payment>> list() {
    return list(null, null, null);
  }

  public BunqResponse<List<com.bunq.sdk.model.generated.object.Payment>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public BunqResponse<List<com.bunq.sdk.model.generated.object.Payment>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }
}
