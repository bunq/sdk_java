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
 * Used to view bunq.me TabResultInquiry objects belonging to a tab. A TabResultInquiry is an
 * object that holds details on both the tab and a single payment made for that tab.
 */
public class BunqMeTabResultInquiryApiObject extends BunqModel {

  /**
   * The payment made for the Tab.
   */
  @Expose
  @SerializedName("payment")
  private PaymentApiObject payment;

  /**
   * The Id of the bunq.me tab that this BunqMeTabResultInquiry belongs to.
   */
  @Expose
  @SerializedName("bunq_me_tab_id")
  private Integer bunqMeTabId;

  /**
   * The payment made for the Tab.
   */
  public PaymentApiObject getPayment() {
    return this.payment;
  }

  public void setPayment(PaymentApiObject payment) {
    this.payment = payment;
  }

  /**
   * The Id of the bunq.me tab that this BunqMeTabResultInquiry belongs to.
   */
  public Integer getBunqMeTabId() {
    return this.bunqMeTabId;
  }

  public void setBunqMeTabId(Integer bunqMeTabId) {
    this.bunqMeTabId = bunqMeTabId;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.payment != null) {
      return false;
    }

    if (this.bunqMeTabId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeTabResultInquiryApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeTabResultInquiryApiObject.class, reader);
  }

}
