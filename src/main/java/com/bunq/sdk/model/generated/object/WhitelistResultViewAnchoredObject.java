package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.endpoint.DraftPayment;
import com.bunq.sdk.model.generated.endpoint.RequestResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class WhitelistResultViewAnchoredObject extends BunqModel {

    /**
     * The ID of the whitelist entry.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The RequestResponse object
     */
    @Expose
    @SerializedName("requestResponse")
    private RequestResponse requestResponse;

    /**
     * The DraftPayment object
     */
    @Expose
    @SerializedName("draftPayment")
    private DraftPayment draftPayment;

    /**
     *
     */
    public static WhitelistResultViewAnchoredObject fromJsonReader(JsonReader reader) {
        return fromJsonReader(WhitelistResultViewAnchoredObject.class, reader);
    }

    /**
     * The ID of the whitelist entry.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The RequestResponse object
     */
    public RequestResponse getRequestResponse() {
        return this.requestResponse;
    }

    public void setRequestResponse(RequestResponse requestResponse) {
        this.requestResponse = requestResponse;
    }

    /**
     * The DraftPayment object
     */
    public DraftPayment getDraftPayment() {
        return this.draftPayment;
    }

    public void setDraftPayment(DraftPayment draftPayment) {
        this.draftPayment = draftPayment;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.id != null) {
            return false;
        }

        if (this.requestResponse != null) {
            return false;
        }

        if (this.draftPayment != null) {
            return false;
        }

        return true;
    }

}
