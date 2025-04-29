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
public class LabelUserObject extends BunqModel {

  /**
   * The public UUID of the label-user.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The current avatar of the user.
   */
  @Expose
  @SerializedName("avatar")
  private AvatarObject avatar;

  /**
   * The current nickname of the user.
   */
  @Expose
  @SerializedName("public_nick_name")
  private String publicNickName;

  /**
   * The name to be displayed for this user, as it was given on the request.
   */
  @Expose
  @SerializedName("display_name")
  private String displayName;

  /**
   * The country of the user. 000 stands for "unknown"
   */
  @Expose
  @SerializedName("country")
  private String country;

  /**
   * The public UUID of the label-user.
   */
  @Expose
  @SerializedName("uuid_field_for_request")
  private String uuidFieldForRequest;

  /**
   * The name to be displayed for this user, as it was given on the request.
   */
  @Expose
  @SerializedName("display_name_field_for_request")
  private String displayNameFieldForRequest;

  /**
   * The country of the user
   */
  @Expose
  @SerializedName("country_field_for_request")
  private String countryFieldForRequest;

  public LabelUserObject() {
  this(null, null, null);
  }

  public LabelUserObject(String uuid) {
  this(uuid, null, null);
  }

  public LabelUserObject(String uuid, String displayName) {
  this(uuid, displayName, null);
  }

  public LabelUserObject(String uuid, String displayName, String country) {
    this.uuidFieldForRequest = uuid;
    this.displayNameFieldForRequest = displayName;
    this.countryFieldForRequest = country;
  }

  /**
   * The public UUID of the label-user.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The current avatar of the user.
   */
  public AvatarObject getAvatar() {
    return this.avatar;
  }

  public void setAvatar(AvatarObject avatar) {
    this.avatar = avatar;
  }

  /**
   * The current nickname of the user.
   */
  public String getPublicNickName() {
    return this.publicNickName;
  }

  public void setPublicNickName(String publicNickName) {
    this.publicNickName = publicNickName;
  }

  /**
   * The name to be displayed for this user, as it was given on the request.
   */
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The country of the user. 000 stands for "unknown"
   */
  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    if (this.publicNickName != null) {
      return false;
    }

    if (this.displayName != null) {
      return false;
    }

    if (this.country != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static LabelUserObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(LabelUserObject.class, reader);
  }

}
