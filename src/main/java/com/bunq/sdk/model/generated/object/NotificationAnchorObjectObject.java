package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.BunqMeFundraiserResultApiObject;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabApiObject;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultInquiryApiObject;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultResponseApiObject;
import com.bunq.sdk.model.generated.endpoint.ChatMessageApiObject;
import com.bunq.sdk.model.generated.endpoint.DraftPaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.IdealMerchantTransactionApiObject;
import com.bunq.sdk.model.generated.endpoint.InvoiceApiObject;
import com.bunq.sdk.model.generated.endpoint.MasterCardActionApiObject;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountApiObject;
import com.bunq.sdk.model.generated.endpoint.PaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.PaymentBatchApiObject;
import com.bunq.sdk.model.generated.endpoint.RequestInquiryApiObject;
import com.bunq.sdk.model.generated.endpoint.RequestInquiryBatchApiObject;
import com.bunq.sdk.model.generated.endpoint.RequestResponseApiObject;
import com.bunq.sdk.model.generated.endpoint.ScheduleInstanceApiObject;
import com.bunq.sdk.model.generated.endpoint.SchedulePaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.ShareInviteMonetaryAccountInquiryApiObject;
import com.bunq.sdk.model.generated.endpoint.ShareInviteMonetaryAccountResponseApiObject;
import com.bunq.sdk.model.generated.endpoint.UserApiObject;
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
public class NotificationAnchorObjectObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("BunqMeFundraiserResult")
  private BunqMeFundraiserResultApiObject bunqMeFundraiserResult;

  /**
   */
  @Expose
  @SerializedName("BunqMeTab")
  private BunqMeTabApiObject bunqMeTab;

  /**
   */
  @Expose
  @SerializedName("BunqMeTabResultInquiry")
  private BunqMeTabResultInquiryApiObject bunqMeTabResultInquiry;

  /**
   */
  @Expose
  @SerializedName("BunqMeTabResultResponse")
  private BunqMeTabResultResponseApiObject bunqMeTabResultResponse;

  /**
   */
  @Expose
  @SerializedName("ChatMessage")
  private ChatMessageApiObject chatMessage;

  /**
   */
  @Expose
  @SerializedName("DraftPayment")
  private DraftPaymentApiObject draftPayment;

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
  @SerializedName("MasterCardAction")
  private MasterCardActionApiObject masterCardAction;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccount")
  private MonetaryAccountApiObject monetaryAccount;

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
  @SerializedName("RequestInquiry")
  private RequestInquiryApiObject requestInquiry;

  /**
   */
  @Expose
  @SerializedName("RequestInquiryBatch")
  private RequestInquiryBatchApiObject requestInquiryBatch;

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
  @SerializedName("ScheduledPayment")
  private SchedulePaymentApiObject scheduledPayment;

  /**
   */
  @Expose
  @SerializedName("ScheduledInstance")
  private ScheduleInstanceApiObject scheduledInstance;

  /**
   */
  @Expose
  @SerializedName("User")
  private UserApiObject user;

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
  public BunqMeTabApiObject getBunqMeTab() {
    return this.bunqMeTab;
  }

  public void setBunqMeTab(BunqMeTabApiObject bunqMeTab) {
    this.bunqMeTab = bunqMeTab;
  }

  /**
   */
  public BunqMeTabResultInquiryApiObject getBunqMeTabResultInquiry() {
    return this.bunqMeTabResultInquiry;
  }

  public void setBunqMeTabResultInquiry(BunqMeTabResultInquiryApiObject bunqMeTabResultInquiry) {
    this.bunqMeTabResultInquiry = bunqMeTabResultInquiry;
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
  public ChatMessageApiObject getChatMessage() {
    return this.chatMessage;
  }

  public void setChatMessage(ChatMessageApiObject chatMessage) {
    this.chatMessage = chatMessage;
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
  public MasterCardActionApiObject getMasterCardAction() {
    return this.masterCardAction;
  }

  public void setMasterCardAction(MasterCardActionApiObject masterCardAction) {
    this.masterCardAction = masterCardAction;
  }

  /**
   */
  public MonetaryAccountApiObject getMonetaryAccount() {
    return this.monetaryAccount;
  }

  public void setMonetaryAccount(MonetaryAccountApiObject monetaryAccount) {
    this.monetaryAccount = monetaryAccount;
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
  public RequestInquiryApiObject getRequestInquiry() {
    return this.requestInquiry;
  }

  public void setRequestInquiry(RequestInquiryApiObject requestInquiry) {
    this.requestInquiry = requestInquiry;
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
  public SchedulePaymentApiObject getScheduledPayment() {
    return this.scheduledPayment;
  }

  public void setScheduledPayment(SchedulePaymentApiObject scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
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
  public UserApiObject getUser() {
    return this.user;
  }

  public void setUser(UserApiObject user) {
    this.user = user;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.bunqMeFundraiserResult != null) {
      return this.bunqMeFundraiserResult;
    }

    if (this.bunqMeTab != null) {
      return this.bunqMeTab;
    }

    if (this.bunqMeTabResultInquiry != null) {
      return this.bunqMeTabResultInquiry;
    }

    if (this.bunqMeTabResultResponse != null) {
      return this.bunqMeTabResultResponse;
    }

    if (this.chatMessage != null) {
      return this.chatMessage;
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

    if (this.masterCardAction != null) {
      return this.masterCardAction;
    }

    if (this.monetaryAccount != null) {
      return this.monetaryAccount;
    }

    if (this.payment != null) {
      return this.payment;
    }

    if (this.paymentBatch != null) {
      return this.paymentBatch;
    }

    if (this.requestInquiry != null) {
      return this.requestInquiry;
    }

    if (this.requestInquiryBatch != null) {
      return this.requestInquiryBatch;
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

    if (this.scheduledPayment != null) {
      return this.scheduledPayment;
    }

    if (this.scheduledInstance != null) {
      return this.scheduledInstance;
    }

    if (this.user != null) {
      return this.user;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.bunqMeFundraiserResult != null) {
      return false;
    }

    if (this.bunqMeTab != null) {
      return false;
    }

    if (this.bunqMeTabResultInquiry != null) {
      return false;
    }

    if (this.bunqMeTabResultResponse != null) {
      return false;
    }

    if (this.chatMessage != null) {
      return false;
    }

    if (this.draftPayment != null) {
      return false;
    }

    if (this.idealMerchantTransaction != null) {
      return false;
    }

    if (this.invoice != null) {
      return false;
    }

    if (this.masterCardAction != null) {
      return false;
    }

    if (this.monetaryAccount != null) {
      return false;
    }

    if (this.payment != null) {
      return false;
    }

    if (this.paymentBatch != null) {
      return false;
    }

    if (this.requestInquiry != null) {
      return false;
    }

    if (this.requestInquiryBatch != null) {
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

    if (this.scheduledPayment != null) {
      return false;
    }

    if (this.scheduledInstance != null) {
      return false;
    }

    if (this.user != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NotificationAnchorObjectObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationAnchorObjectObject.class, reader);
  }

}
