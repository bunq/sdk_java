package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.MonetaryAccountProfileDrain;
import com.bunq.sdk.model.generated.object.MonetaryAccountProfileFill;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.profileFill != null) {
      return false;
    }

    if (this.profileDrain != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountProfile fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountProfile.class, reader);
  }

}
