package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class MonetaryAccountProfileDrain extends BunqModel {

    /**
     * The status of the profile.
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * The goal balance.
     */
    @Expose
    @SerializedName("balance_preferred")
    private Amount balancePreferred;

    /**
     * The high threshold balance.
     */
    @Expose
    @SerializedName("balance_threshold_high")
    private Amount balanceThresholdHigh;

    /**
     * The savings monetary account.
     */
    @Expose
    @SerializedName("savings_account_alias")
    private LabelMonetaryAccount savingsAccountAlias;

    /**
     * The status of the profile.
     */
    @Expose
    @SerializedName("status_field_for_request")
    private String statusFieldForRequest;

    /**
     * The goal balance.
     */
    @Expose
    @SerializedName("balance_preferred_field_for_request")
    private Amount balancePreferredFieldForRequest;

    /**
     * The high threshold balance.
     */
    @Expose
    @SerializedName("balance_threshold_high_field_for_request")
    private Amount balanceThresholdHighFieldForRequest;

    /**
     * The savings monetary account.
     */
    @Expose
    @SerializedName("savings_account_alias_field_for_request")
    private Pointer savingsAccountAliasFieldForRequest;

    public MonetaryAccountProfileDrain() {
        this(null, null, null, null);
    }

    public MonetaryAccountProfileDrain(String status) {
        this(status, null, null, null);
    }

    public MonetaryAccountProfileDrain(String status, Amount balancePreferred) {
        this(status, balancePreferred, null, null);
    }

    public MonetaryAccountProfileDrain(String status, Amount balancePreferred, Amount balanceThresholdHigh) {
        this(status, balancePreferred, balanceThresholdHigh, null);
    }

    public MonetaryAccountProfileDrain(String status, Amount balancePreferred, Amount balanceThresholdHigh, Pointer savingsAccountAlias) {
        this.statusFieldForRequest = status;
        this.balancePreferredFieldForRequest = balancePreferred;
        this.balanceThresholdHighFieldForRequest = balanceThresholdHigh;
        this.savingsAccountAliasFieldForRequest = savingsAccountAlias;
    }

    /**
     *
     */
    public static MonetaryAccountProfileDrain fromJsonReader(JsonReader reader) {
        return fromJsonReader(MonetaryAccountProfileDrain.class, reader);
    }

    /**
     * The status of the profile.
     */
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The goal balance.
     */
    public Amount getBalancePreferred() {
        return this.balancePreferred;
    }

    public void setBalancePreferred(Amount balancePreferred) {
        this.balancePreferred = balancePreferred;
    }

    /**
     * The high threshold balance.
     */
    public Amount getBalanceThresholdHigh() {
        return this.balanceThresholdHigh;
    }

    public void setBalanceThresholdHigh(Amount balanceThresholdHigh) {
        this.balanceThresholdHigh = balanceThresholdHigh;
    }

    /**
     * The savings monetary account.
     */
    public LabelMonetaryAccount getSavingsAccountAlias() {
        return this.savingsAccountAlias;
    }

    public void setSavingsAccountAlias(LabelMonetaryAccount savingsAccountAlias) {
        this.savingsAccountAlias = savingsAccountAlias;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.status != null) {
            return false;
        }

        if (this.balancePreferred != null) {
            return false;
        }

        if (this.balanceThresholdHigh != null) {
            return false;
        }

        if (this.savingsAccountAlias != null) {
            return false;
        }

        return true;
    }

}
