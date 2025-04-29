package com.bunq.sdk.model.generated.endpoint;

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
 * The receipt the company employee has provided for a transaction.
 */
public class CompanyEmployeeCardReceiptApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * The status of the receipt.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * Update the status of this receipt.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public CompanyEmployeeCardReceiptApiObject() {
  this(null);
  }

  public CompanyEmployeeCardReceiptApiObject(String status) {
    this.statusFieldForRequest = status;
  }

  /**
   * The status of the receipt.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CompanyEmployeeCardReceiptApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CompanyEmployeeCardReceiptApiObject.class, reader);
  }

}
