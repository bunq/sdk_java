package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.BunqId;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.TabVisibility;
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
 * TabUsageSingle is a Tab that can be paid once. The TabUsageSingle is created with the status
 * OPEN. Optionally you can add TabItems to the tab using /tab/_/tab-item, TabItems don't affect
 * the total amount of the Tab. However, if you've created any TabItems for a Tab the sum of the
 * amounts of these items must be equal to the total_amount of the Tab when you change its
 * status to WAITING_FOR_PAYMENT. By setting the visibility object a TabUsageSingle with the
 * status OPEN or WAITING_FOR_PAYMENT can be made visible to customers. As soon as a customer
 * pays the TabUsageSingle its status changes to PAID, and it can't be paid again.
 */
public class TabUsageSingle extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_MERCHANT_REFERENCE = "merchant_reference";
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
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single/%s";
  private static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single/%s";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "TabUsageSingle";

  /**
   * The uuid of the created TabUsageSingle.
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
   * The merchant reference of the Tab, as defined by the owner.
   */
  @Expose
  @SerializedName("merchant_reference")
  private String merchantReference;

  /**
   * The description of the TabUsageMultiple. Maximum 9000 characters.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status of the Tab. Can be OPEN, WAITING_FOR_PAYMENT, PAID or CANCELED.
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
   * The amount that has been paid for this Tab.
   */
  @Expose
  @SerializedName("amount_paid")
  private Amount amountPaid;

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
   * An array of attachments that describe the tab. Uploaded through the POST
   * /user/{userid}/attachment-tab endpoint.
   */
  @Expose
  @SerializedName("tab_attachment")
  private List<BunqId> tabAttachment;

  public static BunqResponse<String> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, cashRegisterId, new HashMap<>());
  }

  /**
   * Create a TabUsageSingle. The initial status must be OPEN
   */
  public static BunqResponse<String> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId, cashRegisterId), requestBytes, customHeaders);

    return processForUuid(responseRaw);
  }

  public static BunqResponse<String> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageSingleUuid) {
    return update(apiContext, requestMap, userId, monetaryAccountId, cashRegisterId, tabUsageSingleUuid, new HashMap<>());
  }

  /**
   * Modify a specific TabUsageSingle. You can change the amount_total, status and visibility.
   * Once you change the status to WAITING_FOR_PAYMENT the TabUsageSingle will expire after 5
   * minutes (default) or up to 1 hour if a different expiration is provided.
   */
  public static BunqResponse<String> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageSingleUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, cashRegisterId, tabUsageSingleUuid), requestBytes, customHeaders);

    return processForUuid(responseRaw);
  }

  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageSingleUuid) {
    return delete(apiContext, userId, monetaryAccountId, cashRegisterId, tabUsageSingleUuid, new HashMap<>());
  }

  /**
   * Cancel a specific TabUsageSingle. This request returns an empty response.
   */
  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageSingleUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, userId, monetaryAccountId, cashRegisterId, tabUsageSingleUuid), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<TabUsageSingle> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageSingleUuid) {
    return get(apiContext, userId, monetaryAccountId, cashRegisterId, tabUsageSingleUuid, new HashMap<>());
  }

  /**
   * Get a specific TabUsageSingle.
   */
  public static BunqResponse<TabUsageSingle> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUsageSingleUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, cashRegisterId, tabUsageSingleUuid), new HashMap<>(), customHeaders);

    return fromJson(TabUsageSingle.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<TabUsageSingle>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId) {
    return list(apiContext, userId, monetaryAccountId, cashRegisterId, new HashMap<>());
  }

  public static BunqResponse<List<TabUsageSingle>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, cashRegisterId, params, new HashMap<>());
  }

  /**
   * Get a collection of TabUsageSingle.
   */
  public static BunqResponse<List<TabUsageSingle>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId, cashRegisterId), params, customHeaders);

    return fromJsonList(TabUsageSingle.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The uuid of the created TabUsageSingle.
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
   * The merchant reference of the Tab, as defined by the owner.
   */
  public String getMerchantReference() {
    return this.merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
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
   * The status of the Tab. Can be OPEN, WAITING_FOR_PAYMENT, PAID or CANCELED.
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
   * The amount that has been paid for this Tab.
   */
  public Amount getAmountPaid() {
    return this.amountPaid;
  }

  public void setAmountPaid(Amount amountPaid) {
    this.amountPaid = amountPaid;
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
   * An array of attachments that describe the tab. Uploaded through the POST
   * /user/{userid}/attachment-tab endpoint.
   */
  public List<BunqId> getTabAttachment() {
    return this.tabAttachment;
  }

  public void setTabAttachment(List<BunqId> tabAttachment) {
    this.tabAttachment = tabAttachment;
  }

}
