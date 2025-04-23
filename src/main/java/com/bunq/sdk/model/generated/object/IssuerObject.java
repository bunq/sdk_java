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
public class IssuerObject extends BunqModel {

  /**
   * The BIC code.
   */
  @Expose
  @SerializedName("bic")
  private String bic;

  /**
   * The name of the bank.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The BIC code.
   */
  @Expose
  @SerializedName("bic_field_for_request")
  private String bicFieldForRequest;

  /**
   * The name of the bank.
   */
  @Expose
  @SerializedName("name_field_for_request")
  private String nameFieldForRequest;

  public IssuerObject() {
  this(null, null);
  }

  public IssuerObject(String bic) {
  this(bic, null);
  }

  public IssuerObject(String bic, String name) {
    this.bicFieldForRequest = bic;
    this.nameFieldForRequest = name;
  }

  /**
   * The BIC code.
   */
  public String getBic() {
    return this.bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  /**
   * The name of the bank.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.bic != null) {
      return false;
    }

    if (this.name != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static IssuerObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(IssuerObject.class, reader);
  }

}
