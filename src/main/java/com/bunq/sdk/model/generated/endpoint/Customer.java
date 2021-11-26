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
 * Used to view a customer.
 */
public class Customer extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_BILLING_ACCOUNT_ID = "billing_account_id";
  public static final String FIELD_INVOICE_NOTIFICATION_PREFERENCE = "invoice_notification_preference";

  /**
   * The id of the customer.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the customer object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the customer object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The primary billing account account's id.
   */
  @Expose
  @SerializedName("billing_account_id")
  private String billingAccountId;

  /**
   * The preferred notification type for invoices.
   */
  @Expose
  @SerializedName("invoice_notification_preference")
  private String invoiceNotificationPreference;

  /**
   * The primary billing account account's id.
   */
  @Expose
  @SerializedName("billing_account_id_field_for_request")
  private String billingAccountIdFieldForRequest;

  /**
   * The preferred notification type for invoices
   */
  @Expose
  @SerializedName("invoice_notification_preference_field_for_request")
  private String invoiceNotificationPreferenceFieldForRequest;

  public Customer() {
  this(null, null);
  }

  public Customer(String billingAccountId) {
  this(billingAccountId, null);
  }

  public Customer(String billingAccountId, String invoiceNotificationPreference) {
    this.billingAccountIdFieldForRequest = billingAccountId;
    this.invoiceNotificationPreferenceFieldForRequest = invoiceNotificationPreference;
  }

  /**
   * The id of the customer.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the customer object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the customer object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The primary billing account account's id.
   */
  public String getBillingAccountId() {
    return this.billingAccountId;
  }

  public void setBillingAccountId(String billingAccountId) {
    this.billingAccountId = billingAccountId;
  }

  /**
   * The preferred notification type for invoices.
   */
  public String getInvoiceNotificationPreference() {
    return this.invoiceNotificationPreference;
  }

  public void setInvoiceNotificationPreference(String invoiceNotificationPreference) {
    this.invoiceNotificationPreference = invoiceNotificationPreference;
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

    if (this.updated != null) {
      return false;
    }

    if (this.billingAccountId != null) {
      return false;
    }

    if (this.invoiceNotificationPreference != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Customer fromJsonReader(JsonReader reader) {
    return fromJsonReader(Customer.class, reader);
  }

}
