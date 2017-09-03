package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
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
 * Create a batch of requests for payment, or show the request batches of a monetary account.
 */
public class RequestInquiryBatch extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_REQUEST_INQUIRIES = "request_inquiries";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_TOTAL_AMOUNT_INQUIRED = "total_amount_inquired";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry-batch";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry-batch/%s";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/request-inquiry-batch/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry-batch";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "RequestInquiryBatch";

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

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Create a request batch by sending an array of single request objects, that will become part
   * of the batch.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer requestInquiryBatchId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, requestInquiryBatchId, new HashMap<>());
  }

  /**
   * Revoke a request batch. The status of all the requests will be set to REVOKED.
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer requestInquiryBatchId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, requestInquiryBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<RequestInquiryBatch> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer requestInquiryBatchId) {
    return get(apiContext, userId, monetaryAccountId, requestInquiryBatchId, new HashMap<>());
  }

  /**
   * Return the details of a specific request batch.
   */
  public static BunqResponse<RequestInquiryBatch> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer requestInquiryBatchId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, requestInquiryBatchId), new HashMap<>(), customHeaders);

    return fromJson(RequestInquiryBatch.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<RequestInquiryBatch>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<RequestInquiryBatch>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   * Return all the request batches for a monetary account.
   */
  public static BunqResponse<List<RequestInquiryBatch>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(RequestInquiryBatch.class, responseRaw, OBJECT_TYPE);
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

}
