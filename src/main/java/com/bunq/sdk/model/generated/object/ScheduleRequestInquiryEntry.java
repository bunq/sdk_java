package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class ScheduleRequestInquiryEntry extends BunqModel {

  /**
   * The requested amount.
   */
  @Expose
  @SerializedName("amount_inquired")
  private Amount amountInquired;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount the money was
   * requested from.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private MonetaryAccountReference counterpartyAlias;

  /**
   * The description of the inquiry.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The attachments attached to the payment.
   */
  @Expose
  @SerializedName("attachment")
  private AttachmentScheduleRequestInquiryEntry attachment;

  /**
   * The client's custom reference that was attached to the request and the mutation.
   */
  @Expose
  @SerializedName("merchant_reference")
  private String merchantReference;

  /**
   * The minimum age the user accepting the RequestInquiry must have.
   */
  @Expose
  @SerializedName("minimum_age")
  private Integer minimumAge;

  /**
   * Whether or not an address must be provided on accept.
   */
  @Expose
  @SerializedName("require_address")
  private String requireAddress;

  /**
   * [DEPRECATED] Whether or not the user accepting the request should be asked if he wants to
   * give a tip.
   */
  @Expose
  @SerializedName("want_tip")
  private Boolean wantTip;

  /**
   * [DEPRECATED] Whether or not a lower amount can be paid on accept.
   */
  @Expose
  @SerializedName("allow_amount_lower")
  private Boolean allowAmountLower;

  /**
   * [DEPRECATED] Whether or not a higher amount can be paid on accept.
   */
  @Expose
  @SerializedName("allow_amount_higher")
  private Boolean allowAmountHigher;

  /**
   * Whether or not sending a bunq.me request is allowed.
   */
  @Expose
  @SerializedName("allow_bunqme")
  private Boolean allowBunqme;

  /**
   * The URL which the user is sent to after accepting or rejecting the Request.
   */
  @Expose
  @SerializedName("redirect_url")
  private String redirectUrl;

  /**
   * The label that's displayed to the counterparty with the mutation. Includes user.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUser userAliasCreated;

  /**
   * The label that's displayed to the counterparty with the mutation. Includes user.
   */
  @Expose
  @SerializedName("user_alias_revoked")
  private LabelUser userAliasRevoked;

  public ScheduleRequestInquiryEntry(Amount amountInquired, MonetaryAccountReference counterpartyAlias, String description, Boolean allowBunqme) {
    this.amountInquired = amountInquired;
    this.counterpartyAlias = counterpartyAlias;
    this.description = description;
    this.allowBunqme = allowBunqme;
  }

  /**
   * The requested amount.
   */
  public Amount getAmountInquired() {
    return this.amountInquired;
  }

  public void setAmountInquired(Amount amountInquired) {
    this.amountInquired = amountInquired;
  }

  /**
   * The label that's displayed to the counterparty with the mutation. Includes user.
   */
  public LabelUser getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUser userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   * The label that's displayed to the counterparty with the mutation. Includes user.
   */
  public LabelUser getUserAliasRevoked() {
    return this.userAliasRevoked;
  }

  public void setUserAliasRevoked(LabelUser userAliasRevoked) {
    this.userAliasRevoked = userAliasRevoked;
  }

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount the money was
   * requested from.
   */
  public MonetaryAccountReference getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(MonetaryAccountReference counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The description of the inquiry.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The client's custom reference that was attached to the request and the mutation.
   */
  public String getMerchantReference() {
    return this.merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  /**
   * The attachments attached to the payment.
   */
  public AttachmentScheduleRequestInquiryEntry getAttachment() {
    return this.attachment;
  }

  public void setAttachment(AttachmentScheduleRequestInquiryEntry attachment) {
    this.attachment = attachment;
  }

  /**
   * The minimum age the user accepting the RequestInquiry must have.
   */
  public Integer getMinimumAge() {
    return this.minimumAge;
  }

  public void setMinimumAge(Integer minimumAge) {
    this.minimumAge = minimumAge;
  }

  /**
   * Whether or not an address must be provided on accept.
   */
  public String getRequireAddress() {
    return this.requireAddress;
  }

  public void setRequireAddress(String requireAddress) {
    this.requireAddress = requireAddress;
  }

  /**
   * Whether or not sending a bunq.me request is allowed.
   */
  public Boolean getAllowBunqme() {
    return this.allowBunqme;
  }

  public void setAllowBunqme(Boolean allowBunqme) {
    this.allowBunqme = allowBunqme;
  }

  /**
   * The URL which the user is sent to after accepting or rejecting the Request.
   */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

}
