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
public class HealthCheckResultEntry extends BunqModel {

  /**
   * The type of HealthCheckResultEntry.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The status of the HealthCheckResultEntry
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The type of HealthCheckResultEntry.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The status of the HealthCheckResultEntry
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.type != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static HealthCheckResultEntry fromJsonReader(JsonReader reader) {
    return fromJsonReader(HealthCheckResultEntry.class, reader);
  }

}
