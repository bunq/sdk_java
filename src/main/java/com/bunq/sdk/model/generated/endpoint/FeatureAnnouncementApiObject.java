package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
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
import javax.lang.model.type.NullType;

/**
 * view for updating the feature display.
 */
public class FeatureAnnouncementApiObject extends BunqModel {

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
  private AvatarObject avatar;

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
   * The type of the feature announcement so apps can override with their own stuff if desired
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   */
  public static BunqResponse<FeatureAnnouncementApiObject> get(Integer featureAnnouncementId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), featureAnnouncementId), params, customHeaders);

    return fromJson(FeatureAnnouncementApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<FeatureAnnouncementApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<FeatureAnnouncementApiObject> get(Integer featureAnnouncementId) {
    return get(featureAnnouncementId, null, null);
  }

  public static BunqResponse<FeatureAnnouncementApiObject> get(Integer featureAnnouncementId, Map<String, String> params) {
    return get(featureAnnouncementId, params, null);
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
   * The type of the feature announcement so apps can override with their own stuff if desired
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
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

    return true;
  }

  /**
   */
  public static FeatureAnnouncementApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(FeatureAnnouncementApiObject.class, reader);
  }

}
