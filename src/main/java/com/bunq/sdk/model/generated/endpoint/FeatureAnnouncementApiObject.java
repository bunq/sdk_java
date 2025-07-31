package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AvatarObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * view for creating the feature announcement.
 */
public class FeatureAnnouncementApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_TITLE = "title";
  public static final String FIELD_SUB_TITLE = "sub_title";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_FEATURE_ACCESS_ID = "feature_access_id";
  public static final String FIELD_CONTENT_TYPE = "content_type";

  /**
   * The Avatar of the event overview.
   */
  @Expose
  @SerializedName("avatar")
  private AvatarObject avatar;

  /**
   * The event title of the feature announcement.
   */
  @Expose
  @SerializedName("title")
  private List<String> title;

  /**
   * The event sub title of the feature announcement.
   */
  @Expose
  @SerializedName("sub_title")
  private List<String> subTitle;

  /**
   * The type of the feature announcement.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The status of the feature announcement.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The event sub title of the feature announcement.
   */
  @Expose
  @SerializedName("all_feature_announcement_content")
  private List<String> allFeatureAnnouncementContent;

  /**
   * The avatar uuid.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The event title of the feature announcement.
   */
  @Expose
  @SerializedName("title_field_for_request")
  private List<String> titleFieldForRequest;

  /**
   * The event sub title of the feature announcement.
   */
  @Expose
  @SerializedName("sub_title_field_for_request")
  private List<String> subTitleFieldForRequest;

  /**
   * The status of the feature announcement.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The feature access id that controls the feature announcement.
   */
  @Expose
  @SerializedName("feature_access_id_field_for_request")
  private String featureAccessIdFieldForRequest;

  /**
   * The content type of the feature announcement.
   */
  @Expose
  @SerializedName("content_type_field_for_request")
  private String contentTypeFieldForRequest;

  public FeatureAnnouncementApiObject() {
  this(null, null, null, null, null, null);
  }

  public FeatureAnnouncementApiObject(List<String> title) {
  this(title, null, null, null, null, null);
  }

  public FeatureAnnouncementApiObject(List<String> title, List<String> subTitle) {
  this(title, subTitle, null, null, null, null);
  }

  public FeatureAnnouncementApiObject(List<String> title, List<String> subTitle, String contentType) {
  this(title, subTitle, contentType, null, null, null);
  }

  public FeatureAnnouncementApiObject(List<String> title, List<String> subTitle, String contentType, String avatarUuid) {
  this(title, subTitle, contentType, avatarUuid, null, null);
  }

  public FeatureAnnouncementApiObject(List<String> title, List<String> subTitle, String contentType, String avatarUuid, String status) {
  this(title, subTitle, contentType, avatarUuid, status, null);
  }

  public FeatureAnnouncementApiObject(List<String> title, List<String> subTitle, String contentType, String avatarUuid, String status, String featureAccessId) {
    this.avatarUuidFieldForRequest = avatarUuid;
    this.titleFieldForRequest = title;
    this.subTitleFieldForRequest = subTitle;
    this.statusFieldForRequest = status;
    this.featureAccessIdFieldForRequest = featureAccessId;
    this.contentTypeFieldForRequest = contentType;
  }

  /**
   * The Avatar of the event overview.
   */
  public AvatarObject getAvatar() {
    return this.avatar;
  }

  public void setAvatar(AvatarObject avatar) {
    this.avatar = avatar;
  }

  /**
   * The event title of the feature announcement.
   */
  public List<String> getTitle() {
    return this.title;
  }

  public void setTitle(List<String> title) {
    this.title = title;
  }

  /**
   * The event sub title of the feature announcement.
   */
  public List<String> getSubTitle() {
    return this.subTitle;
  }

  public void setSubTitle(List<String> subTitle) {
    this.subTitle = subTitle;
  }

  /**
   * The type of the feature announcement.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The status of the feature announcement.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The event sub title of the feature announcement.
   */
  public List<String> getAllFeatureAnnouncementContent() {
    return this.allFeatureAnnouncementContent;
  }

  public void setAllFeatureAnnouncementContent(List<String> allFeatureAnnouncementContent) {
    this.allFeatureAnnouncementContent = allFeatureAnnouncementContent;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.avatar != null) {
      return false;
    }

    if (this.title != null) {
      return false;
    }

    if (this.subTitle != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.allFeatureAnnouncementContent != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static FeatureAnnouncementApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(FeatureAnnouncementApiObject.class, reader);
  }

}
