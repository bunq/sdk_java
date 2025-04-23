package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AttachmentPublicObject;
import com.bunq.sdk.model.generated.object.BunqMeMerchantAvailableObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.PointerObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * bunq.me public profile of the user.
 */
public class BunqMeFundraiserProfileApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_POINTER = "pointer";

  /**
   * The color chosen for the bunq.me fundraiser profile in hexadecimal format.
   */
  @Expose
  @SerializedName("color")
  private String color;

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The currency of the MonetaryAccount that created the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The description of the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The attachment attached to the fundraiser profile.
   */
  @Expose
  @SerializedName("attachment")
  private AttachmentPublicObject attachment;

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("pointer")
  private PointerObject pointer;

  /**
   * The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED.
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
   * Provided if the user has enabled their invite link.
   */
  @Expose
  @SerializedName("invite_profile_name")
  private String inviteProfileName;

  /**
   * List of available merchants.
   */
  @Expose
  @SerializedName("merchant_available")
  private List<BunqMeMerchantAvailableObject> merchantAvailable;

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("pointer_field_for_request")
  private PointerObject pointerFieldForRequest;

  public BunqMeFundraiserProfileApiObject() {
  this(null);
  }

  public BunqMeFundraiserProfileApiObject(PointerObject pointer) {
    this.pointerFieldForRequest = pointer;
  }

  /**
   * The color chosen for the bunq.me fundraiser profile in hexadecimal format.
   */
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me fundraiser profile.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The currency of the MonetaryAccount that created the bunq.me fundraiser profile.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The description of the bunq.me fundraiser profile.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The attachment attached to the fundraiser profile.
   */
  public AttachmentPublicObject getAttachment() {
    return this.attachment;
  }

  public void setAttachment(AttachmentPublicObject attachment) {
    this.attachment = attachment;
  }

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  public PointerObject getPointer() {
    return this.pointer;
  }

  public void setPointer(PointerObject pointer) {
    this.pointer = pointer;
  }

  /**
   * The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED.
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
   * Provided if the user has enabled their invite link.
   */
  public String getInviteProfileName() {
    return this.inviteProfileName;
  }

  public void setInviteProfileName(String inviteProfileName) {
    this.inviteProfileName = inviteProfileName;
  }

  /**
   * List of available merchants.
   */
  public List<BunqMeMerchantAvailableObject> getMerchantAvailable() {
    return this.merchantAvailable;
  }

  public void setMerchantAvailable(List<BunqMeMerchantAvailableObject> merchantAvailable) {
    this.merchantAvailable = merchantAvailable;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.color != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.currency != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.pointer != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.redirectUrl != null) {
      return false;
    }

    if (this.inviteProfileName != null) {
      return false;
    }

    if (this.merchantAvailable != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeFundraiserProfileApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeFundraiserProfileApiObject.class, reader);
  }

}
