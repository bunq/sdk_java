package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.BunqId;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.TabVisibility;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single/%s";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-single";

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
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "Uuid";
  protected static final String OBJECT_TYPE_PUT = "Uuid";
  protected static final String OBJECT_TYPE_GET = "TabUsageSingle";

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
  private LabelMonetaryAccount alias;

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

  /**
   * The reference of the Tab, as defined by the owner. This reference will be set for any payment
   * that is generated by this tab. Must be unique among all the owner's tabs for the used
   * monetary account.
   */
  @Expose
  @SerializedName("merchant_reference_field_for_request")
  private String merchantReferenceFieldForRequest;

  /**
   * The description of the Tab. Maximum 9000 characters. Field is required but can be an empty
   * string.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The status of the Tab. On creation the status must be set to OPEN. You can change the status
   * from OPEN to WAITING_FOR_PAYMENT.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The total amount of the Tab. Must be a positive amount. As long as the tab has the status
   * OPEN you can change the total amount. This amount is not affected by the amounts of the
   * TabItems. However, if you've created any TabItems for a Tab the sum of the amounts of these
   * items must be equal to the total_amount of the Tab when you change its status to
   * WAITING_FOR_PAYMENT.
   */
  @Expose
  @SerializedName("amount_total_field_for_request")
  private Amount amountTotalFieldForRequest;

  /**
   * [DEPRECATED] Whether or not a higher amount can be paid.
   */
  @Expose
  @SerializedName("allow_amount_higher_field_for_request")
  private Boolean allowAmountHigherFieldForRequest;

  /**
   * [DEPRECATED] Whether or not a lower amount can be paid.
   */
  @Expose
  @SerializedName("allow_amount_lower_field_for_request")
  private Boolean allowAmountLowerFieldForRequest;

  /**
   * [DEPRECATED] Whether or not the user paying the Tab should be asked if he wants to give a
   * tip. When want_tip is set to true, allow_amount_higher must also be set to true and
   * allow_amount_lower must be false.
   */
  @Expose
  @SerializedName("want_tip_field_for_request")
  private Boolean wantTipFieldForRequest;

  /**
   * The minimum age of the user paying the Tab.
   */
  @Expose
  @SerializedName("minimum_age_field_for_request")
  private Integer minimumAgeFieldForRequest;

  /**
   * Whether a billing and shipping address must be provided when paying the Tab. Possible values
   * are: BILLING, SHIPPING, BILLING_SHIPPING, NONE, OPTIONAL. Default is NONE.
   */
  @Expose
  @SerializedName("require_address_field_for_request")
  private String requireAddressFieldForRequest;

  /**
   * The URL which the user is sent to after paying the Tab.
   */
  @Expose
  @SerializedName("redirect_url_field_for_request")
  private String redirectUrlFieldForRequest;

  /**
   * The visibility of a Tab. A Tab can be visible trough NearPay, the QR code of the CashRegister
   * and its own QR code.
   */
  @Expose
  @SerializedName("visibility_field_for_request")
  private TabVisibility visibilityFieldForRequest;

  /**
   * The moment when this Tab expires. Can be at most 1 hour into the future.
   */
  @Expose
  @SerializedName("expiration_field_for_request")
  private String expirationFieldForRequest;

  /**
   * An array of attachments that describe the tab. Uploaded through the POST
   * /user/{userid}/attachment-tab endpoint.
   */
  @Expose
  @SerializedName("tab_attachment_field_for_request")
  private List<BunqId> tabAttachmentFieldForRequest;

  public TabUsageSingle() {
    this(null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public TabUsageSingle(String description) {
    this(description, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public TabUsageSingle(String description, String status) {
    this(description, status, null, null, null, null, null, null, null, null, null, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal) {
    this(description, status, amountTotal, null, null, null, null, null, null, null, null, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference) {
    this(description, status, amountTotal, merchantReference, null, null, null, null, null, null, null, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference, Boolean allowAmountHigher) {
    this(description, status, amountTotal, merchantReference, allowAmountHigher, null, null, null, null, null, null, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower) {
    this(description, status, amountTotal, merchantReference, allowAmountHigher, allowAmountLower, null, null, null, null, null, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip) {
    this(description, status, amountTotal, merchantReference, allowAmountHigher, allowAmountLower, wantTip, null, null, null, null, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge) {
    this(description, status, amountTotal, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, null, null, null, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress) {
    this(description, status, amountTotal, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, null, null, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl) {
    this(description, status, amountTotal, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, null, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility) {
    this(description, status, amountTotal, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, null, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration) {
    this(description, status, amountTotal, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, expiration, null);
  }

  public TabUsageSingle(String description, String status, Amount amountTotal, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration, List<BunqId> tabAttachment) {
    this.merchantReferenceFieldForRequest = merchantReference;
    this.descriptionFieldForRequest = description;
    this.statusFieldForRequest = status;
    this.amountTotalFieldForRequest = amountTotal;
    this.allowAmountHigherFieldForRequest = allowAmountHigher;
    this.allowAmountLowerFieldForRequest = allowAmountLower;
    this.wantTipFieldForRequest = wantTip;
    this.minimumAgeFieldForRequest = minimumAge;
    this.requireAddressFieldForRequest = requireAddress;
    this.redirectUrlFieldForRequest = redirectUrl;
    this.visibilityFieldForRequest = visibility;
    this.expirationFieldForRequest = expiration;
    this.tabAttachmentFieldForRequest = tabAttachment;
  }

  /**
   * Create a TabUsageSingle. The initial status must be OPEN
   * @param description The description of the Tab. Maximum 9000 characters. Field is required but
   * can be an empty string.
   * @param status The status of the Tab. On creation the status must be set to OPEN. You can
   * change the status from OPEN to WAITING_FOR_PAYMENT.
   * @param amountTotal The total amount of the Tab. Must be a positive amount. As long as the tab
   * has the status OPEN you can change the total amount. This amount is not affected by the
   * amounts of the TabItems. However, if you've created any TabItems for a Tab the sum of the
   * amounts of these items must be equal to the total_amount of the Tab when you change its
   * status to WAITING_FOR_PAYMENT.
   * @param merchantReference The reference of the Tab, as defined by the owner. This reference
   * will be set for any payment that is generated by this tab. Must be unique among all the
   * owner's tabs for the used monetary account.
   * @param allowAmountHigher [DEPRECATED] Whether or not a higher amount can be paid.
   * @param allowAmountLower [DEPRECATED] Whether or not a lower amount can be paid.
   * @param wantTip [DEPRECATED] Whether or not the user paying the Tab should be asked if he
   * wants to give a tip. When want_tip is set to true, allow_amount_higher must also be set to
   * true and allow_amount_lower must be false.
   * @param minimumAge The minimum age of the user paying the Tab.
   * @param requireAddress Whether a billing and shipping address must be provided when paying the
   * Tab. Possible values are: BILLING, SHIPPING, BILLING_SHIPPING, NONE, OPTIONAL. Default is
   * NONE.
   * @param redirectUrl The URL which the user is sent to after paying the Tab.
   * @param visibility The visibility of a Tab. A Tab can be visible trough NearPay, the QR code
   * of the CashRegister and its own QR code.
   * @param expiration The moment when this Tab expires. Can be at most 1 hour into the future.
   * @param tabAttachment An array of attachments that describe the tab. Uploaded through the POST
   * /user/{userid}/attachment-tab endpoint.
   */
  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration, List<BunqId> tabAttachment, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_MERCHANT_REFERENCE, merchantReference);
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_AMOUNT_TOTAL, amountTotal);
    requestMap.put(FIELD_ALLOW_AMOUNT_HIGHER, allowAmountHigher);
    requestMap.put(FIELD_ALLOW_AMOUNT_LOWER, allowAmountLower);
    requestMap.put(FIELD_WANT_TIP, wantTip);
    requestMap.put(FIELD_MINIMUM_AGE, minimumAge);
    requestMap.put(FIELD_REQUIRE_ADDRESS, requireAddress);
    requestMap.put(FIELD_REDIRECT_URL, redirectUrl);
    requestMap.put(FIELD_VISIBILITY, visibility);
    requestMap.put(FIELD_EXPIRATION, expiration);
    requestMap.put(FIELD_TAB_ATTACHMENT, tabAttachment);

    byte[] requestBytes = determineRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId), requestBytes, customHeaders);

    return processForUuid(responseRaw);
  }

  public static BunqResponse<String> create() {
    return create(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId) {
    return create(cashRegisterId, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description) {
    return create(cashRegisterId, description, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status) {
    return create(cashRegisterId, description, status, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal) {
    return create(cashRegisterId, description, status, amountTotal, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, allowAmountHigher, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, allowAmountHigher, allowAmountLower, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, allowAmountHigher, allowAmountLower, wantTip, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, null, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, null, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, null, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, null, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, expiration, null, null);
  }

  public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, String merchantReference, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration, List<BunqId> tabAttachment) {
    return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, merchantReference, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, expiration, tabAttachment, null);
  }

  /**
   * Modify a specific TabUsageSingle. You can change the amount_total, status and visibility.
   * Once you change the status to WAITING_FOR_PAYMENT the TabUsageSingle will expire after 5
   * minutes (default) or up to 1 hour if a different expiration is provided.
   * @param status The status of the Tab. On creation the status must be set to OPEN. You can
   * change the status from OPEN to WAITING_FOR_PAYMENT.
   * @param amountTotal The total amount of the Tab. Must be a positive amount. As long as the tab
   * has the status OPEN you can change the total amount. This amount is not affected by the
   * amounts of the TabItems. However, if you've created any TabItems for a Tab the sum of the
   * amounts of these items must be equal to the total_amount of the Tab when you change its
   * status to WAITING_FOR_PAYMENT.
   * @param visibility The visibility of a Tab. A Tab can be visible trough NearPay, the QR code
   * of the CashRegister and its own QR code.
   * @param expiration The moment when this Tab expires. Can be at most 1 hour into the future.
   * @param tabAttachment An array of attachments that describe the tab. Uploaded through the POST
   * /user/{userid}/attachment-tab endpoint.
   */
  public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId, String status, Amount amountTotal, TabVisibility visibility, String expiration, List<BunqId> tabAttachment, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_AMOUNT_TOTAL, amountTotal);
    requestMap.put(FIELD_VISIBILITY, visibility);
    requestMap.put(FIELD_EXPIRATION, expiration);
    requestMap.put(FIELD_TAB_ATTACHMENT, tabAttachment);

    byte[] requestBytes = determineRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUsageSingleUuid), requestBytes, customHeaders);

    return processForUuid(responseRaw);
  }

  public static BunqResponse<String> update(Integer cashRegisterId) {
    return update(cashRegisterId, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageSingleUuid) {
    return update(cashRegisterId, tabUsageSingleUuid, null, null, null, null, null, null, null);
  }

  public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId) {
    return update(cashRegisterId, tabUsageSingleUuid, monetaryAccountId, null, null, null, null, null, null);
  }

  public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId, String status) {
    return update(cashRegisterId, tabUsageSingleUuid, monetaryAccountId, status, null, null, null, null, null);
  }

  public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId, String status, Amount amountTotal) {
    return update(cashRegisterId, tabUsageSingleUuid, monetaryAccountId, status, amountTotal, null, null, null, null);
  }

  public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId, String status, Amount amountTotal, TabVisibility visibility) {
    return update(cashRegisterId, tabUsageSingleUuid, monetaryAccountId, status, amountTotal, visibility, null, null, null);
  }

  public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId, String status, Amount amountTotal, TabVisibility visibility, String expiration) {
    return update(cashRegisterId, tabUsageSingleUuid, monetaryAccountId, status, amountTotal, visibility, expiration, null, null);
  }

  public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId, String status, Amount amountTotal, TabVisibility visibility, String expiration, List<BunqId> tabAttachment) {
    return update(cashRegisterId, tabUsageSingleUuid, monetaryAccountId, status, amountTotal, visibility, expiration, tabAttachment, null);
  }

  /**
   * Cancel a specific TabUsageSingle.
   */
  public static BunqResponse<TabUsageSingle> delete(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUsageSingleUuid), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<TabUsageSingle> delete(Integer cashRegisterId) {
    return delete(cashRegisterId, null, null, null);
  }

  public static BunqResponse<TabUsageSingle> delete(Integer cashRegisterId, String tabUsageSingleUuid) {
    return delete(cashRegisterId, tabUsageSingleUuid, null, null);
  }

  public static BunqResponse<TabUsageSingle> delete(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId) {
    return delete(cashRegisterId, tabUsageSingleUuid, monetaryAccountId, null);
  }

  /**
   * Get a specific TabUsageSingle.
   */
  public static BunqResponse<TabUsageSingle> get(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUsageSingleUuid), params, customHeaders);

    return fromJson(TabUsageSingle.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<TabUsageSingle> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<TabUsageSingle> get(Integer cashRegisterId) {
    return get(cashRegisterId, null, null, null, null);
  }

  public static BunqResponse<TabUsageSingle> get(Integer cashRegisterId, String tabUsageSingleUuid) {
    return get(cashRegisterId, tabUsageSingleUuid, null, null, null);
  }

  public static BunqResponse<TabUsageSingle> get(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId) {
    return get(cashRegisterId, tabUsageSingleUuid, monetaryAccountId, null, null);
  }

  public static BunqResponse<TabUsageSingle> get(Integer cashRegisterId, String tabUsageSingleUuid, Integer monetaryAccountId, Map<String, String> params) {
    return get(cashRegisterId, tabUsageSingleUuid, monetaryAccountId, params, null);
  }

  /**
   * Get a collection of TabUsageSingle.
   */
  public static BunqResponse<List<TabUsageSingle>> list(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId), params, customHeaders);

    return fromJsonList(TabUsageSingle.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<TabUsageSingle>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<TabUsageSingle>> list(Integer cashRegisterId) {
    return list(cashRegisterId, null, null, null);
  }

  public static BunqResponse<List<TabUsageSingle>> list(Integer cashRegisterId, Integer monetaryAccountId) {
    return list(cashRegisterId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<TabUsageSingle>> list(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params) {
    return list(cashRegisterId, monetaryAccountId, params, null);
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
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.merchantReference != null) {
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

    if (this.amountPaid != null) {
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

  /**
   */
  public static TabUsageSingle fromJsonReader(JsonReader reader) {
    return fromJsonReader(TabUsageSingle.class, reader);
  }

}
