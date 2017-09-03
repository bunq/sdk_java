package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.Image;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Avatars are public images used to represent you or your company. Avatars are used to
 * represent users, monetary accounts and cash registers. Avatars cannot be deleted, only
 * replaced. Avatars can be updated after uploading the image you would like to use through
 * AttachmentPublic. Using the attachment_public_uuid which is returned you can update your
 * Avatar. Avatars used for cash registers and company accounts will be reviewed by bunq.
 */
public class Avatar extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_ATTACHMENT_PUBLIC_UUID = "attachment_public_uuid";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "avatar";
  private static final String ENDPOINT_URL_READ = "avatar/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "Avatar";

  /**
   * The UUID of the created avatar.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The content type of the image.
   */
  @Expose
  @SerializedName("image")
  private List<Image> image;

  public static BunqResponse<String> create(ApiContext apiContext, Map<String, Object> requestMap) {
    return create(apiContext, requestMap, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<String> create(ApiContext apiContext, Map<String, Object> requestMap,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(ENDPOINT_URL_CREATE, requestBytes, customHeaders);

    return processForUuid(responseRaw);
  }

  public static BunqResponse<Avatar> get(ApiContext apiContext, String avatarUuid) {
    return get(apiContext, avatarUuid, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Avatar> get(ApiContext apiContext, String avatarUuid,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, avatarUuid), new HashMap<>(), customHeaders);

    return fromJson(Avatar.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The UUID of the created avatar.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The content type of the image.
   */
  public List<Image> getImage() {
    return this.image;
  }

  public void setImage(List<Image> image) {
    this.image = image;
  }

}
