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
public class TransferwiseRequirementFieldGroup extends BunqModel {

  /**
   * The key of the field. This is the value to send as input.
   */
  @Expose
  @SerializedName("key")
  private String key;

  /**
   * The field's input type: "text", "select" or "radio".
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The field name.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * Indicates that any changes in this field affect the requirements, if this field is changed,
   * the requirements endpoint must be called again to recheck if there are any additional
   * requirements.
   */
  @Expose
  @SerializedName("refresh_requirements_on_change")
  private Boolean refreshRequirementsOnChange;

  /**
   * Whether or not the field is required.
   */
  @Expose
  @SerializedName("required")
  private Boolean required;

  /**
   * Formatting mask to guide user input.
   */
  @Expose
  @SerializedName("display_format")
  private String displayFormat;

  /**
   * An example value for this field.
   */
  @Expose
  @SerializedName("example")
  private String example;

  /**
   * The minimum length of the field's value.
   */
  @Expose
  @SerializedName("min_length")
  private String minLength;

  /**
   * The maximum length of the field's value.
   */
  @Expose
  @SerializedName("max_length")
  private String maxLength;

  /**
   * A regular expression which may be used to validate the user input.
   */
  @Expose
  @SerializedName("validation_regexp")
  private String validationRegexp;

  /**
   * Details of an endpoint which may be used to validate the user input.
   */
  @Expose
  @SerializedName("validation_async")
  private TransferwiseRequirementFieldGroupValidationAsync validationAsync;

  /**
   * Shows which values are allowed for fields of type "select" or "radio".
   */
  @Expose
  @SerializedName("values_allowed")
  private TransferwiseRequirementFieldGroupValuesAllowed valuesAllowed;

  /**
   * The key of the field. This is the value to send as input.
   */
  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The field's input type: "text", "select" or "radio".
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The field name.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Indicates that any changes in this field affect the requirements, if this field is changed,
   * the requirements endpoint must be called again to recheck if there are any additional
   * requirements.
   */
  public Boolean getRefreshRequirementsOnChange() {
    return this.refreshRequirementsOnChange;
  }

  public void setRefreshRequirementsOnChange(Boolean refreshRequirementsOnChange) {
    this.refreshRequirementsOnChange = refreshRequirementsOnChange;
  }

  /**
   * Whether or not the field is required.
   */
  public Boolean getRequired() {
    return this.required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   * Formatting mask to guide user input.
   */
  public String getDisplayFormat() {
    return this.displayFormat;
  }

  public void setDisplayFormat(String displayFormat) {
    this.displayFormat = displayFormat;
  }

  /**
   * An example value for this field.
   */
  public String getExample() {
    return this.example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  /**
   * The minimum length of the field's value.
   */
  public String getMinLength() {
    return this.minLength;
  }

  public void setMinLength(String minLength) {
    this.minLength = minLength;
  }

  /**
   * The maximum length of the field's value.
   */
  public String getMaxLength() {
    return this.maxLength;
  }

  public void setMaxLength(String maxLength) {
    this.maxLength = maxLength;
  }

  /**
   * A regular expression which may be used to validate the user input.
   */
  public String getValidationRegexp() {
    return this.validationRegexp;
  }

  public void setValidationRegexp(String validationRegexp) {
    this.validationRegexp = validationRegexp;
  }

  /**
   * Details of an endpoint which may be used to validate the user input.
   */
  public TransferwiseRequirementFieldGroupValidationAsync getValidationAsync() {
    return this.validationAsync;
  }

  public void setValidationAsync(TransferwiseRequirementFieldGroupValidationAsync validationAsync) {
    this.validationAsync = validationAsync;
  }

  /**
   * Shows which values are allowed for fields of type "select" or "radio".
   */
  public TransferwiseRequirementFieldGroupValuesAllowed getValuesAllowed() {
    return this.valuesAllowed;
  }

  public void setValuesAllowed(TransferwiseRequirementFieldGroupValuesAllowed valuesAllowed) {
    this.valuesAllowed = valuesAllowed;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.key != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.name != null) {
      return false;
    }

    if (this.refreshRequirementsOnChange != null) {
      return false;
    }

    if (this.required != null) {
      return false;
    }

    if (this.displayFormat != null) {
      return false;
    }

    if (this.example != null) {
      return false;
    }

    if (this.minLength != null) {
      return false;
    }

    if (this.maxLength != null) {
      return false;
    }

    if (this.validationRegexp != null) {
      return false;
    }

    if (this.validationAsync != null) {
      return false;
    }

    if (this.valuesAllowed != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TransferwiseRequirementFieldGroup fromJsonReader(JsonReader reader) {
    return fromJsonReader(TransferwiseRequirementFieldGroup.class, reader);
  }

}
