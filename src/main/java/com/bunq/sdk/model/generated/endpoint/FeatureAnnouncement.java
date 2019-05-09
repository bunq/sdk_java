package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Avatar;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * view for updating the feature display.
 */
public class FeatureAnnouncement extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/feature-announcement/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "FeatureAnnouncement";

  /**
   * The Avatar of the event overview.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The event overview title of the feature display
   */
  @Expose
  @SerializedName("title")
  private String title;

  /**
   * The event overview subtitle of the feature display
   */
  @Expose
  @SerializedName("sub_title")
  private String subTitle;

  /**
   */
  public static BunqResponse<FeatureAnnouncement> get(Integer featureAnnouncementId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), featureAnnouncementId), params, customHeaders);

    return fromJson(FeatureAnnouncement.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<FeatureAnnouncement> get() {
    return get(null, null, null);
  }

  public static BunqResponse<FeatureAnnouncement> get(Integer featureAnnouncementId) {
    return get(featureAnnouncementId, null, null);
  }

  public static BunqResponse<FeatureAnnouncement> get(Integer featureAnnouncementId, Map<String, String> params) {
    return get(featureAnnouncementId, params, null);
  }

  /**
   * The Avatar of the event overview.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The event overview title of the feature display
   */
  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The event overview subtitle of the feature display
   */
  public String getSubTitle() {
    return this.subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
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

    return true;
  }

  /**
   */
  public static FeatureAnnouncement fromJsonReader(JsonReader reader) {
    return fromJsonReader(FeatureAnnouncement.class, reader);
  }

}
