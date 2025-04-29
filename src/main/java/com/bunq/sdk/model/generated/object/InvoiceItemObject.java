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
public class InvoiceItemObject extends BunqModel {

  /**
   * The id of the invoice item.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The billing date of the item.
   */
  @Expose
  @SerializedName("billing_date")
  private String billingDate;

  /**
   * The price description.
   */
  @Expose
  @SerializedName("type_description")
  private String typeDescription;

  /**
   * The translated price description.
   */
  @Expose
  @SerializedName("type_description_translated")
  private String typeDescriptionTranslated;

  /**
   * The unit item price excluding VAT.
   */
  @Expose
  @SerializedName("unit_vat_exclusive")
  private AmountObject unitVatExclusive;

  /**
   * The unit item price including VAT.
   */
  @Expose
  @SerializedName("unit_vat_inclusive")
  private AmountObject unitVatInclusive;

  /**
   * The VAT tax fraction.
   */
  @Expose
  @SerializedName("vat")
  private BigDecimal vat;

  /**
   * The number of items priced.
   */
  @Expose
  @SerializedName("quantity")
  private BigDecimal quantity;

  /**
   * The item price excluding VAT.
   */
  @Expose
  @SerializedName("total_vat_exclusive")
  private AmountObject totalVatExclusive;

  /**
   * The item price including VAT.
   */
  @Expose
  @SerializedName("total_vat_inclusive")
  private AmountObject totalVatInclusive;

  /**
   * The id of the invoice item.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The billing date of the item.
   */
  public String getBillingDate() {
    return this.billingDate;
  }

  public void setBillingDate(String billingDate) {
    this.billingDate = billingDate;
  }

  /**
   * The price description.
   */
  public String getTypeDescription() {
    return this.typeDescription;
  }

  public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
  }

  /**
   * The translated price description.
   */
  public String getTypeDescriptionTranslated() {
    return this.typeDescriptionTranslated;
  }

  public void setTypeDescriptionTranslated(String typeDescriptionTranslated) {
    this.typeDescriptionTranslated = typeDescriptionTranslated;
  }

  /**
   * The unit item price excluding VAT.
   */
  public AmountObject getUnitVatExclusive() {
    return this.unitVatExclusive;
  }

  public void setUnitVatExclusive(AmountObject unitVatExclusive) {
    this.unitVatExclusive = unitVatExclusive;
  }

  /**
   * The unit item price including VAT.
   */
  public AmountObject getUnitVatInclusive() {
    return this.unitVatInclusive;
  }

  public void setUnitVatInclusive(AmountObject unitVatInclusive) {
    this.unitVatInclusive = unitVatInclusive;
  }

  /**
   * The VAT tax fraction.
   */
  public BigDecimal getVat() {
    return this.vat;
  }

  public void setVat(BigDecimal vat) {
    this.vat = vat;
  }

  /**
   * The number of items priced.
   */
  public BigDecimal getQuantity() {
    return this.quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  /**
   * The item price excluding VAT.
   */
  public AmountObject getTotalVatExclusive() {
    return this.totalVatExclusive;
  }

  public void setTotalVatExclusive(AmountObject totalVatExclusive) {
    this.totalVatExclusive = totalVatExclusive;
  }

  /**
   * The item price including VAT.
   */
  public AmountObject getTotalVatInclusive() {
    return this.totalVatInclusive;
  }

  public void setTotalVatInclusive(AmountObject totalVatInclusive) {
    this.totalVatInclusive = totalVatInclusive;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.billingDate != null) {
      return false;
    }

    if (this.typeDescription != null) {
      return false;
    }

    if (this.typeDescriptionTranslated != null) {
      return false;
    }

    if (this.unitVatExclusive != null) {
      return false;
    }

    if (this.unitVatInclusive != null) {
      return false;
    }

    if (this.vat != null) {
      return false;
    }

    if (this.quantity != null) {
      return false;
    }

    if (this.totalVatExclusive != null) {
      return false;
    }

    if (this.totalVatInclusive != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static InvoiceItemObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(InvoiceItemObject.class, reader);
  }

}
