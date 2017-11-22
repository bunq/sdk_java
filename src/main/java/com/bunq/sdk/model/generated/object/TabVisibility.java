package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

  /**
   */
  public boolean areAllFieldNull() {
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
