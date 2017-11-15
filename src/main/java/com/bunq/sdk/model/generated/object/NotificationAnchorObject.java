package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.BunqMeTab;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultInquiry;
import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultResponse;
import com.bunq.sdk.model.generated.endpoint.ChatMessageAnnouncement;
import com.bunq.sdk.model.generated.endpoint.ChatMessageStatus;
import com.bunq.sdk.model.generated.endpoint.ChatMessageUser;
import com.bunq.sdk.model.generated.endpoint.DraftPayment;
import com.bunq.sdk.model.generated.endpoint.IdealMerchantTransaction;
import com.bunq.sdk.model.generated.endpoint.Invoice;
import com.bunq.sdk.model.generated.endpoint.MasterCardAction;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountBank;
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
import com.bunq.sdk.model.generated.endpoint.UserCompany;
import com.bunq.sdk.model.generated.endpoint.UserPerson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class NotificationAnchorObject extends BunqModel {

  /**
   * Error constants.
   */
  private static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

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
  @SerializedName("ChatMessageStatus")
  private ChatMessageStatus chatMessageStatus;

  /**
   */
  @Expose
  @SerializedName("ChatMessageUser")
  private ChatMessageUser chatMessageUser;

  /**
   */
  @Expose
  @SerializedName("ChatMessageAnnouncement")
  private ChatMessageAnnouncement chatMessageAnnouncement;

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
  @SerializedName("MonetaryAccountBank")
  private MonetaryAccountBank monetaryAccountBank;

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
  @SerializedName("UserPerson")
  private UserPerson userPerson;

  /**
   */
  @Expose
  @SerializedName("UserCompany")
  private UserCompany userCompany;

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
  public ChatMessageStatus getChatMessageStatus() {
    return this.chatMessageStatus;
  }

  public void setChatMessageStatus(ChatMessageStatus chatMessageStatus) {
    this.chatMessageStatus = chatMessageStatus;
  }

  /**
   */
  public ChatMessageUser getChatMessageUser() {
    return this.chatMessageUser;
  }

  public void setChatMessageUser(ChatMessageUser chatMessageUser) {
    this.chatMessageUser = chatMessageUser;
  }

  /**
   */
  public ChatMessageAnnouncement getChatMessageAnnouncement() {
    return this.chatMessageAnnouncement;
  }

  public void setChatMessageAnnouncement(ChatMessageAnnouncement chatMessageAnnouncement) {
    this.chatMessageAnnouncement = chatMessageAnnouncement;
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
  public MonetaryAccountBank getMonetaryAccountBank() {
    return this.monetaryAccountBank;
  }

  public void setMonetaryAccountBank(MonetaryAccountBank monetaryAccountBank) {
    this.monetaryAccountBank = monetaryAccountBank;
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
  public UserPerson getUserPerson() {
    return this.userPerson;
  }

  public void setUserPerson(UserPerson userPerson) {
    this.userPerson = userPerson;
  }

  /**
   */
  public UserCompany getUserCompany() {
    return this.userCompany;
  }

  public void setUserCompany(UserCompany userCompany) {
    this.userCompany = userCompany;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.bunqMeTab != null) {
      return this.bunqMeTab;
    }

    if (this.bunqMeTabResultInquiry != null) {
      return this.bunqMeTabResultInquiry;
    }

    if (this.bunqMeTabResultResponse != null) {
      return this.bunqMeTabResultResponse;
    }

    if (this.chatMessageStatus != null) {
      return this.chatMessageStatus;
    }

    if (this.chatMessageUser != null) {
      return this.chatMessageUser;
    }

    if (this.chatMessageAnnouncement != null) {
      return this.chatMessageAnnouncement;
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

    if (this.monetaryAccountBank != null) {
      return this.monetaryAccountBank;
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

    if (this.userPerson != null) {
      return this.userPerson;
    }

    if (this.userCompany != null) {
      return this.userCompany;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

}
