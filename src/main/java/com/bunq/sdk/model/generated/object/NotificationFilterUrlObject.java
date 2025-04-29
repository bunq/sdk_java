package com.bunq.sdk.model.generated.object;

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

/**
 */
public class NotificationFilterUrlObject extends BunqModel {

  /**
   * The id of the NotificationFilterUrl.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the NotificationFilterUrl's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the NotificationFilterUrl's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The notification category that will match this notification filter.
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * The users this filter pertains to.
   */
  @Expose
  @SerializedName("all_user_id")
  private List<String> allUserId;

  /**
   * The MAs this filter pertains to.
   */
  @Expose
  @SerializedName("all_monetary_account_id")
  private List<String> allMonetaryAccountId;

  /**
   * Type of verification required for the connection.
   */
  @Expose
  @SerializedName("all_verification_type")
  private List<String> allVerificationType;

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
   * The users this filter pertains to. OPTIONAL FOR BACKWARD COMPATIBILITY
   */
  @Expose
  @SerializedName("all_user_id_field_for_request")
  private List<String> allUserIdFieldForRequest;

  /**
   * The MAs this filter pertains to. OPTIONAL FOR BACKWARD COMPATIBILITY
   */
  @Expose
  @SerializedName("all_monetary_account_id_field_for_request")
  private List<String> allMonetaryAccountIdFieldForRequest;

  /**
   * Type of verification required for the connection.
   */
  @Expose
  @SerializedName("all_verification_type_field_for_request")
  private List<String> allVerificationTypeFieldForRequest;

  /**
   * The URL to which the callback should be made.
   */
  @Expose
  @SerializedName("notification_target_field_for_request")
  private String notificationTargetFieldForRequest;

  public NotificationFilterUrlObject() {
  this(null, null, null, null, null);
  }

  public NotificationFilterUrlObject(String category) {
  this(category, null, null, null, null);
  }

  public NotificationFilterUrlObject(String category, String notificationTarget) {
  this(category, notificationTarget, null, null, null);
  }

  public NotificationFilterUrlObject(String category, String notificationTarget, List<String> allUserId) {
  this(category, notificationTarget, allUserId, null, null);
  }

  public NotificationFilterUrlObject(String category, String notificationTarget, List<String> allUserId, List<String> allMonetaryAccountId) {
  this(category, notificationTarget, allUserId, allMonetaryAccountId, null);
  }

  public NotificationFilterUrlObject(String category, String notificationTarget, List<String> allUserId, List<String> allMonetaryAccountId, List<String> allVerificationType) {
    this.categoryFieldForRequest = category;
    this.allUserIdFieldForRequest = allUserId;
    this.allMonetaryAccountIdFieldForRequest = allMonetaryAccountId;
    this.allVerificationTypeFieldForRequest = allVerificationType;
    this.notificationTargetFieldForRequest = notificationTarget;
  }

  /**
   * The id of the NotificationFilterUrl.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the NotificationFilterUrl's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the NotificationFilterUrl's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
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
   * The users this filter pertains to.
   */
  public List<String> getAllUserId() {
    return this.allUserId;
  }

  public void setAllUserId(List<String> allUserId) {
    this.allUserId = allUserId;
  }

  /**
   * The MAs this filter pertains to.
   */
  public List<String> getAllMonetaryAccountId() {
    return this.allMonetaryAccountId;
  }

  public void setAllMonetaryAccountId(List<String> allMonetaryAccountId) {
    this.allMonetaryAccountId = allMonetaryAccountId;
  }

  /**
   * Type of verification required for the connection.
   */
  public List<String> getAllVerificationType() {
    return this.allVerificationType;
  }

  public void setAllVerificationType(List<String> allVerificationType) {
    this.allVerificationType = allVerificationType;
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
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.category != null) {
      return false;
    }

    if (this.allUserId != null) {
      return false;
    }

    if (this.allMonetaryAccountId != null) {
      return false;
    }

    if (this.allVerificationType != null) {
      return false;
    }

    if (this.notificationTarget != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NotificationFilterUrlObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterUrlObject.class, reader);
  }

}
