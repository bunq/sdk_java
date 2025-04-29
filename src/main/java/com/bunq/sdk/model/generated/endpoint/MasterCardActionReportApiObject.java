package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MasterCard report view.
 */
public class MasterCardActionReportApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_MASTERCARD_ACTION_ID = "mastercard_action_id";
  public static final String FIELD_TYPE = "type";
  public static final String FIELD_STATUS = "status";

  /**
   * The id of mastercard action being reported.
   */
  @Expose
  @SerializedName("mastercard_action_id")
  private Integer mastercardActionId;

  /**
   * The id of mastercard action being reported.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The id of mastercard action being reported.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The reported merchant.
   */
  @Expose
  @SerializedName("merchant_id")
  private String merchantId;

  /**
   * The name of the merchant.
   */
  @Expose
  @SerializedName("merchant_name")
  private String merchantName;

  /**
   * The monetary account label of the merchant.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

  /**
   * The id of mastercard action being reported.
   */
  @Expose
  @SerializedName("mastercard_action_id_field_for_request")
  private Integer mastercardActionIdFieldForRequest;

  /**
   * The type of report. Can be 'FRAUD' or 'MERCHANT_BLOCKED'.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The id of mastercard action being reported.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public MasterCardActionReportApiObject() {
  this(null, null, null);
  }

  public MasterCardActionReportApiObject(Integer mastercardActionId) {
  this(mastercardActionId, null, null);
  }

  public MasterCardActionReportApiObject(Integer mastercardActionId, String type) {
  this(mastercardActionId, type, null);
  }

  public MasterCardActionReportApiObject(Integer mastercardActionId, String type, String status) {
    this.mastercardActionIdFieldForRequest = mastercardActionId;
    this.typeFieldForRequest = type;
    this.statusFieldForRequest = status;
  }

  /**
   * The id of mastercard action being reported.
   */
  public Integer getMastercardActionId() {
    return this.mastercardActionId;
  }

  public void setMastercardActionId(Integer mastercardActionId) {
    this.mastercardActionId = mastercardActionId;
  }

  /**
   * The id of mastercard action being reported.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The id of mastercard action being reported.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The reported merchant.
   */
  public String getMerchantId() {
    return this.merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * The name of the merchant.
   */
  public String getMerchantName() {
    return this.merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  /**
   * The monetary account label of the merchant.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.mastercardActionId != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.merchantId != null) {
      return false;
    }

    if (this.merchantName != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MasterCardActionReportApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MasterCardActionReportApiObject.class, reader);
  }

}
