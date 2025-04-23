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
 * Endpoint to retrieve point mutation.
 */
public class PointMutationApiObject extends BunqModel {

  /**
   * The number of points earned.
   */
  @Expose
  @SerializedName("number_of_point")
  private Integer numberOfPoint;

  /**
   * The number of points earned.
   */
  public Integer getNumberOfPoint() {
    return this.numberOfPoint;
  }

  public void setNumberOfPoint(Integer numberOfPoint) {
    this.numberOfPoint = numberOfPoint;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.numberOfPoint != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PointMutationApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PointMutationApiObject.class, reader);
  }

}
