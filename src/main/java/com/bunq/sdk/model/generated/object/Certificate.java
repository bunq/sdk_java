package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class Certificate extends BunqModel {

  /**
   * A single certificate in the chain in .PEM format.
   */
  @Expose
  @SerializedName("certificate")
  private String certificate;

  public Certificate(String certificate) {
    this.certificate = certificate;
  }

  /**
   * A single certificate in the chain in .PEM format.
   */
  public String getCertificate() {
    return this.certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

}
