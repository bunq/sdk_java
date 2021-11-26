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
public class TabAttachment extends BunqModel {

  /**
   * The ID of the AttachmentTab you want to attach to the TabItem.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Integer idFieldForRequest;

  public TabAttachment() {
  this(null);
  }

  public TabAttachment(Integer id) {
    this.idFieldForRequest = id;
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static TabAttachment fromJsonReader(JsonReader reader) {
    return fromJsonReader(TabAttachment.class, reader);
  }

}
