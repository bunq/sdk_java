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
public class ShareDetailObject extends BunqModel {

  /**
   * The share details for a payment share. In the response 'payment' is replaced by
   * 'ShareDetailPayment'.
   */
  @Expose
  @SerializedName("ShareDetailPayment")
  private ShareDetailPaymentObject payment;

  /**
   * The share details for viewing a share. In the response 'read_only' is replaced by
   * 'ShareDetailReadOnly'.
   */
  @Expose
  @SerializedName("ShareDetailReadOnly")
  private ShareDetailReadOnlyObject readOnly;

  /**
   * The share details for a draft payment share. In the response 'draft_payment' is replaced by
   * 'ShareDetailDraftPayment'.
   */
  @Expose
  @SerializedName("ShareDetailDraftPayment")
  private ShareDetailDraftPaymentObject draftPayment;

  /**
   * The share details for a payment share. Remember to replace 'payment' with
   * 'ShareDetailPayment' before sending a request.
   */
  @Expose
  @SerializedName("ShareDetailPayment_field_for_request")
  private ShareDetailPaymentObject paymentFieldForRequest;

  /**
   * The share details for viewing a share. Remember to replace 'read_only' with
   * 'ShareDetailReadOnly' before sending a request.
   */
  @Expose
  @SerializedName("ShareDetailReadOnly_field_for_request")
  private ShareDetailReadOnlyObject readOnlyFieldForRequest;

  /**
   * The share details for a draft payment share. Remember to replace 'draft_payment' with
   * 'ShareDetailDraftPayment' before sending a request.
   */
  @Expose
  @SerializedName("ShareDetailDraftPayment_field_for_request")
  private ShareDetailDraftPaymentObject draftPaymentFieldForRequest;

  public ShareDetailObject() {
  this(null, null, null);
  }

  public ShareDetailObject(ShareDetailPaymentObject payment) {
  this(payment, null, null);
  }

  public ShareDetailObject(ShareDetailPaymentObject payment, ShareDetailReadOnlyObject readOnly) {
  this(payment, readOnly, null);
  }

  public ShareDetailObject(ShareDetailPaymentObject payment, ShareDetailReadOnlyObject readOnly, ShareDetailDraftPaymentObject draftPayment) {
    this.paymentFieldForRequest = payment;
    this.readOnlyFieldForRequest = readOnly;
    this.draftPaymentFieldForRequest = draftPayment;
  }

  /**
   * The share details for a payment share. In the response 'payment' is replaced by
   * 'ShareDetailPayment'.
   */
  public ShareDetailPaymentObject getPayment() {
    return this.payment;
  }

  public void setPayment(ShareDetailPaymentObject payment) {
    this.payment = payment;
  }

  /**
   * The share details for viewing a share. In the response 'read_only' is replaced by
   * 'ShareDetailReadOnly'.
   */
  public ShareDetailReadOnlyObject getReadOnly() {
    return this.readOnly;
  }

  public void setReadOnly(ShareDetailReadOnlyObject readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * The share details for a draft payment share. In the response 'draft_payment' is replaced by
   * 'ShareDetailDraftPayment'.
   */
  public ShareDetailDraftPaymentObject getDraftPayment() {
    return this.draftPayment;
  }

  public void setDraftPayment(ShareDetailDraftPaymentObject draftPayment) {
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
  public static ShareDetailObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareDetailObject.class, reader);
  }

}
