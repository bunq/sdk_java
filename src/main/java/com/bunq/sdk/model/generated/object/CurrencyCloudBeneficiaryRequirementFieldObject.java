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
public class CurrencyCloudBeneficiaryRequirementFieldObject extends BunqModel {

  /**
   * The label to display for the field.
   */
  @Expose
  @SerializedName("label")
  private String label;

  /**
   * The name of the field.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The expression to validate field input.
   */
  @Expose
  @SerializedName("validation_expression")
  private String validationExpression;

  /**
   * The type of data to input. Determines the keyboard to display.
   */
  @Expose
  @SerializedName("input_type")
  private String inputType;

  /**
   * The label to display for the field.
   */
  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The name of the field.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The expression to validate field input.
   */
  public String getValidationExpression() {
    return this.validationExpression;
  }

  public void setValidationExpression(String validationExpression) {
    this.validationExpression = validationExpression;
  }

  /**
   * The type of data to input. Determines the keyboard to display.
   */
  public String getInputType() {
    return this.inputType;
  }

  public void setInputType(String inputType) {
    this.inputType = inputType;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.label != null) {
      return false;
    }

    if (this.name != null) {
      return false;
    }

    if (this.validationExpression != null) {
      return false;
    }

    if (this.inputType != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CurrencyCloudBeneficiaryRequirementFieldObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CurrencyCloudBeneficiaryRequirementFieldObject.class, reader);
  }

}
