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
public class TaxResident extends BunqModel {

  /**
   * The id of the tax resident.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

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
   * The status of the tax number. Either CONFIRMED or UNCONFIRMED.
   */
  @Expose
  @SerializedName("status")
  private String status;

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

  /**
   * The status of the tax number. Either CONFIRMED or UNCONFIRMED.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public TaxResident() {
  this(null, null, null);
  }

  public TaxResident(String country) {
  this(country, null, null);
  }

  public TaxResident(String country, String taxNumber) {
  this(country, taxNumber, null);
  }

  public TaxResident(String country, String taxNumber, String status) {
    this.countryFieldForRequest = country;
    this.taxNumberFieldForRequest = taxNumber;
    this.statusFieldForRequest = status;
  }

  /**
   * The id of the tax resident.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
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
   * The status of the tax number. Either CONFIRMED or UNCONFIRMED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.country != null) {
      return false;
    }

    if (this.taxNumber != null) {
      return false;
    }

    if (this.status != null) {
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
