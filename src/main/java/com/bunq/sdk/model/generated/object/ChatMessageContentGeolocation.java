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
public class ChatMessageContentGeolocation extends BunqModel {

  /**
   * A geolocation, using WGS 84 coordinates.
   */
  @Expose
  @SerializedName("geolocation")
  private Geolocation geolocation;

  /**
   * A geolocation, using WGS 84 coordinates.
   */
  public Geolocation getGeolocation() {
    return this.geolocation;
  }

  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.geolocation != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ChatMessageContentGeolocation fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatMessageContentGeolocation.class, reader);
  }

}
