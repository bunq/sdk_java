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
  public static final String FIELD_ACCOUNT_INFORMATION_SERVICE_STATUS = "account_information_service_status";
  public static final String FIELD_PAYMENT_INFORMATION_SERVICE_STATUS = "payment_information_service_status";

  /**
   * The name of the bank provider.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * Whether we support Open Banking budgeting using the bank provider.
   */
  @Expose
  @SerializedName("account_information_service_status")
  private String accountInformationServiceStatus;

  /**
   * Whether we support top ups using the bank provider.
   */
  @Expose
  @SerializedName("payment_information_service_status")
  private String paymentInformationServiceStatus;

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
   * Whether business banking is supported by the provider.
   */
  @Expose
  @SerializedName("audience_business_status")
  private Boolean audienceBusinessStatus;

  /**
   * Whether personal banking is supported by the provider.
   */
  @Expose
  @SerializedName("audience_private_status")
  private Boolean audiencePrivateStatus;

  /**
   * The avatar of the bank.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * Whether we want to activate the account information service for the bank provider.
   */
  @Expose
  @SerializedName("account_information_service_status_field_for_request")
  private String accountInformationServiceStatusFieldForRequest;

  /**
   * Whether we want to activate the payment information service for the bank provider.
   */
  @Expose
  @SerializedName("payment_information_service_status_field_for_request")
  private String paymentInformationServiceStatusFieldForRequest;

  public OpenBankingProviderBank() {
  this(null, null);
  }

  public OpenBankingProviderBank(String accountInformationServiceStatus) {
  this(accountInformationServiceStatus, null);
  }

  public OpenBankingProviderBank(String accountInformationServiceStatus, String paymentInformationServiceStatus) {
    this.accountInformationServiceStatusFieldForRequest = accountInformationServiceStatus;
    this.paymentInformationServiceStatusFieldForRequest = paymentInformationServiceStatus;
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
   * Whether we support Open Banking budgeting using the bank provider.
   */
  public String getAccountInformationServiceStatus() {
    return this.accountInformationServiceStatus;
  }

  public void setAccountInformationServiceStatus(String accountInformationServiceStatus) {
    this.accountInformationServiceStatus = accountInformationServiceStatus;
  }

  /**
   * Whether we support top ups using the bank provider.
   */
  public String getPaymentInformationServiceStatus() {
    return this.paymentInformationServiceStatus;
  }

  public void setPaymentInformationServiceStatus(String paymentInformationServiceStatus) {
    this.paymentInformationServiceStatus = paymentInformationServiceStatus;
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
   * Whether business banking is supported by the provider.
   */
  public Boolean getAudienceBusinessStatus() {
    return this.audienceBusinessStatus;
  }

  public void setAudienceBusinessStatus(Boolean audienceBusinessStatus) {
    this.audienceBusinessStatus = audienceBusinessStatus;
  }

  /**
   * Whether personal banking is supported by the provider.
   */
  public Boolean getAudiencePrivateStatus() {
    return this.audiencePrivateStatus;
  }

  public void setAudiencePrivateStatus(Boolean audiencePrivateStatus) {
    this.audiencePrivateStatus = audiencePrivateStatus;
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

    if (this.accountInformationServiceStatus != null) {
      return false;
    }

    if (this.paymentInformationServiceStatus != null) {
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

    if (this.audienceBusinessStatus != null) {
      return false;
    }

    if (this.audiencePrivateStatus != null) {
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
