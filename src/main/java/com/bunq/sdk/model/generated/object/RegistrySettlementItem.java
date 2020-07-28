package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.endpoint.RegistryMembership;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class RegistrySettlementItem extends BunqModel {

    /**
     * The amount of the RegistrySettlementItem.
     */
    @Expose
    @SerializedName("amount")
    private Amount amount;

    /**
     * The membership of the user that has to pay.
     */
    @Expose
    @SerializedName("membership_paying")
    private RegistryMembership membershipPaying;

    /**
     * The membership of the user that will receive money.
     */
    @Expose
    @SerializedName("membership_receiving")
    private RegistryMembership membershipReceiving;

    /**
     * The LabelMonetaryAccount of the user that has to pay the request.
     */
    @Expose
    @SerializedName("paying_user_alias")
    private LabelMonetaryAccount payingUserAlias;

    /**
     * The LabelMonetaryAccount of the user that will receive the amount.
     */
    @Expose
    @SerializedName("receiving_user_alias")
    private LabelMonetaryAccount receivingUserAlias;

    /**
     *
     */
    public static RegistrySettlementItem fromJsonReader(JsonReader reader) {
        return fromJsonReader(RegistrySettlementItem.class, reader);
    }

    /**
     * The amount of the RegistrySettlementItem.
     */
    public Amount getAmount() {
        return this.amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    /**
     * The membership of the user that has to pay.
     */
    public RegistryMembership getMembershipPaying() {
        return this.membershipPaying;
    }

    public void setMembershipPaying(RegistryMembership membershipPaying) {
        this.membershipPaying = membershipPaying;
    }

    /**
     * The membership of the user that will receive money.
     */
    public RegistryMembership getMembershipReceiving() {
        return this.membershipReceiving;
    }

    public void setMembershipReceiving(RegistryMembership membershipReceiving) {
        this.membershipReceiving = membershipReceiving;
    }

    /**
     * The LabelMonetaryAccount of the user that has to pay the request.
     */
    public LabelMonetaryAccount getPayingUserAlias() {
        return this.payingUserAlias;
    }

    public void setPayingUserAlias(LabelMonetaryAccount payingUserAlias) {
        this.payingUserAlias = payingUserAlias;
    }

    /**
     * The LabelMonetaryAccount of the user that will receive the amount.
     */
    public LabelMonetaryAccount getReceivingUserAlias() {
        return this.receivingUserAlias;
    }

    public void setReceivingUserAlias(LabelMonetaryAccount receivingUserAlias) {
        this.receivingUserAlias = receivingUserAlias;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.amount != null) {
            return false;
        }

        if (this.membershipPaying != null) {
            return false;
        }

        if (this.membershipReceiving != null) {
            return false;
        }

        if (this.payingUserAlias != null) {
            return false;
        }

        if (this.receivingUserAlias != null) {
            return false;
        }

        return true;
    }

}
