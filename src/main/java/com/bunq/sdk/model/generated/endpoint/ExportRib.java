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
 * Used to create new and read existing RIBs of a monetary account
 */
public class ExportRib extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/export-rib";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/export-rib/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/export-rib/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/export-rib";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ExportRib";

  /**
   * The id of the rib as created on the server.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the RIB's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the RIB's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * Create a new RIB.
   */
  public static BunqResponse<Integer> create(Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null);
  }

  public static BunqResponse<Integer> create(Integer monetaryAccountId) {
    return create(monetaryAccountId, null);
  }

  /**
   * Get a RIB for a monetary account by its id.
   */
  public static BunqResponse<ExportRib> get(Integer exportRibId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), exportRibId), params, customHeaders);

    return fromJson(ExportRib.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ExportRib> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<ExportRib> get(Integer exportRibId) {
    return get(exportRibId, null, null, null);
  }

  public static BunqResponse<ExportRib> get(Integer exportRibId, Integer monetaryAccountId) {
    return get(exportRibId, monetaryAccountId, null, null);
  }

  public static BunqResponse<ExportRib> get(Integer exportRibId, Integer monetaryAccountId, Map<String, String> params) {
    return get(exportRibId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<ExportRib> delete(Integer exportRibId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), exportRibId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<ExportRib> delete(Integer exportRibId) {
    return delete(exportRibId, null, null);
  }

  public static BunqResponse<ExportRib> delete(Integer exportRibId, Integer monetaryAccountId) {
    return delete(exportRibId, monetaryAccountId, null);
  }

  /**
   * List all the RIBs for a monetary account.
   */
  public static BunqResponse<List<ExportRib>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(ExportRib.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ExportRib>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<ExportRib>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<ExportRib>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   */
  public static ExportRib fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportRib.class, reader);
  }

  /**
   * The id of the rib as created on the server.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the RIB's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the RIB's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
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

    return true;
  }

}
