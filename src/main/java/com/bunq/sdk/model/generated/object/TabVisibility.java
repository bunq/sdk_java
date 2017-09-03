package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
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

  public TabVisibility(Boolean cashRegisterQrCode, Boolean tabQrCode) {
    this.cashRegisterQrCode = cashRegisterQrCode;
    this.tabQrCode = tabQrCode;
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

}
