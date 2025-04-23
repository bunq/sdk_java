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
public class TransferwiseRequirementFieldObject extends BunqModel {

  /**
   * The descriptive label of the field.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The field group.
   */
  @Expose
  @SerializedName("group")
  private TransferwiseRequirementFieldGroupObject group;

  /**
   * The name of the required field.
   */
  @Expose
  @SerializedName("key_field_for_request")
  private String keyFieldForRequest;

  /**
   * The value of the required field.
   */
  @Expose
  @SerializedName("value_field_for_request")
  private String valueFieldForRequest;

  public TransferwiseRequirementFieldObject() {
  this(null, null);
  }

  public TransferwiseRequirementFieldObject(String key) {
  this(key, null);
  }

  public TransferwiseRequirementFieldObject(String key, String value) {
    this.keyFieldForRequest = key;
    this.valueFieldForRequest = value;
  }

  /**
   * The descriptive label of the field.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The field group.
   */
  public TransferwiseRequirementFieldGroupObject getGroup() {
    return this.group;
  }

  public void setGroup(TransferwiseRequirementFieldGroupObject group) {
    this.group = group;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.name != null) {
      return false;
    }

    if (this.group != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TransferwiseRequirementFieldObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(TransferwiseRequirementFieldObject.class, reader);
  }

}
