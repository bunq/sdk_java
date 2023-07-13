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
 * Fetch blacklists of merchants created by user
 */
public class UserBlacklistMasterCardMerchant extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_MERCHANT_ID = "merchant_id";
  public static final String FIELD_MERCHANT_NAME = "merchant_name";
  public static final String FIELD_MERCHANT_IDENTIFIER = "merchant_identifier";

  /**
   * The id of the blacklist.
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
   * The status of the the blacklist.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The blacklisted merchant.
   */
  @Expose
  @SerializedName("merchant_id")
  private String merchantId;

  /**
   * The name of the merchant.
   */
  @Expose
  @SerializedName("merchant_name")
  private String merchantName;

  /**
   * Identifier of the merchant we are blacklisting.
   */
  @Expose
  @SerializedName("merchant_identifier")
  private String merchantIdentifier;

  /**
   * Hash of the merchant we are blacklisting.
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
   * The merchant id.
   */
  @Expose
  @SerializedName("merchant_id_field_for_request")
  private String merchantIdFieldForRequest;

  /**
   * The name of the merchant.
   */
  @Expose
  @SerializedName("merchant_name_field_for_request")
  private String merchantNameFieldForRequest;

  /**
   * Optional identifier of the merchant to blacklist.
   */
  @Expose
  @SerializedName("merchant_identifier_field_for_request")
  private String merchantIdentifierFieldForRequest;

  public UserBlacklistMasterCardMerchant() {
  this(null, null, null);
  }

  public UserBlacklistMasterCardMerchant(String merchantId) {
  this(merchantId, null, null);
  }

  public UserBlacklistMasterCardMerchant(String merchantId, String merchantName) {
  this(merchantId, merchantName, null);
  }

  public UserBlacklistMasterCardMerchant(String merchantId, String merchantName, String merchantIdentifier) {
    this.merchantIdFieldForRequest = merchantId;
    this.merchantNameFieldForRequest = merchantName;
    this.merchantIdentifierFieldForRequest = merchantIdentifier;
  }

  /**
   * The id of the blacklist.
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
   * The status of the the blacklist.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The blacklisted merchant.
   */
  public String getMerchantId() {
    return this.merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
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
   * Identifier of the merchant we are blacklisting.
   */
  public String getMerchantIdentifier() {
    return this.merchantIdentifier;
  }

  public void setMerchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = merchantIdentifier;
  }

  /**
   * Hash of the merchant we are blacklisting.
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

    if (this.merchantId != null) {
      return false;
    }

    if (this.merchantName != null) {
      return false;
    }

    if (this.merchantIdentifier != null) {
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
  public static UserBlacklistMasterCardMerchant fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserBlacklistMasterCardMerchant.class, reader);
  }

}
