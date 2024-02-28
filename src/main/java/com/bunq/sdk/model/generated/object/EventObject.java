package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.BankSwitchServiceNetherlandsIncomingPayment;
import com.bunq.sdk.model.generated.endpoint.BunqMeFundraiserResult;
import com.bunq.sdk.model.generated.endpoint.BunqMeTab;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultResponse;
import com.bunq.sdk.model.generated.endpoint.Card;
import com.bunq.sdk.model.generated.endpoint.CardDebit;
import com.bunq.sdk.model.generated.endpoint.DraftPayment;
import com.bunq.sdk.model.generated.endpoint.FeatureAnnouncement;
import com.bunq.sdk.model.generated.endpoint.IdealMerchantTransaction;
import com.bunq.sdk.model.generated.endpoint.Invoice;
import com.bunq.sdk.model.generated.endpoint.MasterCardAction;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.bunq.sdk.model.generated.endpoint.PaymentBatch;
import com.bunq.sdk.model.generated.endpoint.RequestInquiry;
import com.bunq.sdk.model.generated.endpoint.RequestInquiryBatch;
import com.bunq.sdk.model.generated.endpoint.RequestResponse;
import com.bunq.sdk.model.generated.endpoint.ScheduleInstance;
import com.bunq.sdk.model.generated.endpoint.SchedulePayment;
import com.bunq.sdk.model.generated.endpoint.SchedulePaymentBatch;
import com.bunq.sdk.model.generated.endpoint.ShareInviteMonetaryAccountInquiry;
import com.bunq.sdk.model.generated.endpoint.ShareInviteMonetaryAccountResponse;
import com.bunq.sdk.model.generated.endpoint.SofortMerchantTransaction;
import com.bunq.sdk.model.generated.endpoint.TransferwiseTransfer;
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
public class EventObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("BunqMeTab")
  private BunqMeTab bunqMeTab;

  /**
   */
  @Expose
  @SerializedName("BunqMeTabResultResponse")
  private BunqMeTabResultResponse bunqMeTabResultResponse;

  /**
   */
  @Expose
  @SerializedName("BunqMeFundraiserResult")
  private BunqMeFundraiserResult bunqMeFundraiserResult;

  /**
   */
  @Expose
  @SerializedName("Card")
  private Card card;

  /**
   */
  @Expose
  @SerializedName("CardDebit")
  private CardDebit cardDebit;

  /**
   */
  @Expose
  @SerializedName("DraftPayment")
  private DraftPayment draftPayment;

  /**
   */
  @Expose
  @SerializedName("FeatureAnnouncement")
  private FeatureAnnouncement featureAnnouncement;

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
  @SerializedName("ScheduledPayment")
  private SchedulePayment scheduledPayment;

  /**
   */
  @Expose
  @SerializedName("ScheduledPaymentBatch")
  private SchedulePaymentBatch scheduledPaymentBatch;

  /**
   */
  @Expose
  @SerializedName("ScheduledInstance")
  private ScheduleInstance scheduledInstance;

  /**
   */
  @Expose
  @SerializedName("MasterCardAction")
  private MasterCardAction masterCardAction;

  /**
   */
  @Expose
  @SerializedName("BankSwitchServiceNetherlandsIncomingPayment")
  private BankSwitchServiceNetherlandsIncomingPayment bankSwitchServiceNetherlandsIncomingPayment;

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
  @SerializedName("ShareInviteBankInquiry")
  private ShareInviteMonetaryAccountInquiry shareInviteBankInquiry;

  /**
   */
  @Expose
  @SerializedName("ShareInviteBankResponse")
  private ShareInviteMonetaryAccountResponse shareInviteBankResponse;

  /**
   */
  @Expose
  @SerializedName("SofortMerchantTransaction")
  private SofortMerchantTransaction sofortMerchantTransaction;

  /**
   */
  @Expose
  @SerializedName("TransferwisePayment")
  private TransferwiseTransfer transferwisePayment;

  /**
   */
  public BunqMeTab getBunqMeTab() {
    return this.bunqMeTab;
  }

  public void setBunqMeTab(BunqMeTab bunqMeTab) {
    this.bunqMeTab = bunqMeTab;
  }

  /**
   */
  public BunqMeTabResultResponse getBunqMeTabResultResponse() {
    return this.bunqMeTabResultResponse;
  }

  public void setBunqMeTabResultResponse(BunqMeTabResultResponse bunqMeTabResultResponse) {
    this.bunqMeTabResultResponse = bunqMeTabResultResponse;
  }

  /**
   */
  public BunqMeFundraiserResult getBunqMeFundraiserResult() {
    return this.bunqMeFundraiserResult;
  }

  public void setBunqMeFundraiserResult(BunqMeFundraiserResult bunqMeFundraiserResult) {
    this.bunqMeFundraiserResult = bunqMeFundraiserResult;
  }

  /**
   */
  public Card getCard() {
    return this.card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

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
  public DraftPayment getDraftPayment() {
    return this.draftPayment;
  }

  public void setDraftPayment(DraftPayment draftPayment) {
    this.draftPayment = draftPayment;
  }

  /**
   */
  public FeatureAnnouncement getFeatureAnnouncement() {
    return this.featureAnnouncement;
  }

  public void setFeatureAnnouncement(FeatureAnnouncement featureAnnouncement) {
    this.featureAnnouncement = featureAnnouncement;
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
  public SchedulePayment getScheduledPayment() {
    return this.scheduledPayment;
  }

  public void setScheduledPayment(SchedulePayment scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
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
  public ScheduleInstance getScheduledInstance() {
    return this.scheduledInstance;
  }

  public void setScheduledInstance(ScheduleInstance scheduledInstance) {
    this.scheduledInstance = scheduledInstance;
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
  public BankSwitchServiceNetherlandsIncomingPayment getBankSwitchServiceNetherlandsIncomingPayment() {
    return this.bankSwitchServiceNetherlandsIncomingPayment;
  }

  public void setBankSwitchServiceNetherlandsIncomingPayment(BankSwitchServiceNetherlandsIncomingPayment bankSwitchServiceNetherlandsIncomingPayment) {
    this.bankSwitchServiceNetherlandsIncomingPayment = bankSwitchServiceNetherlandsIncomingPayment;
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
  public ShareInviteMonetaryAccountInquiry getShareInviteBankInquiry() {
    return this.shareInviteBankInquiry;
  }

  public void setShareInviteBankInquiry(ShareInviteMonetaryAccountInquiry shareInviteBankInquiry) {
    this.shareInviteBankInquiry = shareInviteBankInquiry;
  }

  /**
   */
  public ShareInviteMonetaryAccountResponse getShareInviteBankResponse() {
    return this.shareInviteBankResponse;
  }

  public void setShareInviteBankResponse(ShareInviteMonetaryAccountResponse shareInviteBankResponse) {
    this.shareInviteBankResponse = shareInviteBankResponse;
  }

  /**
   */
  public SofortMerchantTransaction getSofortMerchantTransaction() {
    return this.sofortMerchantTransaction;
  }

  public void setSofortMerchantTransaction(SofortMerchantTransaction sofortMerchantTransaction) {
    this.sofortMerchantTransaction = sofortMerchantTransaction;
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
  public BunqModel getReferencedObject() {
    if (this.bunqMeTab != null) {
      return this.bunqMeTab;
    }

    if (this.bunqMeTabResultResponse != null) {
      return this.bunqMeTabResultResponse;
    }

    if (this.bunqMeFundraiserResult != null) {
      return this.bunqMeFundraiserResult;
    }

    if (this.card != null) {
      return this.card;
    }

    if (this.cardDebit != null) {
      return this.cardDebit;
    }

    if (this.draftPayment != null) {
      return this.draftPayment;
    }

    if (this.featureAnnouncement != null) {
      return this.featureAnnouncement;
    }

    if (this.idealMerchantTransaction != null) {
      return this.idealMerchantTransaction;
    }

    if (this.invoice != null) {
      return this.invoice;
    }

    if (this.scheduledPayment != null) {
      return this.scheduledPayment;
    }

    if (this.scheduledPaymentBatch != null) {
      return this.scheduledPaymentBatch;
    }

    if (this.scheduledInstance != null) {
      return this.scheduledInstance;
    }

    if (this.masterCardAction != null) {
      return this.masterCardAction;
    }

    if (this.bankSwitchServiceNetherlandsIncomingPayment != null) {
      return this.bankSwitchServiceNetherlandsIncomingPayment;
    }

    if (this.payment != null) {
      return this.payment;
    }

    if (this.paymentBatch != null) {
      return this.paymentBatch;
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

    if (this.shareInviteBankInquiry != null) {
      return this.shareInviteBankInquiry;
    }

    if (this.shareInviteBankResponse != null) {
      return this.shareInviteBankResponse;
    }

    if (this.sofortMerchantTransaction != null) {
      return this.sofortMerchantTransaction;
    }

    if (this.transferwisePayment != null) {
      return this.transferwisePayment;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.bunqMeTab != null) {
      return false;
    }

    if (this.bunqMeTabResultResponse != null) {
      return false;
    }

    if (this.bunqMeFundraiserResult != null) {
      return false;
    }

    if (this.card != null) {
      return false;
    }

    if (this.cardDebit != null) {
      return false;
    }

    if (this.draftPayment != null) {
      return false;
    }

    if (this.featureAnnouncement != null) {
      return false;
    }

    if (this.idealMerchantTransaction != null) {
      return false;
    }

    if (this.invoice != null) {
      return false;
    }

    if (this.scheduledPayment != null) {
      return false;
    }

    if (this.scheduledPaymentBatch != null) {
      return false;
    }

    if (this.scheduledInstance != null) {
      return false;
    }

    if (this.masterCardAction != null) {
      return false;
    }

    if (this.bankSwitchServiceNetherlandsIncomingPayment != null) {
      return false;
    }

    if (this.payment != null) {
      return false;
    }

    if (this.paymentBatch != null) {
      return false;
    }

    if (this.requestInquiryBatch != null) {
      return false;
    }

    if (this.requestInquiry != null) {
      return false;
    }

    if (this.requestResponse != null) {
      return false;
    }

    if (this.shareInviteBankInquiry != null) {
      return false;
    }

    if (this.shareInviteBankResponse != null) {
      return false;
    }

    if (this.sofortMerchantTransaction != null) {
      return false;
    }

    if (this.transferwisePayment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static EventObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(EventObject.class, reader);
  }

}
