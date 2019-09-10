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
 * Endpoint for getting available legal names that can be used by the user.
 */
public class UserLegalName extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/legal-name";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "UserLegalNameArray";

  /**
   * All legal names that can be used by the user
   */
  @Expose
  @SerializedName("legal_names")
  private List<String> legalNames;

  /**
   */
  public static BunqResponse<List<UserLegalName>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(UserLegalName.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<UserLegalName>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<UserLegalName>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * All legal names that can be used by the user
   */
  public List<String> getLegalNames() {
    return this.legalNames;
  }

  public void setLegalNames(List<String> legalNames) {
    this.legalNames = legalNames;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.legalNames != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static UserLegalName fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserLegalName.class, reader);
  }

}
