package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class Address extends BunqModel {

  /**
   * The street.
   */
  @Expose
  @SerializedName("street")
  private String street;

  /**
   * The house number.
   */
  @Expose
  @SerializedName("house_number")
  private String houseNumber;

  /**
   * The PO box.
   */
  @Expose
  @SerializedName("po_box")
  private String poBox;

  /**
   * The postal code.
   */
  @Expose
  @SerializedName("postal_code")
  private String postalCode;

  /**
   * The city.
   */
  @Expose
  @SerializedName("city")
  private String city;

  /**
   * The country as an ISO 3166-1 alpha-2 country code..
   */
  @Expose
  @SerializedName("country")
  private String country;

  /**
   * The province according to local standard.
   */
  @Expose
  @SerializedName("province")
  private String province;

  /**
   * The street.
   */
  @Expose
  @SerializedName("street_field_for_request")
  private String streetFieldForRequest;

  /**
   * The house number.
   */
  @Expose
  @SerializedName("house_number_field_for_request")
  private String houseNumberFieldForRequest;

  /**
   * The PO box.
   */
  @Expose
  @SerializedName("po_box_field_for_request")
  private String poBoxFieldForRequest;

  /**
   * The postal code.
   */
  @Expose
  @SerializedName("postal_code_field_for_request")
  private String postalCodeFieldForRequest;

  /**
   * The city.
   */
  @Expose
  @SerializedName("city_field_for_request")
  private String cityFieldForRequest;

  /**
   * The country as an ISO 3166-1 alpha-2 country code.
   */
  @Expose
  @SerializedName("country_field_for_request")
  private String countryFieldForRequest;

  public Address() {
    this(null, null, null, null, null, null);
  }

  public Address(String street) {
    this(street, null, null, null, null, null);
  }

  public Address(String street, String houseNumber) {
    this(street, houseNumber, null, null, null, null);
  }

  public Address(String street, String houseNumber, String postalCode) {
    this(street, houseNumber, postalCode, null, null, null);
  }

  public Address(String street, String houseNumber, String postalCode, String city) {
    this(street, houseNumber, postalCode, city, null, null);
  }

  public Address(String street, String houseNumber, String postalCode, String city, String country) {
    this(street, houseNumber, postalCode, city, country, null);
  }

  public Address(String street, String houseNumber, String postalCode, String city, String country, String poBox) {
    this.streetFieldForRequest = street;
    this.houseNumberFieldForRequest = houseNumber;
    this.poBoxFieldForRequest = poBox;
    this.postalCodeFieldForRequest = postalCode;
    this.cityFieldForRequest = city;
    this.countryFieldForRequest = country;
  }

  /**
   * The street.
   */
  public String getStreet() {
    return this.street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * The house number.
   */
  public String getHouseNumber() {
    return this.houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  /**
   * The PO box.
   */
  public String getPoBox() {
    return this.poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  /**
   * The postal code.
   */
  public String getPostalCode() {
    return this.postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * The city.
   */
  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The country as an ISO 3166-1 alpha-2 country code..
   */
  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The province according to local standard.
   */
  public String getProvince() {
    return this.province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.street != null) {
      return false;
    }

    if (this.houseNumber != null) {
      return false;
    }

    if (this.poBox != null) {
      return false;
    }

    if (this.postalCode != null) {
      return false;
    }

    if (this.city != null) {
      return false;
    }

    if (this.country != null) {
      return false;
    }

    if (this.province != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Address fromJsonReader(JsonReader reader) {
    return fromJsonReader(Address.class, reader);
  }

}
