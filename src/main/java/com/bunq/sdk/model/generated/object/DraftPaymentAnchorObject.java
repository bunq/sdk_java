package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.bunq.sdk.model.generated.endpoint.PaymentBatch;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class DraftPaymentAnchorObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("Payment")
  private Payment payment;

  /**
   */
  @Expose
  @SerializedName("PaymentBatch")
  private PaymentBatch paymentBatch;

  /**
   */
  public static DraftPaymentAnchorObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(DraftPaymentAnchorObject.class, reader);
  }

  /**
   */
  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  /**
   */
  public PaymentBatch getPaymentBatch() {
    return this.paymentBatch;
  }

  public void setPaymentBatch(PaymentBatch paymentBatch) {
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

}
