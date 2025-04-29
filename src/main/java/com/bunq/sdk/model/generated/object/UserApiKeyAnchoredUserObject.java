package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.UserCompanyApiObject;
import com.bunq.sdk.model.generated.endpoint.UserPaymentServiceProviderApiObject;
import com.bunq.sdk.model.generated.endpoint.UserPersonApiObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class UserApiKeyAnchoredUserObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

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
  @SerializedName("UserPaymentServiceProvider")
  private UserPaymentServiceProviderApiObject userPaymentServiceProvider;

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

  /**
   */
  public static UserApiKeyAnchoredUserObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserApiKeyAnchoredUserObject.class, reader);
  }

}
