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
public class CoOwner extends BunqModel {

  /**
   * The Alias of the co-owner.
   */
  @Expose
  @SerializedName("alias")
  private List<LabelUser> alias;

  /**
   * Can be: ACCEPTED, REJECTED, PENDING or REVOKED
   */
  @Expose
  @SerializedName("status")
  private String status;

  public CoOwner(List<LabelUser> alias) {
    this.alias = alias;
  }

  /**
   * The Alias of the co-owner.
   */
  public List<LabelUser> getAlias() {
    return this.alias;
  }

  public void setAlias(List<LabelUser> alias) {
    this.alias = alias;
  }

  /**
   * Can be: ACCEPTED, REJECTED, PENDING or REVOKED
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.alias != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CoOwner fromJsonReader(JsonReader reader) {
    return fromJsonReader(CoOwner.class, reader);
  }

}
