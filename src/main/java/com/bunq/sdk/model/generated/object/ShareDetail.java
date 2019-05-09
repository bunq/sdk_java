package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

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
   * The share details for a draft payment share. In the response 'draft_payment' is replaced by
   * 'ShareDetailDraftPayment'.
   */
  @Expose
  @SerializedName("ShareDetailDraftPayment")
  private ShareDetailDraftPayment draftPayment;

  /**
   * The share details for a payment share. Remember to replace 'payment' with
   * 'ShareDetailPayment' before sending a request.
   */
  @Expose
  @SerializedName("ShareDetailPayment_field_for_request")
  private ShareDetailPayment paymentFieldForRequest;

  /**
   * The share details for viewing a share. Remember to replace 'read_only' with
   * 'ShareDetailReadOnly' before sending a request.
   */
  @Expose
  @SerializedName("ShareDetailReadOnly_field_for_request")
  private ShareDetailReadOnly readOnlyFieldForRequest;

  /**
   * The share details for a draft payment share. Remember to replace 'draft_payment' with
   * 'ShareDetailDraftPayment' before sending a request.
   */
  @Expose
  @SerializedName("ShareDetailDraftPayment_field_for_request")
  private ShareDetailDraftPayment draftPaymentFieldForRequest;

  public ShareDetail() {
    this(null, null, null);
  }

  public ShareDetail(ShareDetailPayment payment) {
    this(payment, null, null);
  }

  public ShareDetail(ShareDetailPayment payment, ShareDetailReadOnly readOnly) {
    this(payment, readOnly, null);
  }

  public ShareDetail(ShareDetailPayment payment, ShareDetailReadOnly readOnly, ShareDetailDraftPayment draftPayment) {
    this.paymentFieldForRequest = payment;
    this.readOnlyFieldForRequest = readOnly;
    this.draftPaymentFieldForRequest = draftPayment;
  }

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
   * The share details for a draft payment share. In the response 'draft_payment' is replaced by
   * 'ShareDetailDraftPayment'.
   */
  public ShareDetailDraftPayment getDraftPayment() {
    return this.draftPayment;
  }

  public void setDraftPayment(ShareDetailDraftPayment draftPayment) {
    this.draftPayment = draftPayment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.payment != null) {
      return false;
    }

    if (this.readOnly != null) {
      return false;
    }

    if (this.draftPayment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ShareDetail fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareDetail.class, reader);
  }

}
