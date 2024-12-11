package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Endpoint for reading Ginmon transactions.
 */
public class GinmonTransaction extends BunqModel {

  /**
   * The status of the transaction.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The status of the transaction.
   */
  @Expose
  @SerializedName("status_description")
  private String statusDescription;

  /**
   * The translated status of the transaction.
   */
  @Expose
  @SerializedName("status_description_translated")
  private String statusDescriptionTranslated;

  /**
   * The final amount the user will pay or receive.
   */
  @Expose
  @SerializedName("amount_billing")
  private Amount amountBilling;

  /**
   * The estimated amount the user will pay or receive.
   */
  @Expose
  @SerializedName("amount_billing_original")
  private Amount amountBillingOriginal;

  /**
   * The ISIN of the security.
   */
  @Expose
  @SerializedName("isin")
  private String isin;

  /**
   * External identifier of this order at Ginmon.
   */
  @Expose
  @SerializedName("external_identifier")
  private String externalIdentifier;

  /**
   * The label of the user.
   */
  @Expose
  @SerializedName("label_user")
  private LabelUser labelUser;

  /**
   * The label of the monetary account.
   */
  @Expose
  @SerializedName("label_monetary_account")
  private LabelMonetaryAccount labelMonetaryAccount;

  /**
   * The label of the counter monetary account.
   */
  @Expose
  @SerializedName("counter_label_monetary_account")
  private LabelMonetaryAccount counterLabelMonetaryAccount;

  /**
   * The id of the event of transaction.
   */
  @Expose
  @SerializedName("event_id")
  private Integer eventId;

  /**
   * The status of the transaction.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The status of the transaction.
   */
  public String getStatusDescription() {
    return this.statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  /**
   * The translated status of the transaction.
   */
  public String getStatusDescriptionTranslated() {
    return this.statusDescriptionTranslated;
  }

  public void setStatusDescriptionTranslated(String statusDescriptionTranslated) {
    this.statusDescriptionTranslated = statusDescriptionTranslated;
  }

  /**
   * The final amount the user will pay or receive.
   */
  public Amount getAmountBilling() {
    return this.amountBilling;
  }

  public void setAmountBilling(Amount amountBilling) {
    this.amountBilling = amountBilling;
  }

  /**
   * The estimated amount the user will pay or receive.
   */
  public Amount getAmountBillingOriginal() {
    return this.amountBillingOriginal;
  }

  public void setAmountBillingOriginal(Amount amountBillingOriginal) {
    this.amountBillingOriginal = amountBillingOriginal;
  }

  /**
   * The ISIN of the security.
   */
  public String getIsin() {
    return this.isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  /**
   * External identifier of this order at Ginmon.
   */
  public String getExternalIdentifier() {
    return this.externalIdentifier;
  }

  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  /**
   * The label of the user.
   */
  public LabelUser getLabelUser() {
    return this.labelUser;
  }

  public void setLabelUser(LabelUser labelUser) {
    this.labelUser = labelUser;
  }

  /**
   * The label of the monetary account.
   */
  public LabelMonetaryAccount getLabelMonetaryAccount() {
    return this.labelMonetaryAccount;
  }

  public void setLabelMonetaryAccount(LabelMonetaryAccount labelMonetaryAccount) {
    this.labelMonetaryAccount = labelMonetaryAccount;
  }

  /**
   * The label of the counter monetary account.
   */
  public LabelMonetaryAccount getCounterLabelMonetaryAccount() {
    return this.counterLabelMonetaryAccount;
  }

  public void setCounterLabelMonetaryAccount(LabelMonetaryAccount counterLabelMonetaryAccount) {
    this.counterLabelMonetaryAccount = counterLabelMonetaryAccount;
  }

  /**
   * The id of the event of transaction.
   */
  public Integer getEventId() {
    return this.eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.statusDescription != null) {
      return false;
    }

    if (this.statusDescriptionTranslated != null) {
      return false;
    }

    if (this.amountBilling != null) {
      return false;
    }

    if (this.amountBillingOriginal != null) {
      return false;
    }

    if (this.isin != null) {
      return false;
    }

    if (this.externalIdentifier != null) {
      return false;
    }

    if (this.labelUser != null) {
      return false;
    }

    if (this.labelMonetaryAccount != null) {
      return false;
    }

    if (this.counterLabelMonetaryAccount != null) {
      return false;
    }

    if (this.eventId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static GinmonTransaction fromJsonReader(JsonReader reader) {
    return fromJsonReader(GinmonTransaction.class, reader);
  }

}
