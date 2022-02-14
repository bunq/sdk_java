package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.BirdeeInvestmentPortfolioGoal;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Endpoint for interacting with the investment portfolio opened at Birdee.
 */
public class BirdeeInvestmentPortfolio extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_RISK_PROFILE_TYPE = "risk_profile_type";
  public static final String FIELD_INVESTMENT_THEME = "investment_theme";
  public static final String FIELD_NAME = "name";
  public static final String FIELD_GOAL = "goal";

  /**
   * Status of the portfolio.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The type of risk profile associated with the portfolio.
   */
  @Expose
  @SerializedName("risk_profile_type")
  private String riskProfileType;

  /**
   * The investment theme.
   */
  @Expose
  @SerializedName("investment_theme")
  private String investmentTheme;

  /**
   * Maximum number of strategy changes in a year.
   */
  @Expose
  @SerializedName("number_of_strategy_change_annual_maximum")
  private Integer numberOfStrategyChangeAnnualMaximum;

  /**
   * Maximum number of strategy changes used.
   */
  @Expose
  @SerializedName("number_of_strategy_change_annual_used")
  private Integer numberOfStrategyChangeAnnualUsed;

  /**
   * The name associated with the investment portfolio.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The investment goal.
   */
  @Expose
  @SerializedName("goal")
  private BirdeeInvestmentPortfolioGoal goal;

  /**
   * The investment portfolio balance.
   */
  @Expose
  @SerializedName("balance")
  private BirdeeInvestmentPortfolioBalance balance;

  /**
   * The allocations of the investment portfolio.
   */
  @Expose
  @SerializedName("allocations")
  private List<BirdeePortfolioAllocation> allocations;

  /**
   * The type of risk profile associated with the portfolio.
   */
  @Expose
  @SerializedName("risk_profile_type_field_for_request")
  private String riskProfileTypeFieldForRequest;

  /**
   * The investment theme.
   */
  @Expose
  @SerializedName("investment_theme_field_for_request")
  private String investmentThemeFieldForRequest;

  /**
   * The name associated with the investment portfolio.
   */
  @Expose
  @SerializedName("name_field_for_request")
  private String nameFieldForRequest;

  /**
   * The investment goal.
   */
  @Expose
  @SerializedName("goal_field_for_request")
  private BirdeeInvestmentPortfolioGoal goalFieldForRequest;

  public BirdeeInvestmentPortfolio() {
  this(null, null, null, null);
  }

  public BirdeeInvestmentPortfolio(String riskProfileType) {
  this(riskProfileType, null, null, null);
  }

  public BirdeeInvestmentPortfolio(String riskProfileType, String investmentTheme) {
  this(riskProfileType, investmentTheme, null, null);
  }

  public BirdeeInvestmentPortfolio(String riskProfileType, String investmentTheme, String name) {
  this(riskProfileType, investmentTheme, name, null);
  }

  public BirdeeInvestmentPortfolio(String riskProfileType, String investmentTheme, String name, BirdeeInvestmentPortfolioGoal goal) {
    this.riskProfileTypeFieldForRequest = riskProfileType;
    this.investmentThemeFieldForRequest = investmentTheme;
    this.nameFieldForRequest = name;
    this.goalFieldForRequest = goal;
  }

  /**
   * Status of the portfolio.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The type of risk profile associated with the portfolio.
   */
  public String getRiskProfileType() {
    return this.riskProfileType;
  }

  public void setRiskProfileType(String riskProfileType) {
    this.riskProfileType = riskProfileType;
  }

  /**
   * The investment theme.
   */
  public String getInvestmentTheme() {
    return this.investmentTheme;
  }

  public void setInvestmentTheme(String investmentTheme) {
    this.investmentTheme = investmentTheme;
  }

  /**
   * Maximum number of strategy changes in a year.
   */
  public Integer getNumberOfStrategyChangeAnnualMaximum() {
    return this.numberOfStrategyChangeAnnualMaximum;
  }

  public void setNumberOfStrategyChangeAnnualMaximum(Integer numberOfStrategyChangeAnnualMaximum) {
    this.numberOfStrategyChangeAnnualMaximum = numberOfStrategyChangeAnnualMaximum;
  }

  /**
   * Maximum number of strategy changes used.
   */
  public Integer getNumberOfStrategyChangeAnnualUsed() {
    return this.numberOfStrategyChangeAnnualUsed;
  }

  public void setNumberOfStrategyChangeAnnualUsed(Integer numberOfStrategyChangeAnnualUsed) {
    this.numberOfStrategyChangeAnnualUsed = numberOfStrategyChangeAnnualUsed;
  }

  /**
   * The name associated with the investment portfolio.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The investment goal.
   */
  public BirdeeInvestmentPortfolioGoal getGoal() {
    return this.goal;
  }

  public void setGoal(BirdeeInvestmentPortfolioGoal goal) {
    this.goal = goal;
  }

  /**
   * The investment portfolio balance.
   */
  public BirdeeInvestmentPortfolioBalance getBalance() {
    return this.balance;
  }

  public void setBalance(BirdeeInvestmentPortfolioBalance balance) {
    this.balance = balance;
  }

  /**
   * The allocations of the investment portfolio.
   */
  public List<BirdeePortfolioAllocation> getAllocations() {
    return this.allocations;
  }

  public void setAllocations(List<BirdeePortfolioAllocation> allocations) {
    this.allocations = allocations;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.riskProfileType != null) {
      return false;
    }

    if (this.investmentTheme != null) {
      return false;
    }

    if (this.numberOfStrategyChangeAnnualMaximum != null) {
      return false;
    }

    if (this.numberOfStrategyChangeAnnualUsed != null) {
      return false;
    }

    if (this.name != null) {
      return false;
    }

    if (this.goal != null) {
      return false;
    }

    if (this.balance != null) {
      return false;
    }

    if (this.allocations != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BirdeeInvestmentPortfolio fromJsonReader(JsonReader reader) {
    return fromJsonReader(BirdeeInvestmentPortfolio.class, reader);
  }

}
