package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class CoOwner extends BunqModel {

    /**
     * The Alias of the co-owner.
     */
    @Expose
    @SerializedName("alias")
    private LabelUser alias;

    /**
     * Can be: ACCEPTED, REJECTED, PENDING or REVOKED
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * The users the account will be joint with.
     */
    @Expose
    @SerializedName("alias_field_for_request")
    private Pointer aliasFieldForRequest;

    public CoOwner() {
        this(null);
    }

    public CoOwner(Pointer alias) {
        this.aliasFieldForRequest = alias;
    }

    /**
     *
     */
    public static CoOwner fromJsonReader(JsonReader reader) {
        return fromJsonReader(CoOwner.class, reader);
    }

    /**
     * The Alias of the co-owner.
     */
    public LabelUser getAlias() {
        return this.alias;
    }

    public void setAlias(LabelUser alias) {
        this.alias = alias;
    }

    /**
     * Can be: ACCEPTED, REJECTED, PENDING or REVOKED
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

        if (this.status != null) {
            return false;
        }

        return true;
    }

}
