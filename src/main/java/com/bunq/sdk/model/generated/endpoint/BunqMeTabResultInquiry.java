package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 * Used to view bunq.me TabResultInquiry objects belonging to a tab. A TabResultInquiry is an
 * object that holds details on both the tab and a single payment made for that tab.
 */
public class BunqMeTabResultInquiry extends BunqModel {

  /**
   * The payment made for the Tab.
   */
  @Expose
  @SerializedName("payment")
  private Payment payment;

  /**
   * The Id of the bunq.me tab that this BunqMeTabResultInquiry belongs to.
   */
  @Expose
  @SerializedName("bunq_me_tab_id")
  private Integer bunqMeTabId;

  /**
   * The payment made for the Tab.
   */
  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
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
  public static BunqMeTabResultInquiry fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeTabResultInquiry.class, reader);
  }

}
