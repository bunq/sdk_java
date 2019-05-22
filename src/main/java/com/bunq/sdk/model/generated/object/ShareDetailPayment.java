package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class ShareDetailPayment extends BunqModel {

  /**
   * If set to true, the invited user will be able to make payments from the shared account.
   */
  @Expose
  @SerializedName("make_payments")
  private Boolean makePayments;

  /**
   * If set to true, the invited user will be able to make draft payments from the shared account.
   */
  @Expose
  @SerializedName("make_draft_payments")
  private Boolean makeDraftPayments;

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
   * The budget restriction.
   */
  @Expose
  @SerializedName("budget")
  private BudgetRestriction budget;

  /**
   * If set to true, the invited user will be able to make payments from the shared account.
   */
  @Expose
  @SerializedName("make_payments_field_for_request")
  private Boolean makePaymentsFieldForRequest;

  /**
   * If set to true, the invited user will be able to make draft payments from the shared account.
   */
  @Expose
  @SerializedName("make_draft_payments_field_for_request")
  private Boolean makeDraftPaymentsFieldForRequest;

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

  /**
   * The budget restriction.
   */
  @Expose
  @SerializedName("budget_field_for_request")
  private BudgetRestriction budgetFieldForRequest;

  public ShareDetailPayment() {
    this(null, null, null, null, null, null);
  }

  public ShareDetailPayment(Boolean makePayments) {
    this(makePayments, null, null, null, null, null);
  }

  public ShareDetailPayment(Boolean makePayments, Boolean viewBalance) {
    this(makePayments, viewBalance, null, null, null, null);
  }

  public ShareDetailPayment(Boolean makePayments, Boolean viewBalance, Boolean viewOldEvents) {
    this(makePayments, viewBalance, viewOldEvents, null, null, null);
  }

  public ShareDetailPayment(Boolean makePayments, Boolean viewBalance, Boolean viewOldEvents, Boolean viewNewEvents) {
    this(makePayments, viewBalance, viewOldEvents, viewNewEvents, null, null);
  }

  public ShareDetailPayment(Boolean makePayments, Boolean viewBalance, Boolean viewOldEvents, Boolean viewNewEvents, Boolean makeDraftPayments) {
    this(makePayments, viewBalance, viewOldEvents, viewNewEvents, makeDraftPayments, null);
  }

  public ShareDetailPayment(Boolean makePayments, Boolean viewBalance, Boolean viewOldEvents, Boolean viewNewEvents, Boolean makeDraftPayments, BudgetRestriction budget) {
    this.makePaymentsFieldForRequest = makePayments;
    this.makeDraftPaymentsFieldForRequest = makeDraftPayments;
    this.viewBalanceFieldForRequest = viewBalance;
    this.viewOldEventsFieldForRequest = viewOldEvents;
    this.viewNewEventsFieldForRequest = viewNewEvents;
    this.budgetFieldForRequest = budget;
  }

  /**
   */
  public static ShareDetailPayment fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareDetailPayment.class, reader);
  }

  /**
   * If set to true, the invited user will be able to make payments from the shared account.
   */
  public Boolean getMakePayments() {
    return this.makePayments;
  }

  public void setMakePayments(Boolean makePayments) {
    this.makePayments = makePayments;
  }

  /**
   * If set to true, the invited user will be able to make draft payments from the shared account.
   */
  public Boolean getMakeDraftPayments() {
    return this.makeDraftPayments;
  }

  public void setMakeDraftPayments(Boolean makeDraftPayments) {
    this.makeDraftPayments = makeDraftPayments;
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
   * The budget restriction.
   */
  public BudgetRestriction getBudget() {
    return this.budget;
  }

  public void setBudget(BudgetRestriction budget) {
    this.budget = budget;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.makePayments != null) {
      return false;
    }

    if (this.makeDraftPayments != null) {
      return false;
    }

    if (this.viewBalance != null) {
      return false;
    }

    if (this.viewOldEvents != null) {
      return false;
    }

    if (this.viewNewEvents != null) {
      return false;
    }

    if (this.budget != null) {
      return false;
    }

    return true;
  }

}
