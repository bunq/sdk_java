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
public class HealthCheckResultObject extends BunqModel {

  /**
   * The result status of the health check.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The entries on which the current status is based.
   */
  @Expose
  @SerializedName("allEntry")
  private List<HealthCheckResultEntryObject> allEntry;

  /**
   * The result status of the health check.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The entries on which the current status is based.
   */
  public List<HealthCheckResultEntryObject> getAllEntry() {
    return this.allEntry;
  }

  public void setAllEntry(List<HealthCheckResultEntryObject> allEntry) {
    this.allEntry = allEntry;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.allEntry != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static HealthCheckResultObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(HealthCheckResultObject.class, reader);
  }

}
