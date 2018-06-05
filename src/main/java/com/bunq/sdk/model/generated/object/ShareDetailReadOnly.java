package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class ShareDetailReadOnly extends BunqModel {

  /**
   * If set to true, the invited user will be able to view the account balance.
   */
  @Expose
  @SerializedName("view_balance")
  private Boolean viewBalance;

  /**
   * If set to true, the invited user will be able to view events from before the share was
   * active.
   */
  @Expose
  @SerializedName("view_old_events")
  private Boolean viewOldEvents;

  /**
   * If set to true, the invited user will be able to view events starting from the time the share
   * became active.
   */
  @Expose
  @SerializedName("view_new_events")
  private Boolean viewNewEvents;

  /**
   * If set to true, the invited user will be able to view the account balance.
   */
  @Expose
  @SerializedName("view_balance_field_for_request")
  private Boolean viewBalanceFieldForRequest;

  /**
   * If set to true, the invited user will be able to view events from before the share was
   * active.
   */
  @Expose
  @SerializedName("view_old_events_field_for_request")
  private Boolean viewOldEventsFieldForRequest;

  /**
   * If set to true, the invited user will be able to view events starting from the time the share
   * became active.
   */
  @Expose
  @SerializedName("view_new_events_field_for_request")
  private Boolean viewNewEventsFieldForRequest;

  public ShareDetailReadOnly() {
    this(null, null, null);
  }

  public ShareDetailReadOnly(Boolean viewBalance) {
    this(viewBalance, null, null);
  }

  public ShareDetailReadOnly(Boolean viewBalance, Boolean viewOldEvents) {
    this(viewBalance, viewOldEvents, null);
  }

  public ShareDetailReadOnly(Boolean viewBalance, Boolean viewOldEvents, Boolean viewNewEvents) {
    this.viewBalanceFieldForRequest = viewBalance;
    this.viewOldEventsFieldForRequest = viewOldEvents;
    this.viewNewEventsFieldForRequest = viewNewEvents;
  }

  /**
   * If set to true, the invited user will be able to view the account balance.
   */
  public Boolean getViewBalance() {
    return this.viewBalance;
  }

  public void setViewBalance(Boolean viewBalance) {
    this.viewBalance = viewBalance;
  }

  /**
   * If set to true, the invited user will be able to view events from before the share was
   * active.
   */
  public Boolean getViewOldEvents() {
    return this.viewOldEvents;
  }

  public void setViewOldEvents(Boolean viewOldEvents) {
    this.viewOldEvents = viewOldEvents;
  }

  /**
   * If set to true, the invited user will be able to view events starting from the time the share
   * became active.
   */
  public Boolean getViewNewEvents() {
    return this.viewNewEvents;
  }

  public void setViewNewEvents(Boolean viewNewEvents) {
    this.viewNewEvents = viewNewEvents;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.viewBalance != null) {
      return false;
    }

    if (this.viewOldEvents != null) {
      return false;
    }

    if (this.viewNewEvents != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ShareDetailReadOnly fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareDetailReadOnly.class, reader);
  }

}
