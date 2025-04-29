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
public class RequestInquiryReferenceObject extends BunqModel {

  /**
   * The type of request inquiry. Can be RequestInquiry or RequestInquiryBatch.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The id of the request inquiry (batch).
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The type of request inquiry. Can be RequestInquiry or RequestInquiryBatch.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The id of the request inquiry (batch).
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
    if (this.type != null) {
      return false;
    }

    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RequestInquiryReferenceObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(RequestInquiryReferenceObject.class, reader);
  }

}
