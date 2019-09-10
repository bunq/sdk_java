package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.math.BigDecimal;

/**
 *
 */
public class InvoiceItem extends BunqModel {

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
    private Amount unitVatExclusive;

    /**
     * The unit item price including VAT.
     */
    @Expose
    @SerializedName("unit_vat_inclusive")
    private Amount unitVatInclusive;

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
    private Amount totalVatExclusive;

    /**
     * The item price including VAT.
     */
    @Expose
    @SerializedName("total_vat_inclusive")
    private Amount totalVatInclusive;

    /**
     *
     */
    public static InvoiceItem fromJsonReader(JsonReader reader) {
        return fromJsonReader(InvoiceItem.class, reader);
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
    public Amount getUnitVatExclusive() {
        return this.unitVatExclusive;
    }

    public void setUnitVatExclusive(Amount unitVatExclusive) {
        this.unitVatExclusive = unitVatExclusive;
    }

    /**
     * The unit item price including VAT.
     */
    public Amount getUnitVatInclusive() {
        return this.unitVatInclusive;
    }

    public void setUnitVatInclusive(Amount unitVatInclusive) {
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
    public Amount getTotalVatExclusive() {
        return this.totalVatExclusive;
    }

    public void setTotalVatExclusive(Amount totalVatExclusive) {
        this.totalVatExclusive = totalVatExclusive;
    }

    /**
     * The item price including VAT.
     */
    public Amount getTotalVatInclusive() {
        return this.totalVatInclusive;
    }

    public void setTotalVatInclusive(Amount totalVatInclusive) {
        this.totalVatInclusive = totalVatInclusive;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
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

}
