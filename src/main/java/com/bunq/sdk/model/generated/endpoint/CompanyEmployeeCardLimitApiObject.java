package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manage the card limit for company employees.
 */
public class CompanyEmployeeCardLimitApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_AMOUNT_LIMIT_MONTHLY = "amount_limit_monthly";

  /**
   * Company item id.
   */
  @Expose
  @SerializedName("user_company_id")
  private Integer userCompanyId;

  /**
   * Company employee item id.
   */
  @Expose
  @SerializedName("user_employee_id")
  private Integer userEmployeeId;

  /**
   * The monthly spending limit for this employee on the card.
   */
  @Expose
  @SerializedName("amount_limit_monthly")
  private AmountObject amountLimitMonthly;

  /**
   * The monthly spend for this employee on the card.
   */
  @Expose
  @SerializedName("amount_spent_monthly")
  private AmountObject amountSpentMonthly;

  /**
   * The monthly spending limit for this employee on the card.
   */
  @Expose
  @SerializedName("amount_limit_monthly_field_for_request")
  private AmountObject amountLimitMonthlyFieldForRequest;

  public CompanyEmployeeCardLimitApiObject() {
  this(null);
  }

  public CompanyEmployeeCardLimitApiObject(AmountObject amountLimitMonthly) {
    this.amountLimitMonthlyFieldForRequest = amountLimitMonthly;
  }

  /**
   * Company item id.
   */
  public Integer getUserCompanyId() {
    return this.userCompanyId;
  }

  public void setUserCompanyId(Integer userCompanyId) {
    this.userCompanyId = userCompanyId;
  }

  /**
   * Company employee item id.
   */
  public Integer getUserEmployeeId() {
    return this.userEmployeeId;
  }

  public void setUserEmployeeId(Integer userEmployeeId) {
    this.userEmployeeId = userEmployeeId;
  }

  /**
   * The monthly spending limit for this employee on the card.
   */
  public AmountObject getAmountLimitMonthly() {
    return this.amountLimitMonthly;
  }

  public void setAmountLimitMonthly(AmountObject amountLimitMonthly) {
    this.amountLimitMonthly = amountLimitMonthly;
  }

  /**
   * The monthly spend for this employee on the card.
   */
  public AmountObject getAmountSpentMonthly() {
    return this.amountSpentMonthly;
  }

  public void setAmountSpentMonthly(AmountObject amountSpentMonthly) {
    this.amountSpentMonthly = amountSpentMonthly;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.userCompanyId != null) {
      return false;
    }

    if (this.userEmployeeId != null) {
      return false;
    }

    if (this.amountLimitMonthly != null) {
      return false;
    }

    if (this.amountSpentMonthly != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CompanyEmployeeCardLimitApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CompanyEmployeeCardLimitApiObject.class, reader);
  }

}
