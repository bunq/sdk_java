package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class TransferwiseRequirementFieldGroupValuesAllowed extends BunqModel {

    /**
     * The key.
     */
    @Expose
    @SerializedName("key")
    private String key;

    /**
     * The label.
     */
    @Expose
    @SerializedName("name")
    private String name;

    /**
     *
     */
    public static TransferwiseRequirementFieldGroupValuesAllowed fromJsonReader(JsonReader reader) {
        return fromJsonReader(TransferwiseRequirementFieldGroupValuesAllowed.class, reader);
    }

    /**
     * The key.
     */
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The label.
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.key != null) {
            return false;
        }

        if (this.name != null) {
            return false;
        }

        return true;
    }

}
