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
public class TransferwiseRequirementFieldGroupValidationAsyncParamsObject extends BunqModel {

  /**
   * The parameter key.
   */
  @Expose
  @SerializedName("key")
  private String key;

  /**
   * The parameter label.
   */
  @Expose
  @SerializedName("parameter_name")
  private String parameterName;

  /**
   * Shows whether the parameter is required or not.
   */
  @Expose
  @SerializedName("required")
  private Boolean required;

  /**
   * The parameter key.
   */
  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The parameter label.
   */
  public String getParameterName() {
    return this.parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  /**
   * Shows whether the parameter is required or not.
   */
  public Boolean getRequired() {
    return this.required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.key != null) {
      return false;
    }

    if (this.parameterName != null) {
      return false;
    }

    if (this.required != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TransferwiseRequirementFieldGroupValidationAsyncParamsObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(TransferwiseRequirementFieldGroupValidationAsyncParamsObject.class, reader);
  }

}
