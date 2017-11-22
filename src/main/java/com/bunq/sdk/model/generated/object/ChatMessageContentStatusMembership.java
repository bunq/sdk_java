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
public class ChatMessageContentStatusMembership extends BunqModel {

  /**
   * Action which occurred over a member. Could be MEMBER_ADDED or MEMBER_REMOVED
   */
  @Expose
  @SerializedName("action")
  private String action;

  /**
   * The member over which the action has occurred.
   */
  @Expose
  @SerializedName("member")
  private LabelUser member;

  /**
   * Action which occurred over a member. Could be MEMBER_ADDED or MEMBER_REMOVED
   */
  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  /**
   * The member over which the action has occurred.
   */
  public LabelUser getMember() {
    return this.member;
  }

  public void setMember(LabelUser member) {
    this.member = member;
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.action != null) {
      return false;
    }

    if (this.member != null) {
      return false;
    }

    return true;
  }

}
