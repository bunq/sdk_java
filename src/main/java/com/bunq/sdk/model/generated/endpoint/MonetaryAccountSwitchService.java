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
 * View for MonetaryAccountSwitchService
 */
public class MonetaryAccountSwitchService extends BunqModel {

  /**
   * The id of the monetary account.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the monetary account's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The description for the bank account.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status of the account.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the account.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The id of the monetary account.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the monetary account's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The description for the bank account.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The status of the account.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the account.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountSwitchService fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountSwitchService.class, reader);
  }

}
