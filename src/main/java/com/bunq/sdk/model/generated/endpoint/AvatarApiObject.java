package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.ImageObject;
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
 * Avatars are public images used to represent you or your company. Avatars are used to
 * represent users, monetary accounts and cash registers. Avatars cannot be deleted, only
 * replaced. Avatars can be updated after uploading the image you would like to use through
 * AttachmentPublic. Using the attachment_public_uuid which is returned you can update your
 * Avatar. Avatars used for cash registers and company accounts will be reviewed by bunq.
 */
public class AvatarApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "avatar";
  protected static final String ENDPOINT_URL_READ = "avatar/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_ATTACHMENT_PUBLIC_UUID = "attachment_public_uuid";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "Uuid";
  protected static final String OBJECT_TYPE_GET = "Avatar";

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
  private List<ImageObject> image;

  /**
   * The public UUID of the public attachment from which an avatar image must be created.
   */
  @Expose
  @SerializedName("attachment_public_uuid_field_for_request")
  private String attachmentPublicUuidFieldForRequest;

  public AvatarApiObject() {
  this(null);
  }

  public AvatarApiObject(String attachmentPublicUuid) {
    this.attachmentPublicUuidFieldForRequest = attachmentPublicUuid;
  }  /**
   * @param attachmentPublicUuid The public UUID of the public attachment from which an avatar
   * image must be created.
   */
  public static BunqResponse<String> create(String attachmentPublicUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_ATTACHMENT_PUBLIC_UUID, attachmentPublicUuid);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(ENDPOINT_URL_CREATE, requestBytes, customHeaders);

    return processForUuid(responseRaw);
  }

  public static BunqResponse<String> create() {
    return create(null, null);
  }

  public static BunqResponse<String> create(String attachmentPublicUuid) {
    return create(attachmentPublicUuid, null);
  }

  /**
   */
  public static BunqResponse<AvatarApiObject> get(String avatarUuid, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, avatarUuid), params, customHeaders);

    return fromJson(AvatarApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<AvatarApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<AvatarApiObject> get(String avatarUuid) {
    return get(avatarUuid, null, null);
  }

  public static BunqResponse<AvatarApiObject> get(String avatarUuid, Map<String, String> params) {
    return get(avatarUuid, params, null);
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
  public List<ImageObject> getImage() {
    return this.image;
  }

  public void setImage(List<ImageObject> image) {
    this.image = image;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.image != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AvatarApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(AvatarApiObject.class, reader);
  }

}
