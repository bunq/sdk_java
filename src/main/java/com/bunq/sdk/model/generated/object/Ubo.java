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

}
