package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.BunqId;
import com.bunq.sdk.model.generated.object.MonetaryAccountSetting;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Endpoint for managing monetary accounts which are connected to external services.
 */
public class MonetaryAccountExternal extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CURRENCY = "currency";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_DAILY_LIMIT = "daily_limit";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SUB_STATUS = "sub_status";
  public static final String FIELD_REASON = "reason";
  public static final String FIELD_REASON_DESCRIPTION = "reason_description";
  public static final String FIELD_DISPLAY_NAME = "display_name";
  public static final String FIELD_SETTING = "setting";

  /**
   * The id of the MonetaryAccountExternal.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the MonetaryAccountExternal's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the MonetaryAccountExternal's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The Avatar of the MonetaryAccountExternal.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The currency of the MonetaryAccountExternal as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The description of the MonetaryAccountExternal. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountExternal. Defaults to 1000 EUR.
   * Currency must match the MonetaryAccountExternal's currency. Limited to 10000 EUR.
   */
  @Expose
  @SerializedName("daily_limit")
  private Amount dailyLimit;

  /**
   * The maximum Amount the MonetaryAccountExternal can be 'in the red'.
   */
  @Expose
  @SerializedName("overdraft_limit")
  private Amount overdraftLimit;

  /**
   * The current available balance Amount of the MonetaryAccountExternal.
   */
  @Expose
  @SerializedName("balance")
  private Amount balance;

  /**
   * The Aliases for the MonetaryAccountExternal.
   */
  @Expose
  @SerializedName("alias")
  private List<Pointer> alias;

  /**
   * The MonetaryAccountExternal's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountExternal. Can be: ACTIVE, BLOCKED, CANCELLED or
   * PENDING_REOPEN
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountExternal providing extra information regarding the
   * status. Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for
   * BLOCKED and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountExternal, can only be
   * OTHER.
   */
  @Expose
  @SerializedName("reason")
  private String reason;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the
   * MonetaryAccountExternal. Can be any user provided message.
   */
  @Expose
  @SerializedName("reason_description")
  private String reasonDescription;

  /**
   * The id of the User who owns the MonetaryAccountExternal.
   */
  @Expose
  @SerializedName("user_id")
  private Integer userId;

  /**
   * The profile of the account.
   */
  @Expose
  @SerializedName("monetary_account_profile")
  private MonetaryAccountProfile monetaryAccountProfile;

  /**
   * The legal name of the user / company using this monetary account.
   */
  @Expose
  @SerializedName("display_name")
  private String displayName;

  /**
   * The settings of the MonetaryAccountExternal.
   */
  @Expose
  @SerializedName("setting")
  private MonetaryAccountSetting setting;

  /**
   * The ids of the AutoSave.
   */
  @Expose
  @SerializedName("all_auto_save_id")
  private List<BunqId> allAutoSaveId;

  /**
   * The currency of the MonetaryAccountExternal as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency_field_for_request")
  private String currencyFieldForRequest;

  /**
   * The description of the MonetaryAccountExternal. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The daily spending limit Amount of the MonetaryAccountExternal. Defaults to 1000 EUR.
   * Currency must match the MonetaryAccountExternal's currency. Limited to 10000 EUR.
   */
  @Expose
  @SerializedName("daily_limit_field_for_request")
  private Amount dailyLimitFieldForRequest;

  /**
   * The UUID of the Avatar of the MonetaryAccountExternal.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The status of the MonetaryAccountExternal. Ignored in POST requests (always set to ACTIVE)
   * can be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountExternal. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The sub-status of the MonetaryAccountExternal providing extra information regarding the
   * status. Should be ignored for POST requests. In case of PUT requests with status CANCELLED it
   * can only be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can only be NONE. When
   * updating the status and/or sub_status no other fields can be updated in the same request (and
   * vice versa).
   */
  @Expose
  @SerializedName("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountExternal, can only be
   * OTHER. Should only be specified if updating the status to CANCELLED.
   */
  @Expose
  @SerializedName("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the
   * MonetaryAccountExternal. Can be any user provided message. Should only be specified if
   * updating the status to CANCELLED.
   */
  @Expose
  @SerializedName("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  /**
   * The legal name of the user / company using this monetary account.
   */
  @Expose
  @SerializedName("display_name_field_for_request")
  private String displayNameFieldForRequest;

  /**
   * The settings of the MonetaryAccountExternal.
   */
  @Expose
  @SerializedName("setting_field_for_request")
  private MonetaryAccountSetting settingFieldForRequest;

  public MonetaryAccountExternal() {
  this(null, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountExternal(String currency) {
  this(currency, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountExternal(String currency, String description) {
  this(currency, description, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountExternal(String currency, String description, Amount dailyLimit) {
  this(currency, description, dailyLimit, null, null, null, null, null, null, null);
  }

  public MonetaryAccountExternal(String currency, String description, Amount dailyLimit, String avatarUuid) {
  this(currency, description, dailyLimit, avatarUuid, null, null, null, null, null, null);
  }

  public MonetaryAccountExternal(String currency, String description, Amount dailyLimit, String avatarUuid, String status) {
  this(currency, description, dailyLimit, avatarUuid, status, null, null, null, null, null);
  }

  public MonetaryAccountExternal(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus) {
  this(currency, description, dailyLimit, avatarUuid, status, subStatus, null, null, null, null);
  }

  public MonetaryAccountExternal(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason) {
  this(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, null, null, null);
  }

  public MonetaryAccountExternal(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
  this(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, null, null);
  }

  public MonetaryAccountExternal(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, String displayName) {
  this(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, displayName, null);
  }

  public MonetaryAccountExternal(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, String displayName, MonetaryAccountSetting setting) {
    this.currencyFieldForRequest = currency;
    this.descriptionFieldForRequest = description;
    this.dailyLimitFieldForRequest = dailyLimit;
    this.avatarUuidFieldForRequest = avatarUuid;
    this.statusFieldForRequest = status;
    this.subStatusFieldForRequest = subStatus;
    this.reasonFieldForRequest = reason;
    this.reasonDescriptionFieldForRequest = reasonDescription;
    this.displayNameFieldForRequest = displayName;
    this.settingFieldForRequest = setting;
  }

  /**
   * The id of the MonetaryAccountExternal.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the MonetaryAccountExternal's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the MonetaryAccountExternal's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The Avatar of the MonetaryAccountExternal.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The currency of the MonetaryAccountExternal as an ISO 4217 formatted currency code.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The description of the MonetaryAccountExternal. Defaults to 'bunq account'.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The daily spending limit Amount of the MonetaryAccountExternal. Defaults to 1000 EUR.
   * Currency must match the MonetaryAccountExternal's currency. Limited to 10000 EUR.
   */
  public Amount getDailyLimit() {
    return this.dailyLimit;
  }

  public void setDailyLimit(Amount dailyLimit) {
    this.dailyLimit = dailyLimit;
  }

  /**
   * The maximum Amount the MonetaryAccountExternal can be 'in the red'.
   */
  public Amount getOverdraftLimit() {
    return this.overdraftLimit;
  }

  public void setOverdraftLimit(Amount overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  /**
   * The current available balance Amount of the MonetaryAccountExternal.
   */
  public Amount getBalance() {
    return this.balance;
  }

  public void setBalance(Amount balance) {
    this.balance = balance;
  }

  /**
   * The Aliases for the MonetaryAccountExternal.
   */
  public List<Pointer> getAlias() {
    return this.alias;
  }

  public void setAlias(List<Pointer> alias) {
    this.alias = alias;
  }

  /**
   * The MonetaryAccountExternal's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The status of the MonetaryAccountExternal. Can be: ACTIVE, BLOCKED, CANCELLED or
   * PENDING_REOPEN
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the MonetaryAccountExternal providing extra information regarding the
   * status. Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for
   * BLOCKED and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountExternal, can only be
   * OTHER.
   */
  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the
   * MonetaryAccountExternal. Can be any user provided message.
   */
  public String getReasonDescription() {
    return this.reasonDescription;
  }

  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
  }

  /**
   * The id of the User who owns the MonetaryAccountExternal.
   */
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The profile of the account.
   */
  public MonetaryAccountProfile getMonetaryAccountProfile() {
    return this.monetaryAccountProfile;
  }

  public void setMonetaryAccountProfile(MonetaryAccountProfile monetaryAccountProfile) {
    this.monetaryAccountProfile = monetaryAccountProfile;
  }

  /**
   * The legal name of the user / company using this monetary account.
   */
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The settings of the MonetaryAccountExternal.
   */
  public MonetaryAccountSetting getSetting() {
    return this.setting;
  }

  public void setSetting(MonetaryAccountSetting setting) {
    this.setting = setting;
  }

  /**
   * The ids of the AutoSave.
   */
  public List<BunqId> getAllAutoSaveId() {
    return this.allAutoSaveId;
  }

  public void setAllAutoSaveId(List<BunqId> allAutoSaveId) {
    this.allAutoSaveId = allAutoSaveId;
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

    if (this.avatar != null) {
      return false;
    }

    if (this.currency != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.dailyLimit != null) {
      return false;
    }

    if (this.overdraftLimit != null) {
      return false;
    }

    if (this.balance != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.publicUuid != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.reason != null) {
      return false;
    }

    if (this.reasonDescription != null) {
      return false;
    }

    if (this.userId != null) {
      return false;
    }

    if (this.monetaryAccountProfile != null) {
      return false;
    }

    if (this.displayName != null) {
      return false;
    }

    if (this.setting != null) {
      return false;
    }

    if (this.allAutoSaveId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountExternal fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountExternal.class, reader);
  }

}
