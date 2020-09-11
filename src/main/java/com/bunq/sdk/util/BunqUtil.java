package com.bunq.sdk.util;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.endpoint.UserApiKey;
import com.bunq.sdk.model.generated.endpoint.UserCompany;
import com.bunq.sdk.model.generated.endpoint.UserPaymentServiceProvider;
import com.bunq.sdk.model.generated.endpoint.UserPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BunqUtil {
    /**
     * Error constants.
     */
    private static final String ERROR_ALL_FIELD_NULL = "All fields of an extended model or object are null.";

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

    public static BunqModel getReferencedUser(
            UserPerson userPerson,
            UserCompany userCompany,
            UserApiKey userApiKey,
            UserPaymentServiceProvider userPaymentServiceProvider
    ) {
        if (userCompany == null && userApiKey == null && userPerson != null && userPaymentServiceProvider == null) {
            return userPerson;
        } else if (userPerson == null && userApiKey == null && userCompany != null && userPaymentServiceProvider == null) {
            return userCompany;
        } else if (userPerson == null && userCompany == null && userApiKey != null && userPaymentServiceProvider == null) {
            return userApiKey;
        } else if (userPerson == null && userCompany == null && userApiKey == null && userPaymentServiceProvider != null) {
            return userPaymentServiceProvider;
        } else {
            throw new BunqException(ERROR_ALL_FIELD_NULL);
        }
    }
}
