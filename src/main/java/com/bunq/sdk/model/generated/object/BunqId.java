package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class BunqId extends BunqModel {

    /**
     * An integer ID of an object. Unique per object type.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * An integer ID of an object. Unique per object type.
     */
    @Expose
    @SerializedName("id_field_for_request")
    private Integer idFieldForRequest;

    public BunqId() {
        this(null);
    }

    public BunqId(Integer id) {
        this.idFieldForRequest = id;
    }

    /**
     *
     */
    public static BunqId fromJsonReader(JsonReader reader) {
        return fromJsonReader(BunqId.class, reader);
    }

    /**
     * An integer ID of an object. Unique per object type.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.id != null) {
            return false;
        }

        return true;
    }

}
