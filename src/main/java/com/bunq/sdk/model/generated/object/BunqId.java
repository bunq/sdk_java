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
public class BunqId extends BunqModel {

  /**
   * An integer ID of an object. Unique per object type.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public BunqId(Integer id) {
    this.id = id;
  }

  /**
   * An integer ID of an object. Unique per object type.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqId fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqId.class, reader);
  }

}
