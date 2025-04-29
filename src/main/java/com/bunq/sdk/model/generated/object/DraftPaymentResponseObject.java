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
public class DraftPaymentResponseObject extends BunqModel {

  /**
   * The status with which was responded.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The user that responded to the DraftPayment.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUserObject userAliasCreated;

  /**
   * The status with which was responded.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The user that responded to the DraftPayment.
   */
  public LabelUserObject getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUserObject userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.userAliasCreated != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static DraftPaymentResponseObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(DraftPaymentResponseObject.class, reader);
  }

}
