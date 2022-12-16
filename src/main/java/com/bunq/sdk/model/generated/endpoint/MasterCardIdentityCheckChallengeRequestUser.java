package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
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
 * Endpoint for apps to fetch a challenge request.
 */
public class MasterCardIdentityCheckChallengeRequestUser extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/challenge-request/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/challenge-request/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "MasterCardIdentityCheckChallengeRequest";

  /**
   * The transaction amount.
   */
  @Expose
  @SerializedName("amount")
  private String amount;

  /**
   * When the identity check expires.
   */
  @Expose
  @SerializedName("expiry_time")
  private String expiryTime;

  /**
   * The description of the purchase. NULL if no description is given.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status of the secure code. Can be PENDING, ACCEPTED, REJECTED, EXPIRED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The monetary account label of the counterparty.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /**
   * The status of the identity check. Can be ACCEPTED_PENDING_RESPONSE or
   * REJECTED_PENDING_RESPONSE.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public MasterCardIdentityCheckChallengeRequestUser() {
  this(null);
  }

  public MasterCardIdentityCheckChallengeRequestUser(String status) {
    this.statusFieldForRequest = status;
  }  /**
   */
  public static BunqResponse<MasterCardIdentityCheckChallengeRequestUser> get(Integer masterCardIdentityCheckChallengeRequestUserId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), masterCardIdentityCheckChallengeRequestUserId), params, customHeaders);

    return fromJson(MasterCardIdentityCheckChallengeRequestUser.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<MasterCardIdentityCheckChallengeRequestUser> get() {
    return get(null, null, null);
  }

  public static BunqResponse<MasterCardIdentityCheckChallengeRequestUser> get(Integer masterCardIdentityCheckChallengeRequestUserId) {
    return get(masterCardIdentityCheckChallengeRequestUserId, null, null);
  }

  public static BunqResponse<MasterCardIdentityCheckChallengeRequestUser> get(Integer masterCardIdentityCheckChallengeRequestUserId, Map<String, String> params) {
    return get(masterCardIdentityCheckChallengeRequestUserId, params, null);
  }

  /**
   * @param status The status of the identity check. Can be ACCEPTED_PENDING_RESPONSE or
   * REJECTED_PENDING_RESPONSE.
   */
  public static BunqResponse<Integer> update(Integer masterCardIdentityCheckChallengeRequestUserId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), masterCardIdentityCheckChallengeRequestUserId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer masterCardIdentityCheckChallengeRequestUserId) {
    return update(masterCardIdentityCheckChallengeRequestUserId, null, null);
  }

  public static BunqResponse<Integer> update(Integer masterCardIdentityCheckChallengeRequestUserId, String status) {
    return update(masterCardIdentityCheckChallengeRequestUserId, status, null);
  }

  /**
   * The transaction amount.
   */
  public String getAmount() {
    return this.amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * When the identity check expires.
   */
  public String getExpiryTime() {
    return this.expiryTime;
  }

  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

  /**
   * The description of the purchase. NULL if no description is given.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The status of the secure code. Can be PENDING, ACCEPTED, REJECTED, EXPIRED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The monetary account label of the counterparty.
   */
  public LabelMonetaryAccount getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.amount != null) {
      return false;
    }

    if (this.expiryTime != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MasterCardIdentityCheckChallengeRequestUser fromJsonReader(JsonReader reader) {
    return fromJsonReader(MasterCardIdentityCheckChallengeRequestUser.class, reader);
  }

}
