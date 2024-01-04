package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AllocationItem;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.model.generated.object.RegistryEntryAttachment;
import com.bunq.sdk.model.generated.object.RegistryEntryReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to manage Slice group payment.
 */
public class RegistryEntry extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_ID = "id";
  public static final String FIELD_UUID = "uuid";
  public static final String FIELD_UPDATED = "updated";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_MEMBERSHIP_UUID_OWNER = "membership_uuid_owner";
  public static final String FIELD_MEMBERSHIP_TRICOUNT_ID_OWNER = "membership_tricount_id_owner";
  public static final String FIELD_ALIAS_OWNER = "alias_owner";
  public static final String FIELD_AMOUNT = "amount";
  public static final String FIELD_AMOUNT_LOCAL = "amount_local";
  public static final String FIELD_EXCHANGE_RATE = "exchange_rate";
  public static final String FIELD_OBJECT_REFERENCE = "object_reference";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_ALLOCATIONS = "allocations";
  public static final String FIELD_ATTACHMENT = "attachment";
  public static final String FIELD_CATEGORY = "category";
  public static final String FIELD_CATEGORY_CUSTOM = "category_custom";
  public static final String FIELD_DATE = "date";
  public static final String FIELD_TYPE_TRANSACTION = "type_transaction";
  public static final String FIELD_TRICOUNT_ID = "tricount_id";

  /**
   * The id of the RegistryEntry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The uuid of the RegistryEntry. If it was provided by the client on creation, then the client
   * can use it to match the returned RegistryEntry to the row stored locally.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The timestamp of the RegistryEntry's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the RegistryEntry's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The id of the Registry.
   */
  @Expose
  @SerializedName("registry_id")
  private Integer registryId;

  /**
   * The status of the RegistryEntry.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The Amount of the RegistryEntry.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The Amount of the RegistryEntry in a local currency.
   */
  @Expose
  @SerializedName("amount_local")
  private Amount amountLocal;

  /**
   * The exchange rate used to convert between amount and amount_local.
   */
  @Expose
  @SerializedName("exchange_rate")
  private String exchangeRate;

  /**
   * A description about the RegistryEntry.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The RegistryEntry type. AUTO if created by Auto Slice, MANUAL for manually added entries.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The RegistryEntry transaction type. NORMAL, INCOME, or BALANCE.
   */
  @Expose
  @SerializedName("type_transaction")
  private String typeTransaction;

  /**
   * The LabelUser with the public information of the party of this RegistryEntry.
   */
  @Expose
  @SerializedName("alias")
  private LabelUser alias;

  /**
   * The LabelUser with the public information of the counter party of this RegistryEntry.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelUser counterpartyAlias;

  /**
   * The LabelUser with the public information of the User that created the RegistryEntry.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUser userAliasCreated;

  /**
   * The membership of the creator.
   */
  @Expose
  @SerializedName("membership_created")
  private RegistryMembership membershipCreated;

  /**
   * The membership of the owner.
   */
  @Expose
  @SerializedName("membership_owned")
  private RegistryMembership membershipOwned;

  /**
   * An array of AllocationItems.
   */
  @Expose
  @SerializedName("allocations")
  private List<AllocationItem> allocations;

  /**
   * The attachments attached to the payment.
   */
  @Expose
  @SerializedName("attachment")
  private List<RegistryEntryAttachment> attachment;

  /**
   * The category of this RegistryEntry. Supported values: UNCATEGORIZED, OTHER, ACCOMODATION,
   * ENTERTAINMENT, GROCERIES, HEALTHCARE, INSURANCE, RENT, RESTAURANTS, SHOPPING, TRANSPORT
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * A custom user-provided category description for this RegistryEntry. Only allowed if
   * `category` is set to "OTHER".
   */
  @Expose
  @SerializedName("category_custom")
  private String categoryCustom;

  /**
   * A user provided date for this RegistryEntry. Returns a full timestamp to allow apps to also
   * use this to sort transactions client-side.
   */
  @Expose
  @SerializedName("date")
  private String date;

  /**
   * An optional id of the RegistryEntry. Only relevant when doing a batch update of
   * RegistryEntries when updating a Registry.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Integer idFieldForRequest;

  /**
   * An optional uuid of the RegistryEntry. Can be provided by the client on POST to allow clients
   * to later match returned RegistryEntries to the row stored locally. If none is provided, the
   * backend will generate it.
   */
  @Expose
  @SerializedName("uuid_field_for_request")
  private String uuidFieldForRequest;

  /**
   * An optional updated timestamp of the RegistryEntry. Used during sync to determine if the
   * version on the client or server is newest.
   */
  @Expose
  @SerializedName("updated_field_for_request")
  private String updatedFieldForRequest;

  /**
   * The status of the RegistryEntry.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The UUID of the RegistryMembership of the party we are allocating money for. Can be provided
   * instead of the "alias_owner" field.
   */
  @Expose
  @SerializedName("membership_uuid_owner_field_for_request")
  private String membershipUuidOwnerFieldForRequest;

  /**
   * The original tricount id of the membership for backwards compatibility, to ensure clients are
   * able to sync updates to transactions made offline before the Tricount migration to the bunq
   * backend.
   */
  @Expose
  @SerializedName("membership_tricount_id_owner_field_for_request")
  private Integer membershipTricountIdOwnerFieldForRequest;

  /**
   * The Alias of the party we are allocating money for.
   */
  @Expose
  @SerializedName("alias_owner_field_for_request")
  private Pointer aliasOwnerFieldForRequest;

  /**
   * The Amount of the RegistryEntry.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private Amount amountFieldForRequest;

  /**
   * The Amount of the RegistryEntry in a local currency.
   */
  @Expose
  @SerializedName("amount_local_field_for_request")
  private Amount amountLocalFieldForRequest;

  /**
   * The exchange rate used to convert between amount and amount_local.
   */
  @Expose
  @SerializedName("exchange_rate_field_for_request")
  private String exchangeRateFieldForRequest;

  /**
   * The object linked to the RegistryEntry.
   */
  @Expose
  @SerializedName("object_reference_field_for_request")
  private RegistryEntryReference objectReferenceFieldForRequest;

  /**
   * A description about the RegistryEntry.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * An array of AllocationItems.
   */
  @Expose
  @SerializedName("allocations_field_for_request")
  private List<AllocationItem> allocationsFieldForRequest;

  /**
   * The attachments attached to the payment.
   */
  @Expose
  @SerializedName("attachment_field_for_request")
  private List<RegistryEntryAttachment> attachmentFieldForRequest;

  /**
   * The category of this RegistryEntry. Supported values: UNCATEGORIZED, OTHER, ACCOMODATION,
   * ENTERTAINMENT, GROCERIES, HEALTHCARE, INSURANCE, RENT, RESTAURANTS, SHOPPING, TRANSPORT
   */
  @Expose
  @SerializedName("category_field_for_request")
  private String categoryFieldForRequest;

  /**
   * A custom user-provided category description for this RegistryEntry. Only allowed if
   * `category` is set to "OTHER".
   */
  @Expose
  @SerializedName("category_custom_field_for_request")
  private String categoryCustomFieldForRequest;

  /**
   * A user provided date for this RegistryEntry. Accepts full timestamps to assist with
   * client-side sorting of transactions created while the app was offline.
   */
  @Expose
  @SerializedName("date_field_for_request")
  private String dateFieldForRequest;

  /**
   * The RegistryEntry transaction type. NORMAL, INCOME, or BALANCE.
   */
  @Expose
  @SerializedName("type_transaction_field_for_request")
  private String typeTransactionFieldForRequest;

  /**
   * The original tricount id for backwards compatibility, to ensure clients are able to sync
   * updates to transactions made offline before the Tricount migration to the bunq backend.
   */
  @Expose
  @SerializedName("tricount_id_field_for_request")
  private Integer tricountIdFieldForRequest;

  public RegistryEntry() {
  this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount) {
  this(amount, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations) {
  this(amount, allocations, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id) {
  this(amount, allocations, id, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid) {
  this(amount, allocations, id, uuid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated) {
  this(amount, allocations, id, uuid, updated, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status) {
  this(amount, allocations, id, uuid, updated, status, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, null, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, amountLocal, null, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal, String exchangeRate) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, amountLocal, exchangeRate, null, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal, String exchangeRate, RegistryEntryReference objectReference) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, amountLocal, exchangeRate, objectReference, null, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal, String exchangeRate, RegistryEntryReference objectReference, String description) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, amountLocal, exchangeRate, objectReference, description, null, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal, String exchangeRate, RegistryEntryReference objectReference, String description, List<RegistryEntryAttachment> attachment) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, amountLocal, exchangeRate, objectReference, description, attachment, null, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal, String exchangeRate, RegistryEntryReference objectReference, String description, List<RegistryEntryAttachment> attachment, String category) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, amountLocal, exchangeRate, objectReference, description, attachment, category, null, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal, String exchangeRate, RegistryEntryReference objectReference, String description, List<RegistryEntryAttachment> attachment, String category, String categoryCustom) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, amountLocal, exchangeRate, objectReference, description, attachment, category, categoryCustom, null, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal, String exchangeRate, RegistryEntryReference objectReference, String description, List<RegistryEntryAttachment> attachment, String category, String categoryCustom, String date) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, amountLocal, exchangeRate, objectReference, description, attachment, category, categoryCustom, date, null, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal, String exchangeRate, RegistryEntryReference objectReference, String description, List<RegistryEntryAttachment> attachment, String category, String categoryCustom, String date, String typeTransaction) {
  this(amount, allocations, id, uuid, updated, status, membershipUuidOwner, membershipTricountIdOwner, aliasOwner, amountLocal, exchangeRate, objectReference, description, attachment, category, categoryCustom, date, typeTransaction, null);
  }

  public RegistryEntry(Amount amount, List<AllocationItem> allocations, Integer id, String uuid, String updated, String status, String membershipUuidOwner, Integer membershipTricountIdOwner, Pointer aliasOwner, Amount amountLocal, String exchangeRate, RegistryEntryReference objectReference, String description, List<RegistryEntryAttachment> attachment, String category, String categoryCustom, String date, String typeTransaction, Integer tricountId) {
    this.idFieldForRequest = id;
    this.uuidFieldForRequest = uuid;
    this.updatedFieldForRequest = updated;
    this.statusFieldForRequest = status;
    this.membershipUuidOwnerFieldForRequest = membershipUuidOwner;
    this.membershipTricountIdOwnerFieldForRequest = membershipTricountIdOwner;
    this.aliasOwnerFieldForRequest = aliasOwner;
    this.amountFieldForRequest = amount;
    this.amountLocalFieldForRequest = amountLocal;
    this.exchangeRateFieldForRequest = exchangeRate;
    this.objectReferenceFieldForRequest = objectReference;
    this.descriptionFieldForRequest = description;
    this.allocationsFieldForRequest = allocations;
    this.attachmentFieldForRequest = attachment;
    this.categoryFieldForRequest = category;
    this.categoryCustomFieldForRequest = categoryCustom;
    this.dateFieldForRequest = date;
    this.typeTransactionFieldForRequest = typeTransaction;
    this.tricountIdFieldForRequest = tricountId;
  }

  /**
   * The id of the RegistryEntry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The uuid of the RegistryEntry. If it was provided by the client on creation, then the client
   * can use it to match the returned RegistryEntry to the row stored locally.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The timestamp of the RegistryEntry's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the RegistryEntry's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The id of the Registry.
   */
  public Integer getRegistryId() {
    return this.registryId;
  }

  public void setRegistryId(Integer registryId) {
    this.registryId = registryId;
  }

  /**
   * The status of the RegistryEntry.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The Amount of the RegistryEntry.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The Amount of the RegistryEntry in a local currency.
   */
  public Amount getAmountLocal() {
    return this.amountLocal;
  }

  public void setAmountLocal(Amount amountLocal) {
    this.amountLocal = amountLocal;
  }

  /**
   * The exchange rate used to convert between amount and amount_local.
   */
  public String getExchangeRate() {
    return this.exchangeRate;
  }

  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  /**
   * A description about the RegistryEntry.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The RegistryEntry type. AUTO if created by Auto Slice, MANUAL for manually added entries.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The RegistryEntry transaction type. NORMAL, INCOME, or BALANCE.
   */
  public String getTypeTransaction() {
    return this.typeTransaction;
  }

  public void setTypeTransaction(String typeTransaction) {
    this.typeTransaction = typeTransaction;
  }

  /**
   * The LabelUser with the public information of the party of this RegistryEntry.
   */
  public LabelUser getAlias() {
    return this.alias;
  }

  public void setAlias(LabelUser alias) {
    this.alias = alias;
  }

  /**
   * The LabelUser with the public information of the counter party of this RegistryEntry.
   */
  public LabelUser getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelUser counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The LabelUser with the public information of the User that created the RegistryEntry.
   */
  public LabelUser getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUser userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   * The membership of the creator.
   */
  public RegistryMembership getMembershipCreated() {
    return this.membershipCreated;
  }

  public void setMembershipCreated(RegistryMembership membershipCreated) {
    this.membershipCreated = membershipCreated;
  }

  /**
   * The membership of the owner.
   */
  public RegistryMembership getMembershipOwned() {
    return this.membershipOwned;
  }

  public void setMembershipOwned(RegistryMembership membershipOwned) {
    this.membershipOwned = membershipOwned;
  }

  /**
   * An array of AllocationItems.
   */
  public List<AllocationItem> getAllocations() {
    return this.allocations;
  }

  public void setAllocations(List<AllocationItem> allocations) {
    this.allocations = allocations;
  }

  /**
   * The attachments attached to the payment.
   */
  public List<RegistryEntryAttachment> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<RegistryEntryAttachment> attachment) {
    this.attachment = attachment;
  }

  /**
   * The category of this RegistryEntry. Supported values: UNCATEGORIZED, OTHER, ACCOMODATION,
   * ENTERTAINMENT, GROCERIES, HEALTHCARE, INSURANCE, RENT, RESTAURANTS, SHOPPING, TRANSPORT
   */
  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * A custom user-provided category description for this RegistryEntry. Only allowed if
   * `category` is set to "OTHER".
   */
  public String getCategoryCustom() {
    return this.categoryCustom;
  }

  public void setCategoryCustom(String categoryCustom) {
    this.categoryCustom = categoryCustom;
  }

  /**
   * A user provided date for this RegistryEntry. Returns a full timestamp to allow apps to also
   * use this to sort transactions client-side.
   */
  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
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

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.registryId != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.amountLocal != null) {
      return false;
    }

    if (this.exchangeRate != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.typeTransaction != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.userAliasCreated != null) {
      return false;
    }

    if (this.membershipCreated != null) {
      return false;
    }

    if (this.membershipOwned != null) {
      return false;
    }

    if (this.allocations != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.category != null) {
      return false;
    }

    if (this.categoryCustom != null) {
      return false;
    }

    if (this.date != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RegistryEntry fromJsonReader(JsonReader reader) {
    return fromJsonReader(RegistryEntry.class, reader);
  }

}
