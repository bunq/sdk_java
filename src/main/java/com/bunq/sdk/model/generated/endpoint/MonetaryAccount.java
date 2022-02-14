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
 * Used to show the MonetaryAccounts that you can access. Currently the only MonetaryAccount
 * type is MonetaryAccountBank. See also: monetary-account-bank.<br/><br/>Notification filters
 * can be set on a monetary account level to receive callbacks. For more information check the
 * <a href="/api/2/page/callbacks">dedicated callbacks page</a>.
 */
public class MonetaryAccount extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "MonetaryAccount";

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountBank")
  private MonetaryAccountBank monetaryAccountBank;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountJoint")
  private MonetaryAccountJoint monetaryAccountJoint;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountLight")
  private MonetaryAccountLight monetaryAccountLight;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountSavings")
  private MonetaryAccountSavings monetaryAccountSavings;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountExternal")
  private MonetaryAccountExternal monetaryAccountExternal;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountInvestment")
  private MonetaryAccountInvestment monetaryAccountInvestment;

  /**
   * Get a specific MonetaryAccount.
   */
  public static BunqResponse<MonetaryAccount> get(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJson(MonetaryAccount.class, responseRaw);
  }

  public static BunqResponse<MonetaryAccount> get() {
    return get(null, null, null);
  }

  public static BunqResponse<MonetaryAccount> get(Integer monetaryAccountId) {
    return get(monetaryAccountId, null, null);
  }

  public static BunqResponse<MonetaryAccount> get(Integer monetaryAccountId, Map<String, String> params) {
    return get(monetaryAccountId, params, null);
  }

  /**
   * Get a collection of all your MonetaryAccounts.
   */
  public static BunqResponse<List<MonetaryAccount>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(MonetaryAccount.class, responseRaw);
  }

  public static BunqResponse<List<MonetaryAccount>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<MonetaryAccount>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public MonetaryAccountBank getMonetaryAccountBank() {
    return this.monetaryAccountBank;
  }

  public void setMonetaryAccountBank(MonetaryAccountBank monetaryAccountBank) {
    this.monetaryAccountBank = monetaryAccountBank;
  }

  /**
   */
  public MonetaryAccountJoint getMonetaryAccountJoint() {
    return this.monetaryAccountJoint;
  }

  public void setMonetaryAccountJoint(MonetaryAccountJoint monetaryAccountJoint) {
    this.monetaryAccountJoint = monetaryAccountJoint;
  }

  /**
   */
  public MonetaryAccountLight getMonetaryAccountLight() {
    return this.monetaryAccountLight;
  }

  public void setMonetaryAccountLight(MonetaryAccountLight monetaryAccountLight) {
    this.monetaryAccountLight = monetaryAccountLight;
  }

  /**
   */
  public MonetaryAccountSavings getMonetaryAccountSavings() {
    return this.monetaryAccountSavings;
  }

  public void setMonetaryAccountSavings(MonetaryAccountSavings monetaryAccountSavings) {
    this.monetaryAccountSavings = monetaryAccountSavings;
  }

  /**
   */
  public MonetaryAccountExternal getMonetaryAccountExternal() {
    return this.monetaryAccountExternal;
  }

  public void setMonetaryAccountExternal(MonetaryAccountExternal monetaryAccountExternal) {
    this.monetaryAccountExternal = monetaryAccountExternal;
  }

  /**
   */
  public MonetaryAccountInvestment getMonetaryAccountInvestment() {
    return this.monetaryAccountInvestment;
  }

  public void setMonetaryAccountInvestment(MonetaryAccountInvestment monetaryAccountInvestment) {
    this.monetaryAccountInvestment = monetaryAccountInvestment;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.monetaryAccountBank != null) {
      return this.monetaryAccountBank;
    }

    if (this.monetaryAccountJoint != null) {
      return this.monetaryAccountJoint;
    }

    if (this.monetaryAccountLight != null) {
      return this.monetaryAccountLight;
    }

    if (this.monetaryAccountSavings != null) {
      return this.monetaryAccountSavings;
    }

    if (this.monetaryAccountExternal != null) {
      return this.monetaryAccountExternal;
    }

    if (this.monetaryAccountInvestment != null) {
      return this.monetaryAccountInvestment;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.monetaryAccountBank != null) {
      return false;
    }

    if (this.monetaryAccountJoint != null) {
      return false;
    }

    if (this.monetaryAccountLight != null) {
      return false;
    }

    if (this.monetaryAccountSavings != null) {
      return false;
    }

    if (this.monetaryAccountExternal != null) {
      return false;
    }

    if (this.monetaryAccountInvestment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccount fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccount.class, reader);
  }

}
