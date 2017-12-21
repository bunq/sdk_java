package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
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
 * Show the subscription billing contract for the authenticated user.
 */
public class BillingContractSubscription extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/billing-contract-subscription";
  private static final String ENDPOINT_URL_LISTING = "user/%s/billing-contract-subscription";

  /**
   * Field constants.
   */
  public static final String FIELD_SUBSCRIPTION_TYPE = "subscription_type";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "BillingContractSubscription";

  /**
   * The id of the billing contract.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the billing contract was made.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the billing contract was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The date from when the billing contract is valid.
   */
  @Expose
  @SerializedName("contract_date_start")
  private String contractDateStart;

  /**
   * The date until when the billing contract is valid.
   */
  @Expose
  @SerializedName("contract_date_end")
  private String contractDateEnd;

  /**
   * The version of the billing contract.
   */
  @Expose
  @SerializedName("contract_version")
  private Integer contractVersion;

  /**
   * The subscription type of the user. Can be one of PERSON_SUPER_LIGHT_V1, PERSON_LIGHT_V1,
   * PERSON_MORE_V1, PERSON_FREE_V1, PERSON_PREMIUM_V1, COMPANY_V1, or COMPANY_V2.
   */
  @Expose
  @SerializedName("subscription_type")
  private String subscriptionType;

  public static BunqResponse<BillingContractSubscription> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId) {
    return create(apiContext, requestMap, userId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<BillingContractSubscription> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId), requestBytes, customHeaders);

    return fromJson(BillingContractSubscription.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<BillingContractSubscription>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  public static BunqResponse<List<BillingContractSubscription>> list(ApiContext apiContext, Integer userId, Map<String, String> params) {
    return list(apiContext, userId, params, new HashMap<>());
  }

  /**
   * Get all subscription billing contract for the authenticated user.
   */
  public static BunqResponse<List<BillingContractSubscription>> list(ApiContext apiContext, Integer userId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId), params, customHeaders);

    return fromJsonList(BillingContractSubscription.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The id of the billing contract.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the billing contract was made.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the billing contract was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The date from when the billing contract is valid.
   */
  public String getContractDateStart() {
    return this.contractDateStart;
  }

  public void setContractDateStart(String contractDateStart) {
    this.contractDateStart = contractDateStart;
  }

  /**
   * The date until when the billing contract is valid.
   */
  public String getContractDateEnd() {
    return this.contractDateEnd;
  }

  public void setContractDateEnd(String contractDateEnd) {
    this.contractDateEnd = contractDateEnd;
  }

  /**
   * The version of the billing contract.
   */
  public Integer getContractVersion() {
    return this.contractVersion;
  }

  public void setContractVersion(Integer contractVersion) {
    this.contractVersion = contractVersion;
  }

  /**
   * The subscription type of the user. Can be one of PERSON_SUPER_LIGHT_V1, PERSON_LIGHT_V1,
   * PERSON_MORE_V1, PERSON_FREE_V1, PERSON_PREMIUM_V1, COMPANY_V1, or COMPANY_V2.
   */
  public String getSubscriptionType() {
    return this.subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.contractDateStart != null) {
      return false;
    }

    if (this.contractDateEnd != null) {
      return false;
    }

    if (this.contractVersion != null) {
      return false;
    }

    if (this.subscriptionType != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BillingContractSubscription fromJsonReader(JsonReader reader) {
    return fromJsonReader(BillingContractSubscription.class, reader);
  }

}
