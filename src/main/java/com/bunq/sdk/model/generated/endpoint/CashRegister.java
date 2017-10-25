package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.NotificationFilter;
import com.bunq.sdk.model.generated.object.TabTextWaitingScreen;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

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
   * Field constants.
   */
  public static final String FIELD_NAME = "name";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_LOCATION = "location";
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";
  public static final String FIELD_TAB_TEXT_WAITING_SCREEN = "tab_text_waiting_screen";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/cash-register/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CashRegister";

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

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Create a new CashRegister. Only an UserCompany can create a CashRegisters. They need to be
   * created with status PENDING_APPROVAL, an bunq admin has to approve your CashRegister before
   * you can use it. In the sandbox testing environment an CashRegister will be automatically
   * approved immediately after creation.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<CashRegister> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId) {
    return get(apiContext, userId, monetaryAccountId, cashRegisterId, new HashMap<>());
  }

  /**
   * Get a specific CashRegister.
   */
  public static BunqResponse<CashRegister> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, cashRegisterId), new HashMap<>(), customHeaders);

    return fromJson(CashRegister.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, cashRegisterId, new HashMap<>());
  }

  /**
   * Modify or close an existing CashRegister. You must set the status back to PENDING_APPROVAL if
   * you modify the name, avatar or location of a CashRegister. To close a cash register put its
   * status to CLOSED.
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, cashRegisterId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<List<CashRegister>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<CashRegister>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   * Get a collection of CashRegister for a given user and monetary account.
   */
  public static BunqResponse<List<CashRegister>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(CashRegister.class, responseRaw, OBJECT_TYPE);
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

}
