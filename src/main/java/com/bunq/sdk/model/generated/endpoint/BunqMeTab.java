package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
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
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/bunqme-tab";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/bunqme-tab/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/bunqme-tab";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/bunqme-tab/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_BUNQME_TAB_ENTRY = "bunqme_tab_entry";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_EVENT_ID = "event_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "BunqMeTab";

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
   * The type of the bunq.me Tab. Should be BUNQ_ME
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me link.
   */
  @Expose
  @SerializedName("alias_monetary_account")
  private LabelMonetaryAccount aliasMonetaryAccount;

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
   * The bunq.me tab entries attached to this bunq.me Tab.
   */
  @Expose
  @SerializedName("bunqme_tab_entries")
  private List<BunqMeTabEntry> bunqmeTabEntries;

  /**
   * The list of bunq.me result Inquiries successfully made and paid.
   */
  @Expose
  @SerializedName("result_inquiries")
  private List<BunqMeTabResultInquiry> resultInquiries;

  /**
   * The bunq.me entry containing the payment information.
   */
  @Expose
  @SerializedName("bunqme_tab_entry_field_for_request")
  private BunqMeTabEntry bunqmeTabEntryFieldForRequest;

  /**
   * The status of the bunq.me. Ignored in POST requests but can be used for cancelling the
   * bunq.me by setting status as CANCELLED with a PUT request.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The ID of the related event if the bunqMeTab made by 'split' functionality.
   */
  @Expose
  @SerializedName("event_id_field_for_request")
  private Integer eventIdFieldForRequest;

  public BunqMeTab() {
  this(null, null, null);
  }

  public BunqMeTab(BunqMeTabEntry bunqmeTabEntry) {
  this(bunqmeTabEntry, null, null);
  }

  public BunqMeTab(BunqMeTabEntry bunqmeTabEntry, String status) {
  this(bunqmeTabEntry, status, null);
  }

  public BunqMeTab(BunqMeTabEntry bunqmeTabEntry, String status, Integer eventId) {
    this.bunqmeTabEntryFieldForRequest = bunqmeTabEntry;
    this.statusFieldForRequest = status;
    this.eventIdFieldForRequest = eventId;
  }  /**
   * @param bunqmeTabEntry The bunq.me entry containing the payment information.
   * @param status The status of the bunq.me. Ignored in POST requests but can be used for
   * cancelling the bunq.me by setting status as CANCELLED with a PUT request.
   * @param eventId The ID of the related event if the bunqMeTab made by 'split' functionality.
   */
  public static BunqResponse<Integer> create(BunqMeTabEntry bunqmeTabEntry, Integer monetaryAccountId, String status, Integer eventId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_BUNQME_TAB_ENTRY, bunqmeTabEntry);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_EVENT_ID, eventId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(BunqMeTabEntry bunqmeTabEntry) {
    return create(bunqmeTabEntry, null, null, null, null);
  }

  public static BunqResponse<Integer> create(BunqMeTabEntry bunqmeTabEntry, Integer monetaryAccountId) {
    return create(bunqmeTabEntry, monetaryAccountId, null, null, null);
  }

  public static BunqResponse<Integer> create(BunqMeTabEntry bunqmeTabEntry, Integer monetaryAccountId, String status) {
    return create(bunqmeTabEntry, monetaryAccountId, status, null, null);
  }

  public static BunqResponse<Integer> create(BunqMeTabEntry bunqmeTabEntry, Integer monetaryAccountId, String status, Integer eventId) {
    return create(bunqmeTabEntry, monetaryAccountId, status, eventId, null);
  }

  /**
   * @param status The status of the bunq.me. Ignored in POST requests but can be used for
   * cancelling the bunq.me by setting status as CANCELLED with a PUT request.
   */
  public static BunqResponse<Integer> update(Integer bunqMeTabId, Integer monetaryAccountId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bunqMeTabId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer bunqMeTabId) {
    return update(bunqMeTabId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer bunqMeTabId, Integer monetaryAccountId) {
    return update(bunqMeTabId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer bunqMeTabId, Integer monetaryAccountId, String status) {
    return update(bunqMeTabId, monetaryAccountId, status, null);
  }

  /**
   */
  public static BunqResponse<List<BunqMeTab>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(BunqMeTab.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<BunqMeTab>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<BunqMeTab>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<BunqMeTab>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<BunqMeTab> get(Integer bunqMeTabId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bunqMeTabId), params, customHeaders);

    return fromJson(BunqMeTab.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<BunqMeTab> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<BunqMeTab> get(Integer bunqMeTabId) {
    return get(bunqMeTabId, null, null, null);
  }

  public static BunqResponse<BunqMeTab> get(Integer bunqMeTabId, Integer monetaryAccountId) {
    return get(bunqMeTabId, monetaryAccountId, null, null);
  }

  public static BunqResponse<BunqMeTab> get(Integer bunqMeTabId, Integer monetaryAccountId, Map<String, String> params) {
    return get(bunqMeTabId, monetaryAccountId, params, null);
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
   * The type of the bunq.me Tab. Should be BUNQ_ME
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me link.
   */
  public LabelMonetaryAccount getAliasMonetaryAccount() {
    return this.aliasMonetaryAccount;
  }

  public void setAliasMonetaryAccount(LabelMonetaryAccount aliasMonetaryAccount) {
    this.aliasMonetaryAccount = aliasMonetaryAccount;
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
   * The bunq.me tab entries attached to this bunq.me Tab.
   */
  public List<BunqMeTabEntry> getBunqmeTabEntries() {
    return this.bunqmeTabEntries;
  }

  public void setBunqmeTabEntries(List<BunqMeTabEntry> bunqmeTabEntries) {
    this.bunqmeTabEntries = bunqmeTabEntries;
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

    if (this.type != null) {
      return false;
    }

    if (this.aliasMonetaryAccount != null) {
      return false;
    }

    if (this.bunqmeTabShareUrl != null) {
      return false;
    }

    if (this.bunqmeTabEntry != null) {
      return false;
    }

    if (this.bunqmeTabEntries != null) {
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
