package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.InvoiceItemGroup;
import com.bunq.sdk.model.generated.object.RequestInquiryReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Used to view a bunq invoice.
 */
public class Invoice extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/invoice";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/invoice/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_EXTERNAL_URL = "external_url";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Invoice";

  /**
   * The id of the invoice object.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the invoice object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the invoice object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The invoice date.
   */
  @Expose
  @SerializedName("invoice_date")
  private String invoiceDate;

  /**
   * The invoice number.
   */
  @Expose
  @SerializedName("invoice_number")
  private String invoiceNumber;

  /**
   * The invoice status.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The invoice item groups.
   */
  @Expose
  @SerializedName("group")
  private List<InvoiceItemGroup> group;

  /**
   * The total discounted item price including VAT.
   */
  @Expose
  @SerializedName("total_vat_inclusive")
  private Amount totalVatInclusive;

  /**
   * The total discounted item price excluding VAT.
   */
  @Expose
  @SerializedName("total_vat_exclusive")
  private Amount totalVatExclusive;

  /**
   * The VAT on the total discounted item price.
   */
  @Expose
  @SerializedName("total_vat")
  private Amount totalVat;

  /**
   * The label that's displayed to the counterparty with the invoice. Includes user.
   */
  @Expose
  @SerializedName("alias")
  private MonetaryAccountReference alias;

  /**
   * The customer's address.
   */
  @Expose
  @SerializedName("address")
  private Address address;

  /**
   * The label of the counterparty of the invoice. Includes user.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private MonetaryAccountReference counterpartyAlias;

  /**
   * The company's address.
   */
  @Expose
  @SerializedName("counterparty_address")
  private Address counterpartyAddress;

  /**
   * The company's chamber of commerce number.
   */
  @Expose
  @SerializedName("chamber_of_commerce_number")
  private String chamberOfCommerceNumber;

  /**
   * The company's chamber of commerce number.
   */
  @Expose
  @SerializedName("vat_number")
  private String vatNumber;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /**
   */
  public static BunqResponse<List<Invoice>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(Invoice.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<Invoice>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<Invoice>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<Invoice>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<Invoice> get(Integer invoiceId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), invoiceId), params, customHeaders);

    return fromJson(Invoice.class, responseRaw, OBJECT_TYPE_GET);
  }
  public static BunqResponse<Invoice> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<Invoice> get(Integer invoiceId) {
    return get(invoiceId, null, null, null);
  }

  public static BunqResponse<Invoice> get(Integer invoiceId, Integer monetaryAccountId) {
    return get(invoiceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Invoice> get(Integer invoiceId, Integer monetaryAccountId, Map<String, String> params) {
    return get(invoiceId, monetaryAccountId, params, null);
  }

  /**
   * The id of the invoice object.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the invoice object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the invoice object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The invoice date.
   */
  public String getInvoiceDate() {
    return this.invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  /**
   * The invoice number.
   */
  public String getInvoiceNumber() {
    return this.invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  /**
   * The invoice status.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The invoice item groups.
   */
  public List<InvoiceItemGroup> getGroup() {
    return this.group;
  }

  public void setGroup(List<InvoiceItemGroup> group) {
    this.group = group;
  }

  /**
   * The total discounted item price including VAT.
   */
  public Amount getTotalVatInclusive() {
    return this.totalVatInclusive;
  }

  public void setTotalVatInclusive(Amount totalVatInclusive) {
    this.totalVatInclusive = totalVatInclusive;
  }

  /**
   * The total discounted item price excluding VAT.
   */
  public Amount getTotalVatExclusive() {
    return this.totalVatExclusive;
  }

  public void setTotalVatExclusive(Amount totalVatExclusive) {
    this.totalVatExclusive = totalVatExclusive;
  }

  /**
   * The VAT on the total discounted item price.
   */
  public Amount getTotalVat() {
    return this.totalVat;
  }

  public void setTotalVat(Amount totalVat) {
    this.totalVat = totalVat;
  }

  /**
   * The label that's displayed to the counterparty with the invoice. Includes user.
   */
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The customer's address.
   */
  public Address getAddress() {
    return this.address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * The label of the counterparty of the invoice. Includes user.
   */
  public MonetaryAccountReference getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(MonetaryAccountReference counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The company's address.
   */
  public Address getCounterpartyAddress() {
    return this.counterpartyAddress;
  }

  public void setCounterpartyAddress(Address counterpartyAddress) {
    this.counterpartyAddress = counterpartyAddress;
  }

  /**
   * The company's chamber of commerce number.
   */
  public String getChamberOfCommerceNumber() {
    return this.chamberOfCommerceNumber;
  }

  public void setChamberOfCommerceNumber(String chamberOfCommerceNumber) {
    this.chamberOfCommerceNumber = chamberOfCommerceNumber;
  }

  /**
   * The company's chamber of commerce number.
   */
  public String getVatNumber() {
    return this.vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  public List<RequestInquiryReference> getRequestReferenceSplitTheBill() {
    return this.requestReferenceSplitTheBill;
  }

  public void setRequestReferenceSplitTheBill(List<RequestInquiryReference> requestReferenceSplitTheBill) {
    this.requestReferenceSplitTheBill = requestReferenceSplitTheBill;
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

    if (this.invoiceDate != null) {
      return false;
    }

    if (this.invoiceNumber != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.group != null) {
      return false;
    }

    if (this.totalVatInclusive != null) {
      return false;
    }

    if (this.totalVatExclusive != null) {
      return false;
    }

    if (this.totalVat != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.address != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.counterpartyAddress != null) {
      return false;
    }

    if (this.chamberOfCommerceNumber != null) {
      return false;
    }

    if (this.vatNumber != null) {
      return false;
    }

    if (this.requestReferenceSplitTheBill != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Invoice fromJsonReader(JsonReader reader) {
    return fromJsonReader(Invoice.class, reader);
  }

}
