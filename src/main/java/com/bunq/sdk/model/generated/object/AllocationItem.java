package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.RegistryMembership;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class AllocationItem extends BunqModel {

  /**
   * The type of the AllocationItem.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The membership.
   */
  @Expose
  @SerializedName("membership")
  private RegistryMembership membership;

  /**
   * The Amount of the AllocationItem.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The Amount of the AllocationItem in the local currency.
   */
  @Expose
  @SerializedName("amount_local")
  private Amount amountLocal;

  /**
   * The share ratio of the AllocationItem.
   */
  @Expose
  @SerializedName("share_ratio")
  private Integer shareRatio;

  /**
   * The UUID of the RegistryMembership we are allocating money for. Can be provided instead of
   * the "alias" field.
   */
  @Expose
  @SerializedName("membership_uuid_field_for_request")
  private String membershipUuidFieldForRequest;

  /**
   * The Tricount ID of the membership for backwards compatibility, to be able to handle changed
   * made offline before the Tricount migration, but synced to the backend after the Tricount
   * migration.
   */
  @Expose
  @SerializedName("membership_tricount_id_field_for_request")
  private Integer membershipTricountIdFieldForRequest;

  /**
   * The Alias of the party we are allocating money for.
   */
  @Expose
  @SerializedName("alias_field_for_request")
  private Pointer aliasFieldForRequest;

  /**
   * The type of the AllocationItem.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The Amount of the AllocationItem. Required when type is AMOUNT. For type RATIO either provide
   * it for all (preferred) or none.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private Amount amountFieldForRequest;

  /**
   * The Amount of the AllocationItem in the local currency.
   */
  @Expose
  @SerializedName("amount_local_field_for_request")
  private Amount amountLocalFieldForRequest;

  /**
   * The share ratio of the AllocationItem.
   */
  @Expose
  @SerializedName("share_ratio_field_for_request")
  private Integer shareRatioFieldForRequest;

  public AllocationItem() {
  this(null, null, null, null, null, null, null);
  }

  public AllocationItem(String type) {
  this(type, null, null, null, null, null, null);
  }

  public AllocationItem(String type, String membershipUuid) {
  this(type, membershipUuid, null, null, null, null, null);
  }

  public AllocationItem(String type, String membershipUuid, Integer membershipTricountId) {
  this(type, membershipUuid, membershipTricountId, null, null, null, null);
  }

  public AllocationItem(String type, String membershipUuid, Integer membershipTricountId, Pointer alias) {
  this(type, membershipUuid, membershipTricountId, alias, null, null, null);
  }

  public AllocationItem(String type, String membershipUuid, Integer membershipTricountId, Pointer alias, Amount amount) {
  this(type, membershipUuid, membershipTricountId, alias, amount, null, null);
  }

  public AllocationItem(String type, String membershipUuid, Integer membershipTricountId, Pointer alias, Amount amount, Amount amountLocal) {
  this(type, membershipUuid, membershipTricountId, alias, amount, amountLocal, null);
  }

  public AllocationItem(String type, String membershipUuid, Integer membershipTricountId, Pointer alias, Amount amount, Amount amountLocal, Integer shareRatio) {
    this.membershipUuidFieldForRequest = membershipUuid;
    this.membershipTricountIdFieldForRequest = membershipTricountId;
    this.aliasFieldForRequest = alias;
    this.typeFieldForRequest = type;
    this.amountFieldForRequest = amount;
    this.amountLocalFieldForRequest = amountLocal;
    this.shareRatioFieldForRequest = shareRatio;
  }

  /**
   * The type of the AllocationItem.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The membership.
   */
  public RegistryMembership getMembership() {
    return this.membership;
  }

  public void setMembership(RegistryMembership membership) {
    this.membership = membership;
  }

  /**
   * The Amount of the AllocationItem.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The Amount of the AllocationItem in the local currency.
   */
  public Amount getAmountLocal() {
    return this.amountLocal;
  }

  public void setAmountLocal(Amount amountLocal) {
    this.amountLocal = amountLocal;
  }

  /**
   * The share ratio of the AllocationItem.
   */
  public Integer getShareRatio() {
    return this.shareRatio;
  }

  public void setShareRatio(Integer shareRatio) {
    this.shareRatio = shareRatio;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.type != null) {
      return false;
    }

    if (this.membership != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.amountLocal != null) {
      return false;
    }

    if (this.shareRatio != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AllocationItem fromJsonReader(JsonReader reader) {
    return fromJsonReader(AllocationItem.class, reader);
  }

}
