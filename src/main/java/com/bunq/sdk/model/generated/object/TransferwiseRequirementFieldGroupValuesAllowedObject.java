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
public class TransferwiseRequirementFieldGroupValuesAllowedObject extends BunqModel {

  /**
   * The key.
   */
  @Expose
  @SerializedName("key")
  private String key;

  /**
   * The label.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The key.
   */
  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The label.
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
    if (this.key != null) {
      return false;
    }

    if (this.name != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TransferwiseRequirementFieldGroupValuesAllowedObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(TransferwiseRequirementFieldGroupValuesAllowedObject.class, reader);
  }

}
