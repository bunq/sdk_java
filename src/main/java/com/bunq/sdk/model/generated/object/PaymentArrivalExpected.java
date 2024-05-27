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
public class PaymentArrivalExpected extends BunqModel {

  /**
   * Indicates when we expect the payment to arrive.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The time when the payment is expected to arrive.
   */
  @Expose
  @SerializedName("time")
  private String time;

  /**
   * Indicates when we expect the payment to arrive.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The time when the payment is expected to arrive.
   */
  public String getTime() {
    return this.time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.time != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentArrivalExpected fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentArrivalExpected.class, reader);
  }

}
