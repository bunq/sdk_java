package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 */
public class PermittedDevice extends BunqModel {

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

}
