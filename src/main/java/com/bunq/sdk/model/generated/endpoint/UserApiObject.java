package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.AnchorObjectInterface;
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
 * Using this call you can retrieve information of the user you are logged in as. This includes
 * your user id, which is referred to in endpoints.
 */
public class UserApiObject extends BunqModel implements AnchorObjectInterface {

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
  @SerializedName("UserPerson")
  private UserPersonApiObject userPerson;

  /**
   */
  @Expose
  @SerializedName("UserCompany")
  private UserCompanyApiObject userCompany;

  /**
   */
  @Expose
  @SerializedName("UserApiKey")
  private UserApiKeyApiObject userApiKey;

  /**
   */
  @Expose
  @SerializedName("UserPaymentServiceProvider")
  private UserPaymentServiceProviderApiObject userPaymentServiceProvider;

  /**
   * Get a specific user.
   */
  public static BunqResponse<UserApiObject> get(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId()), params, customHeaders);

    return fromJson(UserApiObject.class, responseRaw);
  }

  public static BunqResponse<UserApiObject> get() {
    return get(null, null);
  }

  public static BunqResponse<UserApiObject> get(Map<String, String> params) {
    return get(params, null);
  }

  /**
   * Get a collection of all available users.
   */
  public static BunqResponse<List<UserApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(ENDPOINT_URL_LISTING, params, customHeaders);

    return fromJsonList(UserApiObject.class, responseRaw);
  }

  public static BunqResponse<List<UserApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<UserApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public UserPersonApiObject getUserPerson() {
    return this.userPerson;
  }

  public void setUserPerson(UserPersonApiObject userPerson) {
    this.userPerson = userPerson;
  }

  /**
   */
  public UserCompanyApiObject getUserCompany() {
    return this.userCompany;
  }

  public void setUserCompany(UserCompanyApiObject userCompany) {
    this.userCompany = userCompany;
  }

  /**
   */
  public UserApiKeyApiObject getUserApiKey() {
    return this.userApiKey;
  }

  public void setUserApiKey(UserApiKeyApiObject userApiKey) {
    this.userApiKey = userApiKey;
  }

  /**
   */
  public UserPaymentServiceProviderApiObject getUserPaymentServiceProvider() {
    return this.userPaymentServiceProvider;
  }

  public void setUserPaymentServiceProvider(UserPaymentServiceProviderApiObject userPaymentServiceProvider) {
    this.userPaymentServiceProvider = userPaymentServiceProvider;
  }

  /**
   */
  public BunqModel getReferencedObject() {
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
  public static UserApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserApiObject.class, reader);
  }

}
