package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;

/**
 *
 */
public class InvoiceItemGroup extends BunqModel {

    /**
     * The type of the invoice item group.
     */
    @Expose
    @SerializedName("type")
    private String type;

    /**
     * The description of the type of the invoice item group.
     */
    @Expose
    @SerializedName("type_description")
    private String typeDescription;

    /**
     * The translated description of the type of the invoice item group.
     */
    @Expose
    @SerializedName("type_description_translated")
    private String typeDescriptionTranslated;

    /**
     * The identifier of the invoice item group.
     */
    @Expose
    @SerializedName("instance_description")
    private String instanceDescription;

    /**
     * The unit item price excluding VAT.
     */
    @Expose
    @SerializedName("product_vat_exclusive")
    private Amount productVatExclusive;

    /**
     * The unit item price including VAT.
     */
    @Expose
    @SerializedName("product_vat_inclusive")
    private Amount productVatInclusive;

    /**
     * The invoice items in the group.
     */
    @Expose
    @SerializedName("item")
    private List<InvoiceItem> item;

    /**
     *
     */
    public static InvoiceItemGroup fromJsonReader(JsonReader reader) {
        return fromJsonReader(InvoiceItemGroup.class, reader);
    }

    /**
     * The type of the invoice item group.
     */
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The description of the type of the invoice item group.
     */
    public String getTypeDescription() {
        return this.typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    /**
     * The translated description of the type of the invoice item group.
     */
    public String getTypeDescriptionTranslated() {
        return this.typeDescriptionTranslated;
    }

    public void setTypeDescriptionTranslated(String typeDescriptionTranslated) {
        this.typeDescriptionTranslated = typeDescriptionTranslated;
    }

    /**
     * The identifier of the invoice item group.
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public void setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
    }

    /**
     * The unit item price excluding VAT.
     */
    public Amount getProductVatExclusive() {
        return this.productVatExclusive;
    }

    public void setProductVatExclusive(Amount productVatExclusive) {
        this.productVatExclusive = productVatExclusive;
    }

    /**
     * The unit item price including VAT.
     */
    public Amount getProductVatInclusive() {
        return this.productVatInclusive;
    }

    public void setProductVatInclusive(Amount productVatInclusive) {
        this.productVatInclusive = productVatInclusive;
    }

    /**
     * The invoice items in the group.
     */
    public List<InvoiceItem> getItem() {
        return this.item;
    }

    public void setItem(List<InvoiceItem> item) {
        this.item = item;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.type != null) {
            return false;
        }

        if (this.typeDescription != null) {
            return false;
        }

        if (this.typeDescriptionTranslated != null) {
            return false;
        }

        if (this.instanceDescription != null) {
            return false;
        }

        if (this.productVatExclusive != null) {
            return false;
        }

        if (this.productVatInclusive != null) {
            return false;
        }

        if (this.item != null) {
            return false;
        }

        return true;
    }

}
