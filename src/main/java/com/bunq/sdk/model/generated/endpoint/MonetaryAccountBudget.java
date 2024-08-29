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
 * Endpoint to read, list, or delete the budget for a monetary account.
 */
public class MonetaryAccountBudget extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_ALL_CATEGORY = "all_category";
  public static final String FIELD_AMOUNT = "amount";
  public static final String FIELD_RECURRENCE_TYPE = "recurrence_type";
  public static final String FIELD_MONETARY_ACCOUNT_SOURCE_FUNDING_ID = "monetary_account_source_funding_id";
  public static final String FIELD_PAYMENT_DAY_OF_MONTH = "payment_day_of_month";

  /**
   * DEPRECATED. The list of categories on which the user wants to set the budget.
   */
  @Expose
  @SerializedName("all_category_field_for_request")
  private List<String> allCategoryFieldForRequest;

  /**
   * DEPRECATED. The amount for the budget.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private Amount amountFieldForRequest;

  /**
   * DEPRECATED. The recurrence type for the automatic top-up.
   */
  @Expose
  @SerializedName("recurrence_type_field_for_request")
  private String recurrenceTypeFieldForRequest;

  /**
   * DEPRECATED. The monetary account's ID from/to which the missing/exceeding funds will be
   * transferred.
   */
  @Expose
  @SerializedName("monetary_account_source_funding_id_field_for_request")
  private Integer monetaryAccountSourceFundingIdFieldForRequest;

  /**
   * DEPRECATED. The day of the month for the automatic top-up.
   */
  @Expose
  @SerializedName("payment_day_of_month_field_for_request")
  private Integer paymentDayOfMonthFieldForRequest;

  public MonetaryAccountBudget() {
  this(null, null, null, null, null);
  }

  public MonetaryAccountBudget(List<String> allCategory) {
  this(allCategory, null, null, null, null);
  }

  public MonetaryAccountBudget(List<String> allCategory, Amount amount) {
  this(allCategory, amount, null, null, null);
  }

  public MonetaryAccountBudget(List<String> allCategory, Amount amount, String recurrenceType) {
  this(allCategory, amount, recurrenceType, null, null);
  }

  public MonetaryAccountBudget(List<String> allCategory, Amount amount, String recurrenceType, Integer monetaryAccountSourceFundingId) {
  this(allCategory, amount, recurrenceType, monetaryAccountSourceFundingId, null);
  }

  public MonetaryAccountBudget(List<String> allCategory, Amount amount, String recurrenceType, Integer monetaryAccountSourceFundingId, Integer paymentDayOfMonth) {
    this.allCategoryFieldForRequest = allCategory;
    this.amountFieldForRequest = amount;
    this.recurrenceTypeFieldForRequest = recurrenceType;
    this.monetaryAccountSourceFundingIdFieldForRequest = monetaryAccountSourceFundingId;
    this.paymentDayOfMonthFieldForRequest = paymentDayOfMonth;
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static MonetaryAccountBudget fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountBudget.class, reader);
  }

}
