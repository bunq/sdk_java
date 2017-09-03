package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

}
