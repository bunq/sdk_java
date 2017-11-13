package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Using this call you can retrieve information of the user you are logged in as. This includes
 * your user id, which is referred to in endpoints.
 */
public class User extends BunqModel {

  /**
   * Error constants.
   */
  private static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s";
  private static final String ENDPOINT_URL_LISTING = "user";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "User";

  /**
   */
  @Expose
  @SerializedName("UserLight")
  private UserLight userLight;

  /**
   */
  @Expose
  @SerializedName("UserPerson")
  private UserPerson userPerson;

  /**
   */
  @Expose
  @SerializedName("UserCompany")
  private UserCompany userCompany;

  public static BunqResponse<User> get(ApiContext apiContext, Integer userId) {
    return get(apiContext, userId, new HashMap<>());
  }

  /**
   * Get a specific user.
   */
  public static BunqResponse<User> get(ApiContext apiContext, Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId), new HashMap<>(), customHeaders);

    return fromJson(User.class, responseRaw);
  }

  public static BunqResponse<List<User>> list(ApiContext apiContext) {
    return list(apiContext, new HashMap<>());
  }

  public static BunqResponse<List<User>> list(ApiContext apiContext, Map<String, String> params) {
    return list(apiContext, params, new HashMap<>());
  }

  /**
   * Get a collection of all available users.
   */
  public static BunqResponse<List<User>> list(ApiContext apiContext, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(ENDPOINT_URL_LISTING, params, customHeaders);

    return fromJsonList(User.class, responseRaw);
  }

  /**
   */
  public UserLight getUserLight() {
    return this.userLight;
  }

  public void setUserLight(UserLight userLight) {
    this.userLight = userLight;
  }

  /**
   */
  public UserPerson getUserPerson() {
    return this.userPerson;
  }

  public void setUserPerson(UserPerson userPerson) {
    this.userPerson = userPerson;
  }

  /**
   */
  public UserCompany getUserCompany() {
    return this.userCompany;
  }

  public void setUserCompany(UserCompany userCompany) {
    this.userCompany = userCompany;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.userLight != null) {
      return this.userLight;
    }

    if (this.userPerson != null) {
      return this.userPerson;
    }

    if (this.userCompany != null) {
      return this.userCompany;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

}
