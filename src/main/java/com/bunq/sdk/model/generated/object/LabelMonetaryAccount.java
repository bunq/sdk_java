package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class LabelMonetaryAccount extends BunqModel {

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
  private Avatar avatar;

  /**
   * The user this monetary account belongs to.
   */
  @Expose
  @SerializedName("label_user")
  private LabelUser labelUser;

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
  private MonetaryAccountReference bunqMe;

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
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The user this monetary account belongs to.
   */
  public LabelUser getLabelUser() {
    return this.labelUser;
  }

  public void setLabelUser(LabelUser labelUser) {
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
  public MonetaryAccountReference getBunqMe() {
    return this.bunqMe;
  }

  public void setBunqMe(MonetaryAccountReference bunqMe) {
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

}
