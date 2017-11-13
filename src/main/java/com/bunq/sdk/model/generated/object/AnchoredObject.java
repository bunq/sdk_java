package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.CardDebit;
import com.bunq.sdk.model.generated.endpoint.CardPinChange;
import com.bunq.sdk.model.generated.endpoint.CardResult;
import com.bunq.sdk.model.generated.endpoint.DraftPayment;
import com.bunq.sdk.model.generated.endpoint.IdealMerchantTransaction;
import com.bunq.sdk.model.generated.endpoint.Invoice;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.bunq.sdk.model.generated.endpoint.PaymentBatch;
import com.bunq.sdk.model.generated.endpoint.PromotionDisplay;
import com.bunq.sdk.model.generated.endpoint.RequestInquiry;
import com.bunq.sdk.model.generated.endpoint.RequestInquiryBatch;
import com.bunq.sdk.model.generated.endpoint.RequestResponse;
import com.bunq.sdk.model.generated.endpoint.ScheduleInstance;
import com.bunq.sdk.model.generated.endpoint.SchedulePayment;
import com.bunq.sdk.model.generated.endpoint.SchedulePaymentBatch;
import com.bunq.sdk.model.generated.endpoint.ShareInviteBankInquiry;
import com.bunq.sdk.model.generated.endpoint.ShareInviteBankResponse;
import com.bunq.sdk.model.generated.endpoint.UserCredentialPasswordIp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class AnchoredObject extends BunqModel {

  /**
   * Error constants.
   */
  private static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("CardDebit")
  private CardDebit cardDebit;

  /**
   */
  @Expose
  @SerializedName("CardPinChange")
  private CardPinChange cardPinChange;

  /**
   */
  @Expose
  @SerializedName("CardResult")
  private CardResult cardResult;

  /**
   */
  @Expose
  @SerializedName("DraftPayment")
  private DraftPayment draftPayment;

  /**
   */
  @Expose
  @SerializedName("IdealMerchantTransaction")
  private IdealMerchantTransaction idealMerchantTransaction;

  /**
   */
  @Expose
  @SerializedName("Invoice")
  private Invoice invoice;

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
  @SerializedName("PromotionDisplay")
  private PromotionDisplay promotionDisplay;

  /**
   */
  @Expose
  @SerializedName("RequestInquiryBatch")
  private RequestInquiryBatch requestInquiryBatch;

  /**
   */
  @Expose
  @SerializedName("RequestInquiry")
  private RequestInquiry requestInquiry;

  /**
   */
  @Expose
  @SerializedName("RequestResponse")
  private RequestResponse requestResponse;

  /**
   */
  @Expose
  @SerializedName("ScheduledPaymentBatch")
  private SchedulePaymentBatch scheduledPaymentBatch;

  /**
   */
  @Expose
  @SerializedName("ScheduledPayment")
  private SchedulePayment scheduledPayment;

  /**
   */
  @Expose
  @SerializedName("ScheduledInstance")
  private ScheduleInstance scheduledInstance;

  /**
   */
  @Expose
  @SerializedName("ShareInviteBankInquiry")
  private ShareInviteBankInquiry shareInviteBankInquiry;

  /**
   */
  @Expose
  @SerializedName("ShareInviteBankResponse")
  private ShareInviteBankResponse shareInviteBankResponse;

  /**
   */
  @Expose
  @SerializedName("UserCredentialPasswordIp")
  private UserCredentialPasswordIp userCredentialPasswordIp;

  /**
   */
  public CardDebit getCardDebit() {
    return this.cardDebit;
  }

  public void setCardDebit(CardDebit cardDebit) {
    this.cardDebit = cardDebit;
  }

  /**
   */
  public CardPinChange getCardPinChange() {
    return this.cardPinChange;
  }

  public void setCardPinChange(CardPinChange cardPinChange) {
    this.cardPinChange = cardPinChange;
  }

  /**
   */
  public CardResult getCardResult() {
    return this.cardResult;
  }

  public void setCardResult(CardResult cardResult) {
    this.cardResult = cardResult;
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
  public IdealMerchantTransaction getIdealMerchantTransaction() {
    return this.idealMerchantTransaction;
  }

  public void setIdealMerchantTransaction(IdealMerchantTransaction idealMerchantTransaction) {
    this.idealMerchantTransaction = idealMerchantTransaction;
  }

  /**
   */
  public Invoice getInvoice() {
    return this.invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
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
  public PromotionDisplay getPromotionDisplay() {
    return this.promotionDisplay;
  }

  public void setPromotionDisplay(PromotionDisplay promotionDisplay) {
    this.promotionDisplay = promotionDisplay;
  }

  /**
   */
  public RequestInquiryBatch getRequestInquiryBatch() {
    return this.requestInquiryBatch;
  }

  public void setRequestInquiryBatch(RequestInquiryBatch requestInquiryBatch) {
    this.requestInquiryBatch = requestInquiryBatch;
  }

  /**
   */
  public RequestInquiry getRequestInquiry() {
    return this.requestInquiry;
  }

  public void setRequestInquiry(RequestInquiry requestInquiry) {
    this.requestInquiry = requestInquiry;
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
  public SchedulePaymentBatch getScheduledPaymentBatch() {
    return this.scheduledPaymentBatch;
  }

  public void setScheduledPaymentBatch(SchedulePaymentBatch scheduledPaymentBatch) {
    this.scheduledPaymentBatch = scheduledPaymentBatch;
  }

  /**
   */
  public SchedulePayment getScheduledPayment() {
    return this.scheduledPayment;
  }

  public void setScheduledPayment(SchedulePayment scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
  }

  /**
   */
  public ScheduleInstance getScheduledInstance() {
    return this.scheduledInstance;
  }

  public void setScheduledInstance(ScheduleInstance scheduledInstance) {
    this.scheduledInstance = scheduledInstance;
  }

  /**
   */
  public ShareInviteBankInquiry getShareInviteBankInquiry() {
    return this.shareInviteBankInquiry;
  }

  public void setShareInviteBankInquiry(ShareInviteBankInquiry shareInviteBankInquiry) {
    this.shareInviteBankInquiry = shareInviteBankInquiry;
  }

  /**
   */
  public ShareInviteBankResponse getShareInviteBankResponse() {
    return this.shareInviteBankResponse;
  }

  public void setShareInviteBankResponse(ShareInviteBankResponse shareInviteBankResponse) {
    this.shareInviteBankResponse = shareInviteBankResponse;
  }

  /**
   */
  public UserCredentialPasswordIp getUserCredentialPasswordIp() {
    return this.userCredentialPasswordIp;
  }

  public void setUserCredentialPasswordIp(UserCredentialPasswordIp userCredentialPasswordIp) {
    this.userCredentialPasswordIp = userCredentialPasswordIp;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.cardDebit != null) {
      return this.cardDebit;
    }

    if (this.cardPinChange != null) {
      return this.cardPinChange;
    }

    if (this.cardResult != null) {
      return this.cardResult;
    }

    if (this.draftPayment != null) {
      return this.draftPayment;
    }

    if (this.idealMerchantTransaction != null) {
      return this.idealMerchantTransaction;
    }

    if (this.invoice != null) {
      return this.invoice;
    }

    if (this.payment != null) {
      return this.payment;
    }

    if (this.paymentBatch != null) {
      return this.paymentBatch;
    }

    if (this.promotionDisplay != null) {
      return this.promotionDisplay;
    }

    if (this.requestInquiryBatch != null) {
      return this.requestInquiryBatch;
    }

    if (this.requestInquiry != null) {
      return this.requestInquiry;
    }

    if (this.requestResponse != null) {
      return this.requestResponse;
    }

    if (this.scheduledPaymentBatch != null) {
      return this.scheduledPaymentBatch;
    }

    if (this.scheduledPayment != null) {
      return this.scheduledPayment;
    }

    if (this.scheduledInstance != null) {
      return this.scheduledInstance;
    }

    if (this.shareInviteBankInquiry != null) {
      return this.shareInviteBankInquiry;
    }

    if (this.shareInviteBankResponse != null) {
      return this.shareInviteBankResponse;
    }

    if (this.userCredentialPasswordIp != null) {
      return this.userCredentialPasswordIp;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

}
