package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.PaymentArrivalExpected;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Payments that are not processed yet.
 */
public class PaymentDelayedIncoming extends BunqModel {

  /**
   * The status of the delayed payment.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The id of the monetary account.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The amount of the payment.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * payment.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the payment.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /**
   * The description of the payment.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * Information about the expected arrival of the payment.
   */
  @Expose
  @SerializedName("payment_arrival_expected")
  private PaymentArrivalExpected paymentArrivalExpected;

  /**
   * The resulting payment, only when it’s successful.
   */
  @Expose
  @SerializedName("payment_result")
  private Payment paymentResult;

  /**
   * The status of the delayed payment.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The id of the monetary account.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The amount of the payment.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * payment.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the payment.
   */
  public LabelMonetaryAccount getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The description of the payment.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Information about the expected arrival of the payment.
   */
  public PaymentArrivalExpected getPaymentArrivalExpected() {
    return this.paymentArrivalExpected;
  }

  public void setPaymentArrivalExpected(PaymentArrivalExpected paymentArrivalExpected) {
    this.paymentArrivalExpected = paymentArrivalExpected;
  }

  /**
   * The resulting payment, only when it’s successful.
   */
  public Payment getPaymentResult() {
    return this.paymentResult;
  }

  public void setPaymentResult(Payment paymentResult) {
    this.paymentResult = paymentResult;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.paymentArrivalExpected != null) {
      return false;
    }

    if (this.paymentResult != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentDelayedIncoming fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentDelayedIncoming.class, reader);
  }

}
