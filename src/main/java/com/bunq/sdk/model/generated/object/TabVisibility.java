package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class TabVisibility extends BunqModel {

    /**
     * When true the tab will be linked to the ACTIVE cash registers QR code.
     */
    @Expose
    @SerializedName("cash_register_qr_code")
    private Boolean cashRegisterQrCode;

    /**
     * When true the tab will be visible through its own QR code. Use
     * ../tab/{tab-id}/qr-code-content to get the raw content of this QR code
     */
    @Expose
    @SerializedName("tab_qr_code")
    private Boolean tabQrCode;

    /**
     * The location of the Tab in NearPay.
     */
    @Expose
    @SerializedName("location")
    private Geolocation location;

    /**
     * When true the Tab will be linked to the ACTIVE cash registers QR code. If no cash register QR
     * code exists, one will be created.
     */
    @Expose
    @SerializedName("cash_register_qr_code_field_for_request")
    private Boolean cashRegisterQrCodeFieldForRequest;

    /**
     * When true the Tab will be visible through its own QR code. Use
     * ../tab/{tab-id}/qr-code-content to get the raw content of this QR code
     */
    @Expose
    @SerializedName("tab_qr_code_field_for_request")
    private Boolean tabQrCodeFieldForRequest;

    /**
     * The location on which this tab will be made visible in NearPay. This location must overlap
     * with the location of the CashRegister. If no location is provided the location of the
     * CashRegister will be used.
     */
    @Expose
    @SerializedName("location_field_for_request")
    private Geolocation locationFieldForRequest;

    public TabVisibility() {
        this(null, null, null);
    }

    public TabVisibility(Boolean cashRegisterQrCode) {
        this(cashRegisterQrCode, null, null);
    }

    public TabVisibility(Boolean cashRegisterQrCode, Boolean tabQrCode) {
        this(cashRegisterQrCode, tabQrCode, null);
    }

    public TabVisibility(Boolean cashRegisterQrCode, Boolean tabQrCode, Geolocation location) {
        this.cashRegisterQrCodeFieldForRequest = cashRegisterQrCode;
        this.tabQrCodeFieldForRequest = tabQrCode;
        this.locationFieldForRequest = location;
    }

    /**
     *
     */
    public static TabVisibility fromJsonReader(JsonReader reader) {
        return fromJsonReader(TabVisibility.class, reader);
    }

    /**
     * When true the tab will be linked to the ACTIVE cash registers QR code.
     */
    public Boolean getCashRegisterQrCode() {
        return this.cashRegisterQrCode;
    }

    public void setCashRegisterQrCode(Boolean cashRegisterQrCode) {
        this.cashRegisterQrCode = cashRegisterQrCode;
    }

    /**
     * When true the tab will be visible through its own QR code. Use
     * ../tab/{tab-id}/qr-code-content to get the raw content of this QR code
     */
    public Boolean getTabQrCode() {
        return this.tabQrCode;
    }

    public void setTabQrCode(Boolean tabQrCode) {
        this.tabQrCode = tabQrCode;
    }

    /**
     * The location of the Tab in NearPay.
     */
    public Geolocation getLocation() {
        return this.location;
    }

    public void setLocation(Geolocation location) {
        this.location = location;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.cashRegisterQrCode != null) {
            return false;
        }

        if (this.tabQrCode != null) {
            return false;
        }

        if (this.location != null) {
            return false;
        }

        return true;
    }

}
