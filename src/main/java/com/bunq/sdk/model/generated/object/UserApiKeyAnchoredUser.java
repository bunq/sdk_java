package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.endpoint.UserCompany;
import com.bunq.sdk.model.generated.endpoint.UserPaymentServiceProvider;
import com.bunq.sdk.model.generated.endpoint.UserPerson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class UserApiKeyAnchoredUser extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

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
  @SerializedName("UserPaymentServiceProvider")
  private UserPaymentServiceProvider userPaymentServiceProvider;

  /**
   */
  public static UserApiKeyAnchoredUser fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserApiKeyAnchoredUser.class, reader);
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
  public UserPaymentServiceProvider getUserPaymentServiceProvider() {
    return this.userPaymentServiceProvider;
  }

  public void setUserPaymentServiceProvider(UserPaymentServiceProvider userPaymentServiceProvider) {
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

    if (this.userPaymentServiceProvider != null) {
      return false;
    }

    return true;
  }

}
