package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

  public Address(String street, String houseNumber, String postalCode, String city,
      String country) {
    this.street = street;
    this.houseNumber = houseNumber;
    this.postalCode = postalCode;
    this.city = city;
    this.country = country;
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

}
