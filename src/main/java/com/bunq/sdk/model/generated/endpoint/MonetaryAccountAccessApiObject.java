package com.bunq.sdk.model.generated.endpoint;

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
 * You can use MonetaryAccountAccess to retrieve all MonetaryAccountAccessModels for the given
 * MonetaryAccount
 */
public class MonetaryAccountAccessApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_ACCESS_TYPE = "access_type";

  /**
   * The access type of the monetary account access.
   */
  @Expose
  @SerializedName("access_type")
  private String accessType;

  /**
   * The access type of the monetary account access.
   */
  @Expose
  @SerializedName("access_type_field_for_request")
  private String accessTypeFieldForRequest;

  public MonetaryAccountAccessApiObject() {
  this(null);
  }

  public MonetaryAccountAccessApiObject(String accessType) {
    this.accessTypeFieldForRequest = accessType;
  }

  /**
   * The access type of the monetary account access.
   */
  public String getAccessType() {
    return this.accessType;
  }

  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.accessType != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountAccessApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountAccessApiObject.class, reader);
  }

}
