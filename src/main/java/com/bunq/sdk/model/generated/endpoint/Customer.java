package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to view a customer.
 */
public class Customer extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/customer";
  protected static final String ENDPOINT_URL_READ = "user/%s/customer/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/customer/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_BILLING_ACCOUNT_ID = "billing_account_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Customer";

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

  /**
   * The primary billing account account's id.
   */
  @Expose
  @SerializedName("billing_account_id_field_for_request")
  private String billingAccountIdFieldForRequest;

  public Customer() {
    this(null);
  }

  public Customer(String billingAccountId) {
    this.billingAccountIdFieldForRequest = billingAccountId;
  }

  /**
   */
  public static BunqResponse<List<Customer>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(Customer.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<Customer>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<Customer>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public static BunqResponse<Customer> get(Integer customerId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), customerId), params, customHeaders);

    return fromJson(Customer.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<Customer> get() {
    return get(null, null, null);
  }

  public static BunqResponse<Customer> get(Integer customerId) {
    return get(customerId, null, null);
  }

  public static BunqResponse<Customer> get(Integer customerId, Map<String, String> params) {
    return get(customerId, params, null);
  }

  /**
   * @param billingAccountId The primary billing account account's id.
   */
  public static BunqResponse<Integer> update(Integer customerId, String billingAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_BILLING_ACCOUNT_ID, billingAccountId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), customerId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer customerId) {
    return update(customerId, null, null);
  }

  public static BunqResponse<Integer> update(Integer customerId, String billingAccountId) {
    return update(customerId, billingAccountId, null);
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

    if (this.billingAccountId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Customer fromJsonReader(JsonReader reader) {
    return fromJsonReader(Customer.class, reader);
  }

}
