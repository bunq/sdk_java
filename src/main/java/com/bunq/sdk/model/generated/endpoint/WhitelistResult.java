package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Error;
import com.bunq.sdk.model.generated.object.RequestInquiryReference;
import com.bunq.sdk.model.generated.object.WhitelistResultViewAnchoredObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;

/**
 * Whitelist an SDD so that when one comes in, it is automatically accepted.
 */
public class WhitelistResult extends BunqModel {

    /**
     * The ID of the whitelist entry.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The account from which payments will be deducted when a transaction is matched with this
     * whitelist.
     */
    @Expose
    @SerializedName("monetary_account_paying_id")
    private Integer monetaryAccountPayingId;

    /**
     * The status of the WhitelistResult.
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * The subStatus of the WhitelistResult.
     */
    @Expose
    @SerializedName("sub_status")
    private String subStatus;

    /**
     * The message when the whitelist result has failed due to user error.
     */
    @Expose
    @SerializedName("error_message")
    private List<Error> errorMessage;

    /**
     * The corresponding whitelist.
     */
    @Expose
    @SerializedName("whitelist")
    private Whitelist whitelist;

    /**
     * The details of the external object the event was created for.
     */
    @Expose
    @SerializedName("object")
    private WhitelistResultViewAnchoredObject object;

    /**
     * The reference to the object used for split the bill. Can be RequestInquiry or
     * RequestInquiryBatch
     */
    @Expose
    @SerializedName("request_reference_split_the_bill")
    private List<RequestInquiryReference> requestReferenceSplitTheBill;

    /**
     *
     */
    public static WhitelistResult fromJsonReader(JsonReader reader) {
        return fromJsonReader(WhitelistResult.class, reader);
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
     * The account from which payments will be deducted when a transaction is matched with this
     * whitelist.
     */
    public Integer getMonetaryAccountPayingId() {
        return this.monetaryAccountPayingId;
    }

    public void setMonetaryAccountPayingId(Integer monetaryAccountPayingId) {
        this.monetaryAccountPayingId = monetaryAccountPayingId;
    }

    /**
     * The status of the WhitelistResult.
     */
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The subStatus of the WhitelistResult.
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    /**
     * The message when the whitelist result has failed due to user error.
     */
    public List<Error> getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(List<Error> errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * The corresponding whitelist.
     */
    public Whitelist getWhitelist() {
        return this.whitelist;
    }

    public void setWhitelist(Whitelist whitelist) {
        this.whitelist = whitelist;
    }

    /**
     * The details of the external object the event was created for.
     */
    public WhitelistResultViewAnchoredObject getObject() {
        return this.object;
    }

    public void setObject(WhitelistResultViewAnchoredObject object) {
        this.object = object;
    }

    /**
     * The reference to the object used for split the bill. Can be RequestInquiry or
     * RequestInquiryBatch
     */
    public List<RequestInquiryReference> getRequestReferenceSplitTheBill() {
        return this.requestReferenceSplitTheBill;
    }

    public void setRequestReferenceSplitTheBill(List<RequestInquiryReference> requestReferenceSplitTheBill) {
        this.requestReferenceSplitTheBill = requestReferenceSplitTheBill;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.id != null) {
            return false;
        }

        if (this.monetaryAccountPayingId != null) {
            return false;
        }

        if (this.status != null) {
            return false;
        }

        if (this.subStatus != null) {
            return false;
        }

        if (this.errorMessage != null) {
            return false;
        }

        if (this.whitelist != null) {
            return false;
        }

        if (this.object != null) {
            return false;
        }

        if (this.requestReferenceSplitTheBill != null) {
            return false;
        }

        return true;
    }

}
