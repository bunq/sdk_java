package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to view bunq.me TabResultInquiry objects belonging to a tab. A TabResultInquiry is an
 * object that holds details on both the tab and a single payment made for that tab.
 */
public class BunqMeTabResultInquiry extends BunqModel {

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "BunqMeTabResultInquiry";

  /**
   * The payment made for the Tab.
   */
  @Expose
  @SerializedName("payment")
  private Payment payment;

  /**
   * The payment made for the Tab.
   */
  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

}
