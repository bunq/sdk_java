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
 * Manage credit lines for a user.
 */
public class CreditLine extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CREDIT_LINE_OFFER_ID = "credit_line_offer_id";
  public static final String FIELD_MONETARY_ACCOUNT_REPAYMENT_ID = "monetary_account_repayment_id";

  /**
   * The ID of the user this credit line belongs to.
   */
  @Expose
  @SerializedName("user_id")
  private Integer userId;

  /**
   * The ID of the monetary account this credit line withdraws credit from.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The ID of the monetary account this credit line repays from.
   */
  @Expose
  @SerializedName("monetary_account_repayment_id")
  private Integer monetaryAccountRepaymentId;

  /**
   * The status of the credit line.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The amount of the credit line.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The interest rate on overdue repayments of the credit line.
   */
  @Expose
  @SerializedName("interest_rate")
  private String interestRate;

  /**
   * The next time a repayment will be made.
   */
  @Expose
  @SerializedName("time_repayment_next")
  private String timeRepaymentNext;

  /**
   * The pending repayments for this credit line.
   */
  @Expose
  @SerializedName("pending_repayments")
  private List<CreditLineRepayment> pendingRepayments;

  /**
   * The ID of the pending credit line offer extended to the user.
   */
  @Expose
  @SerializedName("credit_line_offer_id_field_for_request")
  private Integer creditLineOfferIdFieldForRequest;

  /**
   * The ID of the monetary account to repay the credit line from.
   */
  @Expose
  @SerializedName("monetary_account_repayment_id_field_for_request")
  private Integer monetaryAccountRepaymentIdFieldForRequest;

  public CreditLine() {
  this(null, null);
  }

  public CreditLine(Integer creditLineOfferId) {
  this(creditLineOfferId, null);
  }

  public CreditLine(Integer creditLineOfferId, Integer monetaryAccountRepaymentId) {
    this.creditLineOfferIdFieldForRequest = creditLineOfferId;
    this.monetaryAccountRepaymentIdFieldForRequest = monetaryAccountRepaymentId;
  }

  /**
   * The ID of the user this credit line belongs to.
   */
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The ID of the monetary account this credit line withdraws credit from.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The ID of the monetary account this credit line repays from.
   */
  public Integer getMonetaryAccountRepaymentId() {
    return this.monetaryAccountRepaymentId;
  }

  public void setMonetaryAccountRepaymentId(Integer monetaryAccountRepaymentId) {
    this.monetaryAccountRepaymentId = monetaryAccountRepaymentId;
  }

  /**
   * The status of the credit line.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The amount of the credit line.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The interest rate on overdue repayments of the credit line.
   */
  public String getInterestRate() {
    return this.interestRate;
  }

  public void setInterestRate(String interestRate) {
    this.interestRate = interestRate;
  }

  /**
   * The next time a repayment will be made.
   */
  public String getTimeRepaymentNext() {
    return this.timeRepaymentNext;
  }

  public void setTimeRepaymentNext(String timeRepaymentNext) {
    this.timeRepaymentNext = timeRepaymentNext;
  }

  /**
   * The pending repayments for this credit line.
   */
  public List<CreditLineRepayment> getPendingRepayments() {
    return this.pendingRepayments;
  }

  public void setPendingRepayments(List<CreditLineRepayment> pendingRepayments) {
    this.pendingRepayments = pendingRepayments;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.userId != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.monetaryAccountRepaymentId != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.interestRate != null) {
      return false;
    }

    if (this.timeRepaymentNext != null) {
      return false;
    }

    if (this.pendingRepayments != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CreditLine fromJsonReader(JsonReader reader) {
    return fromJsonReader(CreditLine.class, reader);
  }

}
