package com.bunq.sdk.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BunqUtil {
    public static <T> T getValueFromMapOrDefault(Map<String, T> map, String key, T defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    public static List<String> getChunksFromString(String stringToSplit, int chunkSize) {
        List<String> chunkList = new ArrayList<>();

        int chunkAmount = (int) Math.ceil(stringToSplit.length() / chunkSize);
        for (int chunk = 0; chunk <= chunkAmount; chunk++) {
            int startIndex = chunk * chunkSize;
            int endIndex = startIndex + chunkSize;
            endIndex = Math.min(stringToSplit.length(), endIndex);

            chunkList.add(stringToSplit.substring(startIndex, endIndex));
        }

        return chunkList;
    }
}
