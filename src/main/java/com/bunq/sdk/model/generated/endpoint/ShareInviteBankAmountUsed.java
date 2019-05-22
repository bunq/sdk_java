package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * [DEPRECATED - use /share-invite-monetary-account-inquiry/ID/amount-used] When you have
 * connected your monetary account bank to a user, and given this user a (for example) daily
 * budget of 10 EUR. If this users has used his entire budget or part of it, this call can be
 * used to reset the amount he used to 0. The user can then spend the daily budget of 10 EUR
 * again.
 */
public class ShareInviteBankAmountUsed extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/share-invite-bank-inquiry/%s/amount-used/%s";

  /**
   * [DEPRECATED - use /share-invite-monetary-account-inquiry/ID/amount-used] Reset the available
   * budget for a bank account share. To be called without any ID at the end of the path.
   */
  public static BunqResponse<ShareInviteBankAmountUsed> delete(Integer shareInviteBankInquiryId, Integer shareInviteBankAmountUsedId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), shareInviteBankInquiryId, shareInviteBankAmountUsedId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<ShareInviteBankAmountUsed> delete(Integer shareInviteBankInquiryId) {
    return delete(shareInviteBankInquiryId, null, null, null);
  }

  public static BunqResponse<ShareInviteBankAmountUsed> delete(Integer shareInviteBankInquiryId, Integer shareInviteBankAmountUsedId) {
    return delete(shareInviteBankInquiryId, shareInviteBankAmountUsedId, null, null);
  }

  public static BunqResponse<ShareInviteBankAmountUsed> delete(Integer shareInviteBankInquiryId, Integer shareInviteBankAmountUsedId, Integer monetaryAccountId) {
    return delete(shareInviteBankInquiryId, shareInviteBankAmountUsedId, monetaryAccountId, null);
  }

  /**
   */
  public static ShareInviteBankAmountUsed fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareInviteBankAmountUsed.class, reader);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

}
