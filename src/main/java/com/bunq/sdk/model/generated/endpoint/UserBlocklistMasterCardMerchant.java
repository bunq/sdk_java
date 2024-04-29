package com.bunq.sdk.model.generated.endpoint;

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
 * Fetch blocklists of merchants created by user
 */
public class UserBlocklistMasterCardMerchant extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_MERCHANT_NAME = "merchant_name";
  public static final String FIELD_MERCHANT_ID = "merchant_id";
  public static final String FIELD_MERCHANT_IDENTIFIER = "merchant_identifier";
  public static final String FIELD_MASTERCARD_MERCHANT_ID = "mastercard_merchant_id";
  public static final String FIELD_EXTERNAL_MERCHANT_ID = "external_merchant_id";

  /**
   * The id of the blocklist.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The status of the the blocklist.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The name of the merchant.
   */
  @Expose
  @SerializedName("merchant_name")
  private String merchantName;

  /**
   * The blocklisted merchant.
   */
  @Expose
  @SerializedName("merchant_id")
  private String merchantId;

  /**
   * Identifier of the merchant we are blocklisting.
   */
  @Expose
  @SerializedName("merchant_identifier")
  private String merchantIdentifier;

  /**
   * The blocklisted merchant.
   */
  @Expose
  @SerializedName("mastercard_merchant_id")
  private String mastercardMerchantId;

  /**
   * Externally provided merchant identification.
   */
  @Expose
  @SerializedName("external_merchant_id")
  private String externalMerchantId;

  /**
   * Hash of the merchant we are blocklisting.
   */
  @Expose
  @SerializedName("merchant_hash")
  private String merchantHash;

  /**
   */
  @Expose
  @SerializedName("merchant_avatar")
  private Avatar merchantAvatar;

  /**
   * The name of the merchant.
   */
  @Expose
  @SerializedName("merchant_name_field_for_request")
  private String merchantNameFieldForRequest;

  /**
   * The merchant id.
   */
  @Expose
  @SerializedName("merchant_id_field_for_request")
  private String merchantIdFieldForRequest;

  /**
   * Optional identifier of the merchant to blocklist.
   */
  @Expose
  @SerializedName("merchant_identifier_field_for_request")
  private String merchantIdentifierFieldForRequest;

  /**
   * Master card merchant id.
   */
  @Expose
  @SerializedName("mastercard_merchant_id_field_for_request")
  private String mastercardMerchantIdFieldForRequest;

  /**
   * Externally provided merchant id.
   */
  @Expose
  @SerializedName("external_merchant_id_field_for_request")
  private String externalMerchantIdFieldForRequest;

  public UserBlocklistMasterCardMerchant() {
  this(null, null, null, null, null);
  }

  public UserBlocklistMasterCardMerchant(String merchantName) {
  this(merchantName, null, null, null, null);
  }

  public UserBlocklistMasterCardMerchant(String merchantName, String merchantId) {
  this(merchantName, merchantId, null, null, null);
  }

  public UserBlocklistMasterCardMerchant(String merchantName, String merchantId, String merchantIdentifier) {
  this(merchantName, merchantId, merchantIdentifier, null, null);
  }

  public UserBlocklistMasterCardMerchant(String merchantName, String merchantId, String merchantIdentifier, String mastercardMerchantId) {
  this(merchantName, merchantId, merchantIdentifier, mastercardMerchantId, null);
  }

  public UserBlocklistMasterCardMerchant(String merchantName, String merchantId, String merchantIdentifier, String mastercardMerchantId, String externalMerchantId) {
    this.merchantNameFieldForRequest = merchantName;
    this.merchantIdFieldForRequest = merchantId;
    this.merchantIdentifierFieldForRequest = merchantIdentifier;
    this.mastercardMerchantIdFieldForRequest = mastercardMerchantId;
    this.externalMerchantIdFieldForRequest = externalMerchantId;
  }

  /**
   * The id of the blocklist.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The status of the the blocklist.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The name of the merchant.
   */
  public String getMerchantName() {
    return this.merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  /**
   * The blocklisted merchant.
   */
  public String getMerchantId() {
    return this.merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * Identifier of the merchant we are blocklisting.
   */
  public String getMerchantIdentifier() {
    return this.merchantIdentifier;
  }

  public void setMerchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = merchantIdentifier;
  }

  /**
   * The blocklisted merchant.
   */
  public String getMastercardMerchantId() {
    return this.mastercardMerchantId;
  }

  public void setMastercardMerchantId(String mastercardMerchantId) {
    this.mastercardMerchantId = mastercardMerchantId;
  }

  /**
   * Externally provided merchant identification.
   */
  public String getExternalMerchantId() {
    return this.externalMerchantId;
  }

  public void setExternalMerchantId(String externalMerchantId) {
    this.externalMerchantId = externalMerchantId;
  }

  /**
   * Hash of the merchant we are blocklisting.
   */
  public String getMerchantHash() {
    return this.merchantHash;
  }

  public void setMerchantHash(String merchantHash) {
    this.merchantHash = merchantHash;
  }

  /**
   */
  public Avatar getMerchantAvatar() {
    return this.merchantAvatar;
  }

  public void setMerchantAvatar(Avatar merchantAvatar) {
    this.merchantAvatar = merchantAvatar;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.merchantName != null) {
      return false;
    }

    if (this.merchantId != null) {
      return false;
    }

    if (this.merchantIdentifier != null) {
      return false;
    }

    if (this.mastercardMerchantId != null) {
      return false;
    }

    if (this.externalMerchantId != null) {
      return false;
    }

    if (this.merchantHash != null) {
      return false;
    }

    if (this.merchantAvatar != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static UserBlocklistMasterCardMerchant fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserBlocklistMasterCardMerchant.class, reader);
  }

}
