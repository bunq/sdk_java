package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.BunqMeMerchantAvailable;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
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
  private LabelMonetaryAccount alias;

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
   * Provided if the user has enabled their invite link.
   */
  @Expose
  @SerializedName("invite_profile_name")
  private String inviteProfileName;

  /**
   * The Amount requested to be paid. Can be optional.
   */
  @Expose
  @SerializedName("amount_inquired_field_for_request")
  private Amount amountInquiredFieldForRequest;

  /**
   * The description for the bunq.me. Maximum 9000 characters. Field is required but can be an
   * empty string.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The URL which the user is sent to after making a payment.
   */
  @Expose
  @SerializedName("redirect_url_field_for_request")
  private String redirectUrlFieldForRequest;

  public BunqMeTabEntry() {
  this(null, null, null);
  }

  public BunqMeTabEntry(Amount amountInquired) {
  this(amountInquired, null, null);
  }

  public BunqMeTabEntry(Amount amountInquired, String description) {
  this(amountInquired, description, null);
  }

  public BunqMeTabEntry(Amount amountInquired, String description, String redirectUrl) {
    this.amountInquiredFieldForRequest = amountInquired;
    this.descriptionFieldForRequest = description;
    this.redirectUrlFieldForRequest = redirectUrl;
  }

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
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
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

  /**
   * Provided if the user has enabled their invite link.
   */
  public String getInviteProfileName() {
    return this.inviteProfileName;
  }

  public void setInviteProfileName(String inviteProfileName) {
    this.inviteProfileName = inviteProfileName;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.amountInquired != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.redirectUrl != null) {
      return false;
    }

    if (this.merchantAvailable != null) {
      return false;
    }

    if (this.inviteProfileName != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeTabEntry fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeTabEntry.class, reader);
  }

}
