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
 * Manage the notification filter groups for a user.
 */
public class NotificationFilterGroup extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/notification-filter-group";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/notification-filter-group";

  /**
   * Field constants.
   */
  public static final String FIELD_GROUP = "group";
  public static final String FIELD_STATUS_PUSH = "status_push";
  public static final String FIELD_STATUS_EMAIL = "status_email";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "NotificationFilterGroup";
  protected static final String OBJECT_TYPE_GET = "NotificationFilterGroup";

  /**
   * The notification filter group.
   */
  @Expose
  @SerializedName("group")
  private String group;

  /**
   * The status for push messaging.
   */
  @Expose
  @SerializedName("status_push")
  private String statusPush;

  /**
   * The status for emails.
   */
  @Expose
  @SerializedName("status_email")
  private String statusEmail;

  /**
   * The notification filter group.
   */
  @Expose
  @SerializedName("group_field_for_request")
  private String groupFieldForRequest;

  /**
   * The status for push messaging.
   */
  @Expose
  @SerializedName("status_push_field_for_request")
  private String statusPushFieldForRequest;

  /**
   * The status for emails.
   */
  @Expose
  @SerializedName("status_email_field_for_request")
  private String statusEmailFieldForRequest;

  public NotificationFilterGroup() {
  this(null, null, null);
  }

  public NotificationFilterGroup(String group) {
  this(group, null, null);
  }

  public NotificationFilterGroup(String group, String statusPush) {
  this(group, statusPush, null);
  }

  public NotificationFilterGroup(String group, String statusPush, String statusEmail) {
    this.groupFieldForRequest = group;
    this.statusPushFieldForRequest = statusPush;
    this.statusEmailFieldForRequest = statusEmail;
  }  /**
   * @param group The notification filter group.
   * @param statusPush The status for push messaging.
   * @param statusEmail The status for emails.
   */
  public static BunqResponse<NotificationFilterGroup> create(String group, String statusPush, String statusEmail, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_GROUP, group);
requestMap.put(FIELD_STATUS_PUSH, statusPush);
requestMap.put(FIELD_STATUS_EMAIL, statusEmail);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(NotificationFilterGroup.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<NotificationFilterGroup> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<NotificationFilterGroup> create(String group) {
    return create(group, null, null, null);
  }

  public static BunqResponse<NotificationFilterGroup> create(String group, String statusPush) {
    return create(group, statusPush, null, null);
  }

  public static BunqResponse<NotificationFilterGroup> create(String group, String statusPush, String statusEmail) {
    return create(group, statusPush, statusEmail, null);
  }

  /**
   */
  public static BunqResponse<List<NotificationFilterGroup>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(NotificationFilterGroup.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NotificationFilterGroup>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<NotificationFilterGroup>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The notification filter group.
   */
  public String getGroup() {
    return this.group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * The status for push messaging.
   */
  public String getStatusPush() {
    return this.statusPush;
  }

  public void setStatusPush(String statusPush) {
    this.statusPush = statusPush;
  }

  /**
   * The status for emails.
   */
  public String getStatusEmail() {
    return this.statusEmail;
  }

  public void setStatusEmail(String statusEmail) {
    this.statusEmail = statusEmail;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.group != null) {
      return false;
    }

    if (this.statusPush != null) {
      return false;
    }

    if (this.statusEmail != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NotificationFilterGroup fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterGroup.class, reader);
  }

}
