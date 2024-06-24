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
 * Suspended outgoing payments.
 */
public class PaymentSuspendedOutgoing extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * The ID of the monetary account the payment was sent from.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private String monetaryAccountId;

  /**
   * The status of the payment.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The time this payment should be executed.
   */
  @Expose
  @SerializedName("time_execution")
  private String timeExecution;

  /**
   * The status to update to.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public PaymentSuspendedOutgoing() {
  this(null);
  }

  public PaymentSuspendedOutgoing(String status) {
    this.statusFieldForRequest = status;
  }

  /**
   * The ID of the monetary account the payment was sent from.
   */
  public String getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(String monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The status of the payment.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The time this payment should be executed.
   */
  public String getTimeExecution() {
    return this.timeExecution;
  }

  public void setTimeExecution(String timeExecution) {
    this.timeExecution = timeExecution;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.timeExecution != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentSuspendedOutgoing fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentSuspendedOutgoing.class, reader);
  }

}
