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
public class Avatar extends BunqModel {

  /**
   * The public UUID of the avatar.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The public UUID of object this avatar is anchored to.
   */
  @Expose
  @SerializedName("anchor_uuid")
  private String anchorUuid;

  /**
   * The actual image information of this avatar.
   */
  @Expose
  @SerializedName("image")
  private List<Image> image;

  /**
   * The public UUID of the avatar.
   */
  @Expose
  @SerializedName("uuid_field_for_request")
  private String uuidFieldForRequest;

  public Avatar() {
  this(null);
  }

  public Avatar(String uuid) {
    this.uuidFieldForRequest = uuid;
  }

  /**
   * The public UUID of the avatar.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The public UUID of object this avatar is anchored to.
   */
  public String getAnchorUuid() {
    return this.anchorUuid;
  }

  public void setAnchorUuid(String anchorUuid) {
    this.anchorUuid = anchorUuid;
  }

  /**
   * The actual image information of this avatar.
   */
  public List<Image> getImage() {
    return this.image;
  }

  public void setImage(List<Image> image) {
    this.image = image;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.anchorUuid != null) {
      return false;
    }

    if (this.image != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Avatar fromJsonReader(JsonReader reader) {
    return fromJsonReader(Avatar.class, reader);
  }

}
