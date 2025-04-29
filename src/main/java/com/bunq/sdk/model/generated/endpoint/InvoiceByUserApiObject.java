package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AddressObject;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.InvoiceItemGroupObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Used to list bunq invoices by user.
 */
public class InvoiceByUserApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/invoice";
  protected static final String ENDPOINT_URL_READ = "user/%s/invoice/%s";

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
  private List<InvoiceItemGroupObject> group;

  /**
   * The total discounted item price including VAT.
   */
  @Expose
  @SerializedName("total_vat_inclusive")
  private AmountObject totalVatInclusive;

  /**
   * The total discounted item price excluding VAT.
   */
  @Expose
  @SerializedName("total_vat_exclusive")
  private AmountObject totalVatExclusive;

  /**
   * The VAT on the total discounted item price.
   */
  @Expose
  @SerializedName("total_vat")
  private AmountObject totalVat;

  /**
   * The label that's displayed to the counterparty with the invoice. Includes user.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The customer's address.
   */
  @Expose
  @SerializedName("address")
  private AddressObject address;

  /**
   * The label of the counterparty of the invoice. Includes user.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

  /**
   * The company's address.
   */
  @Expose
  @SerializedName("counterparty_address")
  private AddressObject counterpartyAddress;

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
   */
  public static BunqResponse<List<InvoiceByUserApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(InvoiceByUserApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<InvoiceByUserApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<InvoiceByUserApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public static BunqResponse<InvoiceByUserApiObject> get(Integer invoiceByUserId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), invoiceByUserId), params, customHeaders);

    return fromJson(InvoiceByUserApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<InvoiceByUserApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<InvoiceByUserApiObject> get(Integer invoiceByUserId) {
    return get(invoiceByUserId, null, null);
  }

  public static BunqResponse<InvoiceByUserApiObject> get(Integer invoiceByUserId, Map<String, String> params) {
    return get(invoiceByUserId, params, null);
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
  public List<InvoiceItemGroupObject> getGroup() {
    return this.group;
  }

  public void setGroup(List<InvoiceItemGroupObject> group) {
    this.group = group;
  }

  /**
   * The total discounted item price including VAT.
   */
  public AmountObject getTotalVatInclusive() {
    return this.totalVatInclusive;
  }

  public void setTotalVatInclusive(AmountObject totalVatInclusive) {
    this.totalVatInclusive = totalVatInclusive;
  }

  /**
   * The total discounted item price excluding VAT.
   */
  public AmountObject getTotalVatExclusive() {
    return this.totalVatExclusive;
  }

  public void setTotalVatExclusive(AmountObject totalVatExclusive) {
    this.totalVatExclusive = totalVatExclusive;
  }

  /**
   * The VAT on the total discounted item price.
   */
  public AmountObject getTotalVat() {
    return this.totalVat;
  }

  public void setTotalVat(AmountObject totalVat) {
    this.totalVat = totalVat;
  }

  /**
   * The label that's displayed to the counterparty with the invoice. Includes user.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The customer's address.
   */
  public AddressObject getAddress() {
    return this.address;
  }

  public void setAddress(AddressObject address) {
    this.address = address;
  }

  /**
   * The label of the counterparty of the invoice. Includes user.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The company's address.
   */
  public AddressObject getCounterpartyAddress() {
    return this.counterpartyAddress;
  }

  public void setCounterpartyAddress(AddressObject counterpartyAddress) {
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

    return true;
  }

  /**
   */
  public static InvoiceByUserApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(InvoiceByUserApiObject.class, reader);
  }

}
