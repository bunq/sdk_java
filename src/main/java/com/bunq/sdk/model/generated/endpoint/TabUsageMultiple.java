package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.BunqId;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.TabVisibility;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * TabUsageMultiple is a Tab that can be paid by multiple users. Just like the TabUsageSingle it
 * is created with the status OPEN, the visibility can be defined in the visibility object and
 * TabItems can be added as long as the status is OPEN. When you change the status to PAYABLE
 * any bunq user can use the tab to make a payment to your account. After an user has paid your
 * TabUsageMultiple the status will not change, it will stay PAYABLE. For example: you can
 * create a TabUsageMultiple with require_address set to true. Now show the QR code of this Tab
 * on your webshop, and any bunq user can instantly pay and order something from your webshop.
 */
public class TabUsageMultiple extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple/%s";
  private static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple/%s";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple";

  /**
   * Field constants.
   */
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_AMOUNT_TOTAL = "amount_total";
  public static final String FIELD_ALLOW_AMOUNT_HIGHER = "allow_amount_higher";
  public static final String FIELD_ALLOW_AMOUNT_LOWER = "allow_amount_lower";
  public static final String FIELD_WANT_TIP = "want_tip";
  public static final String FIELD_MINIMUM_AGE = "minimum_age";
  public static final String FIELD_REQUIRE_ADDRESS = "require_address";
  public static final String FIELD_REDIRECT_URL = "redirect_url";
  public static final String FIELD_VISIBILITY = "visibility";
  public static final String FIELD_EXPIRATION = "expiration";
  public static final String FIELD_TAB_ATTACHMENT = "tab_attachment";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "TabUsageMultiple";

  /**
   * The uuid of the created TabUsageMultiple.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The timestamp of the Tab's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the Tab's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The description of the TabUsageMultiple. Maximum 9000 characters.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status of the Tab. Can be OPEN, PAYABLE or CLOSED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The total amount of the Tab.
   */
  @Expose
  @SerializedName("amount_total")
  private Amount amountTotal;

  /**
   * The token used to redirect mobile devices directly to the bunq app. Because they can't scan a
   * QR code.
   */
  @Expose
  @SerializedName("qr_code_token")
  private String qrCodeToken;

  /**
   * The URL redirecting user to the tab payment in the bunq app. Only works on mobile devices.
   */
  @Expose
  @SerializedName("tab_url")
  private String tabUrl;

  /**
   * The visibility of a Tab. A Tab can be visible trough NearPay, the QR code of the CashRegister
   * and its own QR code.
   */
  @Expose
  @SerializedName("visibility")
  private TabVisibility visibility;

  /**
   * The minimum age of the user paying the Tab.
   */
  @Expose
  @SerializedName("minimum_age")
  private Boolean minimumAge;

  /**
   * Whether or not an billing and shipping address must be provided when paying the Tab.
   */
  @Expose
  @SerializedName("require_address")
  private String requireAddress;

  /**
   * The URL which the user is sent to after paying the Tab.
   */
  @Expose
  @SerializedName("redirect_url")
  private String redirectUrl;

  /**
   * The moment when this Tab expires.
   */
  @Expose
  @SerializedName("expiration")
  private String expiration;

  /**
   * The alias of the party that owns this tab.
   */
  @Expose
  @SerializedName("alias")
  private MonetaryAccountReference alias;

  /**
   * The location of the cash register that created this tab.
   */
  @Expose
  @SerializedName("cash_register_location")
  private Geolocation cashRegisterLocation;

  /**
   * The tab items of this tab.
   */
  @Expose
  @SerializedName("tab_item")
  private List<TabItem> tabItem;

  /**
   * An array of attachments that describe the tab. Viewable through the GET
   * /tab/{tabid}/attachment/{attachmentid}/content endpoint.
   */
  @Expose
  @SerializedName("tab_attachment")
  private List<BunqId> tabAttachment;

  public static BunqResponse<String> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, cashRegisterId, new HashMap<>());
  }

  /**
   * Create a TabUsageMultiple. On creation the status must be set to OPEN
   */
  public static BunqResponse<String> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId, cashRegisterId), requestBytes, customHeaders);

    return processForUuid(responseRaw);
  }

  public static BunqResponse<String> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageMultipleUuid) {
    return update(apiContext, requestMap, userId, monetaryAccountId, cashRegisterId, tabUsageMultipleUuid, new HashMap<>());
  }

  /**
   * Modify a specific TabUsageMultiple. You can change the amount_total, status and visibility.
   * Once you change the status to PAYABLE the TabUsageMultiple will expire after a year
   * (default). If you've created any TabItems for a Tab the sum of the amounts of these items
   * must be equal to the total_amount of the Tab when you change its status to PAYABLE.
   */
  public static BunqResponse<String> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageMultipleUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, cashRegisterId, tabUsageMultipleUuid), requestBytes, customHeaders);

    return processForUuid(responseRaw);
  }

  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageMultipleUuid) {
    return delete(apiContext, userId, monetaryAccountId, cashRegisterId, tabUsageMultipleUuid, new HashMap<>());
  }

  /**
   * Close a specific TabUsageMultiple. This request returns an empty response.
   */
  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageMultipleUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, userId, monetaryAccountId, cashRegisterId, tabUsageMultipleUuid), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<TabUsageMultiple> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageMultipleUuid) {
    return get(apiContext, userId, monetaryAccountId, cashRegisterId, tabUsageMultipleUuid, new HashMap<>());
  }

  /**
   * Get a specific TabUsageMultiple.
   */
  public static BunqResponse<TabUsageMultiple> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageMultipleUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, cashRegisterId, tabUsageMultipleUuid), new HashMap<>(), customHeaders);

    return fromJson(TabUsageMultiple.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<TabUsageMultiple>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId) {
    return list(apiContext, userId, monetaryAccountId, cashRegisterId, new HashMap<>());
  }

  public static BunqResponse<List<TabUsageMultiple>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, cashRegisterId, params, new HashMap<>());
  }

  /**
   * Get a collection of TabUsageMultiple.
   */
  public static BunqResponse<List<TabUsageMultiple>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId, cashRegisterId), params, customHeaders);

    return fromJsonList(TabUsageMultiple.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The uuid of the created TabUsageMultiple.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The timestamp of the Tab's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the Tab's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The description of the TabUsageMultiple. Maximum 9000 characters.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The status of the Tab. Can be OPEN, PAYABLE or CLOSED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The total amount of the Tab.
   */
  public Amount getAmountTotal() {
    return this.amountTotal;
  }

  public void setAmountTotal(Amount amountTotal) {
    this.amountTotal = amountTotal;
  }

  /**
   * The token used to redirect mobile devices directly to the bunq app. Because they can't scan a
   * QR code.
   */
  public String getQrCodeToken() {
    return this.qrCodeToken;
  }

  public void setQrCodeToken(String qrCodeToken) {
    this.qrCodeToken = qrCodeToken;
  }

  /**
   * The URL redirecting user to the tab payment in the bunq app. Only works on mobile devices.
   */
  public String getTabUrl() {
    return this.tabUrl;
  }

  public void setTabUrl(String tabUrl) {
    this.tabUrl = tabUrl;
  }

  /**
   * The visibility of a Tab. A Tab can be visible trough NearPay, the QR code of the CashRegister
   * and its own QR code.
   */
  public TabVisibility getVisibility() {
    return this.visibility;
  }

  public void setVisibility(TabVisibility visibility) {
    this.visibility = visibility;
  }

  /**
   * The minimum age of the user paying the Tab.
   */
  public Boolean getMinimumAge() {
    return this.minimumAge;
  }

  public void setMinimumAge(Boolean minimumAge) {
    this.minimumAge = minimumAge;
  }

  /**
   * Whether or not an billing and shipping address must be provided when paying the Tab.
   */
  public String getRequireAddress() {
    return this.requireAddress;
  }

  public void setRequireAddress(String requireAddress) {
    this.requireAddress = requireAddress;
  }

  /**
   * The URL which the user is sent to after paying the Tab.
   */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /**
   * The moment when this Tab expires.
   */
  public String getExpiration() {
    return this.expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  /**
   * The alias of the party that owns this tab.
   */
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The location of the cash register that created this tab.
   */
  public Geolocation getCashRegisterLocation() {
    return this.cashRegisterLocation;
  }

  public void setCashRegisterLocation(Geolocation cashRegisterLocation) {
    this.cashRegisterLocation = cashRegisterLocation;
  }

  /**
   * The tab items of this tab.
   */
  public List<TabItem> getTabItem() {
    return this.tabItem;
  }

  public void setTabItem(List<TabItem> tabItem) {
    this.tabItem = tabItem;
  }

  /**
   * An array of attachments that describe the tab. Viewable through the GET
   * /tab/{tabid}/attachment/{attachmentid}/content endpoint.
   */
  public List<BunqId> getTabAttachment() {
    return this.tabAttachment;
  }

  public void setTabAttachment(List<BunqId> tabAttachment) {
    this.tabAttachment = tabAttachment;
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.amountTotal != null) {
      return false;
    }

    if (this.qrCodeToken != null) {
      return false;
    }

    if (this.tabUrl != null) {
      return false;
    }

    if (this.visibility != null) {
      return false;
    }

    if (this.minimumAge != null) {
      return false;
    }

    if (this.requireAddress != null) {
      return false;
    }

    if (this.redirectUrl != null) {
      return false;
    }

    if (this.expiration != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.cashRegisterLocation != null) {
      return false;
    }

    if (this.tabItem != null) {
      return false;
    }

    if (this.tabAttachment != null) {
      return false;
    }

    return true;
  }

}
