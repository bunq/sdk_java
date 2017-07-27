package com.bunq.sdk.model.generated;

import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.MonetaryAccountProfileDrain;
import com.bunq.sdk.model.generated.object.MonetaryAccountProfileFill;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Used to update and read up monetary account profiles, to keep the balance between specific
 * thresholds.
 */
public class MonetaryAccountProfile extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_PROFILE_FILL = "profile_fill";
  public static final String FIELD_PROFILE_DRAIN = "profile_drain";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "MonetaryAccountProfile";

  /**
   * The profile settings for triggering the fill of a monetary account.
   */
  @Expose
  @SerializedName("profile_fill")
  private MonetaryAccountProfileFill profileFill;

  /**
   * The profile settings for moving excesses to a savings account
   */
  @Expose
  @SerializedName("profile_drain")
  private MonetaryAccountProfileDrain profileDrain;

  /**
   * The profile settings for triggering the fill of a monetary account.
   */
  public MonetaryAccountProfileFill getProfileFill() {
    return this.profileFill;
  }

  public void setProfileFill(MonetaryAccountProfileFill profileFill) {
    this.profileFill = profileFill;
  }

  /**
   * The profile settings for moving excesses to a savings account
   */
  public MonetaryAccountProfileDrain getProfileDrain() {
    return this.profileDrain;
  }

  public void setProfileDrain(MonetaryAccountProfileDrain profileDrain) {
    this.profileDrain = profileDrain;
  }

}
