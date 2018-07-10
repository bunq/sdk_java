package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class NotificationFilter extends BunqModel {

  /**
   * The delivery method via which notifications that match this notification filter will be
   * delivered. Possible choices are PUSH for delivery via push notification and URL for delivery
   * via URL callback.
   */
  @Expose
  @SerializedName("notification_delivery_method")
  private String notificationDeliveryMethod;

  /**
   * The target of notifications that match this notification filter. For URL notification filters
   * this is the URL to which the callback will be made. For PUSH notifications filters this
   * should always be null.
   */
  @Expose
  @SerializedName("notification_target")
  private String notificationTarget;

  /**
   * The notification category that will match this notification filter. Possible choices are
   * BILLING, CARD_TRANSACTION_FAILED, CARD_TRANSACTION_SUCCESSFUL, CHAT, DRAFT_PAYMENT, IDEAL,
   * SOFORT, MONETARY_ACCOUNT_PROFILE, MUTATION, PAYMENT, PROMOTION, REQUEST, SCHEDULE_RESULT,
   * SCHEDULE_STATUS, SHARE, SUPPORT, TAB_RESULT, USER_APPROVAL.
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * The delivery method via which notifications that match this notification filter will be
   * delivered. Possible choices are PUSH for delivery via push notification and URL for delivery
   * via URL callback.
   */
  @Expose
  @SerializedName("notification_delivery_method_field_for_request")
  private String notificationDeliveryMethodFieldForRequest;

  /**
   * The target of notifications that match this notification filter. For URL notification filters
   * this is the URL to which the callback will be made. For PUSH notifications filters this
   * should always be null.
   */
  @Expose
  @SerializedName("notification_target_field_for_request")
  private String notificationTargetFieldForRequest;

  /**
   * The notification category that will match this notification filter. Possible choices are
   * BILLING, CARD_TRANSACTION_FAILED, CARD_TRANSACTION_SUCCESSFUL, CHAT, DRAFT_PAYMENT, IDEAL,
   * SOFORT, MONETARY_ACCOUNT_PROFILE, MUTATION, PAYMENT, PROMOTION, REQUEST, SCHEDULE_RESULT,
   * SCHEDULE_STATUS, SHARE, SUPPORT, TAB_RESULT, USER_APPROVAL.
   */
  @Expose
  @SerializedName("category_field_for_request")
  private String categoryFieldForRequest;

  public NotificationFilter() {
    this(null, null, null);
  }

  public NotificationFilter(String notificationDeliveryMethod) {
    this(notificationDeliveryMethod, null, null);
  }

  public NotificationFilter(String notificationDeliveryMethod, String notificationTarget) {
    this(notificationDeliveryMethod, notificationTarget, null);
  }

  public NotificationFilter(String notificationDeliveryMethod, String notificationTarget, String category) {
    this.notificationDeliveryMethodFieldForRequest = notificationDeliveryMethod;
    this.notificationTargetFieldForRequest = notificationTarget;
    this.categoryFieldForRequest = category;
  }

  /**
   * The delivery method via which notifications that match this notification filter will be
   * delivered. Possible choices are PUSH for delivery via push notification and URL for delivery
   * via URL callback.
   */
  public String getNotificationDeliveryMethod() {
    return this.notificationDeliveryMethod;
  }

  public void setNotificationDeliveryMethod(String notificationDeliveryMethod) {
    this.notificationDeliveryMethod = notificationDeliveryMethod;
  }

  /**
   * The target of notifications that match this notification filter. For URL notification filters
   * this is the URL to which the callback will be made. For PUSH notifications filters this
   * should always be null.
   */
  public String getNotificationTarget() {
    return this.notificationTarget;
  }

  public void setNotificationTarget(String notificationTarget) {
    this.notificationTarget = notificationTarget;
  }

  /**
   * The notification category that will match this notification filter. Possible choices are
   * BILLING, CARD_TRANSACTION_FAILED, CARD_TRANSACTION_SUCCESSFUL, CHAT, DRAFT_PAYMENT, IDEAL,
   * SOFORT, MONETARY_ACCOUNT_PROFILE, MUTATION, PAYMENT, PROMOTION, REQUEST, SCHEDULE_RESULT,
   * SCHEDULE_STATUS, SHARE, SUPPORT, TAB_RESULT, USER_APPROVAL.
   */
  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.notificationDeliveryMethod != null) {
      return false;
    }

    if (this.notificationTarget != null) {
      return false;
    }

    if (this.category != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NotificationFilter fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilter.class, reader);
  }

}
