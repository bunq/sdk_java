package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.HealthCheckResultObject;
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
 * Basic health check for uptime and instance health monitoring.
 */
public class HealthCheckApiObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "health-check";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "HealthCheckResult";

  /**
   */
  @Expose
  @SerializedName("HealthResult")
  private HealthCheckResultObject healthResult;

  /**
   */
  public static BunqResponse<List<HealthCheckApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(ENDPOINT_URL_LISTING, params, customHeaders);

    return fromJsonList(HealthCheckApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<HealthCheckApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<HealthCheckApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public HealthCheckResultObject getHealthResult() {
    return this.healthResult;
  }

  public void setHealthResult(HealthCheckResultObject healthResult) {
    this.healthResult = healthResult;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.healthResult != null) {
      return this.healthResult;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.healthResult != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static HealthCheckApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(HealthCheckApiObject.class, reader);
  }

}
