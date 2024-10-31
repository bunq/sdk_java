package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.model.generated.object.RegistryMembershipSetting;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to manage Slice groups.
 */
public class Registry extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_UPDATED = "updated";
  public static final String FIELD_UUID = "uuid";
  public static final String FIELD_PUBLIC_IDENTIFIER_TOKEN = "public_identifier_token";
  public static final String FIELD_CURRENCY = "currency";
  public static final String FIELD_TITLE = "title";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_CATEGORY = "category";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_LAST_REGISTRY_ENTRY_SEEN_ID = "last_registry_entry_seen_id";
  public static final String FIELD_PREVIOUS_UPDATED_TIMESTAMP = "previous_updated_timestamp";
  public static final String FIELD_MEMBERSHIP_UUID_ACTIVE = "membership_uuid_active";
  public static final String FIELD_MEMBERSHIPS = "memberships";
  public static final String FIELD_MEMBERSHIPS_PREVIOUS = "memberships_previous";
  public static final String FIELD_DELETED_MEMBERSHIP_IDS = "deleted_membership_ids";
  public static final String FIELD_AUTO_ADD_CARD_TRANSACTION = "auto_add_card_transaction";
  public static final String FIELD_MEMBERSHIP_SETTING = "membership_setting";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_SETTING = "setting";
  public static final String FIELD_ALL_REGISTRY_ENTRY = "all_registry_entry";
  public static final String FIELD_ALIAS_CREATOR = "alias_creator";

  /**
   * The id of the Registry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The uuid of the Registry. If it was provided by the client on creation, then the client can
   * use it to match the returned Registry to the row stored locally.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * Public identifier token provided by the client. Will remain null if not provided in the POST
   * call.
   */
  @Expose
  @SerializedName("public_identifier_token")
  private String publicIdentifierToken;

  /**
   * The timestamp of the Registry's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the Registry's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The currency for the Registry as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The title of the Registry.
   */
  @Expose
  @SerializedName("title")
  private String title;

  /**
   * A description about the Registry.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The category of the Registry. Can be one of the following values: GENERAL, TRIP,
   * SHARED_HOUSE, COUPLE, EVENT, PROJECT, OTHER
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * The status of the Registry.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The total amount spent in this Registry since the last settlement.
   */
  @Expose
  @SerializedName("total_amount_spent")
  private Amount totalAmountSpent;

  /**
   * Whether the Registry has previously been settled.
   */
  @Expose
  @SerializedName("is_previously_settled")
  private Boolean isPreviouslySettled;

  /**
   * The UUID of the membership which is currently linked to the logged in user.
   */
  @Expose
  @SerializedName("membership_uuid_active")
  private String membershipUuidActive;

  /**
   * List of memberships to replace the current one.
   */
  @Expose
  @SerializedName("memberships")
  private List<RegistryMembership> memberships;

  /**
   * The settings for this Registry.
   */
  @Expose
  @SerializedName("setting")
  private RegistrySetting setting;

  /**
   * The registry's avatar.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The optional ID of the last settlement of this activity.
   */
  @Expose
  @SerializedName("last_settlement_id")
  private Integer lastSettlementId;

  /**
   * The timestamp of the latest activity seen for this registry.
   */
  @Expose
  @SerializedName("last_activity_timestamp")
  private String lastActivityTimestamp;

  /**
   */
  @Expose
  @SerializedName("all_registry_entry")
  private List<RegistryEntry> allRegistryEntry;

  /**
   */
  @Expose
  @SerializedName("all_registry_gallery_attachment")
  private List<RegistryGalleryAttachment> allRegistryGalleryAttachment;

  /**
   * The timestamp of the Registry's last update.
   */
  @Expose
  @SerializedName("updated_field_for_request")
  private String updatedFieldForRequest;

  /**
   * An optional uuid of the Registry. Can be provided by the client on POST to allow clients to
   * later match returned Registries to the row stored locally. If none is provided, the backend
   * will generate it.
   */
  @Expose
  @SerializedName("uuid_field_for_request")
  private String uuidFieldForRequest;

  /**
   * Public identifier token provided by the client.
   */
  @Expose
  @SerializedName("public_identifier_token_field_for_request")
  private String publicIdentifierTokenFieldForRequest;

  /**
   * The currency for the Registry as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency_field_for_request")
  private String currencyFieldForRequest;

  /**
   * The title of the Registry.
   */
  @Expose
  @SerializedName("title_field_for_request")
  private String titleFieldForRequest;

  /**
   * A description about the Registry.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The category of the Registry. Can be one of the following values: GENERAL, TRIP,
   * SHARED_HOUSE, COUPLE, EVENT, PROJECT, OTHER
   */
  @Expose
  @SerializedName("category_field_for_request")
  private String categoryFieldForRequest;

  /**
   * The status of the Registry.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The id of the last RegistryEntry that the user has seen.
   */
  @Expose
  @SerializedName("last_registry_entry_seen_id_field_for_request")
  private Integer lastRegistryEntrySeenIdFieldForRequest;

  /**
   * The previous updated timestamp that you received for this Registry.
   */
  @Expose
  @SerializedName("previous_updated_timestamp_field_for_request")
  private String previousUpdatedTimestampFieldForRequest;

  /**
   * The UUID of the membership to set as the active one.
   */
  @Expose
  @SerializedName("membership_uuid_active_field_for_request")
  private String membershipUuidActiveFieldForRequest;

  /**
   * New list of memberships.
   */
  @Expose
  @SerializedName("memberships_field_for_request")
  private List<RegistryMembership> membershipsFieldForRequest;

  /**
   * Previous list of memberships.
   */
  @Expose
  @SerializedName("memberships_previous_field_for_request")
  private List<RegistryMembership> membershipsPreviousFieldForRequest;

  /**
   * The ids of the memberships that have been deleted.
   */
  @Expose
  @SerializedName("deleted_membership_ids_field_for_request")
  private List<String> deletedMembershipIdsFieldForRequest;

  /**
   * The setting for adding automatically card transactions to the registry for the creator.
   * (deprecated)
   */
  @Expose
  @SerializedName("auto_add_card_transaction_field_for_request")
  private String autoAddCardTransactionFieldForRequest;

  /**
   * User creator registry membership setting.
   */
  @Expose
  @SerializedName("membership_setting_field_for_request")
  private RegistryMembershipSetting membershipSettingFieldForRequest;

  /**
   * The UUID of the avatar. Use the calls /attachment-public and /avatar to create a new Avatar
   * and get its UUID.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The settings of the Registry.
   */
  @Expose
  @SerializedName("setting_field_for_request")
  private RegistrySetting settingFieldForRequest;

  /**
   */
  @Expose
  @SerializedName("all_registry_entry_field_for_request")
  private List<RegistryEntry> allRegistryEntryFieldForRequest;

  /**
   * The alias of the creator, so we can send a confirmation even when the creator doesn't yet
   * have an alias saved for their user.
   */
  @Expose
  @SerializedName("alias_creator_field_for_request")
  private Pointer aliasCreatorFieldForRequest;

  public Registry() {
  this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency) {
  this(currency, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated) {
  this(currency, updated, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid) {
  this(currency, updated, uuid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken) {
  this(currency, updated, uuid, publicIdentifierToken, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title) {
  this(currency, updated, uuid, publicIdentifierToken, title, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, null, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, membershipUuidActive, null, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive, List<RegistryMembership> memberships) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, membershipUuidActive, memberships, null, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, membershipUuidActive, memberships, membershipsPrevious, null, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious, List<String> deletedMembershipIds) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, membershipUuidActive, memberships, membershipsPrevious, deletedMembershipIds, null, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious, List<String> deletedMembershipIds, String autoAddCardTransaction) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, membershipUuidActive, memberships, membershipsPrevious, deletedMembershipIds, autoAddCardTransaction, null, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious, List<String> deletedMembershipIds, String autoAddCardTransaction, RegistryMembershipSetting membershipSetting) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, membershipUuidActive, memberships, membershipsPrevious, deletedMembershipIds, autoAddCardTransaction, membershipSetting, null, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious, List<String> deletedMembershipIds, String autoAddCardTransaction, RegistryMembershipSetting membershipSetting, String avatarUuid) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, membershipUuidActive, memberships, membershipsPrevious, deletedMembershipIds, autoAddCardTransaction, membershipSetting, avatarUuid, null, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious, List<String> deletedMembershipIds, String autoAddCardTransaction, RegistryMembershipSetting membershipSetting, String avatarUuid, RegistrySetting setting) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, membershipUuidActive, memberships, membershipsPrevious, deletedMembershipIds, autoAddCardTransaction, membershipSetting, avatarUuid, setting, null, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious, List<String> deletedMembershipIds, String autoAddCardTransaction, RegistryMembershipSetting membershipSetting, String avatarUuid, RegistrySetting setting, List<RegistryEntry> allRegistryEntry) {
  this(currency, updated, uuid, publicIdentifierToken, title, description, category, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, membershipUuidActive, memberships, membershipsPrevious, deletedMembershipIds, autoAddCardTransaction, membershipSetting, avatarUuid, setting, allRegistryEntry, null);
  }

  public Registry(String currency, String updated, String uuid, String publicIdentifierToken, String title, String description, String category, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, String membershipUuidActive, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious, List<String> deletedMembershipIds, String autoAddCardTransaction, RegistryMembershipSetting membershipSetting, String avatarUuid, RegistrySetting setting, List<RegistryEntry> allRegistryEntry, Pointer aliasCreator) {
    this.updatedFieldForRequest = updated;
    this.uuidFieldForRequest = uuid;
    this.publicIdentifierTokenFieldForRequest = publicIdentifierToken;
    this.currencyFieldForRequest = currency;
    this.titleFieldForRequest = title;
    this.descriptionFieldForRequest = description;
    this.categoryFieldForRequest = category;
    this.statusFieldForRequest = status;
    this.lastRegistryEntrySeenIdFieldForRequest = lastRegistryEntrySeenId;
    this.previousUpdatedTimestampFieldForRequest = previousUpdatedTimestamp;
    this.membershipUuidActiveFieldForRequest = membershipUuidActive;
    this.membershipsFieldForRequest = memberships;
    this.membershipsPreviousFieldForRequest = membershipsPrevious;
    this.deletedMembershipIdsFieldForRequest = deletedMembershipIds;
    this.autoAddCardTransactionFieldForRequest = autoAddCardTransaction;
    this.membershipSettingFieldForRequest = membershipSetting;
    this.avatarUuidFieldForRequest = avatarUuid;
    this.settingFieldForRequest = setting;
    this.allRegistryEntryFieldForRequest = allRegistryEntry;
    this.aliasCreatorFieldForRequest = aliasCreator;
  }

  /**
   * The id of the Registry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The uuid of the Registry. If it was provided by the client on creation, then the client can
   * use it to match the returned Registry to the row stored locally.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Public identifier token provided by the client. Will remain null if not provided in the POST
   * call.
   */
  public String getPublicIdentifierToken() {
    return this.publicIdentifierToken;
  }

  public void setPublicIdentifierToken(String publicIdentifierToken) {
    this.publicIdentifierToken = publicIdentifierToken;
  }

  /**
   * The timestamp of the Registry's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the Registry's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The currency for the Registry as an ISO 4217 formatted currency code.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The title of the Registry.
   */
  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * A description about the Registry.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The category of the Registry. Can be one of the following values: GENERAL, TRIP,
   * SHARED_HOUSE, COUPLE, EVENT, PROJECT, OTHER
   */
  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * The status of the Registry.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The total amount spent in this Registry since the last settlement.
   */
  public Amount getTotalAmountSpent() {
    return this.totalAmountSpent;
  }

  public void setTotalAmountSpent(Amount totalAmountSpent) {
    this.totalAmountSpent = totalAmountSpent;
  }

  /**
   * Whether the Registry has previously been settled.
   */
  public Boolean getIsPreviouslySettled() {
    return this.isPreviouslySettled;
  }

  public void setIsPreviouslySettled(Boolean isPreviouslySettled) {
    this.isPreviouslySettled = isPreviouslySettled;
  }

  /**
   * The UUID of the membership which is currently linked to the logged in user.
   */
  public String getMembershipUuidActive() {
    return this.membershipUuidActive;
  }

  public void setMembershipUuidActive(String membershipUuidActive) {
    this.membershipUuidActive = membershipUuidActive;
  }

  /**
   * List of memberships to replace the current one.
   */
  public List<RegistryMembership> getMemberships() {
    return this.memberships;
  }

  public void setMemberships(List<RegistryMembership> memberships) {
    this.memberships = memberships;
  }

  /**
   * The settings for this Registry.
   */
  public RegistrySetting getSetting() {
    return this.setting;
  }

  public void setSetting(RegistrySetting setting) {
    this.setting = setting;
  }

  /**
   * The registry's avatar.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The optional ID of the last settlement of this activity.
   */
  public Integer getLastSettlementId() {
    return this.lastSettlementId;
  }

  public void setLastSettlementId(Integer lastSettlementId) {
    this.lastSettlementId = lastSettlementId;
  }

  /**
   * The timestamp of the latest activity seen for this registry.
   */
  public String getLastActivityTimestamp() {
    return this.lastActivityTimestamp;
  }

  public void setLastActivityTimestamp(String lastActivityTimestamp) {
    this.lastActivityTimestamp = lastActivityTimestamp;
  }

  /**
   */
  public List<RegistryEntry> getAllRegistryEntry() {
    return this.allRegistryEntry;
  }

  public void setAllRegistryEntry(List<RegistryEntry> allRegistryEntry) {
    this.allRegistryEntry = allRegistryEntry;
  }

  /**
   */
  public List<RegistryGalleryAttachment> getAllRegistryGalleryAttachment() {
    return this.allRegistryGalleryAttachment;
  }

  public void setAllRegistryGalleryAttachment(List<RegistryGalleryAttachment> allRegistryGalleryAttachment) {
    this.allRegistryGalleryAttachment = allRegistryGalleryAttachment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.uuid != null) {
      return false;
    }

    if (this.publicIdentifierToken != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.currency != null) {
      return false;
    }

    if (this.title != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.category != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.totalAmountSpent != null) {
      return false;
    }

    if (this.isPreviouslySettled != null) {
      return false;
    }

    if (this.membershipUuidActive != null) {
      return false;
    }

    if (this.memberships != null) {
      return false;
    }

    if (this.setting != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    if (this.lastSettlementId != null) {
      return false;
    }

    if (this.lastActivityTimestamp != null) {
      return false;
    }

    if (this.allRegistryEntry != null) {
      return false;
    }

    if (this.allRegistryGalleryAttachment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Registry fromJsonReader(JsonReader reader) {
    return fromJsonReader(Registry.class, reader);
  }

}
