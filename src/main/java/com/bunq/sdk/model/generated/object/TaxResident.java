package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class TaxResident extends BunqModel {

  /**
   * The country of the tax number.
   */
  @Expose
  @SerializedName("country")
  private String country;

  /**
   * The tax number.
   */
  @Expose
  @SerializedName("tax_number")
  private String taxNumber;

  /**
   * The country of the tax number.
   */
  @Expose
  @SerializedName("country_field_for_request")
  private String countryFieldForRequest;

  /**
   * The tax number.
   */
  @Expose
  @SerializedName("tax_number_field_for_request")
  private String taxNumberFieldForRequest;

  public TaxResident() {
    this(null, null);
  }

  public TaxResident(String country) {
    this(country, null);
  }

  public TaxResident(String country, String taxNumber) {
    this.countryFieldForRequest = country;
    this.taxNumberFieldForRequest = taxNumber;
  }

  /**
   * The country of the tax number.
   */
  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The tax number.
   */
  public String getTaxNumber() {
    return this.taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.country != null) {
      return false;
    }

    if (this.taxNumber != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TaxResident fromJsonReader(JsonReader reader) {
    return fromJsonReader(TaxResident.class, reader);
  }

}
