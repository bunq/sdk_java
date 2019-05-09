package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Using this call you can retrieve information of the user you are logged in as. This includes
 * your user id, which is referred to in endpoints.
 */
public class User extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s";
  protected static final String ENDPOINT_URL_LISTING = "user";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "User";

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

  /**
   */
  @Expose
  @SerializedName("UserApiKey")
  private UserApiKey userApiKey;

  /**
   */
  @Expose
  @SerializedName("UserPaymentServiceProvider")
  private UserPaymentServiceProvider userPaymentServiceProvider;

  /**
   * Get a specific user.
   */
  public static BunqResponse<User> get(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId()), params, customHeaders);

    return fromJson(User.class, responseRaw);
  }

  public static BunqResponse<User> get() {
    return get(null, null);
  }

  public static BunqResponse<User> get(Map<String, String> params) {
    return get(params, null);
  }

  /**
   * Get a collection of all available users.
   */
  public static BunqResponse<List<User>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(ENDPOINT_URL_LISTING, params, customHeaders);

    return fromJsonList(User.class, responseRaw);
  }

  public static BunqResponse<List<User>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<User>> list(Map<String, String> params) {
    return list(params, null);
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
  public UserApiKey getUserApiKey() {
    return this.userApiKey;
  }

  public void setUserApiKey(UserApiKey userApiKey) {
    this.userApiKey = userApiKey;
  }

  /**
   */
  public UserPaymentServiceProvider getUserPaymentServiceProvider() {
    return this.userPaymentServiceProvider;
  }

  public void setUserPaymentServiceProvider(UserPaymentServiceProvider userPaymentServiceProvider) {
    this.userPaymentServiceProvider = userPaymentServiceProvider;
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

    if (this.userApiKey != null) {
      return this.userApiKey;
    }

    if (this.userPaymentServiceProvider != null) {
      return this.userPaymentServiceProvider;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.userLight != null) {
      return false;
    }

    if (this.userPerson != null) {
      return false;
    }

    if (this.userCompany != null) {
      return false;
    }

    if (this.userApiKey != null) {
      return false;
    }

    if (this.userPaymentServiceProvider != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static User fromJsonReader(JsonReader reader) {
    return fromJsonReader(User.class, reader);
  }

}
