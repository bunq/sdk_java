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
 * Endpoint for getting information fulfillments for a user.
 */
public class Fulfillment extends BunqModel {

  /**
   * Type of the information fulfillment.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The reason why this fulfillment is requested.
   */
  @Expose
  @SerializedName("reason")
  private String reason;

  /**
   * The translated reason why this fulfillment is requested.
   */
  @Expose
  @SerializedName("reason_translated")
  private String reasonTranslated;

  /**
   * Status of this fulfillment.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * Time when the information fulfillment becomes mandatory.
   */
  @Expose
  @SerializedName("time_mandatory")
  private String timeMandatory;

  /**
   * The user id this fulfillment is required for.
   */
  @Expose
  @SerializedName("user_id")
  private Integer userId;

  /**
   * The allowed statusses for this fulfillment.
   */
  @Expose
  @SerializedName("all_status_allowed")
  private List<String> allStatusAllowed;

  /**
   * Type of the information fulfillment.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The reason why this fulfillment is requested.
   */
  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The translated reason why this fulfillment is requested.
   */
  public String getReasonTranslated() {
    return this.reasonTranslated;
  }

  public void setReasonTranslated(String reasonTranslated) {
    this.reasonTranslated = reasonTranslated;
  }

  /**
   * Status of this fulfillment.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Time when the information fulfillment becomes mandatory.
   */
  public String getTimeMandatory() {
    return this.timeMandatory;
  }

  public void setTimeMandatory(String timeMandatory) {
    this.timeMandatory = timeMandatory;
  }

  /**
   * The user id this fulfillment is required for.
   */
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The allowed statusses for this fulfillment.
   */
  public List<String> getAllStatusAllowed() {
    return this.allStatusAllowed;
  }

  public void setAllStatusAllowed(List<String> allStatusAllowed) {
    this.allStatusAllowed = allStatusAllowed;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.type != null) {
      return false;
    }

    if (this.reason != null) {
      return false;
    }

    if (this.reasonTranslated != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.timeMandatory != null) {
      return false;
    }

    if (this.userId != null) {
      return false;
    }

    if (this.allStatusAllowed != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Fulfillment fromJsonReader(JsonReader reader) {
    return fromJsonReader(Fulfillment.class, reader);
  }

}
