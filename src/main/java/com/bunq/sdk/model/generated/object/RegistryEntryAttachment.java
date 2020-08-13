package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class RegistryEntryAttachment extends BunqModel {

    /**
     * The id of the attachment.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The id of the monetary account to which the attachment belongs.
     */
    @Expose
    @SerializedName("monetary_account_id")
    private Integer monetaryAccountId;

    /**
     * The id of the attachment we are attaching.
     */
    @Expose
    @SerializedName("id_field_for_request")
    private Integer idFieldForRequest;

    public RegistryEntryAttachment() {
        this(null);
    }

    public RegistryEntryAttachment(Integer id) {
        this.idFieldForRequest = id;
    }

    /**
     *
     */
    public static RegistryEntryAttachment fromJsonReader(JsonReader reader) {
        return fromJsonReader(RegistryEntryAttachment.class, reader);
    }

    /**
     * The id of the attachment.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The id of the monetary account to which the attachment belongs.
     */
    public Integer getMonetaryAccountId() {
        return this.monetaryAccountId;
    }

    public void setMonetaryAccountId(Integer monetaryAccountId) {
        this.monetaryAccountId = monetaryAccountId;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.id != null) {
            return false;
        }

        if (this.monetaryAccountId != null) {
            return false;
        }

        return true;
    }

}
