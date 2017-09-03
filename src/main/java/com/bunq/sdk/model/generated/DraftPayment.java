package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.DraftPaymentEntry;
import com.bunq.sdk.model.generated.object.DraftPaymentResponse;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * A DraftPayment is like a regular Payment, but it needs to be accepted by the sending party
 * before the actual Payment is done.
 */
public class DraftPayment extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_ENTRIES = "entries";
  public static final String FIELD_PREVIOUS_UPDATED_TIMESTAMP = "previous_updated_timestamp";
  public static final String FIELD_NUMBER_OF_REQUIRED_ACCEPTS = "number_of_required_accepts";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/draft-payment";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/draft-payment/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/draft-payment";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/draft-payment/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "DraftPayment";

  /**
   * The id of the DraftPayment.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The id of the MonetaryAccount the DraftPayment applies to.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The label of the User who created the DraftPayment.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUser userAliasCreated;

  /**
   * All responses to this draft payment.
   */
  @Expose
  @SerializedName("responses")
  private List<DraftPaymentResponse> responses;

  /**
   * The status of the DraftPayment.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The type of the DraftPayment.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The entries in the DraftPayment.
   */
  @Expose
  @SerializedName("entries")
  private List<DraftPaymentEntry> entries;

  /**
   * The Payment or PaymentBatch. This will only be present after the DraftPayment has been
   * accepted.
   */
  @Expose
  @SerializedName("object")
  private BunqModel object;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Create a new DraftPayment.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer draftPaymentId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, draftPaymentId, new HashMap<>());
  }

  /**
   * Update a DraftPayment.
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer draftPaymentId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, draftPaymentId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<List<DraftPayment>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<DraftPayment>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   * Get a listing of all DraftPayments from a given MonetaryAccount.
   */
  public static BunqResponse<List<DraftPayment>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(DraftPayment.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<DraftPayment> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer draftPaymentId) {
    return get(apiContext, userId, monetaryAccountId, draftPaymentId, new HashMap<>());
  }

  /**
   * Get a specific DraftPayment.
   */
  public static BunqResponse<DraftPayment> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer draftPaymentId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, draftPaymentId), new HashMap<>(), customHeaders);

    return fromJson(DraftPayment.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The id of the DraftPayment.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The id of the MonetaryAccount the DraftPayment applies to.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The label of the User who created the DraftPayment.
   */
  public LabelUser getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUser userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   * All responses to this draft payment.
   */
  public List<DraftPaymentResponse> getResponses() {
    return this.responses;
  }

  public void setResponses(List<DraftPaymentResponse> responses) {
    this.responses = responses;
  }

  /**
   * The status of the DraftPayment.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The type of the DraftPayment.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The entries in the DraftPayment.
   */
  public List<DraftPaymentEntry> getEntries() {
    return this.entries;
  }

  public void setEntries(List<DraftPaymentEntry> entries) {
    this.entries = entries;
  }

  /**
   * The Payment or PaymentBatch. This will only be present after the DraftPayment has been
   * accepted.
   */
  public BunqModel getObject() {
    return this.object;
  }

  public void setObject(BunqModel object) {
    this.object = object;
  }

}
