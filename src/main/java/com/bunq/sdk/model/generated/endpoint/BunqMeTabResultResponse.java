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
 * Used to view bunq.me TabResultResponse objects belonging to a tab. A TabResultResponse is an
 * object that holds details on a tab which has been paid from the provided monetary account.
 */
public class BunqMeTabResultResponse extends BunqModel {

  /**
   * Object type.
   */

  /**
   * The payment made for the bunq.me tab.
   */
  @Expose
  @SerializedName("payment")
  private Payment payment;

  /**
   * The payment made for the bunq.me tab.
   */
  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.payment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeTabResultResponse fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeTabResultResponse.class, reader);
  }

}
