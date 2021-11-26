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
public class MasterCardActionReference extends BunqModel {

  /**
   * The id of the event.
   */
  @Expose
  @SerializedName("event_id")
  private Integer eventId;

  /**
   * The id of the event.
   */
  public Integer getEventId() {
    return this.eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.eventId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MasterCardActionReference fromJsonReader(JsonReader reader) {
    return fromJsonReader(MasterCardActionReference.class, reader);
  }

}
