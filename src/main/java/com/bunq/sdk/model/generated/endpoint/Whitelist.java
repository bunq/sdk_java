package com.bunq.sdk.model.generated.endpoint;

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
 * Whitelist a Request so that when one comes in, it is automatically accepted.
 */
public class Whitelist extends BunqModel {

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static Whitelist fromJsonReader(JsonReader reader) {
    return fromJsonReader(Whitelist.class, reader);
  }

}
