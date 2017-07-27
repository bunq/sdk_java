package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Using this call you can retrieve information of the user you are logged in as. This includes
 * your user id, which is referred to in endpoints.
 */
public class User extends BunqModel {

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

  public static User get(ApiContext apiContext, Integer userId) {
    return get(apiContext, userId, new HashMap<>());
  }

  /**
   * Get a specific user.
   */
  public static User get(ApiContext apiContext, Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient.get(String.format(ENDPOINT_URL_READ, userId), customHeaders);

    return fromJson(User.class, new String(responseBytes));
  }

  public static List<User> list(ApiContext apiContext) {
    return list(apiContext, new HashMap<>());
  }

  /**
   * Get a collection of all available users.
   */
  public static List<User> list(ApiContext apiContext, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient.get(ENDPOINT_URL_LISTING, customHeaders);

    return fromJsonList(User.class, new String(responseBytes));
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

}
