package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;

/**
 * Used to share a monetary account with another bunq user, as in the 'Connect' feature in the
 * bunq app. Allow the creation of share inquiries that, in the same way as request inquiries,
 * can be revoked by the user creating them or accepted/rejected by the other party.
 */
public class ShareInviteBankInquiryBatch extends BunqModel {

    /**
     * The list of share invite bank inquiries that were made.
     */
    @Expose
    @SerializedName("share_invite_bank_inquiries")
    private List<ShareInviteMonetaryAccountInquiry> shareInviteBankInquiries;

    /**
     * The LabelMonetaryAccount containing the public information of this share invite inquiry
     * batch.
     */
    @Expose
    @SerializedName("alias")
    private LabelMonetaryAccount alias;

    /**
     *
     */
    public static ShareInviteBankInquiryBatch fromJsonReader(JsonReader reader) {
        return fromJsonReader(ShareInviteBankInquiryBatch.class, reader);
    }

    /**
     * The list of share invite bank inquiries that were made.
     */
    public List<ShareInviteMonetaryAccountInquiry> getShareInviteBankInquiries() {
        return this.shareInviteBankInquiries;
    }

    public void setShareInviteBankInquiries(List<ShareInviteMonetaryAccountInquiry> shareInviteBankInquiries) {
        this.shareInviteBankInquiries = shareInviteBankInquiries;
    }

    /**
     * The LabelMonetaryAccount containing the public information of this share invite inquiry
     * batch.
     */
    public LabelMonetaryAccount getAlias() {
        return this.alias;
    }

    public void setAlias(LabelMonetaryAccount alias) {
        this.alias = alias;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.shareInviteBankInquiries != null) {
            return false;
        }

        if (this.alias != null) {
            return false;
        }

        return true;
    }

}
