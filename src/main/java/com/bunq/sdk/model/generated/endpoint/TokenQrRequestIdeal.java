package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Attachment;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Using this call you create a request for payment from an external token provided with an
 * ideal transaction. Make sure your iDEAL payments are compliant with the iDEAL standards, by
 * following the following manual: <a
 * href="https://www.bunq.com/files/media/legal/en/20170315_ideal_standards_en.pdf">https://www.bunq.com/files/media/legal/en/20170315_ideal_standards_en.pdf</a>.
 * It's very important to keep these points in mind when you are using the endpoint to make
 * iDEAL payments from your application.
 */
public class TokenQrRequestIdeal extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/token-qr-request-ideal";

  /**
   * Field constants.
   */
  public static final String FIELD_TOKEN = "token";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "TokenQrRequestIdeal";

  /**
   * The timestamp of when the RequestResponse was responded to.
   */
  @Expose
  @SerializedName("time_responded")
  private String timeResponded;

  /**
   * The timestamp of when the RequestResponse expired or will expire.
   */
  @Expose
  @SerializedName("time_expiry")
  private String timeExpiry;

  /**
   * The id of the MonetaryAccount the RequestResponse was received on.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The requested Amount.
   */
  @Expose
  @SerializedName("amount_inquired")
  private Amount amountInquired;

  /**
   * The Amount the RequestResponse was accepted with.
   */
  @Expose
  @SerializedName("amount_responded")
  private Amount amountResponded;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount this
   * RequestResponse was received on.
   */
  @Expose
  @SerializedName("alias")
  private MonetaryAccountReference alias;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount that is
   * requesting money with this RequestResponse.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private MonetaryAccountReference counterpartyAlias;

  /**
   * The description for the RequestResponse provided by the requesting party. Maximum 9000
   * characters.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The Attachments attached to the RequestResponse.
   */
  @Expose
  @SerializedName("attachment")
  private List<Attachment> attachment;

  /**
   * The status of the created RequestResponse. Can only be PENDING.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The minimum age the user accepting the RequestResponse must have.
   */
  @Expose
  @SerializedName("minimum_age")
  private Integer minimumAge;

  /**
   * Whether or not an address must be provided on accept.
   */
  @Expose
  @SerializedName("require_address")
  private String requireAddress;

  /**
   * The shipping address provided by the accepting user if an address was requested.
   */
  @Expose
  @SerializedName("address_shipping")
  private Address addressShipping;

  /**
   * The billing address provided by the accepting user if an address was requested.
   */
  @Expose
  @SerializedName("address_billing")
  private Address addressBilling;

  /**
   * The Geolocation where the RequestResponse was created.
   */
  @Expose
  @SerializedName("geolocation")
  private Geolocation geolocation;

  /**
   * The URL which the user is sent to after accepting or rejecting the Request.
   */
  @Expose
  @SerializedName("redirect_url")
  private String redirectUrl;

  /**
   * The type of the RequestResponse. Can be only be IDEAL.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The subtype of the RequestResponse. Can be only be NONE.
   */
  @Expose
  @SerializedName("sub_type")
  private String subType;

  /**
   * Whether or not chat messages are allowed.
   */
  @Expose
  @SerializedName("allow_chat")
  private Boolean allowChat;

  /**
   * The whitelist id for this action or null.
   */
  @Expose
  @SerializedName("eligible_whitelist_id")
  private Integer eligibleWhitelistId;

  public static BunqResponse<TokenQrRequestIdeal> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId) {
    return create(apiContext, requestMap, userId, new HashMap<>());
  }

  /**
   * Create a request from an ideal transaction.
   */
  public static BunqResponse<TokenQrRequestIdeal> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId), requestBytes, customHeaders);

    return fromJson(TokenQrRequestIdeal.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The timestamp of when the RequestResponse was responded to.
   */
  public String getTimeResponded() {
    return this.timeResponded;
  }

  public void setTimeResponded(String timeResponded) {
    this.timeResponded = timeResponded;
  }

  /**
   * The timestamp of when the RequestResponse expired or will expire.
   */
  public String getTimeExpiry() {
    return this.timeExpiry;
  }

  public void setTimeExpiry(String timeExpiry) {
    this.timeExpiry = timeExpiry;
  }

  /**
   * The id of the MonetaryAccount the RequestResponse was received on.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The requested Amount.
   */
  public Amount getAmountInquired() {
    return this.amountInquired;
  }

  public void setAmountInquired(Amount amountInquired) {
    this.amountInquired = amountInquired;
  }

  /**
   * The Amount the RequestResponse was accepted with.
   */
  public Amount getAmountResponded() {
    return this.amountResponded;
  }

  public void setAmountResponded(Amount amountResponded) {
    this.amountResponded = amountResponded;
  }

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount this
   * RequestResponse was received on.
   */
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount that is
   * requesting money with this RequestResponse.
   */
  public MonetaryAccountReference getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(MonetaryAccountReference counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The description for the RequestResponse provided by the requesting party. Maximum 9000
   * characters.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The Attachments attached to the RequestResponse.
   */
  public List<Attachment> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<Attachment> attachment) {
    this.attachment = attachment;
  }

  /**
   * The status of the created RequestResponse. Can only be PENDING.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The minimum age the user accepting the RequestResponse must have.
   */
  public Integer getMinimumAge() {
    return this.minimumAge;
  }

  public void setMinimumAge(Integer minimumAge) {
    this.minimumAge = minimumAge;
  }

  /**
   * Whether or not an address must be provided on accept.
   */
  public String getRequireAddress() {
    return this.requireAddress;
  }

  public void setRequireAddress(String requireAddress) {
    this.requireAddress = requireAddress;
  }

  /**
   * The shipping address provided by the accepting user if an address was requested.
   */
  public Address getAddressShipping() {
    return this.addressShipping;
  }

  public void setAddressShipping(Address addressShipping) {
    this.addressShipping = addressShipping;
  }

  /**
   * The billing address provided by the accepting user if an address was requested.
   */
  public Address getAddressBilling() {
    return this.addressBilling;
  }

  public void setAddressBilling(Address addressBilling) {
    this.addressBilling = addressBilling;
  }

  /**
   * The Geolocation where the RequestResponse was created.
   */
  public Geolocation getGeolocation() {
    return this.geolocation;
  }

  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  /**
   * The URL which the user is sent to after accepting or rejecting the Request.
   */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /**
   * The type of the RequestResponse. Can be only be IDEAL.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The subtype of the RequestResponse. Can be only be NONE.
   */
  public String getSubType() {
    return this.subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  /**
   * Whether or not chat messages are allowed.
   */
  public Boolean getAllowChat() {
    return this.allowChat;
  }

  public void setAllowChat(Boolean allowChat) {
    this.allowChat = allowChat;
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

}
