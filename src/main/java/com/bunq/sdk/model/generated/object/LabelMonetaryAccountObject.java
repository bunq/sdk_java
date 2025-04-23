package com.bunq.sdk.model.generated.object;

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

/**
 */
public class LabelMonetaryAccountObject extends BunqModel {

  /**
   * The IBAN of the monetary account.
   */
  @Expose
  @SerializedName("iban")
  private String iban;

  /**
   * The name to display with this monetary account.
   */
  @Expose
  @SerializedName("display_name")
  private String displayName;

  /**
   * The avatar of the monetary account.
   */
  @Expose
  @SerializedName("avatar")
  private AvatarObject avatar;

  /**
   * The user this monetary account belongs to.
   */
  @Expose
  @SerializedName("label_user")
  private LabelUserObject labelUser;

  /**
   * The country of the user. Formatted as a ISO 3166-1 alpha-2 country code.
   */
  @Expose
  @SerializedName("country")
  private String country;

  /**
   * Bunq.me pointer with type and value.
   */
  @Expose
  @SerializedName("bunq_me")
  private PointerObject bunqMe;

  /**
   * Whether or not the monetary account is light.
   */
  @Expose
  @SerializedName("is_light")
  private Boolean isLight;

  /**
   * The BIC used for a SWIFT payment.
   */
  @Expose
  @SerializedName("swift_bic")
  private String swiftBic;

  /**
   * The account number used for a SWIFT payment. May or may not be an IBAN.
   */
  @Expose
  @SerializedName("swift_account_number")
  private String swiftAccountNumber;

  /**
   * The account number used for a Transferwise payment. May or may not be an IBAN.
   */
  @Expose
  @SerializedName("transferwise_account_number")
  private String transferwiseAccountNumber;

  /**
   * The bank code used for a Transferwise payment. May or may not be a BIC.
   */
  @Expose
  @SerializedName("transferwise_bank_code")
  private String transferwiseBankCode;

  /**
   * The merchant category code.
   */
  @Expose
  @SerializedName("merchant_category_code")
  private String merchantCategoryCode;

  /**
   * The IBAN of the monetary account.
   */
  public String getIban() {
    return this.iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  /**
   * The name to display with this monetary account.
   */
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The avatar of the monetary account.
   */
  public AvatarObject getAvatar() {
    return this.avatar;
  }

  public void setAvatar(AvatarObject avatar) {
    this.avatar = avatar;
  }

  /**
   * The user this monetary account belongs to.
   */
  public LabelUserObject getLabelUser() {
    return this.labelUser;
  }

  public void setLabelUser(LabelUserObject labelUser) {
    this.labelUser = labelUser;
  }

  /**
   * The country of the user. Formatted as a ISO 3166-1 alpha-2 country code.
   */
  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Bunq.me pointer with type and value.
   */
  public PointerObject getBunqMe() {
    return this.bunqMe;
  }

  public void setBunqMe(PointerObject bunqMe) {
    this.bunqMe = bunqMe;
  }

  /**
   * Whether or not the monetary account is light.
   */
  public Boolean getIsLight() {
    return this.isLight;
  }

  public void setIsLight(Boolean isLight) {
    this.isLight = isLight;
  }

  /**
   * The BIC used for a SWIFT payment.
   */
  public String getSwiftBic() {
    return this.swiftBic;
  }

  public void setSwiftBic(String swiftBic) {
    this.swiftBic = swiftBic;
  }

  /**
   * The account number used for a SWIFT payment. May or may not be an IBAN.
   */
  public String getSwiftAccountNumber() {
    return this.swiftAccountNumber;
  }

  public void setSwiftAccountNumber(String swiftAccountNumber) {
    this.swiftAccountNumber = swiftAccountNumber;
  }

  /**
   * The account number used for a Transferwise payment. May or may not be an IBAN.
   */
  public String getTransferwiseAccountNumber() {
    return this.transferwiseAccountNumber;
  }

  public void setTransferwiseAccountNumber(String transferwiseAccountNumber) {
    this.transferwiseAccountNumber = transferwiseAccountNumber;
  }

  /**
   * The bank code used for a Transferwise payment. May or may not be a BIC.
   */
  public String getTransferwiseBankCode() {
    return this.transferwiseBankCode;
  }

  public void setTransferwiseBankCode(String transferwiseBankCode) {
    this.transferwiseBankCode = transferwiseBankCode;
  }

  /**
   * The merchant category code.
   */
  public String getMerchantCategoryCode() {
    return this.merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.iban != null) {
      return false;
    }

    if (this.displayName != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    if (this.labelUser != null) {
      return false;
    }

    if (this.country != null) {
      return false;
    }

    if (this.bunqMe != null) {
      return false;
    }

    if (this.isLight != null) {
      return false;
    }

    if (this.swiftBic != null) {
      return false;
    }

    if (this.swiftAccountNumber != null) {
      return false;
    }

    if (this.transferwiseAccountNumber != null) {
      return false;
    }

    if (this.transferwiseBankCode != null) {
      return false;
    }

    if (this.merchantCategoryCode != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static LabelMonetaryAccountObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(LabelMonetaryAccountObject.class, reader);
  }

}
