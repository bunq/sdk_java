package com.bunq.sdk.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpUtil {
    /**
     * Query constants.
     */
    protected static final String QUERY_FORMAT = "%s=%s";
    protected static final String QUERY_DELIMITER = "&";

    /**
     */
    public static String createQueryString(Map<String, String> allParameter) {
        List<String> encodedParameters = new ArrayList<>();

        for (Map.Entry<String, String> parameter : allParameter.entrySet()) {
            encodedParameters.add(String.format(QUERY_FORMAT, parameter.getKey(), parameter.getValue()));
        }

        return String.join(QUERY_DELIMITER, encodedParameters);
    }
}
