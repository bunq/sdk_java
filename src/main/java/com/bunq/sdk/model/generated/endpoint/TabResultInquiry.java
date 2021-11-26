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
 * Used to view TabResultInquiry objects belonging to a tab. A TabResultInquiry is an object
 * that holds details on both the tab and a single payment made for that tab.
 */
public class TabResultInquiry extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/tab-result-inquiry/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/tab-result-inquiry";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "TabResultInquiry";

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
   * Used to view a single TabResultInquiry belonging to a tab.
   */
  public static BunqResponse<TabResultInquiry> get(Integer cashRegisterId, String tabUuid, Integer tabResultInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid, tabResultInquiryId), params, customHeaders);

    return fromJson(TabResultInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<TabResultInquiry> get() {
    return get(null, null, null, null, null, null);
  }

  public static BunqResponse<TabResultInquiry> get(Integer cashRegisterId) {
    return get(cashRegisterId, null, null, null, null, null);
  }

  public static BunqResponse<TabResultInquiry> get(Integer cashRegisterId, String tabUuid) {
    return get(cashRegisterId, tabUuid, null, null, null, null);
  }

  public static BunqResponse<TabResultInquiry> get(Integer cashRegisterId, String tabUuid, Integer tabResultInquiryId) {
    return get(cashRegisterId, tabUuid, tabResultInquiryId, null, null, null);
  }

  public static BunqResponse<TabResultInquiry> get(Integer cashRegisterId, String tabUuid, Integer tabResultInquiryId, Integer monetaryAccountId) {
    return get(cashRegisterId, tabUuid, tabResultInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<TabResultInquiry> get(Integer cashRegisterId, String tabUuid, Integer tabResultInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return get(cashRegisterId, tabUuid, tabResultInquiryId, monetaryAccountId, params, null);
  }

  /**
   * Used to view a list of TabResultInquiry objects belonging to a tab.
   */
  public static BunqResponse<List<TabResultInquiry>> list(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid), params, customHeaders);

    return fromJsonList(TabResultInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<TabResultInquiry>> list() {
    return list(null, null, null, null, null);
  }

  public static BunqResponse<List<TabResultInquiry>> list(Integer cashRegisterId) {
    return list(cashRegisterId, null, null, null, null);
  }

  public static BunqResponse<List<TabResultInquiry>> list(Integer cashRegisterId, String tabUuid) {
    return list(cashRegisterId, tabUuid, null, null, null);
  }

  public static BunqResponse<List<TabResultInquiry>> list(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId) {
    return list(cashRegisterId, tabUuid, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<TabResultInquiry>> list(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId, Map<String, String> params) {
    return list(cashRegisterId, tabUuid, monetaryAccountId, params, null);
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
   */
  public boolean isAllFieldNull() {
    if (this.tab != null) {
      return false;
    }

    if (this.payment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TabResultInquiry fromJsonReader(JsonReader reader) {
    return fromJsonReader(TabResultInquiry.class, reader);
  }

}
