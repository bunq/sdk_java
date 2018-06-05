package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.RequestReferenceSplitTheBillAnchorObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create a batch of requests for payment, or show the request batches of a monetary account.
 */
public class RequestInquiryBatch extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry-batch";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry-batch/%s";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/request-inquiry-batch/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry-batch";

  /**
   * Field constants.
   */
  public static final String FIELD_REQUEST_INQUIRIES = "request_inquiries";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_TOTAL_AMOUNT_INQUIRED = "total_amount_inquired";
  public static final String FIELD_EVENT_ID = "event_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "RequestInquiryBatch";

  /**
   * The list of requests that were made.
   */
  @Expose
  @SerializedName("request_inquiries")
  private List<RequestInquiry> requestInquiries;

  /**
   * The total amount originally inquired for this batch.
   */
  @Expose
  @SerializedName("total_amount_inquired")
  private Amount totalAmountInquired;

  /**
   * The reference to the object used for split the bill. Can be Payment, PaymentBatch,
   * ScheduleInstance, RequestResponse and MasterCardAction
   */
  @Expose
  @SerializedName("reference_split_the_bill")
  private RequestReferenceSplitTheBillAnchorObject referenceSplitTheBill;

  /**
   * The list of request inquiries we want to send in 1 batch.
   */
  @Expose
  @SerializedName("request_inquiries_field_for_request")
  private List<RequestInquiry> requestInquiriesFieldForRequest;

  /**
   * The status of the request.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The total amount originally inquired for this batch.
   */
  @Expose
  @SerializedName("total_amount_inquired_field_for_request")
  private Amount totalAmountInquiredFieldForRequest;

  /**
   * The ID of the associated event if the request batch was made using 'split the bill'.
   */
  @Expose
  @SerializedName("event_id_field_for_request")
  private Integer eventIdFieldForRequest;

  public RequestInquiryBatch() {
    this(null, null, null, null);
  }

  public RequestInquiryBatch(List<RequestInquiry> requestInquiries) {
    this(requestInquiries, null, null, null);
  }

  public RequestInquiryBatch(List<RequestInquiry> requestInquiries, Amount totalAmountInquired) {
    this(requestInquiries, totalAmountInquired, null, null);
  }

  public RequestInquiryBatch(List<RequestInquiry> requestInquiries, Amount totalAmountInquired, String status) {
    this(requestInquiries, totalAmountInquired, status, null);
  }

  public RequestInquiryBatch(List<RequestInquiry> requestInquiries, Amount totalAmountInquired, String status, Integer eventId) {
    this.requestInquiriesFieldForRequest = requestInquiries;
    this.statusFieldForRequest = status;
    this.totalAmountInquiredFieldForRequest = totalAmountInquired;
    this.eventIdFieldForRequest = eventId;
  }

  /**
   * Create a request batch by sending an array of single request objects, that will become part
   * of the batch.
   * @param requestInquiries The list of request inquiries we want to send in 1 batch.
   * @param totalAmountInquired The total amount originally inquired for this batch.
   * @param status The status of the request.
   * @param eventId The ID of the associated event if the request batch was made using 'split the
   * bill'.
   */
  public static BunqResponse<Integer> create(List<RequestInquiry> requestInquiries, Amount totalAmountInquired, Integer monetaryAccountId, String status, Integer eventId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_REQUEST_INQUIRIES, requestInquiries);
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_TOTAL_AMOUNT_INQUIRED, totalAmountInquired);
    requestMap.put(FIELD_EVENT_ID, eventId);

    byte[] requestBytes = determineRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(List<RequestInquiry> requestInquiries) {
    return create(requestInquiries, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(List<RequestInquiry> requestInquiries, Amount totalAmountInquired) {
    return create(requestInquiries, totalAmountInquired, null, null, null, null);
  }

  public static BunqResponse<Integer> create(List<RequestInquiry> requestInquiries, Amount totalAmountInquired, Integer monetaryAccountId) {
    return create(requestInquiries, totalAmountInquired, monetaryAccountId, null, null, null);
  }

  public static BunqResponse<Integer> create(List<RequestInquiry> requestInquiries, Amount totalAmountInquired, Integer monetaryAccountId, String status) {
    return create(requestInquiries, totalAmountInquired, monetaryAccountId, status, null, null);
  }

  public static BunqResponse<Integer> create(List<RequestInquiry> requestInquiries, Amount totalAmountInquired, Integer monetaryAccountId, String status, Integer eventId) {
    return create(requestInquiries, totalAmountInquired, monetaryAccountId, status, eventId, null);
  }

  /**
   * Revoke a request batch. The status of all the requests will be set to REVOKED.
   * @param status The status of the request.
   */
  public static BunqResponse<Integer> update(Integer requestInquiryBatchId, Integer monetaryAccountId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryBatchId) {
    return update(requestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryBatchId, Integer monetaryAccountId) {
    return update(requestInquiryBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryBatchId, Integer monetaryAccountId, String status) {
    return update(requestInquiryBatchId, monetaryAccountId, status, null);
  }

  /**
   * Return the details of a specific request batch.
   */
  public static BunqResponse<RequestInquiryBatch> get(Integer requestInquiryBatchId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryBatchId), params, customHeaders);

    return fromJson(RequestInquiryBatch.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<RequestInquiryBatch> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<RequestInquiryBatch> get(Integer requestInquiryBatchId) {
    return get(requestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<RequestInquiryBatch> get(Integer requestInquiryBatchId, Integer monetaryAccountId) {
    return get(requestInquiryBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<RequestInquiryBatch> get(Integer requestInquiryBatchId, Integer monetaryAccountId, Map<String, String> params) {
    return get(requestInquiryBatchId, monetaryAccountId, params, null);
  }

  /**
   * Return all the request batches for a monetary account.
   */
  public static BunqResponse<List<RequestInquiryBatch>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(RequestInquiryBatch.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<RequestInquiryBatch>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<RequestInquiryBatch>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<RequestInquiryBatch>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The list of requests that were made.
   */
  public List<RequestInquiry> getRequestInquiries() {
    return this.requestInquiries;
  }

  public void setRequestInquiries(List<RequestInquiry> requestInquiries) {
    this.requestInquiries = requestInquiries;
  }

  /**
   * The total amount originally inquired for this batch.
   */
  public Amount getTotalAmountInquired() {
    return this.totalAmountInquired;
  }

  public void setTotalAmountInquired(Amount totalAmountInquired) {
    this.totalAmountInquired = totalAmountInquired;
  }

  /**
   * The reference to the object used for split the bill. Can be Payment, PaymentBatch,
   * ScheduleInstance, RequestResponse and MasterCardAction
   */
  public RequestReferenceSplitTheBillAnchorObject getReferenceSplitTheBill() {
    return this.referenceSplitTheBill;
  }

  public void setReferenceSplitTheBill(RequestReferenceSplitTheBillAnchorObject referenceSplitTheBill) {
    this.referenceSplitTheBill = referenceSplitTheBill;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.requestInquiries != null) {
      return false;
    }

    if (this.totalAmountInquired != null) {
      return false;
    }

    if (this.referenceSplitTheBill != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RequestInquiryBatch fromJsonReader(JsonReader reader) {
    return fromJsonReader(RequestInquiryBatch.class, reader);
  }

}
