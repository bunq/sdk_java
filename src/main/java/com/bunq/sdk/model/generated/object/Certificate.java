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
public class Certificate extends BunqModel {

  /**
   * A single certificate in the chain in .PEM format.
   */
  @Expose
  @SerializedName("certificate")
  private String certificate;

  /**
   * A single certificate in the chain in .PEM format.
   */
  @Expose
  @SerializedName("certificate_field_for_request")
  private String certificateFieldForRequest;

  public Certificate() {
  this(null);
  }

  public Certificate(String certificate) {
    this.certificateFieldForRequest = certificate;
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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.certificate != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Certificate fromJsonReader(JsonReader reader) {
    return fromJsonReader(Certificate.class, reader);
  }

}
