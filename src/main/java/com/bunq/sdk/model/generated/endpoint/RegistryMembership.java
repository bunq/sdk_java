package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
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
 * View for RegistryMembership.
 */
public class RegistryMembership extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_UUID = "uuid";
  public static final String FIELD_ALIAS = "alias";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_AUTO_ADD_CARD_TRANSACTION = "auto_add_card_transaction";
  public static final String FIELD_SETTING = "setting";
  public static final String FIELD_MEMBERSHIP_TICOUNT_ID = "membership_ticount_id";

  /**
   * The UUID of the membership.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The LabelMonetaryAccount of the user who belongs to this RegistryMembership.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

  /**
   * The balance of this RegistryMembership.
   */
  @Expose
  @SerializedName("balance")
  private Amount balance;

  /**
   * The total amount spent of this RegistryMembership.
   */
  @Expose
  @SerializedName("total_amount_spent")
  private Amount totalAmountSpent;

  /**
   * The status of the RegistryMembership.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The status of the settlement of the Registry. Can be PENDING or SETTLED.
   */
  @Expose
  @SerializedName("status_settlement")
  private String statusSettlement;

  /**
   * The setting for adding automatically card transactions to the registry. (deprecated)
   */
  @Expose
  @SerializedName("auto_add_card_transaction")
  private String autoAddCardTransaction;

  /**
   * Registry membership setting.
   */
  @Expose
  @SerializedName("setting")
  private RegistryMembershipSetting setting;

  /**
   * The registry id.
   */
  @Expose
  @SerializedName("registry_id")
  private Integer registryId;

  /**
   * The registry title.
   */
  @Expose
  @SerializedName("registry_title")
  private String registryTitle;

  /**
   * For dinner and grocery expenses.
   */
  @Expose
  @SerializedName("registry_description")
  private String registryDescription;

  /**
   * The label of the user that sent the invite.
   */
  @Expose
  @SerializedName("invitor")
  private LabelUser invitor;

  /**
   * The UUID of the membership. May be used as an alternative to the alias field to identify
   * specific memberships, as the alias may be updated server-side, whereas the UUID will remain
   * consistent.
   */
  @Expose
  @SerializedName("uuid_field_for_request")
  private String uuidFieldForRequest;

  /**
   * The Alias of the party we are inviting to the Registry.
   */
  @Expose
  @SerializedName("alias_field_for_request")
  private Pointer aliasFieldForRequest;

  /**
   * The status of the RegistryMembership.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The setting for adding automatically card transactions to the registry. (deprecated)
   */
  @Expose
  @SerializedName("auto_add_card_transaction_field_for_request")
  private String autoAddCardTransactionFieldForRequest;

  /**
   * Registry membership setting.
   */
  @Expose
  @SerializedName("setting_field_for_request")
  private RegistryMembershipSetting settingFieldForRequest;

  /**
   * The original TricountId of the membership for backwards compatibility. May be used as an
   * alternative to the UUID to identify specific memberships to allow clients to sync changes
   * made offline before the Tricount migration.
   */
  @Expose
  @SerializedName("membership_ticount_id_field_for_request")
  private Integer membershipTicountIdFieldForRequest;

  public RegistryMembership() {
  this(null, null, null, null, null, null);
  }

  public RegistryMembership(Pointer alias) {
  this(alias, null, null, null, null, null);
  }

  public RegistryMembership(Pointer alias, String uuid) {
  this(alias, uuid, null, null, null, null);
  }

  public RegistryMembership(Pointer alias, String uuid, String status) {
  this(alias, uuid, status, null, null, null);
  }

  public RegistryMembership(Pointer alias, String uuid, String status, String autoAddCardTransaction) {
  this(alias, uuid, status, autoAddCardTransaction, null, null);
  }

  public RegistryMembership(Pointer alias, String uuid, String status, String autoAddCardTransaction, RegistryMembershipSetting setting) {
  this(alias, uuid, status, autoAddCardTransaction, setting, null);
  }

  public RegistryMembership(Pointer alias, String uuid, String status, String autoAddCardTransaction, RegistryMembershipSetting setting, Integer membershipTicountId) {
    this.uuidFieldForRequest = uuid;
    this.aliasFieldForRequest = alias;
    this.statusFieldForRequest = status;
    this.autoAddCardTransactionFieldForRequest = autoAddCardTransaction;
    this.settingFieldForRequest = setting;
    this.membershipTicountIdFieldForRequest = membershipTicountId;
  }

  /**
   * The UUID of the membership.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The LabelMonetaryAccount of the user who belongs to this RegistryMembership.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
    this.alias = alias;
  }

  /**
   * The balance of this RegistryMembership.
   */
  public Amount getBalance() {
    return this.balance;
  }

  public void setBalance(Amount balance) {
    this.balance = balance;
  }

  /**
   * The total amount spent of this RegistryMembership.
   */
  public Amount getTotalAmountSpent() {
    return this.totalAmountSpent;
  }

  public void setTotalAmountSpent(Amount totalAmountSpent) {
    this.totalAmountSpent = totalAmountSpent;
  }

  /**
   * The status of the RegistryMembership.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The status of the settlement of the Registry. Can be PENDING or SETTLED.
   */
  public String getStatusSettlement() {
    return this.statusSettlement;
  }

  public void setStatusSettlement(String statusSettlement) {
    this.statusSettlement = statusSettlement;
  }

  /**
   * The setting for adding automatically card transactions to the registry. (deprecated)
   */
  public String getAutoAddCardTransaction() {
    return this.autoAddCardTransaction;
  }

  public void setAutoAddCardTransaction(String autoAddCardTransaction) {
    this.autoAddCardTransaction = autoAddCardTransaction;
  }

  /**
   * Registry membership setting.
   */
  public RegistryMembershipSetting getSetting() {
    return this.setting;
  }

  public void setSetting(RegistryMembershipSetting setting) {
    this.setting = setting;
  }

  /**
   * The registry id.
   */
  public Integer getRegistryId() {
    return this.registryId;
  }

  public void setRegistryId(Integer registryId) {
    this.registryId = registryId;
  }

  /**
   * The registry title.
   */
  public String getRegistryTitle() {
    return this.registryTitle;
  }

  public void setRegistryTitle(String registryTitle) {
    this.registryTitle = registryTitle;
  }

  /**
   * For dinner and grocery expenses.
   */
  public String getRegistryDescription() {
    return this.registryDescription;
  }

  public void setRegistryDescription(String registryDescription) {
    this.registryDescription = registryDescription;
  }

  /**
   * The label of the user that sent the invite.
   */
  public LabelUser getInvitor() {
    return this.invitor;
  }

  public void setInvitor(LabelUser invitor) {
    this.invitor = invitor;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.balance != null) {
      return false;
    }

    if (this.totalAmountSpent != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.statusSettlement != null) {
      return false;
    }

    if (this.autoAddCardTransaction != null) {
      return false;
    }

    if (this.setting != null) {
      return false;
    }

    if (this.registryId != null) {
      return false;
    }

    if (this.registryTitle != null) {
      return false;
    }

    if (this.registryDescription != null) {
      return false;
    }

    if (this.invitor != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RegistryMembership fromJsonReader(JsonReader reader) {
    return fromJsonReader(RegistryMembership.class, reader);
  }

}
