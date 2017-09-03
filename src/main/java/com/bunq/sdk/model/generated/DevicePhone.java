package com.bunq.sdk.model.generated;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Used to register a device. This is the only unsigned/verified request.
 */
public class DevicePhone extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_PHONE_NUMBER = "phone_number";
  public static final String FIELD_REMOVE_OLD_DEVICES = "remove_old_devices";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "DevicePhone";

  /**
   * The id of the DevicePhone as created on the server.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the DevicePhone's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the DevicePhone's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The description of the DevicePhone.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The phone number used to register the DevicePhone.
   */
  @Expose
  @SerializedName("phone_number")
  private String phoneNumber;

  /**
   * The operating system running on this phone.
   */
  @Expose
  @SerializedName("os")
  private String os;

  /**
   * The status of the DevicePhone.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The id of the DevicePhone as created on the server.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the DevicePhone's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the DevicePhone's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The description of the DevicePhone.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The phone number used to register the DevicePhone.
   */
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * The operating system running on this phone.
   */
  public String getOs() {
    return this.os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  /**
   * The status of the DevicePhone.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
