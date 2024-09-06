package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Attachment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This call is used to upload an photo that is accessible by all members of a registry.
 */
public class RegistryGalleryAttachment extends BunqModel {

  /**
   * The id of the user owner.
   */
  @Expose
  @SerializedName("user_id")
  private Integer userId;

  /**
   * The attachment.
   */
  @Expose
  @SerializedName("attachment")
  private Attachment attachment;

  /**
   * The membership of the owner uuid.
   */
  @Expose
  @SerializedName("membership_uuid")
  private String membershipUuid;

  /**
   * The id of the user owner.
   */
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The attachment.
   */
  public Attachment getAttachment() {
    return this.attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  /**
   * The membership of the owner uuid.
   */
  public String getMembershipUuid() {
    return this.membershipUuid;
  }

  public void setMembershipUuid(String membershipUuid) {
    this.membershipUuid = membershipUuid;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.userId != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.membershipUuid != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RegistryGalleryAttachment fromJsonReader(JsonReader reader) {
    return fromJsonReader(RegistryGalleryAttachment.class, reader);
  }

}
