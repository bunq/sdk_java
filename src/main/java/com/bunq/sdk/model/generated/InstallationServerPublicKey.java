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

  public static BunqResponse<List<InstallationServerPublicKey>> list(ApiContext apiContext,
      Integer installationId) {
    return list(apiContext, installationId, new HashMap<>());
  }

  /**
   * Show the ServerPublicKey for this Installation.
   */
  public static BunqResponse<List<InstallationServerPublicKey>> list(ApiContext apiContext,
      Integer installationId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, installationId), customHeaders);

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

}
