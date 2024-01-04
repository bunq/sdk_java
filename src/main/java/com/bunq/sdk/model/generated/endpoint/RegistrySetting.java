package com.bunq.sdk.model.generated.endpoint;

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
 * Used to manage Slice group settings.
 */
public class RegistrySetting extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_COLOR = "color";
  public static final String FIELD_ICON = "icon";
  public static final String FIELD_DEFAULT_AVATAR_STATUS = "default_avatar_status";
  public static final String FIELD_SDD_EXPIRATION_ACTION = "sdd_expiration_action";

  /**
   * The color chosen for the Registry.
   */
  @Expose
  @SerializedName("color")
  private String color;

  /**
   * The icon chosen for the Registry.
   */
  @Expose
  @SerializedName("icon")
  private String icon;

  /**
   * The status of the avatar. Can be either AVATAR_DEFAULT, AVATAR_CUSTOM, AVATAR_ICON or
   * AVATAR_UNDETERMINED.
   */
  @Expose
  @SerializedName("default_avatar_status")
  private String defaultAvatarStatus;

  /**
   * The color chosen for the Registry in hexadecimal format.
   */
  @Expose
  @SerializedName("color_field_for_request")
  private String colorFieldForRequest;

  /**
   * The icon chosen for the Registry.
   */
  @Expose
  @SerializedName("icon_field_for_request")
  private String iconFieldForRequest;

  /**
   * The status of the avatar.
   */
  @Expose
  @SerializedName("default_avatar_status_field_for_request")
  private String defaultAvatarStatusFieldForRequest;

  /**
   * A monetaryAccountSetting field that should not be here, added for app support.
   */
  @Expose
  @SerializedName("sdd_expiration_action_field_for_request")
  private String sddExpirationActionFieldForRequest;

  public RegistrySetting() {
  this(null, null, null, null);
  }

  public RegistrySetting(String color) {
  this(color, null, null, null);
  }

  public RegistrySetting(String color, String icon) {
  this(color, icon, null, null);
  }

  public RegistrySetting(String color, String icon, String defaultAvatarStatus) {
  this(color, icon, defaultAvatarStatus, null);
  }

  public RegistrySetting(String color, String icon, String defaultAvatarStatus, String sddExpirationAction) {
    this.colorFieldForRequest = color;
    this.iconFieldForRequest = icon;
    this.defaultAvatarStatusFieldForRequest = defaultAvatarStatus;
    this.sddExpirationActionFieldForRequest = sddExpirationAction;
  }

  /**
   * The color chosen for the Registry.
   */
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The icon chosen for the Registry.
   */
  public String getIcon() {
    return this.icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   * The status of the avatar. Can be either AVATAR_DEFAULT, AVATAR_CUSTOM, AVATAR_ICON or
   * AVATAR_UNDETERMINED.
   */
  public String getDefaultAvatarStatus() {
    return this.defaultAvatarStatus;
  }

  public void setDefaultAvatarStatus(String defaultAvatarStatus) {
    this.defaultAvatarStatus = defaultAvatarStatus;
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

    return true;
  }

  /**
   */
  public static RegistrySetting fromJsonReader(JsonReader reader) {
    return fromJsonReader(RegistrySetting.class, reader);
  }

}
