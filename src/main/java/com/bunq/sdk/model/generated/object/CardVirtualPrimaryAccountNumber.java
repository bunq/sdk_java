package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class CardVirtualPrimaryAccountNumber extends BunqModel {

  /**
   * The ID for this Virtual PAN.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The UUID for this Virtual PAN.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The description for this Virtual PAN.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status for this Virtual PAN.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The ID of the monetary account to assign to this Virtual PAN.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The last four digits of the Virtual PAN.
   */
  @Expose
  @SerializedName("four_digit")
  private String fourDigit;

  /**
   * The ID for this Virtual PAN.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Integer idFieldForRequest;

  /**
   * The description for this Virtual PAN.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The status for this Virtual PAN.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The ID of the monetary account to assign to this Virtual PAN.
   */
  @Expose
  @SerializedName("monetary_account_id_field_for_request")
  private Integer monetaryAccountIdFieldForRequest;

  public CardVirtualPrimaryAccountNumber() {
    this(null, null, null, null);
  }

  public CardVirtualPrimaryAccountNumber(Integer id) {
    this(id, null, null, null);
  }

  public CardVirtualPrimaryAccountNumber(Integer id, String description) {
    this(id, description, null, null);
  }

  public CardVirtualPrimaryAccountNumber(Integer id, String description, String status) {
    this(id, description, status, null);
  }

  public CardVirtualPrimaryAccountNumber(Integer id, String description, String status, Integer monetaryAccountId) {
    this.idFieldForRequest = id;
    this.descriptionFieldForRequest = description;
    this.statusFieldForRequest = status;
    this.monetaryAccountIdFieldForRequest = monetaryAccountId;
  }

  /**
   */
  public static CardVirtualPrimaryAccountNumber fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardVirtualPrimaryAccountNumber.class, reader);
  }

  /**
   * The ID for this Virtual PAN.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The UUID for this Virtual PAN.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The description for this Virtual PAN.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The status for this Virtual PAN.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The ID of the monetary account to assign to this Virtual PAN.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The last four digits of the Virtual PAN.
   */
  public String getFourDigit() {
    return this.fourDigit;
  }

  public void setFourDigit(String fourDigit) {
    this.fourDigit = fourDigit;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.uuid != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.fourDigit != null) {
      return false;
    }

    return true;
  }

}
