package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.PointerObject;
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
 * Manage permissions for Adyen card transactions / Tap to Pay for a company employee.
 */
public class CompanyEmployeeSettingAdyenCardTransactionApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/company-employee-setting-adyen-card-transaction/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_POINTER_COUNTER_USER = "pointer_counter_user";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_MONETARY_ACCOUNT_PAYOUT_ID = "monetary_account_payout_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CompanyEmployeeSettingAdyenCardTransaction";

  /**
   * Whether the user is allowed to use Tap to Pay.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The ID of the monetary account where Tap to Pay transactions should be paid out to.
   */
  @Expose
  @SerializedName("monetary_account_payout_id")
  private Integer monetaryAccountPayoutId;

  /**
   * The pointer to the employee for which you want to create a card.
   */
  @Expose
  @SerializedName("pointer_counter_user_field_for_request")
  private PointerObject pointerCounterUserFieldForRequest;

  /**
   * Whether the user is allowed to use Tap to Pay.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The ID of the monetary account where Tap to Pay transactions should be paid out to.
   */
  @Expose
  @SerializedName("monetary_account_payout_id_field_for_request")
  private Integer monetaryAccountPayoutIdFieldForRequest;

  public CompanyEmployeeSettingAdyenCardTransactionApiObject() {
  this(null, null, null);
  }

  public CompanyEmployeeSettingAdyenCardTransactionApiObject(PointerObject pointerCounterUser) {
  this(pointerCounterUser, null, null);
  }

  public CompanyEmployeeSettingAdyenCardTransactionApiObject(PointerObject pointerCounterUser, String status) {
  this(pointerCounterUser, status, null);
  }

  public CompanyEmployeeSettingAdyenCardTransactionApiObject(PointerObject pointerCounterUser, String status, Integer monetaryAccountPayoutId) {
    this.pointerCounterUserFieldForRequest = pointerCounterUser;
    this.statusFieldForRequest = status;
    this.monetaryAccountPayoutIdFieldForRequest = monetaryAccountPayoutId;
  }  /**
   */
  public static BunqResponse<CompanyEmployeeSettingAdyenCardTransactionApiObject> get(Integer companyEmployeeSettingAdyenCardTransactionId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), companyEmployeeSettingAdyenCardTransactionId), params, customHeaders);

    return fromJson(CompanyEmployeeSettingAdyenCardTransactionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CompanyEmployeeSettingAdyenCardTransactionApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<CompanyEmployeeSettingAdyenCardTransactionApiObject> get(Integer companyEmployeeSettingAdyenCardTransactionId) {
    return get(companyEmployeeSettingAdyenCardTransactionId, null, null);
  }

  public static BunqResponse<CompanyEmployeeSettingAdyenCardTransactionApiObject> get(Integer companyEmployeeSettingAdyenCardTransactionId, Map<String, String> params) {
    return get(companyEmployeeSettingAdyenCardTransactionId, params, null);
  }

  /**
   * Whether the user is allowed to use Tap to Pay.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The ID of the monetary account where Tap to Pay transactions should be paid out to.
   */
  public Integer getMonetaryAccountPayoutId() {
    return this.monetaryAccountPayoutId;
  }

  public void setMonetaryAccountPayoutId(Integer monetaryAccountPayoutId) {
    this.monetaryAccountPayoutId = monetaryAccountPayoutId;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.monetaryAccountPayoutId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CompanyEmployeeSettingAdyenCardTransactionApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CompanyEmployeeSettingAdyenCardTransactionApiObject.class, reader);
  }

}
