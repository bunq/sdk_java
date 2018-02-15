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
 * bunq.me tabs allows you to create a payment request and share the link through e-mail, chat,
 * etc. Multiple persons are able to respond to the payment request and pay through bunq, iDeal
 * or SOFORT.
 */
public class BunqMeTab extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/bunqme-tab";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/bunqme-tab/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/bunqme-tab";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/bunqme-tab/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_BUNQME_TAB_ENTRY = "bunqme_tab_entry";
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE_GET = "BunqMeTab";

  /**
   * The id of the created bunq.me.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the bunq.me was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the bunq.me was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The timestamp of when the bunq.me expired or will expire.
   */
  @Expose
  @SerializedName("time_expiry")
  private String timeExpiry;

  /**
   * The id of the MonetaryAccount the bunq.me was sent from.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The status of the bunq.me. Can be WAITING_FOR_PAYMENT, CANCELLED or EXPIRED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The url that points to the bunq.me page.
   */
  @Expose
  @SerializedName("bunqme_tab_share_url")
  private String bunqmeTabShareUrl;

  /**
   * The bunq.me entry containing the payment information.
   */
  @Expose
  @SerializedName("bunqme_tab_entry")
  private BunqMeTabEntry bunqmeTabEntry;

  /**
   * The list of bunq.me result Inquiries successfully made and paid.
   */
  @Expose
  @SerializedName("result_inquiries")
  private List<BunqMeTabResultInquiry> resultInquiries;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer bunqMeTabId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, bunqMeTabId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer bunqMeTabId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, bunqMeTabId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<List<BunqMeTab>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<BunqMeTab>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<BunqMeTab>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(BunqMeTab.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<BunqMeTab> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer bunqMeTabId) {
    return get(apiContext, userId, monetaryAccountId, bunqMeTabId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<BunqMeTab> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer bunqMeTabId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, bunqMeTabId), new HashMap<>(), customHeaders);

    return fromJson(BunqMeTab.class, responseRaw, OBJECT_TYPE_GET);
  }

  /**
   * The id of the created bunq.me.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the bunq.me was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the bunq.me was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The timestamp of when the bunq.me expired or will expire.
   */
  public String getTimeExpiry() {
    return this.timeExpiry;
  }

  public void setTimeExpiry(String timeExpiry) {
    this.timeExpiry = timeExpiry;
  }

  /**
   * The id of the MonetaryAccount the bunq.me was sent from.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The status of the bunq.me. Can be WAITING_FOR_PAYMENT, CANCELLED or EXPIRED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The url that points to the bunq.me page.
   */
  public String getBunqmeTabShareUrl() {
    return this.bunqmeTabShareUrl;
  }

  public void setBunqmeTabShareUrl(String bunqmeTabShareUrl) {
    this.bunqmeTabShareUrl = bunqmeTabShareUrl;
  }

  /**
   * The bunq.me entry containing the payment information.
   */
  public BunqMeTabEntry getBunqmeTabEntry() {
    return this.bunqmeTabEntry;
  }

  public void setBunqmeTabEntry(BunqMeTabEntry bunqmeTabEntry) {
    this.bunqmeTabEntry = bunqmeTabEntry;
  }

  /**
   * The list of bunq.me result Inquiries successfully made and paid.
   */
  public List<BunqMeTabResultInquiry> getResultInquiries() {
    return this.resultInquiries;
  }

  public void setResultInquiries(List<BunqMeTabResultInquiry> resultInquiries) {
    this.resultInquiries = resultInquiries;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.timeExpiry != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.bunqmeTabShareUrl != null) {
      return false;
    }

    if (this.bunqmeTabEntry != null) {
      return false;
    }

    if (this.resultInquiries != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeTab fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeTab.class, reader);
  }

}
