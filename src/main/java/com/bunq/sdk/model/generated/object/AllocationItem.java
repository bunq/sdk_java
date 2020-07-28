package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.endpoint.RegistryMembership;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
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
     * The share ratio of the AllocationItem.
     */
    @Expose
    @SerializedName("share_ratio")
    private Integer shareRatio;

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
     * The Amount of the AllocationItem.
     */
    @Expose
    @SerializedName("amount_field_for_request")
    private Amount amountFieldForRequest;

    /**
     * The share ratio of the AllocationItem.
     */
    @Expose
    @SerializedName("share_ratio_field_for_request")
    private Integer shareRatioFieldForRequest;

    public AllocationItem() {
        this(null, null, null, null);
    }

    public AllocationItem(Pointer alias) {
        this(alias, null, null, null);
    }

    public AllocationItem(Pointer alias, String type) {
        this(alias, type, null, null);
    }

    public AllocationItem(Pointer alias, String type, Amount amount) {
        this(alias, type, amount, null);
    }

    public AllocationItem(Pointer alias, String type, Amount amount, Integer shareRatio) {
        this.aliasFieldForRequest = alias;
        this.typeFieldForRequest = type;
        this.amountFieldForRequest = amount;
        this.shareRatioFieldForRequest = shareRatio;
    }

    /**
     *
     */
    public static AllocationItem fromJsonReader(JsonReader reader) {
        return fromJsonReader(AllocationItem.class, reader);
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
     * The share ratio of the AllocationItem.
     */
    public Integer getShareRatio() {
        return this.shareRatio;
    }

    public void setShareRatio(Integer shareRatio) {
        this.shareRatio = shareRatio;
    }

    /**
     *
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

        if (this.shareRatio != null) {
            return false;
        }

        return true;
    }

}
