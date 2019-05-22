package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class NotificationFilterUrl extends BunqModel {

  /**
   * The notification category that will match this notification filter.
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * The URL to which the callback should be made.
   */
  @Expose
  @SerializedName("notification_target")
  private String notificationTarget;

  /**
   * The notification category that will match this notification filter.
   */
  @Expose
  @SerializedName("category_field_for_request")
  private String categoryFieldForRequest;

  /**
   * The URL to which the callback should be made.
   */
  @Expose
  @SerializedName("notification_target_field_for_request")
  private String notificationTargetFieldForRequest;

  public NotificationFilterUrl() {
    this(null, null);
  }

  public NotificationFilterUrl(String category) {
    this(category, null);
  }

  public NotificationFilterUrl(String category, String notificationTarget) {
    this.categoryFieldForRequest = category;
    this.notificationTargetFieldForRequest = notificationTarget;
  }

  /**
   */
  public static NotificationFilterUrl fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterUrl.class, reader);
  }

  /**
   * The notification category that will match this notification filter.
   */
  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * The URL to which the callback should be made.
   */
  public String getNotificationTarget() {
    return this.notificationTarget;
  }

  public void setNotificationTarget(String notificationTarget) {
    this.notificationTarget = notificationTarget;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.category != null) {
      return false;
    }

    if (this.notificationTarget != null) {
      return false;
    }

    return true;
  }

}
