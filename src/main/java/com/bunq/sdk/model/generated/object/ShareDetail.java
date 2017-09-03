package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class ShareDetail extends BunqModel {

  /**
   * The share details for a payment share. In the response 'payment' is replaced by
   * 'ShareDetailPayment'.
   */
  @Expose
  @SerializedName("ShareDetailPayment")
  private ShareDetailPayment payment;

  /**
   * The share details for viewing a share. In the response 'read_only' is replaced by
   * 'ShareDetailReadOnly'.
   */
  @Expose
  @SerializedName("ShareDetailReadOnly")
  private ShareDetailReadOnly readOnly;

  /**
   * The share details for a draft payment share. Remember to replace 'draft_payment' with
   * 'ShareDetailDraftPayment' before sending a request.
   */
  @Expose
  @SerializedName("ShareDetailDraftPayment")
  private ShareDetailDraftPayment draftPayment;

  /**
   * The share details for a payment share. In the response 'payment' is replaced by
   * 'ShareDetailPayment'.
   */
  public ShareDetailPayment getPayment() {
    return this.payment;
  }

  public void setPayment(ShareDetailPayment payment) {
    this.payment = payment;
  }

  /**
   * The share details for viewing a share. In the response 'read_only' is replaced by
   * 'ShareDetailReadOnly'.
   */
  public ShareDetailReadOnly getReadOnly() {
    return this.readOnly;
  }

  public void setReadOnly(ShareDetailReadOnly readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * The share details for a draft payment share. Remember to replace 'draft_payment' with
   * 'ShareDetailDraftPayment' before sending a request.
   */
  public ShareDetailDraftPayment getDraftPayment() {
    return this.draftPayment;
  }

  public void setDraftPayment(ShareDetailDraftPayment draftPayment) {
    this.draftPayment = draftPayment;
  }

}
