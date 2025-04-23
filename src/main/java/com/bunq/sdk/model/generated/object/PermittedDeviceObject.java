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
public class PermittedDeviceObject extends BunqModel {

  /**
   * The description of the device that may use the credential.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The IP address of the device that may use the credential.
   */
  @Expose
  @SerializedName("ip")
  private String ip;

  /**
   * The description of the device that may use the credential.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The IP address of the device that may use the credential.
   */
  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.description != null) {
      return false;
    }

    if (this.ip != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PermittedDeviceObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PermittedDeviceObject.class, reader);
  }

}
