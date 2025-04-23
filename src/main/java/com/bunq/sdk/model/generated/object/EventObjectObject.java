package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.BankSwitchServiceNetherlandsIncomingPaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.BunqMeFundraiserResultApiObject;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabApiObject;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultResponseApiObject;
import com.bunq.sdk.model.generated.endpoint.CardApiObject;
import com.bunq.sdk.model.generated.endpoint.CardDebitApiObject;
import com.bunq.sdk.model.generated.endpoint.DraftPaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.FeatureAnnouncementApiObject;
import com.bunq.sdk.model.generated.endpoint.IdealMerchantTransactionApiObject;
import com.bunq.sdk.model.generated.endpoint.InvoiceApiObject;
import com.bunq.sdk.model.generated.endpoint.MasterCardActionApiObject;
import com.bunq.sdk.model.generated.endpoint.PaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.PaymentBatchApiObject;
import com.bunq.sdk.model.generated.endpoint.RequestInquiryApiObject;
import com.bunq.sdk.model.generated.endpoint.RequestInquiryBatchApiObject;
import com.bunq.sdk.model.generated.endpoint.RequestResponseApiObject;
import com.bunq.sdk.model.generated.endpoint.ScheduleInstanceApiObject;
import com.bunq.sdk.model.generated.endpoint.SchedulePaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.SchedulePaymentBatchApiObject;
import com.bunq.sdk.model.generated.endpoint.ShareInviteMonetaryAccountInquiryApiObject;
import com.bunq.sdk.model.generated.endpoint.ShareInviteMonetaryAccountResponseApiObject;
import com.bunq.sdk.model.generated.endpoint.SofortMerchantTransactionApiObject;
import com.bunq.sdk.model.generated.endpoint.TransferwiseTransferApiObject;
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
public class EventObjectObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("BunqMeTab")
  private BunqMeTabApiObject bunqMeTab;

  /**
   */
  @Expose
  @SerializedName("BunqMeTabResultResponse")
  private BunqMeTabResultResponseApiObject bunqMeTabResultResponse;

  /**
   */
  @Expose
  @SerializedName("BunqMeFundraiserResult")
  private BunqMeFundraiserResultApiObject bunqMeFundraiserResult;

  /**
   */
  @Expose
  @SerializedName("Card")
  private CardApiObject card;

  /**
   */
  @Expose
  @SerializedName("CardDebit")
  private CardDebitApiObject cardDebit;

  /**
   */
  @Expose
  @SerializedName("DraftPayment")
  private DraftPaymentApiObject draftPayment;

  /**
   */
  @Expose
  @SerializedName("FeatureAnnouncement")
  private FeatureAnnouncementApiObject featureAnnouncement;

  /**
   */
  @Expose
  @SerializedName("IdealMerchantTransaction")
  private IdealMerchantTransactionApiObject idealMerchantTransaction;

  /**
   */
  @Expose
  @SerializedName("Invoice")
  private InvoiceApiObject invoice;

  /**
   */
  @Expose
  @SerializedName("ScheduledPayment")
  private SchedulePaymentApiObject scheduledPayment;

  /**
   */
  @Expose
  @SerializedName("ScheduledPaymentBatch")
  private SchedulePaymentBatchApiObject scheduledPaymentBatch;

  /**
   */
  @Expose
  @SerializedName("ScheduledInstance")
  private ScheduleInstanceApiObject scheduledInstance;

  /**
   */
  @Expose
  @SerializedName("MasterCardAction")
  private MasterCardActionApiObject masterCardAction;

  /**
   */
  @Expose
  @SerializedName("BankSwitchServiceNetherlandsIncomingPayment")
  private BankSwitchServiceNetherlandsIncomingPaymentApiObject bankSwitchServiceNetherlandsIncomingPayment;

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
  @SerializedName("RequestInquiryBatch")
  private RequestInquiryBatchApiObject requestInquiryBatch;

  /**
   */
  @Expose
  @SerializedName("RequestInquiry")
  private RequestInquiryApiObject requestInquiry;

  /**
   */
  @Expose
  @SerializedName("RequestResponse")
  private RequestResponseApiObject requestResponse;

  /**
   */
  @Expose
  @SerializedName("ShareInviteBankInquiry")
  private ShareInviteMonetaryAccountInquiryApiObject shareInviteBankInquiry;

  /**
   */
  @Expose
  @SerializedName("ShareInviteBankResponse")
  private ShareInviteMonetaryAccountResponseApiObject shareInviteBankResponse;

  /**
   */
  @Expose
  @SerializedName("SofortMerchantTransaction")
  private SofortMerchantTransactionApiObject sofortMerchantTransaction;

  /**
   */
  @Expose
  @SerializedName("TransferwisePayment")
  private TransferwiseTransferApiObject transferwisePayment;

  /**
   */
  public BunqMeTabApiObject getBunqMeTab() {
    return this.bunqMeTab;
  }

  public void setBunqMeTab(BunqMeTabApiObject bunqMeTab) {
    this.bunqMeTab = bunqMeTab;
  }

  /**
   */
  public BunqMeTabResultResponseApiObject getBunqMeTabResultResponse() {
    return this.bunqMeTabResultResponse;
  }

  public void setBunqMeTabResultResponse(BunqMeTabResultResponseApiObject bunqMeTabResultResponse) {
    this.bunqMeTabResultResponse = bunqMeTabResultResponse;
  }

  /**
   */
  public BunqMeFundraiserResultApiObject getBunqMeFundraiserResult() {
    return this.bunqMeFundraiserResult;
  }

  public void setBunqMeFundraiserResult(BunqMeFundraiserResultApiObject bunqMeFundraiserResult) {
    this.bunqMeFundraiserResult = bunqMeFundraiserResult;
  }

  /**
   */
  public CardApiObject getCard() {
    return this.card;
  }

  public void setCard(CardApiObject card) {
    this.card = card;
  }

  /**
   */
  public CardDebitApiObject getCardDebit() {
    return this.cardDebit;
  }

  public void setCardDebit(CardDebitApiObject cardDebit) {
    this.cardDebit = cardDebit;
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
  public FeatureAnnouncementApiObject getFeatureAnnouncement() {
    return this.featureAnnouncement;
  }

  public void setFeatureAnnouncement(FeatureAnnouncementApiObject featureAnnouncement) {
    this.featureAnnouncement = featureAnnouncement;
  }

  /**
   */
  public IdealMerchantTransactionApiObject getIdealMerchantTransaction() {
    return this.idealMerchantTransaction;
  }

  public void setIdealMerchantTransaction(IdealMerchantTransactionApiObject idealMerchantTransaction) {
    this.idealMerchantTransaction = idealMerchantTransaction;
  }

  /**
   */
  public InvoiceApiObject getInvoice() {
    return this.invoice;
  }

  public void setInvoice(InvoiceApiObject invoice) {
    this.invoice = invoice;
  }

  /**
   */
  public SchedulePaymentApiObject getScheduledPayment() {
    return this.scheduledPayment;
  }

  public void setScheduledPayment(SchedulePaymentApiObject scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
  }

  /**
   */
  public SchedulePaymentBatchApiObject getScheduledPaymentBatch() {
    return this.scheduledPaymentBatch;
  }

  public void setScheduledPaymentBatch(SchedulePaymentBatchApiObject scheduledPaymentBatch) {
    this.scheduledPaymentBatch = scheduledPaymentBatch;
  }

  /**
   */
  public ScheduleInstanceApiObject getScheduledInstance() {
    return this.scheduledInstance;
  }

  public void setScheduledInstance(ScheduleInstanceApiObject scheduledInstance) {
    this.scheduledInstance = scheduledInstance;
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
  public BankSwitchServiceNetherlandsIncomingPaymentApiObject getBankSwitchServiceNetherlandsIncomingPayment() {
    return this.bankSwitchServiceNetherlandsIncomingPayment;
  }

  public void setBankSwitchServiceNetherlandsIncomingPayment(BankSwitchServiceNetherlandsIncomingPaymentApiObject bankSwitchServiceNetherlandsIncomingPayment) {
    this.bankSwitchServiceNetherlandsIncomingPayment = bankSwitchServiceNetherlandsIncomingPayment;
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
  public RequestInquiryBatchApiObject getRequestInquiryBatch() {
    return this.requestInquiryBatch;
  }

  public void setRequestInquiryBatch(RequestInquiryBatchApiObject requestInquiryBatch) {
    this.requestInquiryBatch = requestInquiryBatch;
  }

  /**
   */
  public RequestInquiryApiObject getRequestInquiry() {
    return this.requestInquiry;
  }

  public void setRequestInquiry(RequestInquiryApiObject requestInquiry) {
    this.requestInquiry = requestInquiry;
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
  public ShareInviteMonetaryAccountInquiryApiObject getShareInviteBankInquiry() {
    return this.shareInviteBankInquiry;
  }

  public void setShareInviteBankInquiry(ShareInviteMonetaryAccountInquiryApiObject shareInviteBankInquiry) {
    this.shareInviteBankInquiry = shareInviteBankInquiry;
  }

  /**
   */
  public ShareInviteMonetaryAccountResponseApiObject getShareInviteBankResponse() {
    return this.shareInviteBankResponse;
  }

  public void setShareInviteBankResponse(ShareInviteMonetaryAccountResponseApiObject shareInviteBankResponse) {
    this.shareInviteBankResponse = shareInviteBankResponse;
  }

  /**
   */
  public SofortMerchantTransactionApiObject getSofortMerchantTransaction() {
    return this.sofortMerchantTransaction;
  }

  public void setSofortMerchantTransaction(SofortMerchantTransactionApiObject sofortMerchantTransaction) {
    this.sofortMerchantTransaction = sofortMerchantTransaction;
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
  public static EventObjectObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(EventObjectObject.class, reader);
  }

}
