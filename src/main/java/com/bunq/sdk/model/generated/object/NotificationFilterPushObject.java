package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;

/**
 */
public class NotificationFilterPushObject extends BunqModel {

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

  public NotificationFilterPushObject() {
  this(null, null, null);
  }

  public NotificationFilterPushObject(String category) {
  this(category, null, null);
  }

  public NotificationFilterPushObject(String category, List<String> allUserId) {
  this(category, allUserId, null);
  }

  public NotificationFilterPushObject(String category, List<String> allUserId, List<String> allMonetaryAccountId) {
    this.categoryFieldForRequest = category;
    this.allUserIdFieldForRequest = allUserId;
    this.allMonetaryAccountIdFieldForRequest = allMonetaryAccountId;
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
   */
  public boolean isAllFieldNull() {
    if (this.category != null) {
      return false;
    }

    if (this.allUserId != null) {
      return false;
    }

    if (this.allMonetaryAccountId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NotificationFilterPushObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterPushObject.class, reader);
  }

}
