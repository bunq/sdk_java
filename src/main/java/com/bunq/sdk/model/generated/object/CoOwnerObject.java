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
public class CoOwnerObject extends BunqModel {

  /**
   * The Alias of the co-owner.
   */
  @Expose
  @SerializedName("alias")
  private LabelUserObject alias;

  /**
   * Can be: ACCEPTED, REJECTED, PENDING or REVOKED
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The users the account will be joint with.
   */
  @Expose
  @SerializedName("alias_field_for_request")
  private PointerObject aliasFieldForRequest;

  public CoOwnerObject() {
  this(null);
  }

  public CoOwnerObject(PointerObject alias) {
    this.aliasFieldForRequest = alias;
  }

  /**
   * The Alias of the co-owner.
   */
  public LabelUserObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelUserObject alias) {
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
  public static CoOwnerObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CoOwnerObject.class, reader);
  }

}
