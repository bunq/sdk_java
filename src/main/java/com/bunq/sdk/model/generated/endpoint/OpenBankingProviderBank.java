package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Avatar;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Lists open banking provider banks.
 */
public class OpenBankingProviderBank extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * The name of the bank provider.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * Provider's status.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The external identifier for this bank.
   */
  @Expose
  @SerializedName("aiia_provider_id")
  private String aiiaProviderId;

  /**
   * Country of provider
   */
  @Expose
  @SerializedName("country")
  private String country;

  /**
   * All payment methods allowed for Sepa payments.
   */
  @Expose
  @SerializedName("all_payment_method_allowed_sepa")
  private List<String> allPaymentMethodAllowedSepa;

  /**
   * All payment methods allowed for Domestic payments.
   */
  @Expose
  @SerializedName("all_payment_method_allowed_domestic")
  private List<String> allPaymentMethodAllowedDomestic;

  /**
   * Whether this provider supports business banking.
   */
  @Expose
  @SerializedName("is_audience_business_supported")
  private Boolean isAudienceBusinessSupported;

  /**
   * Whether this provider supports brivate banking.
   */
  @Expose
  @SerializedName("is_audience_private_supported")
  private Boolean isAudiencePrivateSupported;

  /**
   * The avatar of the bank.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * Provider's status.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public OpenBankingProviderBank() {
  this(null);
  }

  public OpenBankingProviderBank(String status) {
    this.statusFieldForRequest = status;
  }

  /**
   * The name of the bank provider.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Provider's status.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The external identifier for this bank.
   */
  public String getAiiaProviderId() {
    return this.aiiaProviderId;
  }

  public void setAiiaProviderId(String aiiaProviderId) {
    this.aiiaProviderId = aiiaProviderId;
  }

  /**
   * Country of provider
   */
  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * All payment methods allowed for Sepa payments.
   */
  public List<String> getAllPaymentMethodAllowedSepa() {
    return this.allPaymentMethodAllowedSepa;
  }

  public void setAllPaymentMethodAllowedSepa(List<String> allPaymentMethodAllowedSepa) {
    this.allPaymentMethodAllowedSepa = allPaymentMethodAllowedSepa;
  }

  /**
   * All payment methods allowed for Domestic payments.
   */
  public List<String> getAllPaymentMethodAllowedDomestic() {
    return this.allPaymentMethodAllowedDomestic;
  }

  public void setAllPaymentMethodAllowedDomestic(List<String> allPaymentMethodAllowedDomestic) {
    this.allPaymentMethodAllowedDomestic = allPaymentMethodAllowedDomestic;
  }

  /**
   * Whether this provider supports business banking.
   */
  public Boolean getIsAudienceBusinessSupported() {
    return this.isAudienceBusinessSupported;
  }

  public void setIsAudienceBusinessSupported(Boolean isAudienceBusinessSupported) {
    this.isAudienceBusinessSupported = isAudienceBusinessSupported;
  }

  /**
   * Whether this provider supports brivate banking.
   */
  public Boolean getIsAudiencePrivateSupported() {
    return this.isAudiencePrivateSupported;
  }

  public void setIsAudiencePrivateSupported(Boolean isAudiencePrivateSupported) {
    this.isAudiencePrivateSupported = isAudiencePrivateSupported;
  }

  /**
   * The avatar of the bank.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.name != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.aiiaProviderId != null) {
      return false;
    }

    if (this.country != null) {
      return false;
    }

    if (this.allPaymentMethodAllowedSepa != null) {
      return false;
    }

    if (this.allPaymentMethodAllowedDomestic != null) {
      return false;
    }

    if (this.isAudienceBusinessSupported != null) {
      return false;
    }

    if (this.isAudiencePrivateSupported != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static OpenBankingProviderBank fromJsonReader(JsonReader reader) {
    return fromJsonReader(OpenBankingProviderBank.class, reader);
  }

}
