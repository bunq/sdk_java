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
public class CompanyVatNumber extends BunqModel {

  /**
   * The country of the VAT identification number.
   */
  @Expose
  @SerializedName("country")
  private String country;

  /**
   * The VAT identification number number.
   */
  @Expose
  @SerializedName("value")
  private String value;

  /**
   * The country of the VAT identification number.
   */
  @Expose
  @SerializedName("country_field_for_request")
  private String countryFieldForRequest;

  /**
   * The VAT identification number number.
   */
  @Expose
  @SerializedName("value_field_for_request")
  private String valueFieldForRequest;

  public CompanyVatNumber() {
  this(null, null);
  }

  public CompanyVatNumber(String country) {
  this(country, null);
  }

  public CompanyVatNumber(String country, String value) {
    this.countryFieldForRequest = country;
    this.valueFieldForRequest = value;
  }

  /**
   * The country of the VAT identification number.
   */
  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The VAT identification number number.
   */
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.country != null) {
      return false;
    }

    if (this.value != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CompanyVatNumber fromJsonReader(JsonReader reader) {
    return fromJsonReader(CompanyVatNumber.class, reader);
  }

}
