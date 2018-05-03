package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.RequestInquiryReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Used to view TabResultResponse objects belonging to a tab. A TabResultResponse is an object
 * that holds details on a tab which has been paid from the provided monetary account.
 */
public class TabResultResponse extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/tab-result-response/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/tab-result-response";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "TabResultResponse";

  /**
   * The Tab details.
   */
  @Expose
  @SerializedName("tab")
  private Tab tab;

  /**
   * The payment made for the Tab.
   */
  @Expose
  @SerializedName("payment")
  private Payment payment;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /**
   * Used to view a single TabResultResponse belonging to a tab.
   */
  public static BunqResponse<TabResultResponse> get(Integer tabResultResponseId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), tabResultResponseId), params, customHeaders);

    return fromJson(TabResultResponse.class, responseRaw, OBJECT_TYPE_GET);
  }
  public static BunqResponse<TabResultResponse> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<TabResultResponse> get(Integer tabResultResponseId) {
    return get(tabResultResponseId, null, null, null);
  }

  public static BunqResponse<TabResultResponse> get(Integer tabResultResponseId, Integer monetaryAccountId) {
    return get(tabResultResponseId, monetaryAccountId, null, null);
  }

  public static BunqResponse<TabResultResponse> get(Integer tabResultResponseId, Integer monetaryAccountId, Map<String, String> params) {
    return get(tabResultResponseId, monetaryAccountId, params, null);
  }

  /**
   * Used to view a list of TabResultResponse objects belonging to a tab.
   */
  public static BunqResponse<List<TabResultResponse>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(TabResultResponse.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<TabResultResponse>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<TabResultResponse>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<TabResultResponse>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The Tab details.
   */
  public Tab getTab() {
    return this.tab;
  }

  public void setTab(Tab tab) {
    this.tab = tab;
  }

  /**
   * The payment made for the Tab.
   */
  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
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
    if (this.tab != null) {
      return false;
    }

    if (this.payment != null) {
      return false;
    }

    if (this.requestReferenceSplitTheBill != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TabResultResponse fromJsonReader(JsonReader reader) {
    return fromJsonReader(TabResultResponse.class, reader);
  }

}
