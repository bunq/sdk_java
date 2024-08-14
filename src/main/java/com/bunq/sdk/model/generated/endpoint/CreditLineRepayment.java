package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manage repayments for a credit line.
 */
public class CreditLineRepayment extends BunqModel {

  /**
   * The ID of the monetary account the repayment is made on.
   */
  @Expose
  @SerializedName("monetary_account_credit_line_id")
  private Integer monetaryAccountCreditLineId;

  /**
   * The original balance that was due, regardless of how much has been paid or how much interest
   * has accrued.
   */
  @Expose
  @SerializedName("amount_balance_due_original")
  private Amount amountBalanceDueOriginal;

  /**
   * The total amount due.
   */
  @Expose
  @SerializedName("amount_due")
  private Amount amountDue;

  /**
   * The current balance due.
   */
  @Expose
  @SerializedName("amount_balance_due")
  private Amount amountBalanceDue;

  /**
   * The amount of interest due.
   */
  @Expose
  @SerializedName("amount_interest_due")
  private Amount amountInterestDue;

  /**
   * The amount of the fee due.
   */
  @Expose
  @SerializedName("amount_fee_due")
  private Amount amountFeeDue;

  /**
   * The status of the repayment.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The items of the repayment.
   */
  @Expose
  @SerializedName("items")
  private List<CreditLineRepaymentItem> items;

  /**
   * The ID of the monetary account the repayment is made on.
   */
  public Integer getMonetaryAccountCreditLineId() {
    return this.monetaryAccountCreditLineId;
  }

  public void setMonetaryAccountCreditLineId(Integer monetaryAccountCreditLineId) {
    this.monetaryAccountCreditLineId = monetaryAccountCreditLineId;
  }

  /**
   * The original balance that was due, regardless of how much has been paid or how much interest
   * has accrued.
   */
  public Amount getAmountBalanceDueOriginal() {
    return this.amountBalanceDueOriginal;
  }

  public void setAmountBalanceDueOriginal(Amount amountBalanceDueOriginal) {
    this.amountBalanceDueOriginal = amountBalanceDueOriginal;
  }

  /**
   * The total amount due.
   */
  public Amount getAmountDue() {
    return this.amountDue;
  }

  public void setAmountDue(Amount amountDue) {
    this.amountDue = amountDue;
  }

  /**
   * The current balance due.
   */
  public Amount getAmountBalanceDue() {
    return this.amountBalanceDue;
  }

  public void setAmountBalanceDue(Amount amountBalanceDue) {
    this.amountBalanceDue = amountBalanceDue;
  }

  /**
   * The amount of interest due.
   */
  public Amount getAmountInterestDue() {
    return this.amountInterestDue;
  }

  public void setAmountInterestDue(Amount amountInterestDue) {
    this.amountInterestDue = amountInterestDue;
  }

  /**
   * The amount of the fee due.
   */
  public Amount getAmountFeeDue() {
    return this.amountFeeDue;
  }

  public void setAmountFeeDue(Amount amountFeeDue) {
    this.amountFeeDue = amountFeeDue;
  }

  /**
   * The status of the repayment.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The items of the repayment.
   */
  public List<CreditLineRepaymentItem> getItems() {
    return this.items;
  }

  public void setItems(List<CreditLineRepaymentItem> items) {
    this.items = items;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.monetaryAccountCreditLineId != null) {
      return false;
    }

    if (this.amountBalanceDueOriginal != null) {
      return false;
    }

    if (this.amountDue != null) {
      return false;
    }

    if (this.amountBalanceDue != null) {
      return false;
    }

    if (this.amountInterestDue != null) {
      return false;
    }

    if (this.amountFeeDue != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.items != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CreditLineRepayment fromJsonReader(JsonReader reader) {
    return fromJsonReader(CreditLineRepayment.class, reader);
  }

}
