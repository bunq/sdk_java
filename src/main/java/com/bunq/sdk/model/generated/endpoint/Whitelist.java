package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

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
