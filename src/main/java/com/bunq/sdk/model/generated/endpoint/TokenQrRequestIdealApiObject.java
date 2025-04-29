package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AddressObject;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.AttachmentObject;
import com.bunq.sdk.model.generated.object.GeolocationObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
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
 * Using this call you create a request for payment from an external token provided with an
 * ideal transaction. Make sure your iDEAL payments are compliant with the iDEAL standards, by
 * following the following manual: https://www.bunq.com/terms-idealstandards. It's very
 * important to keep these points in mind when you are using the endpoint to make iDEAL payments
 * from your application.
 */
public class TokenQrRequestIdealApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/token-qr-request-ideal";

  /**
   * Field constants.
   */
  public static final String FIELD_TOKEN = "token";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "RequestResponse";

  /**
   * The id of the RequestResponse.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

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
  private AmountObject amountInquired;

  /**
   * The Amount the RequestResponse was accepted with.
   */
  @Expose
  @SerializedName("amount_responded")
  private AmountObject amountResponded;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount this
   * RequestResponse was received on.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount that is
   * requesting money with this RequestResponse.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

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
  private List<AttachmentObject> attachment;

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
  private AddressObject addressShipping;

  /**
   * The billing address provided by the accepting user if an address was requested.
   */
  @Expose
  @SerializedName("address_billing")
  private AddressObject addressBilling;

  /**
   * The Geolocation where the RequestResponse was created.
   */
  @Expose
  @SerializedName("geolocation")
  private GeolocationObject geolocation;

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
   * The whitelist id for this action or null.
   */
  @Expose
  @SerializedName("eligible_whitelist_id")
  private Integer eligibleWhitelistId;

  /**
   * The token passed from a site or read from a QR code.
   */
  @Expose
  @SerializedName("token_field_for_request")
  private String tokenFieldForRequest;

  public TokenQrRequestIdealApiObject() {
  this(null);
  }

  public TokenQrRequestIdealApiObject(String token) {
    this.tokenFieldForRequest = token;
  }  /**
   * Create a request from an ideal transaction.
   * @param token The token passed from a site or read from a QR code.
   */
  public static BunqResponse<TokenQrRequestIdealApiObject> create(String token, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_TOKEN, token);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(TokenQrRequestIdealApiObject.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<TokenQrRequestIdealApiObject> create() {
    return create(null, null);
  }

  public static BunqResponse<TokenQrRequestIdealApiObject> create(String token) {
    return create(token, null);
  }

  /**
   * The id of the RequestResponse.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
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
  public AmountObject getAmountInquired() {
    return this.amountInquired;
  }

  public void setAmountInquired(AmountObject amountInquired) {
    this.amountInquired = amountInquired;
  }

  /**
   * The Amount the RequestResponse was accepted with.
   */
  public AmountObject getAmountResponded() {
    return this.amountResponded;
  }

  public void setAmountResponded(AmountObject amountResponded) {
    this.amountResponded = amountResponded;
  }

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount this
   * RequestResponse was received on.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount that is
   * requesting money with this RequestResponse.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
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
  public List<AttachmentObject> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentObject> attachment) {
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
  public AddressObject getAddressShipping() {
    return this.addressShipping;
  }

  public void setAddressShipping(AddressObject addressShipping) {
    this.addressShipping = addressShipping;
  }

  /**
   * The billing address provided by the accepting user if an address was requested.
   */
  public AddressObject getAddressBilling() {
    return this.addressBilling;
  }

  public void setAddressBilling(AddressObject addressBilling) {
    this.addressBilling = addressBilling;
  }

  /**
   * The Geolocation where the RequestResponse was created.
   */
  public GeolocationObject getGeolocation() {
    return this.geolocation;
  }

  public void setGeolocation(GeolocationObject geolocation) {
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
   * The whitelist id for this action or null.
   */
  public Integer getEligibleWhitelistId() {
    return this.eligibleWhitelistId;
  }

  public void setEligibleWhitelistId(Integer eligibleWhitelistId) {
    this.eligibleWhitelistId = eligibleWhitelistId;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.timeResponded != null) {
      return false;
    }

    if (this.timeExpiry != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.amountInquired != null) {
      return false;
    }

    if (this.amountResponded != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.minimumAge != null) {
      return false;
    }

    if (this.requireAddress != null) {
      return false;
    }

    if (this.addressShipping != null) {
      return false;
    }

    if (this.addressBilling != null) {
      return false;
    }

    if (this.geolocation != null) {
      return false;
    }

    if (this.redirectUrl != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.subType != null) {
      return false;
    }

    if (this.eligibleWhitelistId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TokenQrRequestIdealApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(TokenQrRequestIdealApiObject.class, reader);
  }

}
