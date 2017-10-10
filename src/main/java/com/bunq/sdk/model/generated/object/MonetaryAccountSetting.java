package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class MonetaryAccountSetting extends BunqModel {

  /**
   * The color chosen for the MonetaryAccount.
   */
  @Expose
  @SerializedName("color")
  private String color;

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
   * The color chosen for the MonetaryAccount.
   */
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
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

}
