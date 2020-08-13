package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class TransferwiseRequirementField extends BunqModel {

    /**
     * The descriptive label of the field.
     */
    @Expose
    @SerializedName("name")
    private String name;

    /**
     * The field group.
     */
    @Expose
    @SerializedName("group")
    private BunqModel group;

    /**
     * The name of the required field.
     */
    @Expose
    @SerializedName("key_field_for_request")
    private String keyFieldForRequest;

    /**
     * The value of the required field.
     */
    @Expose
    @SerializedName("value_field_for_request")
    private String valueFieldForRequest;

    public TransferwiseRequirementField() {
        this(null, null);
    }

    public TransferwiseRequirementField(String key) {
        this(key, null);
    }

    public TransferwiseRequirementField(String key, String value) {
        this.keyFieldForRequest = key;
        this.valueFieldForRequest = value;
    }

    /**
     *
     */
    public static TransferwiseRequirementField fromJsonReader(JsonReader reader) {
        return fromJsonReader(TransferwiseRequirementField.class, reader);
    }

    /**
     * The descriptive label of the field.
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The field group.
     */
    public BunqModel getGroup() {
        return this.group;
    }

    public void setGroup(BunqModel group) {
        this.group = group;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.name != null) {
            return false;
        }

        if (this.group != null) {
            return false;
        }

        return true;
    }

}
