package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.CoOwnerObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.LabelUserObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to accept or reject a monetaryAccountJoint co-ownership.
 */
public class CoOwnerInviteResponseApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * The monetary account and user who get the invite for the joint account.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The monetary account and user who created the joint account.
   */
  @Expose
  @SerializedName("counter_alias")
  private LabelMonetaryAccountObject counterAlias;

  /**
   * The ID of the monetaryAccount
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The extension type of the monetaryAccount
   */
  @Expose
  @SerializedName("monetary_account_type")
  private String monetaryAccountType;

  /**
   * The status of the invite. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted) or ACCEPTED
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The freeze_status of the invite.
   */
  @Expose
  @SerializedName("freeze_status")
  private String freezeStatus;

  /**
   * The label of the user that froze the coowner invite (if frozen).
   */
  @Expose
  @SerializedName("label_freeze_user")
  private LabelUserObject labelFreezeUser;

  /**
   * The users the account will be joint with.
   */
  @Expose
  @SerializedName("all_co_owner")
  private List<CoOwnerObject> allCoOwner;

  /**
   * The status of the co-owner invite, can be ACCEPTED or REJECTED.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public CoOwnerInviteResponseApiObject() {
  this(null);
  }

  public CoOwnerInviteResponseApiObject(String status) {
    this.statusFieldForRequest = status;
  }

  /**
   * The monetary account and user who get the invite for the joint account.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The monetary account and user who created the joint account.
   */
  public LabelMonetaryAccountObject getCounterAlias() {
    return this.counterAlias;
  }

  public void setCounterAlias(LabelMonetaryAccountObject counterAlias) {
    this.counterAlias = counterAlias;
  }

  /**
   * The ID of the monetaryAccount
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The extension type of the monetaryAccount
   */
  public String getMonetaryAccountType() {
    return this.monetaryAccountType;
  }

  public void setMonetaryAccountType(String monetaryAccountType) {
    this.monetaryAccountType = monetaryAccountType;
  }

  /**
   * The status of the invite. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted) or ACCEPTED
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The freeze_status of the invite.
   */
  public String getFreezeStatus() {
    return this.freezeStatus;
  }

  public void setFreezeStatus(String freezeStatus) {
    this.freezeStatus = freezeStatus;
  }

  /**
   * The label of the user that froze the coowner invite (if frozen).
   */
  public LabelUserObject getLabelFreezeUser() {
    return this.labelFreezeUser;
  }

  public void setLabelFreezeUser(LabelUserObject labelFreezeUser) {
    this.labelFreezeUser = labelFreezeUser;
  }

  /**
   * The users the account will be joint with.
   */
  public List<CoOwnerObject> getAllCoOwner() {
    return this.allCoOwner;
  }

  public void setAllCoOwner(List<CoOwnerObject> allCoOwner) {
    this.allCoOwner = allCoOwner;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.alias != null) {
      return false;
    }

    if (this.counterAlias != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.monetaryAccountType != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.freezeStatus != null) {
      return false;
    }

    if (this.labelFreezeUser != null) {
      return false;
    }

    if (this.allCoOwner != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CoOwnerInviteResponseApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CoOwnerInviteResponseApiObject.class, reader);
  }

}
