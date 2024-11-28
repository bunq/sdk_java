package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manage the relation user details.
 */
public class RelationUser extends BunqModel {

  /**
   * The user's ID.
   */
  @Expose
  @SerializedName("user_id")
  private String userId;

  /**
   * The counter user's ID.
   */
  @Expose
  @SerializedName("counter_user_id")
  private String counterUserId;

  /**
   * The user's label.
   */
  @Expose
  @SerializedName("label_user")
  private LabelUser labelUser;

  /**
   * The counter user's label.
   */
  @Expose
  @SerializedName("counter_label_user")
  private LabelUser counterLabelUser;

  /**
   * The requested relation type.
   */
  @Expose
  @SerializedName("relationship")
  private String relationship;

  /**
   * The request's status, only for UPDATE.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The account status of a user
   */
  @Expose
  @SerializedName("user_status")
  private String userStatus;

  /**
   * The account status of a user
   */
  @Expose
  @SerializedName("counter_user_status")
  private String counterUserStatus;

  /**
   * Tap to Pay settings for the company employee.
   */
  @Expose
  @SerializedName("company_employee_setting_adyen_card_transaction")
  private CompanyEmployeeSettingAdyenCardTransaction companyEmployeeSettingAdyenCardTransaction;

  /**
   * Cards accessible by the company employee
   */
  @Expose
  @SerializedName("all_company_employee_card")
  private List<CompanyEmployeeCard> allCompanyEmployeeCard;

  /**
   * The user's ID.
   */
  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * The counter user's ID.
   */
  public String getCounterUserId() {
    return this.counterUserId;
  }

  public void setCounterUserId(String counterUserId) {
    this.counterUserId = counterUserId;
  }

  /**
   * The user's label.
   */
  public LabelUser getLabelUser() {
    return this.labelUser;
  }

  public void setLabelUser(LabelUser labelUser) {
    this.labelUser = labelUser;
  }

  /**
   * The counter user's label.
   */
  public LabelUser getCounterLabelUser() {
    return this.counterLabelUser;
  }

  public void setCounterLabelUser(LabelUser counterLabelUser) {
    this.counterLabelUser = counterLabelUser;
  }

  /**
   * The requested relation type.
   */
  public String getRelationship() {
    return this.relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  /**
   * The request's status, only for UPDATE.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The account status of a user
   */
  public String getUserStatus() {
    return this.userStatus;
  }

  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }

  /**
   * The account status of a user
   */
  public String getCounterUserStatus() {
    return this.counterUserStatus;
  }

  public void setCounterUserStatus(String counterUserStatus) {
    this.counterUserStatus = counterUserStatus;
  }

  /**
   * Tap to Pay settings for the company employee.
   */
  public CompanyEmployeeSettingAdyenCardTransaction getCompanyEmployeeSettingAdyenCardTransaction() {
    return this.companyEmployeeSettingAdyenCardTransaction;
  }

  public void setCompanyEmployeeSettingAdyenCardTransaction(CompanyEmployeeSettingAdyenCardTransaction companyEmployeeSettingAdyenCardTransaction) {
    this.companyEmployeeSettingAdyenCardTransaction = companyEmployeeSettingAdyenCardTransaction;
  }

  /**
   * Cards accessible by the company employee
   */
  public List<CompanyEmployeeCard> getAllCompanyEmployeeCard() {
    return this.allCompanyEmployeeCard;
  }

  public void setAllCompanyEmployeeCard(List<CompanyEmployeeCard> allCompanyEmployeeCard) {
    this.allCompanyEmployeeCard = allCompanyEmployeeCard;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.userId != null) {
      return false;
    }

    if (this.counterUserId != null) {
      return false;
    }

    if (this.labelUser != null) {
      return false;
    }

    if (this.counterLabelUser != null) {
      return false;
    }

    if (this.relationship != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.userStatus != null) {
      return false;
    }

    if (this.counterUserStatus != null) {
      return false;
    }

    if (this.companyEmployeeSettingAdyenCardTransaction != null) {
      return false;
    }

    if (this.allCompanyEmployeeCard != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RelationUser fromJsonReader(JsonReader reader) {
    return fromJsonReader(RelationUser.class, reader);
  }

}
