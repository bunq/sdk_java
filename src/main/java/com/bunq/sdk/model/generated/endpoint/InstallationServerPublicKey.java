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
 * Using /installation/_/server-public-key you can request the ServerPublicKey again. This is
 * done by referring to the id of the Installation.
 */
public class InstallationServerPublicKey extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "installation/%s/server-public-key";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ServerPublicKey";

  /**
   * The server's public key for this Installation.
   */
  @Expose
  @SerializedName("server_public_key")
  private String serverPublicKey;

  public static BunqResponse<List<InstallationServerPublicKey>> list(ApiContext apiContext, Integer installationId) {
    return list(apiContext, installationId, new HashMap<>());
  }

  public static BunqResponse<List<InstallationServerPublicKey>> list(ApiContext apiContext, Integer installationId, Map<String, String> params) {
    return list(apiContext, installationId, params, new HashMap<>());
  }

  /**
   * Show the ServerPublicKey for this Installation.
   */
  public static BunqResponse<List<InstallationServerPublicKey>> list(ApiContext apiContext, Integer installationId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, installationId), params, customHeaders);

    return fromJsonList(InstallationServerPublicKey.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The server's public key for this Installation.
   */
  public String getServerPublicKey() {
    return this.serverPublicKey;
  }

  public void setServerPublicKey(String serverPublicKey) {
    this.serverPublicKey = serverPublicKey;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.serverPublicKey != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static InstallationServerPublicKey fromJsonReader(JsonReader reader) {
    return fromJsonReader(InstallationServerPublicKey.class, reader);
  }

}
