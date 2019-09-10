package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple";
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple/%s";
    protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple/%s";
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/tab-usage-multiple";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_POST = "Uuid";
    protected static final String OBJECT_TYPE_PUT = "Uuid";
    protected static final String OBJECT_TYPE_GET = "TabUsageMultiple";

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
     * An array of attachments that describe the tab. Viewable through the GET
     * /tab/{tabid}/attachment/{attachmentid}/content endpoint.
     */
    @Expose
    @SerializedName("tab_attachment")
    private List<BunqId> tabAttachment;

    /**
     * The description of the TabUsageMultiple. Maximum 9000 characters. Field is required but can
     * be an empty string.
     */
    @Expose
    @SerializedName("description_field_for_request")
    private String descriptionFieldForRequest;

    /**
     * The status of the TabUsageMultiple. On creation the status must be set to OPEN. You can
     * change the status from OPEN to PAYABLE. If the TabUsageMultiple gets paid the status will
     * remain PAYABLE.
     */
    @Expose
    @SerializedName("status_field_for_request")
    private String statusFieldForRequest;

    /**
     * The total amount of the Tab. Must be a positive amount. As long as the tab has the status
     * OPEN you can change the total amount. This amount is not affected by the amounts of the
     * TabItems. However, if you've created any TabItems for a Tab the sum of the amounts of these
     * items must be equal to the total_amount of the Tab when you change its status to PAYABLE
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
     * The moment when this Tab expires. Can be at most 365 days into the future.
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

    public TabUsageMultiple() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public TabUsageMultiple(String description) {
        this(description, null, null, null, null, null, null, null, null, null, null, null);
    }

    public TabUsageMultiple(String description, String status) {
        this(description, status, null, null, null, null, null, null, null, null, null, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal) {
        this(description, status, amountTotal, null, null, null, null, null, null, null, null, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal, Boolean allowAmountHigher) {
        this(description, status, amountTotal, allowAmountHigher, null, null, null, null, null, null, null, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal, Boolean allowAmountHigher, Boolean allowAmountLower) {
        this(description, status, amountTotal, allowAmountHigher, allowAmountLower, null, null, null, null, null, null, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip) {
        this(description, status, amountTotal, allowAmountHigher, allowAmountLower, wantTip, null, null, null, null, null, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge) {
        this(description, status, amountTotal, allowAmountHigher, allowAmountLower, wantTip, minimumAge, null, null, null, null, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress) {
        this(description, status, amountTotal, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, null, null, null, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl) {
        this(description, status, amountTotal, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, null, null, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility) {
        this(description, status, amountTotal, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, null, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration) {
        this(description, status, amountTotal, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, expiration, null);
    }

    public TabUsageMultiple(String description, String status, Amount amountTotal, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration, List<BunqId> tabAttachment) {
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
     * Create a TabUsageMultiple. On creation the status must be set to OPEN
     *
     * @param description       The description of the TabUsageMultiple. Maximum 9000 characters. Field is
     *                          required but can be an empty string.
     * @param status            The status of the TabUsageMultiple. On creation the status must be set to OPEN.
     *                          You can change the status from OPEN to PAYABLE. If the TabUsageMultiple gets paid the status
     *                          will remain PAYABLE.
     * @param amountTotal       The total amount of the Tab. Must be a positive amount. As long as the tab
     *                          has the status OPEN you can change the total amount. This amount is not affected by the
     *                          amounts of the TabItems. However, if you've created any TabItems for a Tab the sum of the
     *                          amounts of these items must be equal to the total_amount of the Tab when you change its
     *                          status to PAYABLE
     * @param allowAmountHigher [DEPRECATED] Whether or not a higher amount can be paid.
     * @param allowAmountLower  [DEPRECATED] Whether or not a lower amount can be paid.
     * @param wantTip           [DEPRECATED] Whether or not the user paying the Tab should be asked if he
     *                          wants to give a tip. When want_tip is set to true, allow_amount_higher must also be set to
     *                          true and allow_amount_lower must be false.
     * @param minimumAge        The minimum age of the user paying the Tab.
     * @param requireAddress    Whether a billing and shipping address must be provided when paying the
     *                          Tab. Possible values are: BILLING, SHIPPING, BILLING_SHIPPING, NONE, OPTIONAL. Default is
     *                          NONE.
     * @param redirectUrl       The URL which the user is sent to after paying the Tab.
     * @param visibility        The visibility of a Tab. A Tab can be visible trough NearPay, the QR code
     *                          of the CashRegister and its own QR code.
     * @param expiration        The moment when this Tab expires. Can be at most 365 days into the future.
     * @param tabAttachment     An array of attachments that describe the tab. Uploaded through the POST
     *                          /user/{userid}/attachment-tab endpoint.
     */
    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration, List<BunqId> tabAttachment, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
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

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId), requestBytes, customHeaders);

        return processForUuid(responseRaw);
    }

    public static BunqResponse<String> create() {
        return create(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId) {
        return create(cashRegisterId, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description) {
        return create(cashRegisterId, description, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status) {
        return create(cashRegisterId, description, status, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal) {
        return create(cashRegisterId, description, status, amountTotal, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, allowAmountHigher, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher, Boolean allowAmountLower) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, allowAmountHigher, allowAmountLower, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, allowAmountHigher, allowAmountLower, wantTip, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, allowAmountHigher, allowAmountLower, wantTip, minimumAge, null, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, null, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, null, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, null, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, expiration, null, null);
    }

    public static BunqResponse<String> create(Integer cashRegisterId, String description, String status, Amount amountTotal, Integer monetaryAccountId, Boolean allowAmountHigher, Boolean allowAmountLower, Boolean wantTip, Integer minimumAge, String requireAddress, String redirectUrl, TabVisibility visibility, String expiration, List<BunqId> tabAttachment) {
        return create(cashRegisterId, description, status, amountTotal, monetaryAccountId, allowAmountHigher, allowAmountLower, wantTip, minimumAge, requireAddress, redirectUrl, visibility, expiration, tabAttachment, null);
    }

    /**
     * Modify a specific TabUsageMultiple. You can change the amount_total, status and visibility.
     * Once you change the status to PAYABLE the TabUsageMultiple will expire after a year
     * (default). If you've created any TabItems for a Tab the sum of the amounts of these items
     * must be equal to the total_amount of the Tab when you change its status to PAYABLE.
     *
     * @param status        The status of the TabUsageMultiple. On creation the status must be set to OPEN.
     *                      You can change the status from OPEN to PAYABLE. If the TabUsageMultiple gets paid the status
     *                      will remain PAYABLE.
     * @param amountTotal   The total amount of the Tab. Must be a positive amount. As long as the tab
     *                      has the status OPEN you can change the total amount. This amount is not affected by the
     *                      amounts of the TabItems. However, if you've created any TabItems for a Tab the sum of the
     *                      amounts of these items must be equal to the total_amount of the Tab when you change its
     *                      status to PAYABLE
     * @param visibility    The visibility of a Tab. A Tab can be visible trough NearPay, the QR code
     *                      of the CashRegister and its own QR code.
     * @param expiration    The moment when this Tab expires. Can be at most 365 days into the future.
     * @param tabAttachment An array of attachments that describe the tab. Uploaded through the POST
     *                      /user/{userid}/attachment-tab endpoint.
     */
    public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId, String status, Amount amountTotal, TabVisibility visibility, String expiration, List<BunqId> tabAttachment, Map<String, String> customHeaders) {
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

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUsageMultipleUuid), requestBytes, customHeaders);

        return processForUuid(responseRaw);
    }

    public static BunqResponse<String> update(Integer cashRegisterId) {
        return update(cashRegisterId, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageMultipleUuid) {
        return update(cashRegisterId, tabUsageMultipleUuid, null, null, null, null, null, null, null);
    }

    public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId) {
        return update(cashRegisterId, tabUsageMultipleUuid, monetaryAccountId, null, null, null, null, null, null);
    }

    public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId, String status) {
        return update(cashRegisterId, tabUsageMultipleUuid, monetaryAccountId, status, null, null, null, null, null);
    }

    public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId, String status, Amount amountTotal) {
        return update(cashRegisterId, tabUsageMultipleUuid, monetaryAccountId, status, amountTotal, null, null, null, null);
    }

    public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId, String status, Amount amountTotal, TabVisibility visibility) {
        return update(cashRegisterId, tabUsageMultipleUuid, monetaryAccountId, status, amountTotal, visibility, null, null, null);
    }

    public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId, String status, Amount amountTotal, TabVisibility visibility, String expiration) {
        return update(cashRegisterId, tabUsageMultipleUuid, monetaryAccountId, status, amountTotal, visibility, expiration, null, null);
    }

    public static BunqResponse<String> update(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId, String status, Amount amountTotal, TabVisibility visibility, String expiration, List<BunqId> tabAttachment) {
        return update(cashRegisterId, tabUsageMultipleUuid, monetaryAccountId, status, amountTotal, visibility, expiration, tabAttachment, null);
    }

    /**
     * Close a specific TabUsageMultiple.
     */
    public static BunqResponse<TabUsageMultiple> delete(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUsageMultipleUuid), customHeaders);

        return new BunqResponse<>(null, responseRaw.getHeaders());
    }

    public static BunqResponse<TabUsageMultiple> delete(Integer cashRegisterId) {
        return delete(cashRegisterId, null, null, null);
    }

    public static BunqResponse<TabUsageMultiple> delete(Integer cashRegisterId, String tabUsageMultipleUuid) {
        return delete(cashRegisterId, tabUsageMultipleUuid, null, null);
    }

    public static BunqResponse<TabUsageMultiple> delete(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId) {
        return delete(cashRegisterId, tabUsageMultipleUuid, monetaryAccountId, null);
    }

    /**
     * Get a specific TabUsageMultiple.
     */
    public static BunqResponse<TabUsageMultiple> get(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUsageMultipleUuid), params, customHeaders);

        return fromJson(TabUsageMultiple.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<TabUsageMultiple> get() {
        return get(null, null, null, null, null);
    }

    public static BunqResponse<TabUsageMultiple> get(Integer cashRegisterId) {
        return get(cashRegisterId, null, null, null, null);
    }

    public static BunqResponse<TabUsageMultiple> get(Integer cashRegisterId, String tabUsageMultipleUuid) {
        return get(cashRegisterId, tabUsageMultipleUuid, null, null, null);
    }

    public static BunqResponse<TabUsageMultiple> get(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId) {
        return get(cashRegisterId, tabUsageMultipleUuid, monetaryAccountId, null, null);
    }

    public static BunqResponse<TabUsageMultiple> get(Integer cashRegisterId, String tabUsageMultipleUuid, Integer monetaryAccountId, Map<String, String> params) {
        return get(cashRegisterId, tabUsageMultipleUuid, monetaryAccountId, params, null);
    }

    /**
     * Get a collection of TabUsageMultiple.
     */
    public static BunqResponse<List<TabUsageMultiple>> list(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId), params, customHeaders);

        return fromJsonList(TabUsageMultiple.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<TabUsageMultiple>> list() {
        return list(null, null, null, null);
    }

    public static BunqResponse<List<TabUsageMultiple>> list(Integer cashRegisterId) {
        return list(cashRegisterId, null, null, null);
    }

    public static BunqResponse<List<TabUsageMultiple>> list(Integer cashRegisterId, Integer monetaryAccountId) {
        return list(cashRegisterId, monetaryAccountId, null, null);
    }

    public static BunqResponse<List<TabUsageMultiple>> list(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params) {
        return list(cashRegisterId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static TabUsageMultiple fromJsonReader(JsonReader reader) {
        return fromJsonReader(TabUsageMultiple.class, reader);
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
     *
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
