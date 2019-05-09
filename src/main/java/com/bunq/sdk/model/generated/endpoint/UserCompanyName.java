package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Endpoint for getting all the known (trade) names for a user company. This is needed for
 * updating the user name, as we only accept legal or trade names.
 */
public class UserCompanyName extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user-company/%s/name";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "UserCompanyNameArray";

  /**
   * All known (trade) names for a user company.
   */
  @Expose
  @SerializedName("name_array")
  private List<String> nameArray;

  /**
   * Return all the known (trade) names for a specific user company.
   */
  public static BunqResponse<List<UserCompanyName>> list(Integer userCompanyId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(UserCompanyName.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<UserCompanyName>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<UserCompanyName>> list(Integer userCompanyId) {
    return list(userCompanyId, null, null);
  }

  public static BunqResponse<List<UserCompanyName>> list(Integer userCompanyId, Map<String, String> params) {
    return list(userCompanyId, params, null);
  }

  /**
   * All known (trade) names for a user company.
   */
  public List<String> getNameArray() {
    return this.nameArray;
  }

  public void setNameArray(List<String> nameArray) {
    this.nameArray = nameArray;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.nameArray != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static UserCompanyName fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserCompanyName.class, reader);
  }

}
