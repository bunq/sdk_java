package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.DraftPaymentAnchorObject;
import com.bunq.sdk.model.generated.object.DraftPaymentEntry;
import com.bunq.sdk.model.generated.object.DraftPaymentResponse;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.RequestInquiryReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/draft-payment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/draft-payment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/draft-payment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/draft-payment/%s";
  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "DraftPayment";

  /**
   * The id of the created DrafPayment.
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
  private DraftPaymentAnchorObject object;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /**
   * The status of the DraftPayment.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The list of entries in the DraftPayment. Each entry will result in a payment when the
   * DraftPayment is accepted.
   */
  @Expose
  @SerializedName("entries_field_for_request")
  private List<DraftPaymentEntry> entriesFieldForRequest;

  /**
   * The last updated_timestamp that you received for this DraftPayment. This needs to be provided
   * to prevent race conditions.
   */
  @Expose
  @SerializedName("previous_updated_timestamp_field_for_request")
  private String previousUpdatedTimestampFieldForRequest;

  /**
   * The number of accepts that are required for the draft payment to receive status ACCEPTED.
   * Currently only 1 is valid.
   */
  @Expose
  @SerializedName("number_of_required_accepts_field_for_request")
  private Integer numberOfRequiredAcceptsFieldForRequest;

  public DraftPayment() {
    this(null, null, null, null);
  }

  public DraftPayment(List<DraftPaymentEntry> entries) {
    this(entries, null, null, null);
  }

  public DraftPayment(List<DraftPaymentEntry> entries, Integer numberOfRequiredAccepts) {
    this(entries, numberOfRequiredAccepts, null, null);
  }

  public DraftPayment(List<DraftPaymentEntry> entries, Integer numberOfRequiredAccepts, String status) {
    this(entries, numberOfRequiredAccepts, status, null);
  }

  public DraftPayment(List<DraftPaymentEntry> entries, Integer numberOfRequiredAccepts, String status, String previousUpdatedTimestamp) {
    this.statusFieldForRequest = status;
    this.entriesFieldForRequest = entries;
    this.previousUpdatedTimestampFieldForRequest = previousUpdatedTimestamp;
    this.numberOfRequiredAcceptsFieldForRequest = numberOfRequiredAccepts;
  }

  /**
   * Create a new DraftPayment.
   *
   * @param entries                  The list of entries in the DraftPayment. Each entry will result in a payment
   *                                 when the DraftPayment is accepted.
   * @param numberOfRequiredAccepts  The number of accepts that are required for the draft payment
   *                                 to receive status ACCEPTED. Currently only 1 is valid.
   * @param status                   The status of the DraftPayment.
   * @param previousUpdatedTimestamp The last updated_timestamp that you received for this
   *                                 DraftPayment. This needs to be provided to prevent race conditions.
   */
  public static BunqResponse<Integer> create(List<DraftPaymentEntry> entries, Integer numberOfRequiredAccepts, Integer monetaryAccountId, String status, String previousUpdatedTimestamp, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_ENTRIES, entries);
    requestMap.put(FIELD_PREVIOUS_UPDATED_TIMESTAMP, previousUpdatedTimestamp);
    requestMap.put(FIELD_NUMBER_OF_REQUIRED_ACCEPTS, numberOfRequiredAccepts);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(List<DraftPaymentEntry> entries) {
    return create(entries, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(List<DraftPaymentEntry> entries, Integer numberOfRequiredAccepts) {
    return create(entries, numberOfRequiredAccepts, null, null, null, null);
  }

  public static BunqResponse<Integer> create(List<DraftPaymentEntry> entries, Integer numberOfRequiredAccepts, Integer monetaryAccountId) {
    return create(entries, numberOfRequiredAccepts, monetaryAccountId, null, null, null);
  }

  public static BunqResponse<Integer> create(List<DraftPaymentEntry> entries, Integer numberOfRequiredAccepts, Integer monetaryAccountId, String status) {
    return create(entries, numberOfRequiredAccepts, monetaryAccountId, status, null, null);
  }

  public static BunqResponse<Integer> create(List<DraftPaymentEntry> entries, Integer numberOfRequiredAccepts, Integer monetaryAccountId, String status, String previousUpdatedTimestamp) {
    return create(entries, numberOfRequiredAccepts, monetaryAccountId, status, previousUpdatedTimestamp, null);
  }

  /**
   * Update a DraftPayment.
   *
   * @param status                   The status of the DraftPayment.
   * @param entries                  The list of entries in the DraftPayment. Each entry will result in a payment
   *                                 when the DraftPayment is accepted.
   * @param previousUpdatedTimestamp The last updated_timestamp that you received for this
   *                                 DraftPayment. This needs to be provided to prevent race conditions.
   */
  public static BunqResponse<Integer> update(Integer draftPaymentId, Integer monetaryAccountId, String status, List<DraftPaymentEntry> entries, String previousUpdatedTimestamp, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_ENTRIES, entries);
    requestMap.put(FIELD_PREVIOUS_UPDATED_TIMESTAMP, previousUpdatedTimestamp);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), draftPaymentId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer draftPaymentId) {
    return update(draftPaymentId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftPaymentId, Integer monetaryAccountId) {
    return update(draftPaymentId, monetaryAccountId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftPaymentId, Integer monetaryAccountId, String status) {
    return update(draftPaymentId, monetaryAccountId, status, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftPaymentId, Integer monetaryAccountId, String status, List<DraftPaymentEntry> entries) {
    return update(draftPaymentId, monetaryAccountId, status, entries, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftPaymentId, Integer monetaryAccountId, String status, List<DraftPaymentEntry> entries, String previousUpdatedTimestamp) {
    return update(draftPaymentId, monetaryAccountId, status, entries, previousUpdatedTimestamp, null);
  }

  /**
   * Get a listing of all DraftPayments from a given MonetaryAccount.
   */
  public static BunqResponse<List<DraftPayment>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(DraftPayment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<DraftPayment>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<DraftPayment>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<DraftPayment>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * Get a specific DraftPayment.
   */
  public static BunqResponse<DraftPayment> get(Integer draftPaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), draftPaymentId), params, customHeaders);

    return fromJson(DraftPayment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<DraftPayment> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<DraftPayment> get(Integer draftPaymentId) {
    return get(draftPaymentId, null, null, null);
  }

  public static BunqResponse<DraftPayment> get(Integer draftPaymentId, Integer monetaryAccountId) {
    return get(draftPaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<DraftPayment> get(Integer draftPaymentId, Integer monetaryAccountId, Map<String, String> params) {
    return get(draftPaymentId, monetaryAccountId, params, null);
  }

  /**
   */
  public static DraftPayment fromJsonReader(JsonReader reader) {
    return fromJsonReader(DraftPayment.class, reader);
  }

  /**
   * The id of the created DrafPayment.
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
  public DraftPaymentAnchorObject getObject() {
    return this.object;
  }

  public void setObject(DraftPaymentAnchorObject object) {
    this.object = object;
  }

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  public List<RequestInquiryReference> getRequestReferenceSplitTheBill() {
    return this.requestReferenceSplitTheBill;
  }

  public void setRequestReferenceSplitTheBill(List<RequestInquiryReference> requestReferenceSplitTheBill) {
    this.requestReferenceSplitTheBill = requestReferenceSplitTheBill;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.userAliasCreated != null) {
      return false;
    }

    if (this.responses != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.entries != null) {
      return false;
    }

    if (this.object != null) {
      return false;
    }

    if (this.requestReferenceSplitTheBill != null) {
      return false;
    }

    return true;
  }

}
