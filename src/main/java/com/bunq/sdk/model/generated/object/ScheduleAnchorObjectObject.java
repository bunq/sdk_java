package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.PaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.PaymentBatchApiObject;
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
public class ScheduleAnchorObjectObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("Payment")
  private PaymentApiObject payment;

  /**
   */
  @Expose
  @SerializedName("PaymentBatch")
  private PaymentBatchApiObject paymentBatch;

  /**
   */
  public PaymentApiObject getPayment() {
    return this.payment;
  }

  public void setPayment(PaymentApiObject payment) {
    this.payment = payment;
  }

  /**
   */
  public PaymentBatchApiObject getPaymentBatch() {
    return this.paymentBatch;
  }

  public void setPaymentBatch(PaymentBatchApiObject paymentBatch) {
    this.paymentBatch = paymentBatch;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.payment != null) {
      return this.payment;
    }

    if (this.paymentBatch != null) {
      return this.paymentBatch;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.payment != null) {
      return false;
    }

    if (this.paymentBatch != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ScheduleAnchorObjectObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(ScheduleAnchorObjectObject.class, reader);
  }

}
