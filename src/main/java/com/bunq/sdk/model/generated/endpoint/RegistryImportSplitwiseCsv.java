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
 * Used to upload a CSV export from Splitwise, and create a new Registry from it.
 */
public class RegistryImportSplitwiseCsv extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "registry-import-splitwise-csv";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "RegistryImport";

  /**
   * The registry details.
   */
  @Expose
  @SerializedName("registry")
  private Registry registry;

  /**
   */
  public static BunqResponse<RegistryImportSplitwiseCsv> create(Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(ENDPOINT_URL_CREATE, requestBytes, customHeaders);

    return fromJson(RegistryImportSplitwiseCsv.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<RegistryImportSplitwiseCsv> create() {
    return create(null);
  }

  /**
   * The registry details.
   */
  public Registry getRegistry() {
    return this.registry;
  }

  public void setRegistry(Registry registry) {
    this.registry = registry;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.registry != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RegistryImportSplitwiseCsv fromJsonReader(JsonReader reader) {
    return fromJsonReader(RegistryImportSplitwiseCsv.class, reader);
  }

}
