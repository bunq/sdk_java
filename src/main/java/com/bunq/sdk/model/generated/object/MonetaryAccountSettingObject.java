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
public class MonetaryAccountSettingObject extends BunqModel {

  /**
   * The color chosen for the MonetaryAccount.
   */
  @Expose
  @SerializedName("color")
  private String color;

  /**
   * The icon chosen for the MonetaryAccount.
   */
  @Expose
  @SerializedName("icon")
  private String icon;

  /**
   * The status of the avatar. Can be either AVATAR_DEFAULT, AVATAR_CUSTOM or AVATAR_UNDETERMINED.
   */
  @Expose
  @SerializedName("default_avatar_status")
  private String defaultAvatarStatus;

  /**
   * The chat restriction. Possible values are ALLOW_INCOMING or BLOCK_INCOMING
   */
  @Expose
  @SerializedName("restriction_chat")
  private String restrictionChat;

  /**
   * The preference for this monetary account on whether to automatically accept or reject
   * expiring SDDs.
   */
  @Expose
  @SerializedName("sdd_expiration_action")
  private String sddExpirationAction;

  /**
   * The color chosen for the MonetaryAccount in hexadecimal format.
   */
  @Expose
  @SerializedName("color_field_for_request")
  private String colorFieldForRequest;

  /**
   * The icon chosen for the MonetaryAccount.
   */
  @Expose
  @SerializedName("icon_field_for_request")
  private String iconFieldForRequest;

  /**
   * The status of the avatar. Cannot be updated directly.
   */
  @Expose
  @SerializedName("default_avatar_status_field_for_request")
  private String defaultAvatarStatusFieldForRequest;

  /**
   * The chat restriction. Possible values are ALLOW_INCOMING or BLOCK_INCOMING
   */
  @Expose
  @SerializedName("restriction_chat_field_for_request")
  private String restrictionChatFieldForRequest;

  /**
   * The preference for this monetary account on whether to automatically accept or reject
   * expiring SDDs.
   */
  @Expose
  @SerializedName("sdd_expiration_action_field_for_request")
  private String sddExpirationActionFieldForRequest;

  public MonetaryAccountSettingObject() {
  this(null, null, null, null, null);
  }

  public MonetaryAccountSettingObject(String color) {
  this(color, null, null, null, null);
  }

  public MonetaryAccountSettingObject(String color, String icon) {
  this(color, icon, null, null, null);
  }

  public MonetaryAccountSettingObject(String color, String icon, String defaultAvatarStatus) {
  this(color, icon, defaultAvatarStatus, null, null);
  }

  public MonetaryAccountSettingObject(String color, String icon, String defaultAvatarStatus, String restrictionChat) {
  this(color, icon, defaultAvatarStatus, restrictionChat, null);
  }

  public MonetaryAccountSettingObject(String color, String icon, String defaultAvatarStatus, String restrictionChat, String sddExpirationAction) {
    this.colorFieldForRequest = color;
    this.iconFieldForRequest = icon;
    this.defaultAvatarStatusFieldForRequest = defaultAvatarStatus;
    this.restrictionChatFieldForRequest = restrictionChat;
    this.sddExpirationActionFieldForRequest = sddExpirationAction;
  }

  /**
   * The color chosen for the MonetaryAccount.
   */
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The icon chosen for the MonetaryAccount.
   */
  public String getIcon() {
    return this.icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   * The status of the avatar. Can be either AVATAR_DEFAULT, AVATAR_CUSTOM or AVATAR_UNDETERMINED.
   */
  public String getDefaultAvatarStatus() {
    return this.defaultAvatarStatus;
  }

  public void setDefaultAvatarStatus(String defaultAvatarStatus) {
    this.defaultAvatarStatus = defaultAvatarStatus;
  }

  /**
   * The chat restriction. Possible values are ALLOW_INCOMING or BLOCK_INCOMING
   */
  public String getRestrictionChat() {
    return this.restrictionChat;
  }

  public void setRestrictionChat(String restrictionChat) {
    this.restrictionChat = restrictionChat;
  }

  /**
   * The preference for this monetary account on whether to automatically accept or reject
   * expiring SDDs.
   */
  public String getSddExpirationAction() {
    return this.sddExpirationAction;
  }

  public void setSddExpirationAction(String sddExpirationAction) {
    this.sddExpirationAction = sddExpirationAction;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.color != null) {
      return false;
    }

    if (this.icon != null) {
      return false;
    }

    if (this.defaultAvatarStatus != null) {
      return false;
    }

    if (this.restrictionChat != null) {
      return false;
    }

    if (this.sddExpirationAction != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountSettingObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountSettingObject.class, reader);
  }

}
