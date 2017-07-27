package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
