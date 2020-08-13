package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 * View for RegistryMembership.
 */
public class RegistryMembership extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_ALIAS = "alias";
    public static final String FIELD_STATUS = "status";

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

    public RegistryMembership() {
        this(null, null);
    }

    public RegistryMembership(Pointer alias) {
        this(alias, null);
    }

    public RegistryMembership(Pointer alias, String status) {
        this.aliasFieldForRequest = alias;
        this.statusFieldForRequest = status;
    }

    /**
     *
     */
    public static RegistryMembership fromJsonReader(JsonReader reader) {
        return fromJsonReader(RegistryMembership.class, reader);
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
     *
     */
    public boolean isAllFieldNull() {
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

        return true;
    }

}
