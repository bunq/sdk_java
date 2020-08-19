package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class TransferwiseRequirementFieldGroupValidationAsync extends BunqModel {

    /**
     * The url to be used to validate user input.
     */
    @Expose
    @SerializedName("url")
    private String url;

    /**
     * The parameters to send when validating user input.
     */
    @Expose
    @SerializedName("params")
    private TransferwiseRequirementFieldGroupValidationAsyncParams params;

    /**
     *
     */
    public static TransferwiseRequirementFieldGroupValidationAsync fromJsonReader(JsonReader reader) {
        return fromJsonReader(TransferwiseRequirementFieldGroupValidationAsync.class, reader);
    }

    /**
     * The url to be used to validate user input.
     */
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The parameters to send when validating user input.
     */
    public TransferwiseRequirementFieldGroupValidationAsyncParams getParams() {
        return this.params;
    }

    public void setParams(TransferwiseRequirementFieldGroupValidationAsyncParams params) {
        this.params = params;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.url != null) {
            return false;
        }

        if (this.params != null) {
            return false;
        }

        return true;
    }

}
