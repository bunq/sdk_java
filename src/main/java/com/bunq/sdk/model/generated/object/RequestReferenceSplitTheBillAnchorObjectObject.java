package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.CurrencyConversionApiObject;
import com.bunq.sdk.model.generated.endpoint.DraftPaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.InvoiceApiObject;
import com.bunq.sdk.model.generated.endpoint.MasterCardActionApiObject;
import com.bunq.sdk.model.generated.endpoint.PaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.PaymentBatchApiObject;
import com.bunq.sdk.model.generated.endpoint.RequestResponseApiObject;
import com.bunq.sdk.model.generated.endpoint.ScheduleInstanceApiObject;
import com.bunq.sdk.model.generated.endpoint.TransferwiseTransferApiObject;
import com.bunq.sdk.model.generated.endpoint.WhitelistResultApiObject;
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
public class RequestReferenceSplitTheBillAnchorObjectObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("BillingInvoice")
  private InvoiceApiObject billingInvoice;

  /**
   */
  @Expose
  @SerializedName("DraftPayment")
  private DraftPaymentApiObject draftPayment;

  /**
   */
  @Expose
  @SerializedName("MasterCardAction")
  private MasterCardActionApiObject masterCardAction;

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
  @Expose
  @SerializedName("RequestResponse")
  private RequestResponseApiObject requestResponse;

  /**
   */
  @Expose
  @SerializedName("ScheduleInstance")
  private ScheduleInstanceApiObject scheduleInstance;

  /**
   */
  @Expose
  @SerializedName("WhitelistResult")
  private WhitelistResultApiObject whitelistResult;

  /**
   */
  @Expose
  @SerializedName("TransferwisePayment")
  private TransferwiseTransferApiObject transferwisePayment;

  /**
   */
  @Expose
  @SerializedName("CurrencyConversion")
  private CurrencyConversionApiObject currencyConversion;

  /**
   */
  public InvoiceApiObject getBillingInvoice() {
    return this.billingInvoice;
  }

  public void setBillingInvoice(InvoiceApiObject billingInvoice) {
    this.billingInvoice = billingInvoice;
  }

  /**
   */
  public DraftPaymentApiObject getDraftPayment() {
    return this.draftPayment;
  }

  public void setDraftPayment(DraftPaymentApiObject draftPayment) {
    this.draftPayment = draftPayment;
  }

  /**
   */
  public MasterCardActionApiObject getMasterCardAction() {
    return this.masterCardAction;
  }

  public void setMasterCardAction(MasterCardActionApiObject masterCardAction) {
    this.masterCardAction = masterCardAction;
  }

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
  public RequestResponseApiObject getRequestResponse() {
    return this.requestResponse;
  }

  public void setRequestResponse(RequestResponseApiObject requestResponse) {
    this.requestResponse = requestResponse;
  }

  /**
   */
  public ScheduleInstanceApiObject getScheduleInstance() {
    return this.scheduleInstance;
  }

  public void setScheduleInstance(ScheduleInstanceApiObject scheduleInstance) {
    this.scheduleInstance = scheduleInstance;
  }

  /**
   */
  public WhitelistResultApiObject getWhitelistResult() {
    return this.whitelistResult;
  }

  public void setWhitelistResult(WhitelistResultApiObject whitelistResult) {
    this.whitelistResult = whitelistResult;
  }

  /**
   */
  public TransferwiseTransferApiObject getTransferwisePayment() {
    return this.transferwisePayment;
  }

  public void setTransferwisePayment(TransferwiseTransferApiObject transferwisePayment) {
    this.transferwisePayment = transferwisePayment;
  }

  /**
   */
  public CurrencyConversionApiObject getCurrencyConversion() {
    return this.currencyConversion;
  }

  public void setCurrencyConversion(CurrencyConversionApiObject currencyConversion) {
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
  public static RequestReferenceSplitTheBillAnchorObjectObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(RequestReferenceSplitTheBillAnchorObjectObject.class, reader);
  }

}
