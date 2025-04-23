package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class BirdeeInvestmentPortfolioGoalObject extends BunqModel {

  /**
   * The investment goal amount.
   */
  @Expose
  @SerializedName("amount_target")
  private AmountObject amountTarget;

  /**
   * The investment goal end time.
   */
  @Expose
  @SerializedName("time_end")
  private String timeEnd;

  /**
   * The investment goal amount.
   */
  @Expose
  @SerializedName("amount_target_field_for_request")
  private AmountObject amountTargetFieldForRequest;

  /**
   * The investment goal end time.
   */
  @Expose
  @SerializedName("time_end_field_for_request")
  private String timeEndFieldForRequest;

  public BirdeeInvestmentPortfolioGoalObject() {
  this(null, null);
  }

  public BirdeeInvestmentPortfolioGoalObject(AmountObject amountTarget) {
  this(amountTarget, null);
  }

  public BirdeeInvestmentPortfolioGoalObject(AmountObject amountTarget, String timeEnd) {
    this.amountTargetFieldForRequest = amountTarget;
    this.timeEndFieldForRequest = timeEnd;
  }

  /**
   * The investment goal amount.
   */
  public AmountObject getAmountTarget() {
    return this.amountTarget;
  }

  public void setAmountTarget(AmountObject amountTarget) {
    this.amountTarget = amountTarget;
  }

  /**
   * The investment goal end time.
   */
  public String getTimeEnd() {
    return this.timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.amountTarget != null) {
      return false;
    }

    if (this.timeEnd != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BirdeeInvestmentPortfolioGoalObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(BirdeeInvestmentPortfolioGoalObject.class, reader);
  }

}
