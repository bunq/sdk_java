package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.CurrencyCloudBeneficiaryRequirementField;
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
 * Endpoint to list requirements for CurrencyCloud beneficiaries.
 */
public class CurrencyCloudBeneficiaryRequirement extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/currency-cloud-beneficiary-requirement";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CurrencyCloudBeneficiaryRequirement";

  /**
   * The payment type this requirement is for.
   */
  @Expose
  @SerializedName("payment_type")
  private String paymentType;

  /**
   * The entity type this requirement is for.
   */
  @Expose
  @SerializedName("legal_entity_type")
  private String legalEntityType;

  /**
   * The fields that are required.
   */
  @Expose
  @SerializedName("all_field")
  private List<CurrencyCloudBeneficiaryRequirementField> allField;

  /**
   */
  public static BunqResponse<List<CurrencyCloudBeneficiaryRequirement>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(CurrencyCloudBeneficiaryRequirement.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CurrencyCloudBeneficiaryRequirement>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<CurrencyCloudBeneficiaryRequirement>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The payment type this requirement is for.
   */
  public String getPaymentType() {
    return this.paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  /**
   * The entity type this requirement is for.
   */
  public String getLegalEntityType() {
    return this.legalEntityType;
  }

  public void setLegalEntityType(String legalEntityType) {
    this.legalEntityType = legalEntityType;
  }

  /**
   * The fields that are required.
   */
  public List<CurrencyCloudBeneficiaryRequirementField> getAllField() {
    return this.allField;
  }

  public void setAllField(List<CurrencyCloudBeneficiaryRequirementField> allField) {
    this.allField = allField;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.paymentType != null) {
      return false;
    }

    if (this.legalEntityType != null) {
      return false;
    }

    if (this.allField != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CurrencyCloudBeneficiaryRequirement fromJsonReader(JsonReader reader) {
    return fromJsonReader(CurrencyCloudBeneficiaryRequirement.class, reader);
  }

}
