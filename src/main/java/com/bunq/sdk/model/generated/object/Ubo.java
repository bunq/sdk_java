package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class Ubo extends BunqModel {

  /**
   * The name of the ultimate beneficiary owner.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The date of birth of the ultimate beneficiary owner.
   */
  @Expose
  @SerializedName("date_of_birth")
  private String dateOfBirth;

  /**
   * The nationality of the ultimate beneficiary owner.
   */
  @Expose
  @SerializedName("nationality")
  private String nationality;

  /**
   * The name of the ultimate beneficiary owner.
   */
  @Expose
  @SerializedName("name_field_for_request")
  private String nameFieldForRequest;

  /**
   * The date of birth of the ultimate beneficiary owner. Accepts ISO8601 date formats.
   */
  @Expose
  @SerializedName("date_of_birth_field_for_request")
  private String dateOfBirthFieldForRequest;

  /**
   * The nationality of the ultimate beneficiary owner. Accepts ISO8601 date formats.
   */
  @Expose
  @SerializedName("nationality_field_for_request")
  private String nationalityFieldForRequest;

  public Ubo() {
    this(null, null, null);
  }

  public Ubo(String name) {
    this(name, null, null);
  }

  public Ubo(String name, String dateOfBirth) {
    this(name, dateOfBirth, null);
  }

  public Ubo(String name, String dateOfBirth, String nationality) {
    this.nameFieldForRequest = name;
    this.dateOfBirthFieldForRequest = dateOfBirth;
    this.nationalityFieldForRequest = nationality;
  }

  /**
   */
  public static Ubo fromJsonReader(JsonReader reader) {
    return fromJsonReader(Ubo.class, reader);
  }

  /**
   * The name of the ultimate beneficiary owner.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The date of birth of the ultimate beneficiary owner.
   */
  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * The nationality of the ultimate beneficiary owner.
   */
  public String getNationality() {
    return this.nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.name != null) {
      return false;
    }

    if (this.dateOfBirth != null) {
      return false;
    }

    if (this.nationality != null) {
      return false;
    }

    return true;
  }

}
