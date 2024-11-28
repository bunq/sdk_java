package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manage cards for company employees.
 */
public class CompanyEmployeeCard extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_POINTER_COUNTER_USER = "pointer_counter_user";
  public static final String FIELD_POINTER_MONETARY_ACCOUNT = "pointer_monetary_account";
  public static final String FIELD_TYPE = "type";
  public static final String FIELD_PRODUCT_TYPE = "product_type";
  public static final String FIELD_COMPANY_NAME_ON_CARD = "company_name_on_card";
  public static final String FIELD_EMPLOYEE_NAME_ON_CARD = "employee_name_on_card";
  public static final String FIELD_EMPLOYEE_PREFERRED_NAME_ON_CARD = "employee_preferred_name_on_card";
  public static final String FIELD_AMOUNT_LIMIT_MONTHLY = "amount_limit_monthly";
  public static final String FIELD_STATUS = "status";

  /**
   * The actual card.
   */
  @Expose
  @SerializedName("card")
  private Card card;

  /**
   * The status of the employee card.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The name of the company that should be displayed on the card.
   */
  @Expose
  @SerializedName("company_name_on_card")
  private String companyNameOnCard;

  /**
   * The monthly spending limit for this employee on the card.
   */
  @Expose
  @SerializedName("amount_limit_monthly")
  private Amount amountLimitMonthly;

  /**
   * The monthly spend for this employee on the card.
   */
  @Expose
  @SerializedName("amount_spent_monthly")
  private Amount amountSpentMonthly;

  /**
   * The number of transactions that still need a receipt.
   */
  @Expose
  @SerializedName("number_of_company_employee_card_receipt_pending")
  private Integer numberOfCompanyEmployeeCardReceiptPending;

  /**
   * The pointer to the employee for which you want to create a card.
   */
  @Expose
  @SerializedName("pointer_counter_user_field_for_request")
  private Pointer pointerCounterUserFieldForRequest;

  /**
   * The pointer to the monetary account that will be connected at first with the card.
   */
  @Expose
  @SerializedName("pointer_monetary_account_field_for_request")
  private Pointer pointerMonetaryAccountFieldForRequest;

  /**
   * The type of card to order.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The product type of the card to order.
   */
  @Expose
  @SerializedName("product_type_field_for_request")
  private String productTypeFieldForRequest;

  /**
   * The name of the company that should be displayed on the card.
   */
  @Expose
  @SerializedName("company_name_on_card_field_for_request")
  private String companyNameOnCardFieldForRequest;

  /**
   * The name of the employee that should be displayed on the card.
   */
  @Expose
  @SerializedName("employee_name_on_card_field_for_request")
  private String employeeNameOnCardFieldForRequest;

  /**
   * The user's preferred name as it will be on the card.
   */
  @Expose
  @SerializedName("employee_preferred_name_on_card_field_for_request")
  private String employeePreferredNameOnCardFieldForRequest;

  /**
   * The monthly spending limit for this employee on the card.
   */
  @Expose
  @SerializedName("amount_limit_monthly_field_for_request")
  private Amount amountLimitMonthlyFieldForRequest;

  /**
   * The status of the employee card.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public CompanyEmployeeCard() {
  this(null, null, null, null, null, null, null, null, null);
  }

  public CompanyEmployeeCard(Pointer pointerCounterUser) {
  this(pointerCounterUser, null, null, null, null, null, null, null, null);
  }

  public CompanyEmployeeCard(Pointer pointerCounterUser, Pointer pointerMonetaryAccount) {
  this(pointerCounterUser, pointerMonetaryAccount, null, null, null, null, null, null, null);
  }

  public CompanyEmployeeCard(Pointer pointerCounterUser, Pointer pointerMonetaryAccount, String type) {
  this(pointerCounterUser, pointerMonetaryAccount, type, null, null, null, null, null, null);
  }

  public CompanyEmployeeCard(Pointer pointerCounterUser, Pointer pointerMonetaryAccount, String type, String productType) {
  this(pointerCounterUser, pointerMonetaryAccount, type, productType, null, null, null, null, null);
  }

  public CompanyEmployeeCard(Pointer pointerCounterUser, Pointer pointerMonetaryAccount, String type, String productType, String companyNameOnCard) {
  this(pointerCounterUser, pointerMonetaryAccount, type, productType, companyNameOnCard, null, null, null, null);
  }

  public CompanyEmployeeCard(Pointer pointerCounterUser, Pointer pointerMonetaryAccount, String type, String productType, String companyNameOnCard, String employeeNameOnCard) {
  this(pointerCounterUser, pointerMonetaryAccount, type, productType, companyNameOnCard, employeeNameOnCard, null, null, null);
  }

  public CompanyEmployeeCard(Pointer pointerCounterUser, Pointer pointerMonetaryAccount, String type, String productType, String companyNameOnCard, String employeeNameOnCard, String employeePreferredNameOnCard) {
  this(pointerCounterUser, pointerMonetaryAccount, type, productType, companyNameOnCard, employeeNameOnCard, employeePreferredNameOnCard, null, null);
  }

  public CompanyEmployeeCard(Pointer pointerCounterUser, Pointer pointerMonetaryAccount, String type, String productType, String companyNameOnCard, String employeeNameOnCard, String employeePreferredNameOnCard, Amount amountLimitMonthly) {
  this(pointerCounterUser, pointerMonetaryAccount, type, productType, companyNameOnCard, employeeNameOnCard, employeePreferredNameOnCard, amountLimitMonthly, null);
  }

  public CompanyEmployeeCard(Pointer pointerCounterUser, Pointer pointerMonetaryAccount, String type, String productType, String companyNameOnCard, String employeeNameOnCard, String employeePreferredNameOnCard, Amount amountLimitMonthly, String status) {
    this.pointerCounterUserFieldForRequest = pointerCounterUser;
    this.pointerMonetaryAccountFieldForRequest = pointerMonetaryAccount;
    this.typeFieldForRequest = type;
    this.productTypeFieldForRequest = productType;
    this.companyNameOnCardFieldForRequest = companyNameOnCard;
    this.employeeNameOnCardFieldForRequest = employeeNameOnCard;
    this.employeePreferredNameOnCardFieldForRequest = employeePreferredNameOnCard;
    this.amountLimitMonthlyFieldForRequest = amountLimitMonthly;
    this.statusFieldForRequest = status;
  }

  /**
   * The actual card.
   */
  public Card getCard() {
    return this.card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  /**
   * The status of the employee card.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The name of the company that should be displayed on the card.
   */
  public String getCompanyNameOnCard() {
    return this.companyNameOnCard;
  }

  public void setCompanyNameOnCard(String companyNameOnCard) {
    this.companyNameOnCard = companyNameOnCard;
  }

  /**
   * The monthly spending limit for this employee on the card.
   */
  public Amount getAmountLimitMonthly() {
    return this.amountLimitMonthly;
  }

  public void setAmountLimitMonthly(Amount amountLimitMonthly) {
    this.amountLimitMonthly = amountLimitMonthly;
  }

  /**
   * The monthly spend for this employee on the card.
   */
  public Amount getAmountSpentMonthly() {
    return this.amountSpentMonthly;
  }

  public void setAmountSpentMonthly(Amount amountSpentMonthly) {
    this.amountSpentMonthly = amountSpentMonthly;
  }

  /**
   * The number of transactions that still need a receipt.
   */
  public Integer getNumberOfCompanyEmployeeCardReceiptPending() {
    return this.numberOfCompanyEmployeeCardReceiptPending;
  }

  public void setNumberOfCompanyEmployeeCardReceiptPending(Integer numberOfCompanyEmployeeCardReceiptPending) {
    this.numberOfCompanyEmployeeCardReceiptPending = numberOfCompanyEmployeeCardReceiptPending;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.card != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.companyNameOnCard != null) {
      return false;
    }

    if (this.amountLimitMonthly != null) {
      return false;
    }

    if (this.amountSpentMonthly != null) {
      return false;
    }

    if (this.numberOfCompanyEmployeeCardReceiptPending != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CompanyEmployeeCard fromJsonReader(JsonReader reader) {
    return fromJsonReader(CompanyEmployeeCard.class, reader);
  }

}
