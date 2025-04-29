package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.LabelCardObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.RequestInquiryReferenceObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * MasterCard transaction view.
 */
public class MasterCardActionApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/mastercard-action/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/mastercard-action";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "MasterCardAction";

  /**
   * The id of the MastercardAction.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The id of the monetary account this action links to.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The id of the card this action links to.
   */
  @Expose
  @SerializedName("card_id")
  private Integer cardId;

  /**
   * The amount of the transaction in local currency.
   */
  @Expose
  @SerializedName("amount_local")
  private AmountObject amountLocal;

  /**
   * The amount of the transaction in local currency.
   */
  @Expose
  @SerializedName("amount_converted")
  private AmountObject amountConverted;

  /**
   * The amount of the transaction in the monetary account's currency.
   */
  @Expose
  @SerializedName("amount_billing")
  private AmountObject amountBilling;

  /**
   * The original amount in local currency.
   */
  @Expose
  @SerializedName("amount_original_local")
  private AmountObject amountOriginalLocal;

  /**
   * The original amount in the monetary account's currency.
   */
  @Expose
  @SerializedName("amount_original_billing")
  private AmountObject amountOriginalBilling;

  /**
   * The fee amount as charged by the merchant, if applicable.
   */
  @Expose
  @SerializedName("amount_fee")
  private AmountObject amountFee;

  /**
   * The response code by which authorised transaction can be identified as authorised by bunq.
   */
  @Expose
  @SerializedName("card_authorisation_id_response")
  private String cardAuthorisationIdResponse;

  /**
   * Why the transaction was denied, if it was denied, or just ALLOWED.
   */
  @Expose
  @SerializedName("decision")
  private String decision;

  /**
   * The payment status of the transaction. For example PAYMENT_SUCCESSFUL, for a successful
   * payment.
   */
  @Expose
  @SerializedName("payment_status")
  private String paymentStatus;

  /**
   * Empty if allowed, otherwise a textual explanation of why it was denied.
   */
  @Expose
  @SerializedName("decision_description")
  private String decisionDescription;

  /**
   * Empty if allowed, otherwise a textual explanation of why it was denied in user's language.
   */
  @Expose
  @SerializedName("decision_description_translated")
  private String decisionDescriptionTranslated;

  /**
   * Empty if allowed or if no relevant Together topic exists, otherwise contains the URL for a
   * Together topic with more information about the decision.
   */
  @Expose
  @SerializedName("decision_together_url")
  private String decisionTogetherUrl;

  /**
   * The description for this transaction to display.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status in the authorisation process.
   */
  @Expose
  @SerializedName("authorisation_status")
  private String authorisationStatus;

  /**
   * The type of transaction that was delivered using the card.
   */
  @Expose
  @SerializedName("authorisation_type")
  private String authorisationType;

  /**
   * The type of entry mode the user used. Can be 'ATM', 'ICC', 'MAGNETIC_STRIPE' or 'E_COMMERCE'.
   */
  @Expose
  @SerializedName("pan_entry_mode_user")
  private String panEntryModeUser;

  /**
   * The setlement status in the authorisation process.
   */
  @Expose
  @SerializedName("settlement_status")
  private String settlementStatus;

  /**
   * The clearing status of the authorisation. Can be 'PENDING', 'FIRST_PRESENTMENT_COMPLETE' or
   * 'REFUND_LENIENCY'.
   */
  @Expose
  @SerializedName("clearing_status")
  private String clearingStatus;

  /**
   * The maturity date.
   */
  @Expose
  @SerializedName("maturity_date")
  private String maturityDate;

  /**
   * The city where the message originates from as announced by the terminal.
   */
  @Expose
  @SerializedName("city")
  private String city;

  /**
   * The monetary account label of the account that this action is created for.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The monetary account label of the counterparty.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

  /**
   * The label of the card.
   */
  @Expose
  @SerializedName("label_card")
  private LabelCardObject labelCard;

  /**
   * The identification string of the merchant.
   */
  @Expose
  @SerializedName("merchant_id")
  private String merchantId;

  /**
   * If this is a tokenisation action, this shows the status of the token.
   */
  @Expose
  @SerializedName("token_status")
  private String tokenStatus;

  /**
   * If this is a reservation, the moment the reservation will expire.
   */
  @Expose
  @SerializedName("reservation_expiry_time")
  private String reservationExpiryTime;

  /**
   * The time when the processing of the clearing is expired, refunding the authorisation.
   */
  @Expose
  @SerializedName("clearing_expiry_time")
  private String clearingExpiryTime;

  /**
   * The type of the limit applied to validate if this MasterCardAction was within the spending
   * limits. The returned string matches the limit types as defined in the card endpoint.
   */
  @Expose
  @SerializedName("applied_limit")
  private String appliedLimit;

  /**
   * The secure code id for this mastercard action or null.
   */
  @Expose
  @SerializedName("secure_code_id")
  private Integer secureCodeId;

  /**
   * The ID of the wallet provider as defined by MasterCard. 420 = bunq Android app with Tap&Pay;
   * 103 = Apple Pay.
   */
  @Expose
  @SerializedName("wallet_provider_id")
  private String walletProviderId;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReferenceObject> requestReferenceSplitTheBill;

  /**
   * The cardTokenization event awaiting acceptance by the user
   */
  @Expose
  @SerializedName("card_tokenization_event")
  private EventApiObject cardTokenizationEvent;

  /**
   * A reference to the Refunds if they exist.
   */
  @Expose
  @SerializedName("all_mastercard_action_refund")
  private List<MasterCardActionRefundApiObject> allMastercardActionRefund;

  /**
   * The Card Presence type of the POS.
   */
  @Expose
  @SerializedName("pos_card_presence")
  private String posCardPresence;

  /**
   * The Card Holder Presence type of the POS.
   */
  @Expose
  @SerializedName("pos_card_holder_presence")
  private String posCardHolderPresence;

  /**
   * The whitelist id for this action or null.
   */
  @Expose
  @SerializedName("eligible_whitelist_id")
  private Integer eligibleWhitelistId;

  /**
   * The cashback payout item for this action or null
   */
  @Expose
  @SerializedName("cashback_payout_item")
  private CashbackPayoutItemApiObject cashbackPayoutItem;

  /**
   * The point mutation for this action or null
   */
  @Expose
  @SerializedName("point_mutation")
  private PointMutationApiObject pointMutation;

  /**
   * DEPRECATED. The blacklist enabled for the merchant of this transaction
   */
  @Expose
  @SerializedName("blacklist")
  private UserBlocklistMasterCardMerchantApiObject blacklist;

  /**
   * The blocklist enabled for the merchant of this transaction
   */
  @Expose
  @SerializedName("blocklist")
  private UserBlocklistMasterCardMerchantApiObject blocklist;

  /**
   * The status of the additional authentication performed (3ds) by the user for this transaction.
   */
  @Expose
  @SerializedName("additional_authentication_status")
  private String additionalAuthenticationStatus;

  /**
   * Status checking the provided PIN.
   */
  @Expose
  @SerializedName("pin_status")
  private String pinStatus;

  /**
   * The report for this transaction
   */
  @Expose
  @SerializedName("mastercard_action_report")
  private MasterCardActionReportApiObject mastercardActionReport;

  /**
   * The MCC provided.
   */
  @Expose
  @SerializedName("merchant_category_code")
  private String merchantCategoryCode;

  /**
   * The receipt the company employee has to provide for this transaction.
   */
  @Expose
  @SerializedName("company_employee_card_receipt")
  private CompanyEmployeeCardReceiptApiObject companyEmployeeCardReceipt;

  /**
   */
  public static BunqResponse<MasterCardActionApiObject> get(Integer masterCardActionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), masterCardActionId), params, customHeaders);

    return fromJson(MasterCardActionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<MasterCardActionApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<MasterCardActionApiObject> get(Integer masterCardActionId) {
    return get(masterCardActionId, null, null, null);
  }

  public static BunqResponse<MasterCardActionApiObject> get(Integer masterCardActionId, Integer monetaryAccountId) {
    return get(masterCardActionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<MasterCardActionApiObject> get(Integer masterCardActionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(masterCardActionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<List<MasterCardActionApiObject>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(MasterCardActionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<MasterCardActionApiObject>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<MasterCardActionApiObject>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<MasterCardActionApiObject>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The id of the MastercardAction.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The id of the monetary account this action links to.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The id of the card this action links to.
   */
  public Integer getCardId() {
    return this.cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  /**
   * The amount of the transaction in local currency.
   */
  public AmountObject getAmountLocal() {
    return this.amountLocal;
  }

  public void setAmountLocal(AmountObject amountLocal) {
    this.amountLocal = amountLocal;
  }

  /**
   * The amount of the transaction in local currency.
   */
  public AmountObject getAmountConverted() {
    return this.amountConverted;
  }

  public void setAmountConverted(AmountObject amountConverted) {
    this.amountConverted = amountConverted;
  }

  /**
   * The amount of the transaction in the monetary account's currency.
   */
  public AmountObject getAmountBilling() {
    return this.amountBilling;
  }

  public void setAmountBilling(AmountObject amountBilling) {
    this.amountBilling = amountBilling;
  }

  /**
   * The original amount in local currency.
   */
  public AmountObject getAmountOriginalLocal() {
    return this.amountOriginalLocal;
  }

  public void setAmountOriginalLocal(AmountObject amountOriginalLocal) {
    this.amountOriginalLocal = amountOriginalLocal;
  }

  /**
   * The original amount in the monetary account's currency.
   */
  public AmountObject getAmountOriginalBilling() {
    return this.amountOriginalBilling;
  }

  public void setAmountOriginalBilling(AmountObject amountOriginalBilling) {
    this.amountOriginalBilling = amountOriginalBilling;
  }

  /**
   * The fee amount as charged by the merchant, if applicable.
   */
  public AmountObject getAmountFee() {
    return this.amountFee;
  }

  public void setAmountFee(AmountObject amountFee) {
    this.amountFee = amountFee;
  }

  /**
   * The response code by which authorised transaction can be identified as authorised by bunq.
   */
  public String getCardAuthorisationIdResponse() {
    return this.cardAuthorisationIdResponse;
  }

  public void setCardAuthorisationIdResponse(String cardAuthorisationIdResponse) {
    this.cardAuthorisationIdResponse = cardAuthorisationIdResponse;
  }

  /**
   * Why the transaction was denied, if it was denied, or just ALLOWED.
   */
  public String getDecision() {
    return this.decision;
  }

  public void setDecision(String decision) {
    this.decision = decision;
  }

  /**
   * The payment status of the transaction. For example PAYMENT_SUCCESSFUL, for a successful
   * payment.
   */
  public String getPaymentStatus() {
    return this.paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  /**
   * Empty if allowed, otherwise a textual explanation of why it was denied.
   */
  public String getDecisionDescription() {
    return this.decisionDescription;
  }

  public void setDecisionDescription(String decisionDescription) {
    this.decisionDescription = decisionDescription;
  }

  /**
   * Empty if allowed, otherwise a textual explanation of why it was denied in user's language.
   */
  public String getDecisionDescriptionTranslated() {
    return this.decisionDescriptionTranslated;
  }

  public void setDecisionDescriptionTranslated(String decisionDescriptionTranslated) {
    this.decisionDescriptionTranslated = decisionDescriptionTranslated;
  }

  /**
   * Empty if allowed or if no relevant Together topic exists, otherwise contains the URL for a
   * Together topic with more information about the decision.
   */
  public String getDecisionTogetherUrl() {
    return this.decisionTogetherUrl;
  }

  public void setDecisionTogetherUrl(String decisionTogetherUrl) {
    this.decisionTogetherUrl = decisionTogetherUrl;
  }

  /**
   * The description for this transaction to display.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The status in the authorisation process.
   */
  public String getAuthorisationStatus() {
    return this.authorisationStatus;
  }

  public void setAuthorisationStatus(String authorisationStatus) {
    this.authorisationStatus = authorisationStatus;
  }

  /**
   * The type of transaction that was delivered using the card.
   */
  public String getAuthorisationType() {
    return this.authorisationType;
  }

  public void setAuthorisationType(String authorisationType) {
    this.authorisationType = authorisationType;
  }

  /**
   * The type of entry mode the user used. Can be 'ATM', 'ICC', 'MAGNETIC_STRIPE' or 'E_COMMERCE'.
   */
  public String getPanEntryModeUser() {
    return this.panEntryModeUser;
  }

  public void setPanEntryModeUser(String panEntryModeUser) {
    this.panEntryModeUser = panEntryModeUser;
  }

  /**
   * The setlement status in the authorisation process.
   */
  public String getSettlementStatus() {
    return this.settlementStatus;
  }

  public void setSettlementStatus(String settlementStatus) {
    this.settlementStatus = settlementStatus;
  }

  /**
   * The clearing status of the authorisation. Can be 'PENDING', 'FIRST_PRESENTMENT_COMPLETE' or
   * 'REFUND_LENIENCY'.
   */
  public String getClearingStatus() {
    return this.clearingStatus;
  }

  public void setClearingStatus(String clearingStatus) {
    this.clearingStatus = clearingStatus;
  }

  /**
   * The maturity date.
   */
  public String getMaturityDate() {
    return this.maturityDate;
  }

  public void setMaturityDate(String maturityDate) {
    this.maturityDate = maturityDate;
  }

  /**
   * The city where the message originates from as announced by the terminal.
   */
  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The monetary account label of the account that this action is created for.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The monetary account label of the counterparty.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The label of the card.
   */
  public LabelCardObject getLabelCard() {
    return this.labelCard;
  }

  public void setLabelCard(LabelCardObject labelCard) {
    this.labelCard = labelCard;
  }

  /**
   * The identification string of the merchant.
   */
  public String getMerchantId() {
    return this.merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * If this is a tokenisation action, this shows the status of the token.
   */
  public String getTokenStatus() {
    return this.tokenStatus;
  }

  public void setTokenStatus(String tokenStatus) {
    this.tokenStatus = tokenStatus;
  }

  /**
   * If this is a reservation, the moment the reservation will expire.
   */
  public String getReservationExpiryTime() {
    return this.reservationExpiryTime;
  }

  public void setReservationExpiryTime(String reservationExpiryTime) {
    this.reservationExpiryTime = reservationExpiryTime;
  }

  /**
   * The time when the processing of the clearing is expired, refunding the authorisation.
   */
  public String getClearingExpiryTime() {
    return this.clearingExpiryTime;
  }

  public void setClearingExpiryTime(String clearingExpiryTime) {
    this.clearingExpiryTime = clearingExpiryTime;
  }

  /**
   * The type of the limit applied to validate if this MasterCardAction was within the spending
   * limits. The returned string matches the limit types as defined in the card endpoint.
   */
  public String getAppliedLimit() {
    return this.appliedLimit;
  }

  public void setAppliedLimit(String appliedLimit) {
    this.appliedLimit = appliedLimit;
  }

  /**
   * The secure code id for this mastercard action or null.
   */
  public Integer getSecureCodeId() {
    return this.secureCodeId;
  }

  public void setSecureCodeId(Integer secureCodeId) {
    this.secureCodeId = secureCodeId;
  }

  /**
   * The ID of the wallet provider as defined by MasterCard. 420 = bunq Android app with Tap&Pay;
   * 103 = Apple Pay.
   */
  public String getWalletProviderId() {
    return this.walletProviderId;
  }

  public void setWalletProviderId(String walletProviderId) {
    this.walletProviderId = walletProviderId;
  }

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  public List<RequestInquiryReferenceObject> getRequestReferenceSplitTheBill() {
    return this.requestReferenceSplitTheBill;
  }

  public void setRequestReferenceSplitTheBill(List<RequestInquiryReferenceObject> requestReferenceSplitTheBill) {
    this.requestReferenceSplitTheBill = requestReferenceSplitTheBill;
  }

  /**
   * The cardTokenization event awaiting acceptance by the user
   */
  public EventApiObject getCardTokenizationEvent() {
    return this.cardTokenizationEvent;
  }

  public void setCardTokenizationEvent(EventApiObject cardTokenizationEvent) {
    this.cardTokenizationEvent = cardTokenizationEvent;
  }

  /**
   * A reference to the Refunds if they exist.
   */
  public List<MasterCardActionRefundApiObject> getAllMastercardActionRefund() {
    return this.allMastercardActionRefund;
  }

  public void setAllMastercardActionRefund(List<MasterCardActionRefundApiObject> allMastercardActionRefund) {
    this.allMastercardActionRefund = allMastercardActionRefund;
  }

  /**
   * The Card Presence type of the POS.
   */
  public String getPosCardPresence() {
    return this.posCardPresence;
  }

  public void setPosCardPresence(String posCardPresence) {
    this.posCardPresence = posCardPresence;
  }

  /**
   * The Card Holder Presence type of the POS.
   */
  public String getPosCardHolderPresence() {
    return this.posCardHolderPresence;
  }

  public void setPosCardHolderPresence(String posCardHolderPresence) {
    this.posCardHolderPresence = posCardHolderPresence;
  }

  /**
   * The whitelist id for this action or null.
   */
  public Integer getEligibleWhitelistId() {
    return this.eligibleWhitelistId;
  }

  public void setEligibleWhitelistId(Integer eligibleWhitelistId) {
    this.eligibleWhitelistId = eligibleWhitelistId;
  }

  /**
   * The cashback payout item for this action or null
   */
  public CashbackPayoutItemApiObject getCashbackPayoutItem() {
    return this.cashbackPayoutItem;
  }

  public void setCashbackPayoutItem(CashbackPayoutItemApiObject cashbackPayoutItem) {
    this.cashbackPayoutItem = cashbackPayoutItem;
  }

  /**
   * The point mutation for this action or null
   */
  public PointMutationApiObject getPointMutation() {
    return this.pointMutation;
  }

  public void setPointMutation(PointMutationApiObject pointMutation) {
    this.pointMutation = pointMutation;
  }

  /**
   * DEPRECATED. The blacklist enabled for the merchant of this transaction
   */
  public UserBlocklistMasterCardMerchantApiObject getBlacklist() {
    return this.blacklist;
  }

  public void setBlacklist(UserBlocklistMasterCardMerchantApiObject blacklist) {
    this.blacklist = blacklist;
  }

  /**
   * The blocklist enabled for the merchant of this transaction
   */
  public UserBlocklistMasterCardMerchantApiObject getBlocklist() {
    return this.blocklist;
  }

  public void setBlocklist(UserBlocklistMasterCardMerchantApiObject blocklist) {
    this.blocklist = blocklist;
  }

  /**
   * The status of the additional authentication performed (3ds) by the user for this transaction.
   */
  public String getAdditionalAuthenticationStatus() {
    return this.additionalAuthenticationStatus;
  }

  public void setAdditionalAuthenticationStatus(String additionalAuthenticationStatus) {
    this.additionalAuthenticationStatus = additionalAuthenticationStatus;
  }

  /**
   * Status checking the provided PIN.
   */
  public String getPinStatus() {
    return this.pinStatus;
  }

  public void setPinStatus(String pinStatus) {
    this.pinStatus = pinStatus;
  }

  /**
   * The report for this transaction
   */
  public MasterCardActionReportApiObject getMastercardActionReport() {
    return this.mastercardActionReport;
  }

  public void setMastercardActionReport(MasterCardActionReportApiObject mastercardActionReport) {
    this.mastercardActionReport = mastercardActionReport;
  }

  /**
   * The MCC provided.
   */
  public String getMerchantCategoryCode() {
    return this.merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  /**
   * The receipt the company employee has to provide for this transaction.
   */
  public CompanyEmployeeCardReceiptApiObject getCompanyEmployeeCardReceipt() {
    return this.companyEmployeeCardReceipt;
  }

  public void setCompanyEmployeeCardReceipt(CompanyEmployeeCardReceiptApiObject companyEmployeeCardReceipt) {
    this.companyEmployeeCardReceipt = companyEmployeeCardReceipt;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.cardId != null) {
      return false;
    }

    if (this.amountLocal != null) {
      return false;
    }

    if (this.amountConverted != null) {
      return false;
    }

    if (this.amountBilling != null) {
      return false;
    }

    if (this.amountOriginalLocal != null) {
      return false;
    }

    if (this.amountOriginalBilling != null) {
      return false;
    }

    if (this.amountFee != null) {
      return false;
    }

    if (this.cardAuthorisationIdResponse != null) {
      return false;
    }

    if (this.decision != null) {
      return false;
    }

    if (this.paymentStatus != null) {
      return false;
    }

    if (this.decisionDescription != null) {
      return false;
    }

    if (this.decisionDescriptionTranslated != null) {
      return false;
    }

    if (this.decisionTogetherUrl != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.authorisationStatus != null) {
      return false;
    }

    if (this.authorisationType != null) {
      return false;
    }

    if (this.panEntryModeUser != null) {
      return false;
    }

    if (this.settlementStatus != null) {
      return false;
    }

    if (this.clearingStatus != null) {
      return false;
    }

    if (this.maturityDate != null) {
      return false;
    }

    if (this.city != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.labelCard != null) {
      return false;
    }

    if (this.merchantId != null) {
      return false;
    }

    if (this.tokenStatus != null) {
      return false;
    }

    if (this.reservationExpiryTime != null) {
      return false;
    }

    if (this.clearingExpiryTime != null) {
      return false;
    }

    if (this.appliedLimit != null) {
      return false;
    }

    if (this.secureCodeId != null) {
      return false;
    }

    if (this.walletProviderId != null) {
      return false;
    }

    if (this.requestReferenceSplitTheBill != null) {
      return false;
    }

    if (this.cardTokenizationEvent != null) {
      return false;
    }

    if (this.allMastercardActionRefund != null) {
      return false;
    }

    if (this.posCardPresence != null) {
      return false;
    }

    if (this.posCardHolderPresence != null) {
      return false;
    }

    if (this.eligibleWhitelistId != null) {
      return false;
    }

    if (this.cashbackPayoutItem != null) {
      return false;
    }

    if (this.pointMutation != null) {
      return false;
    }

    if (this.blacklist != null) {
      return false;
    }

    if (this.blocklist != null) {
      return false;
    }

    if (this.additionalAuthenticationStatus != null) {
      return false;
    }

    if (this.pinStatus != null) {
      return false;
    }

    if (this.mastercardActionReport != null) {
      return false;
    }

    if (this.merchantCategoryCode != null) {
      return false;
    }

    if (this.companyEmployeeCardReceipt != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MasterCardActionApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MasterCardActionApiObject.class, reader);
  }

}
