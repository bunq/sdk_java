package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.endpoint.BunqMeFundraiserResult;
import com.bunq.sdk.model.generated.endpoint.BunqMeTab;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultInquiry;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultResponse;
import com.bunq.sdk.model.generated.endpoint.ChatMessage;
import com.bunq.sdk.model.generated.endpoint.DraftPayment;
import com.bunq.sdk.model.generated.endpoint.IdealMerchantTransaction;
import com.bunq.sdk.model.generated.endpoint.Invoice;
import com.bunq.sdk.model.generated.endpoint.MasterCardAction;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccount;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.bunq.sdk.model.generated.endpoint.PaymentBatch;
import com.bunq.sdk.model.generated.endpoint.RequestInquiry;
import com.bunq.sdk.model.generated.endpoint.RequestInquiryBatch;
import com.bunq.sdk.model.generated.endpoint.RequestResponse;
import com.bunq.sdk.model.generated.endpoint.ScheduleInstance;
import com.bunq.sdk.model.generated.endpoint.SchedulePayment;
import com.bunq.sdk.model.generated.endpoint.ShareInviteBankInquiry;
import com.bunq.sdk.model.generated.endpoint.ShareInviteBankResponse;
import com.bunq.sdk.model.generated.endpoint.TabResultInquiry;
import com.bunq.sdk.model.generated.endpoint.TabResultResponse;
import com.bunq.sdk.model.generated.endpoint.User;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class NotificationAnchorObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("BunqMeFundraiserResult")
  private BunqMeFundraiserResult bunqMeFundraiserResult;

  /**
   */
  @Expose
  @SerializedName("BunqMeTab")
  private BunqMeTab bunqMeTab;

  /**
   */
  @Expose
  @SerializedName("BunqMeTabResultInquiry")
  private BunqMeTabResultInquiry bunqMeTabResultInquiry;

  /**
   */
  @Expose
  @SerializedName("BunqMeTabResultResponse")
  private BunqMeTabResultResponse bunqMeTabResultResponse;

  /**
   */
  @Expose
  @SerializedName("ChatMessage")
  private ChatMessage chatMessage;

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
  @SerializedName("MasterCardAction")
  private MasterCardAction masterCardAction;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccount")
  private MonetaryAccount monetaryAccount;

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
  @SerializedName("RequestInquiry")
  private RequestInquiry requestInquiry;

  /**
   */
  @Expose
  @SerializedName("RequestInquiryBatch")
  private RequestInquiryBatch requestInquiryBatch;

  /**
   */
  @Expose
  @SerializedName("RequestResponse")
  private RequestResponse requestResponse;

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
  @SerializedName("TabResultInquiry")
  private TabResultInquiry tabResultInquiry;

  /**
   */
  @Expose
  @SerializedName("TabResultResponse")
  private TabResultResponse tabResultResponse;

  /**
   */
  @Expose
  @SerializedName("User")
  private User user;

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
  public BunqMeTab getBunqMeTab() {
    return this.bunqMeTab;
  }

  public void setBunqMeTab(BunqMeTab bunqMeTab) {
    this.bunqMeTab = bunqMeTab;
  }

  /**
   */
  public BunqMeTabResultInquiry getBunqMeTabResultInquiry() {
    return this.bunqMeTabResultInquiry;
  }

  public void setBunqMeTabResultInquiry(BunqMeTabResultInquiry bunqMeTabResultInquiry) {
    this.bunqMeTabResultInquiry = bunqMeTabResultInquiry;
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
  public ChatMessage getChatMessage() {
    return this.chatMessage;
  }

  public void setChatMessage(ChatMessage chatMessage) {
    this.chatMessage = chatMessage;
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
  public MasterCardAction getMasterCardAction() {
    return this.masterCardAction;
  }

  public void setMasterCardAction(MasterCardAction masterCardAction) {
    this.masterCardAction = masterCardAction;
  }

  /**
   */
  public MonetaryAccount getMonetaryAccount() {
    return this.monetaryAccount;
  }

  public void setMonetaryAccount(MonetaryAccount monetaryAccount) {
    this.monetaryAccount = monetaryAccount;
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
  public RequestInquiry getRequestInquiry() {
    return this.requestInquiry;
  }

  public void setRequestInquiry(RequestInquiry requestInquiry) {
    this.requestInquiry = requestInquiry;
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
  public RequestResponse getRequestResponse() {
    return this.requestResponse;
  }

  public void setRequestResponse(RequestResponse requestResponse) {
    this.requestResponse = requestResponse;
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
  public TabResultInquiry getTabResultInquiry() {
    return this.tabResultInquiry;
  }

  public void setTabResultInquiry(TabResultInquiry tabResultInquiry) {
    this.tabResultInquiry = tabResultInquiry;
  }

  /**
   */
  public TabResultResponse getTabResultResponse() {
    return this.tabResultResponse;
  }

  public void setTabResultResponse(TabResultResponse tabResultResponse) {
    this.tabResultResponse = tabResultResponse;
  }

  /**
   */
  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
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

    if (this.tabResultInquiry != null) {
      return this.tabResultInquiry;
    }

    if (this.tabResultResponse != null) {
      return this.tabResultResponse;
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

    if (this.tabResultInquiry != null) {
      return false;
    }

    if (this.tabResultResponse != null) {
      return false;
    }

    if (this.user != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NotificationAnchorObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationAnchorObject.class, reader);
  }

}
