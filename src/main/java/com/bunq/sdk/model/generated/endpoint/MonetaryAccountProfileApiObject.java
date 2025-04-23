package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.MonetaryAccountProfileDrainObject;
import com.bunq.sdk.model.generated.object.MonetaryAccountProfileFillObject;
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
public class MonetaryAccountProfileApiObject extends BunqModel {

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
  private MonetaryAccountProfileFillObject profileFill;

  /**
   * The profile settings for moving excesses to a savings account
   */
  @Expose
  @SerializedName("profile_drain")
  private MonetaryAccountProfileDrainObject profileDrain;

  /**
   * The profile settings for triggering the fill of a monetary account.
   */
  @Expose
  @SerializedName("profile_fill_field_for_request")
  private MonetaryAccountProfileFillObject profileFillFieldForRequest;

  /**
   * The profile settings for moving excesses to a savings account
   */
  @Expose
  @SerializedName("profile_drain_field_for_request")
  private MonetaryAccountProfileDrainObject profileDrainFieldForRequest;

  public MonetaryAccountProfileApiObject() {
  this(null, null);
  }

  public MonetaryAccountProfileApiObject(MonetaryAccountProfileFillObject profileFill) {
  this(profileFill, null);
  }

  public MonetaryAccountProfileApiObject(MonetaryAccountProfileFillObject profileFill, MonetaryAccountProfileDrainObject profileDrain) {
    this.profileFillFieldForRequest = profileFill;
    this.profileDrainFieldForRequest = profileDrain;
  }

  /**
   * The profile settings for triggering the fill of a monetary account.
   */
  public MonetaryAccountProfileFillObject getProfileFill() {
    return this.profileFill;
  }

  public void setProfileFill(MonetaryAccountProfileFillObject profileFill) {
    this.profileFill = profileFill;
  }

  /**
   * The profile settings for moving excesses to a savings account
   */
  public MonetaryAccountProfileDrainObject getProfileDrain() {
    return this.profileDrain;
  }

  public void setProfileDrain(MonetaryAccountProfileDrainObject profileDrain) {
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
  public static MonetaryAccountProfileApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountProfileApiObject.class, reader);
  }

}
