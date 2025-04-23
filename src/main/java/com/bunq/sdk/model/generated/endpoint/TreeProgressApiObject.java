package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelUserObject;
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
 * See how many trees this user has planted.
 */
public class TreeProgressApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/tree-progress";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "TreeProgress";

  /**
   * The number of trees this user and all users have planted.
   */
  @Expose
  @SerializedName("number_of_tree")
  private BigDecimal numberOfTree;

  /**
   * The progress towards the next tree.
   */
  @Expose
  @SerializedName("progress_tree_next")
  private BigDecimal progressTreeNext;

  /**
   * URL of the invite profile.
   */
  @Expose
  @SerializedName("url_invite_profile")
  private String urlInviteProfile;

  /**
   * The label of the user the progress belongs to.
   */
  @Expose
  @SerializedName("label_user")
  private LabelUserObject labelUser;

  /**
   */
  public static BunqResponse<List<TreeProgressApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(TreeProgressApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<TreeProgressApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<TreeProgressApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The number of trees this user and all users have planted.
   */
  public BigDecimal getNumberOfTree() {
    return this.numberOfTree;
  }

  public void setNumberOfTree(BigDecimal numberOfTree) {
    this.numberOfTree = numberOfTree;
  }

  /**
   * The progress towards the next tree.
   */
  public BigDecimal getProgressTreeNext() {
    return this.progressTreeNext;
  }

  public void setProgressTreeNext(BigDecimal progressTreeNext) {
    this.progressTreeNext = progressTreeNext;
  }

  /**
   * URL of the invite profile.
   */
  public String getUrlInviteProfile() {
    return this.urlInviteProfile;
  }

  public void setUrlInviteProfile(String urlInviteProfile) {
    this.urlInviteProfile = urlInviteProfile;
  }

  /**
   * The label of the user the progress belongs to.
   */
  public LabelUserObject getLabelUser() {
    return this.labelUser;
  }

  public void setLabelUser(LabelUserObject labelUser) {
    this.labelUser = labelUser;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.numberOfTree != null) {
      return false;
    }

    if (this.progressTreeNext != null) {
      return false;
    }

    if (this.urlInviteProfile != null) {
      return false;
    }

    if (this.labelUser != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TreeProgressApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(TreeProgressApiObject.class, reader);
  }

}
