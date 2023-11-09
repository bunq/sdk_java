package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.CurrencyConversion;
import com.bunq.sdk.model.generated.endpoint.DraftPayment;
import com.bunq.sdk.model.generated.endpoint.Invoice;
import com.bunq.sdk.model.generated.endpoint.MasterCardAction;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.bunq.sdk.model.generated.endpoint.PaymentBatch;
import com.bunq.sdk.model.generated.endpoint.RequestResponse;
import com.bunq.sdk.model.generated.endpoint.ScheduleInstance;
import com.bunq.sdk.model.generated.endpoint.TransferwiseTransfer;
import com.bunq.sdk.model.generated.endpoint.WhitelistResult;
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
public class RequestReferenceSplitTheBillAnchorObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("BillingInvoice")
  private Invoice billingInvoice;

  /**
   */
  @Expose
  @SerializedName("DraftPayment")
  private DraftPayment draftPayment;

  /**
   */
  @Expose
  @SerializedName("MasterCardAction")
  private MasterCardAction masterCardAction;

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
  @Expose
  @SerializedName("RequestResponse")
  private RequestResponse requestResponse;

  /**
   */
  @Expose
  @SerializedName("ScheduleInstance")
  private ScheduleInstance scheduleInstance;

  /**
   */
  @Expose
  @SerializedName("WhitelistResult")
  private WhitelistResult whitelistResult;

  /**
   */
  @Expose
  @SerializedName("TransferwisePayment")
  private TransferwiseTransfer transferwisePayment;

  /**
   */
  @Expose
  @SerializedName("CurrencyConversion")
  private CurrencyConversion currencyConversion;

  /**
   */
  public Invoice getBillingInvoice() {
    return this.billingInvoice;
  }

  public void setBillingInvoice(Invoice billingInvoice) {
    this.billingInvoice = billingInvoice;
  }

  /**
   */
  public DraftPayment getDraftPayment() {
    return this.draftPayment;
  }

  public void setDraftPayment(DraftPayment draftPayment) {
    this.draftPayment = draftPayment;
  }

  /**
   */
  public MasterCardAction getMasterCardAction() {
    return this.masterCardAction;
  }

  public void setMasterCardAction(MasterCardAction masterCardAction) {
    this.masterCardAction = masterCardAction;
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
  public RequestResponse getRequestResponse() {
    return this.requestResponse;
  }

  public void setRequestResponse(RequestResponse requestResponse) {
    this.requestResponse = requestResponse;
  }

  /**
   */
  public ScheduleInstance getScheduleInstance() {
    return this.scheduleInstance;
  }

  public void setScheduleInstance(ScheduleInstance scheduleInstance) {
    this.scheduleInstance = scheduleInstance;
  }

  /**
   */
  public WhitelistResult getWhitelistResult() {
    return this.whitelistResult;
  }

  public void setWhitelistResult(WhitelistResult whitelistResult) {
    this.whitelistResult = whitelistResult;
  }

  /**
   */
  public TransferwiseTransfer getTransferwisePayment() {
    return this.transferwisePayment;
  }

  public void setTransferwisePayment(TransferwiseTransfer transferwisePayment) {
    this.transferwisePayment = transferwisePayment;
  }

  /**
   */
  public CurrencyConversion getCurrencyConversion() {
    return this.currencyConversion;
  }

  public void setCurrencyConversion(CurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.billingInvoice != null) {
      return this.billingInvoice;
    }

    if (this.draftPayment != null) {
      return this.draftPayment;
    }

    if (this.masterCardAction != null) {
      return this.masterCardAction;
    }

    if (this.payment != null) {
      return this.payment;
    }

    if (this.paymentBatch != null) {
      return this.paymentBatch;
    }

    if (this.requestResponse != null) {
      return this.requestResponse;
    }

    if (this.scheduleInstance != null) {
      return this.scheduleInstance;
    }

    if (this.whitelistResult != null) {
      return this.whitelistResult;
    }

    if (this.transferwisePayment != null) {
      return this.transferwisePayment;
    }

    if (this.currencyConversion != null) {
      return this.currencyConversion;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.billingInvoice != null) {
      return false;
    }

    if (this.draftPayment != null) {
      return false;
    }

    if (this.masterCardAction != null) {
      return false;
    }

    if (this.payment != null) {
      return false;
    }

    if (this.paymentBatch != null) {
      return false;
    }

    if (this.requestResponse != null) {
      return false;
    }

    if (this.scheduleInstance != null) {
      return false;
    }

    if (this.whitelistResult != null) {
      return false;
    }

    if (this.transferwisePayment != null) {
      return false;
    }

    if (this.currencyConversion != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RequestReferenceSplitTheBillAnchorObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(RequestReferenceSplitTheBillAnchorObject.class, reader);
  }

}
