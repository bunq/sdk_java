package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.endpoint.DraftPaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.RequestResponseApiObject;
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
public class WhitelistResultViewAnchoredObjectObject extends BunqModel {

  /**
   * The ID of the whitelist entry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The RequestResponse object
   */
  @Expose
  @SerializedName("requestResponse")
  private RequestResponseApiObject requestResponse;

  /**
   * The DraftPayment object
   */
  @Expose
  @SerializedName("draftPayment")
  private DraftPaymentApiObject draftPayment;

  /**
   * The ID of the whitelist entry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The RequestResponse object
   */
  public RequestResponseApiObject getRequestResponse() {
    return this.requestResponse;
  }

  public void setRequestResponse(RequestResponseApiObject requestResponse) {
    this.requestResponse = requestResponse;
  }

  /**
   * The DraftPayment object
   */
  public DraftPaymentApiObject getDraftPayment() {
    return this.draftPayment;
  }

  public void setDraftPayment(DraftPaymentApiObject draftPayment) {
    this.draftPayment = draftPayment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.requestResponse != null) {
      return false;
    }

    if (this.draftPayment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static WhitelistResultViewAnchoredObjectObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(WhitelistResultViewAnchoredObjectObject.class, reader);
  }

}
