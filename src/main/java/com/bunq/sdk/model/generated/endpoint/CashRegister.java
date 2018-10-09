package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.NotificationFilter;
import com.bunq.sdk.model.generated.object.TabTextWaitingScreen;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CashRegisters are virtual points of sale. They have a specific name and avatar, and
 * optionally, a location.<br/>With a CashRegister you can create a Tab and then use a QR code
 * to receive payments.<br/>Check out our Quickstart example to learn how you can easily <a
 * href="/api/1/page/usecase-tab-payment">create Tab payments</a>.<br/><br/>Notification filters
 * can be set on a CashRegister to receive callbacks. For more information check the <a
 * href="/api/1/page/callbacks">dedicated callbacks page</a>.
 */
public class CashRegister extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/cash-register/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register";

  /**
   * Field constants.
   */
  public static final String FIELD_NAME = "name";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_LOCATION = "location";
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";
  public static final String FIELD_TAB_TEXT_WAITING_SCREEN = "tab_text_waiting_screen";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CashRegister";

  /**
   * The id of the created CashRegister.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the CashRegister's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the CashRegister's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The name of the CashRegister.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The status of the CashRegister. Can be PENDING_APPROVAL, ACTIVE, DENIED or CLOSED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The Avatar of the CashRegister.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The geolocation of the CashRegister. Can be null.
   */
  @Expose
  @SerializedName("location")
  private Geolocation location;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * CashRegister.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilter> notificationFilters;

  /**
   * The tab text for waiting screen of CashRegister.
   */
  @Expose
  @SerializedName("tab_text_waiting_screen")
  private List<TabTextWaitingScreen> tabTextWaitingScreen;

  /**
   * The name of the CashRegister. Must be unique for this MonetaryAccount.
   */
  @Expose
  @SerializedName("name_field_for_request")
  private String nameFieldForRequest;

  /**
   * The status of the CashRegister. Can only be created or updated with PENDING_APPROVAL or
   * CLOSED.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The UUID of the avatar of the CashRegister. Use the calls /attachment-public and /avatar to
   * create a new Avatar and get its UUID.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The geolocation of the CashRegister.
   */
  @Expose
  @SerializedName("location_field_for_request")
  private Geolocation locationFieldForRequest;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * CashRegister.
   */
  @Expose
  @SerializedName("notification_filters_field_for_request")
  private List<NotificationFilter> notificationFiltersFieldForRequest;

  /**
   * The tab text for waiting screen of CashRegister.
   */
  @Expose
  @SerializedName("tab_text_waiting_screen_field_for_request")
  private List<TabTextWaitingScreen> tabTextWaitingScreenFieldForRequest;

  public CashRegister() {
    this(null, null, null, null, null, null);
  }

  public CashRegister(String name) {
    this(name, null, null, null, null, null);
  }

  public CashRegister(String name, String status) {
    this(name, status, null, null, null, null);
  }

  public CashRegister(String name, String status, String avatarUuid) {
    this(name, status, avatarUuid, null, null, null);
  }

  public CashRegister(String name, String status, String avatarUuid, Geolocation location) {
    this(name, status, avatarUuid, location, null, null);
  }

  public CashRegister(String name, String status, String avatarUuid, Geolocation location, List<NotificationFilter> notificationFilters) {
    this(name, status, avatarUuid, location, notificationFilters, null);
  }

  public CashRegister(String name, String status, String avatarUuid, Geolocation location, List<NotificationFilter> notificationFilters, List<TabTextWaitingScreen> tabTextWaitingScreen) {
    this.nameFieldForRequest = name;
    this.statusFieldForRequest = status;
    this.avatarUuidFieldForRequest = avatarUuid;
    this.locationFieldForRequest = location;
    this.notificationFiltersFieldForRequest = notificationFilters;
    this.tabTextWaitingScreenFieldForRequest = tabTextWaitingScreen;
  }

  /**
   * Create a new CashRegister. Only an UserCompany can create a CashRegisters. They need to be
   * created with status PENDING_APPROVAL, an bunq admin has to approve your CashRegister before
   * you can use it. In the sandbox testing environment an CashRegister will be automatically
   * approved immediately after creation.
   *
   * @param name                 The name of the CashRegister. Must be unique for this MonetaryAccount.
   * @param status               The status of the CashRegister. Can only be created or updated with
   *                             PENDING_APPROVAL or CLOSED.
   * @param avatarUuid           The UUID of the avatar of the CashRegister. Use the calls
   *                             /attachment-public and /avatar to create a new Avatar and get its UUID.
   * @param location             The geolocation of the CashRegister.
   * @param notificationFilters  The types of notifications that will result in a push notification
   *                             or URL callback for this CashRegister.
   * @param tabTextWaitingScreen The tab text for waiting screen of CashRegister.
   */
  public static BunqResponse<Integer> create(String name, String status, String avatarUuid, Integer monetaryAccountId, Geolocation location, List<NotificationFilter> notificationFilters, List<TabTextWaitingScreen> tabTextWaitingScreen, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_NAME, name);
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_AVATAR_UUID, avatarUuid);
    requestMap.put(FIELD_LOCATION, location);
    requestMap.put(FIELD_NOTIFICATION_FILTERS, notificationFilters);
    requestMap.put(FIELD_TAB_TEXT_WAITING_SCREEN, tabTextWaitingScreen);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name) {
    return create(name, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, String status) {
    return create(name, status, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, String status, String avatarUuid) {
    return create(name, status, avatarUuid, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, String status, String avatarUuid, Integer monetaryAccountId) {
    return create(name, status, avatarUuid, monetaryAccountId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, String status, String avatarUuid, Integer monetaryAccountId, Geolocation location) {
    return create(name, status, avatarUuid, monetaryAccountId, location, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, String status, String avatarUuid, Integer monetaryAccountId, Geolocation location, List<NotificationFilter> notificationFilters) {
    return create(name, status, avatarUuid, monetaryAccountId, location, notificationFilters, null, null);
  }

  public static BunqResponse<Integer> create(String name, String status, String avatarUuid, Integer monetaryAccountId, Geolocation location, List<NotificationFilter> notificationFilters, List<TabTextWaitingScreen> tabTextWaitingScreen) {
    return create(name, status, avatarUuid, monetaryAccountId, location, notificationFilters, tabTextWaitingScreen, null);
  }

  /**
   * Get a specific CashRegister.
   */
  public static BunqResponse<CashRegister> get(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId), params, customHeaders);

    return fromJson(CashRegister.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CashRegister> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<CashRegister> get(Integer cashRegisterId) {
    return get(cashRegisterId, null, null, null);
  }

  public static BunqResponse<CashRegister> get(Integer cashRegisterId, Integer monetaryAccountId) {
    return get(cashRegisterId, monetaryAccountId, null, null);
  }

  public static BunqResponse<CashRegister> get(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params) {
    return get(cashRegisterId, monetaryAccountId, params, null);
  }

  /**
   * Modify or close an existing CashRegister. You must set the status back to PENDING_APPROVAL if
   * you modify the name, avatar or location of a CashRegister. To close a cash register put its
   * status to CLOSED.
   *
   * @param name                 The name of the CashRegister. Must be unique for this MonetaryAccount.
   * @param status               The status of the CashRegister. Can only be created or updated with
   *                             PENDING_APPROVAL or CLOSED.
   * @param avatarUuid           The UUID of the avatar of the CashRegister. Use the calls
   *                             /attachment-public and /avatar to create a new Avatar and get its UUID.
   * @param location             The geolocation of the CashRegister.
   * @param notificationFilters  The types of notifications that will result in a push notification
   *                             or URL callback for this CashRegister.
   * @param tabTextWaitingScreen The tab text for waiting screen of CashRegister.
   */
  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer monetaryAccountId, String name, String status, String avatarUuid, Geolocation location, List<NotificationFilter> notificationFilters, List<TabTextWaitingScreen> tabTextWaitingScreen, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_NAME, name);
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_AVATAR_UUID, avatarUuid);
    requestMap.put(FIELD_LOCATION, location);
    requestMap.put(FIELD_NOTIFICATION_FILTERS, notificationFilters);
    requestMap.put(FIELD_TAB_TEXT_WAITING_SCREEN, tabTextWaitingScreen);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId) {
    return update(cashRegisterId, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer monetaryAccountId) {
    return update(cashRegisterId, monetaryAccountId, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer monetaryAccountId, String name) {
    return update(cashRegisterId, monetaryAccountId, name, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer monetaryAccountId, String name, String status) {
    return update(cashRegisterId, monetaryAccountId, name, status, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer monetaryAccountId, String name, String status, String avatarUuid) {
    return update(cashRegisterId, monetaryAccountId, name, status, avatarUuid, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer monetaryAccountId, String name, String status, String avatarUuid, Geolocation location) {
    return update(cashRegisterId, monetaryAccountId, name, status, avatarUuid, location, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer monetaryAccountId, String name, String status, String avatarUuid, Geolocation location, List<NotificationFilter> notificationFilters) {
    return update(cashRegisterId, monetaryAccountId, name, status, avatarUuid, location, notificationFilters, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer monetaryAccountId, String name, String status, String avatarUuid, Geolocation location, List<NotificationFilter> notificationFilters, List<TabTextWaitingScreen> tabTextWaitingScreen) {
    return update(cashRegisterId, monetaryAccountId, name, status, avatarUuid, location, notificationFilters, tabTextWaitingScreen, null);
  }

  /**
   * Get a collection of CashRegister for a given user and monetary account.
   */
  public static BunqResponse<List<CashRegister>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(CashRegister.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CashRegister>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<CashRegister>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<CashRegister>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The id of the created CashRegister.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the CashRegister's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the CashRegister's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The name of the CashRegister.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The status of the CashRegister. Can be PENDING_APPROVAL, ACTIVE, DENIED or CLOSED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The Avatar of the CashRegister.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The geolocation of the CashRegister. Can be null.
   */
  public Geolocation getLocation() {
    return this.location;
  }

  public void setLocation(Geolocation location) {
    this.location = location;
  }

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * CashRegister.
   */
  public List<NotificationFilter> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilter> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

  /**
   * The tab text for waiting screen of CashRegister.
   */
  public List<TabTextWaitingScreen> getTabTextWaitingScreen() {
    return this.tabTextWaitingScreen;
  }

  public void setTabTextWaitingScreen(List<TabTextWaitingScreen> tabTextWaitingScreen) {
    this.tabTextWaitingScreen = tabTextWaitingScreen;
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

    if (this.name != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    if (this.location != null) {
      return false;
    }

    if (this.notificationFilters != null) {
      return false;
    }

    if (this.tabTextWaitingScreen != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CashRegister fromJsonReader(JsonReader reader) {
    return fromJsonReader(CashRegister.class, reader);
  }

}
