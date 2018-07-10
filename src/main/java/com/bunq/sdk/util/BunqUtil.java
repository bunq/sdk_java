package com.bunq.sdk.util;

import java.util.Map;

public class BunqUtil {
   public static <T> T getValueFromMapOrDefault(Map<String, T> map, String key, T defaultValue) {
    if (map.containsKey(key)) {
      return map.get(key);
    } else {
      return defaultValue;
    }
  }

}
