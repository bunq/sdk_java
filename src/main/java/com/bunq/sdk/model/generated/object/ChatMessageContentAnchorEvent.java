package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
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
public class ChatMessageContentAnchorEvent extends BunqModel {

  /**
   * An anchored object. Can be one of: CardDebit, CardPinChange, CardResult, DraftPayment,
   * IdealMerchantTransaction, Invoice, Payment, PaymentBatch, PromotionDisplay,
   * RequestInquiryBatch, RequestInquiry, RequestResponse, ScheduledPaymentBatch,
   * ScheduledPayment, ScheduledRequestInquiryBatch, ScheduledRequestInquiry, ScheduledInstance,
   * ShareInviteBankInquiry, ShareInviteBankResponse, UserCredentialPasswordIp
   */
  @Expose
  @SerializedName("anchored_object")
  private AnchoredObject anchoredObject;

  /**
   * An anchored object. Can be one of: CardDebit, CardPinChange, CardResult, DraftPayment,
   * IdealMerchantTransaction, Invoice, Payment, PaymentBatch, PromotionDisplay,
   * RequestInquiryBatch, RequestInquiry, RequestResponse, ScheduledPaymentBatch,
   * ScheduledPayment, ScheduledRequestInquiryBatch, ScheduledRequestInquiry, ScheduledInstance,
   * ShareInviteBankInquiry, ShareInviteBankResponse, UserCredentialPasswordIp
   */
  public AnchoredObject getAnchoredObject() {
    return this.anchoredObject;
  }

  public void setAnchoredObject(AnchoredObject anchoredObject) {
    this.anchoredObject = anchoredObject;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.anchoredObject != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ChatMessageContentAnchorEvent fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatMessageContentAnchorEvent.class, reader);
  }

}
