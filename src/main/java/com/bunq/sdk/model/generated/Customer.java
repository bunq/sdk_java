package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to view a customer.
 */
public class Customer extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_BILLING_ACCOUNT_ID = "billing_account_id";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/customer";
  private static final String ENDPOINT_URL_READ = "user/%s/customer/%s";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/customer/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "Customer";

  /**
   * The id of the customer.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the customer object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the customer object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The primary billing account account's id.
   */
  @Expose
  @SerializedName("billing_account_id")
  private String billingAccountId;

  public static BunqResponse<List<Customer>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  public static BunqResponse<List<Customer>> list(ApiContext apiContext, Integer userId,
      Map<String, String> params) {
    return list(apiContext, userId, params, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<Customer>> list(ApiContext apiContext, Integer userId,
      Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId), params, customHeaders);

    return fromJsonList(Customer.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Customer> get(ApiContext apiContext, Integer userId,
      Integer customerId) {
    return get(apiContext, userId, customerId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Customer> get(ApiContext apiContext, Integer userId,
      Integer customerId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, customerId), new HashMap<>(), customHeaders);

    return fromJson(Customer.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer customerId) {
    return update(apiContext, requestMap, userId, customerId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer customerId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .put(String.format(ENDPOINT_URL_UPDATE, userId, customerId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  /**
   * The id of the customer.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the customer object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the customer object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The primary billing account account's id.
   */
  public String getBillingAccountId() {
    return this.billingAccountId;
  }

  public void setBillingAccountId(String billingAccountId) {
    this.billingAccountId = billingAccountId;
  }

}
