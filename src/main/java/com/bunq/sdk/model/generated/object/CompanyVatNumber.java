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
   * The VAT identification number type.
   */
  @Expose
  @SerializedName("type")
  private String type;

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
   * The VAT identification number type.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

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
  this(null, null, null);
  }

  public CompanyVatNumber(String country) {
  this(country, null, null);
  }

  public CompanyVatNumber(String country, String value) {
  this(country, value, null);
  }

  public CompanyVatNumber(String country, String value, String type) {
    this.typeFieldForRequest = type;
    this.countryFieldForRequest = country;
    this.valueFieldForRequest = value;
  }

  /**
   * The VAT identification number type.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
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
    if (this.type != null) {
      return false;
    }

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
