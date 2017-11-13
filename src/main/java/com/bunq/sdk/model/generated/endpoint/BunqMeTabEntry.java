package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.BunqMeMerchantAvailable;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * bunq.me tabs allows you to create a payment request and share the link through e-mail, chat,
 * etc. Multiple persons are able to respond to the payment request and pay through bunq, iDeal
 * or SOFORT.
 */
public class BunqMeTabEntry extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_AMOUNT_INQUIRED = "amount_inquired";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_REDIRECT_URL = "redirect_url";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "BunqMeTabEntry";

  /**
   * The uuid of the bunq.me.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The requested Amount.
   */
  @Expose
  @SerializedName("amount_inquired")
  private Amount amountInquired;

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me link.
   */
  @Expose
  @SerializedName("alias")
  private MonetaryAccountReference alias;

  /**
   * The description for the bunq.me. Maximum 9000 characters.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status of the bunq.me. Can be WAITING_FOR_PAYMENT, CANCELLED or EXPIRED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The URL which the user is sent to when a payment is completed.
   */
  @Expose
  @SerializedName("redirect_url")
  private String redirectUrl;

  /**
   * List of available merchants.
   */
  @Expose
  @SerializedName("merchant_available")
  private List<BunqMeMerchantAvailable> merchantAvailable;

  /**
   * The uuid of the bunq.me.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The requested Amount.
   */
  public Amount getAmountInquired() {
    return this.amountInquired;
  }

  public void setAmountInquired(Amount amountInquired) {
    this.amountInquired = amountInquired;
  }

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me link.
   */
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The description for the bunq.me. Maximum 9000 characters.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The status of the bunq.me. Can be WAITING_FOR_PAYMENT, CANCELLED or EXPIRED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The URL which the user is sent to when a payment is completed.
   */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /**
   * List of available merchants.
   */
  public List<BunqMeMerchantAvailable> getMerchantAvailable() {
    return this.merchantAvailable;
  }

  public void setMerchantAvailable(List<BunqMeMerchantAvailable> merchantAvailable) {
    this.merchantAvailable = merchantAvailable;
  }

}
