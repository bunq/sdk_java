package com.bunq.sdk.json;

import com.bunq.sdk.http.Pagination;
import com.google.gson.*;
import okhttp3.HttpUrl;

import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Custom (de)serialization of SessionServer required due to the specific way we handle pagination.
 */
public class PaginationAdapter implements JsonDeserializer<Pagination> {

    /**
     * Field constants.
     */
    private static final String FIELD_OLDER_URL = "older_url";
    private static final String FIELD_NEWER_URL = "newer_url";
    private static final String FIELD_FUTURE_URL = "future_url";

    private static final String EXAMPLE_URL = "http://www.example.com";

    @Override
    public Pagination deserialize(JsonElement json, Type typeOfT,
                                  JsonDeserializationContext context) throws JsonParseException {
        try {
            JsonObject responseJson = json.getAsJsonObject();
            Map<String, Integer> paginationBody = parsePaginationBody(responseJson);

            return createPagination(paginationBody);
        } catch (URISyntaxException exception) {
            throw new JsonParseException(exception);
        }
    }

    private Map<String, Integer> parsePaginationBody(JsonObject responseJson)
            throws URISyntaxException {
        Map<String, Integer> paginationBody = new HashMap<>();
        updatePaginationBodyFromResponseField(
                paginationBody,
                Pagination.PARAM_OLDER_ID,
                responseJson,
                FIELD_OLDER_URL,
                Pagination.PARAM_OLDER_ID
        );
        updatePaginationBodyFromResponseField(
                paginationBody,
                Pagination.PARAM_NEWER_ID,
                responseJson,
                FIELD_NEWER_URL,
                Pagination.PARAM_NEWER_ID
        );
        updatePaginationBodyFromResponseField(
                paginationBody,
                Pagination.PARAM_FUTURE_ID,
                responseJson,
                FIELD_FUTURE_URL,
                Pagination.PARAM_NEWER_ID
        );

        return paginationBody;
    }

    private Pagination createPagination(Map<String, Integer> paginationBody) {
        Pagination pagination = new Pagination();
        pagination.setOlderId(paginationBody.get(Pagination.PARAM_OLDER_ID));
        pagination.setNewerId(paginationBody.get(Pagination.PARAM_NEWER_ID));
        pagination.setFutureId(paginationBody.get(Pagination.PARAM_FUTURE_ID));
        pagination.setCount(paginationBody.get(Pagination.PARAM_COUNT));

        return pagination;
    }

    private void updatePaginationBodyFromResponseField(
            Map<String, Integer> paginationBody,
            String idField,
            JsonObject responseJson,
            String responseField,
            String responseParam
    ) {
        if (responseJson.has(responseField) && !responseJson.get(responseField).isJsonNull()) {
            // Uses EXAMPLE_URL to build a proper URL string that the parser understands to extract
            // the url parameters.
            HttpUrl url = HttpUrl.parse(EXAMPLE_URL + responseJson.get(responseField).getAsString());

            for (String parameterName : Objects.requireNonNull(url).queryParameterNames()) {
                if (responseParam.equals(parameterName)) {
                    paginationBody.put(idField, Integer.parseInt(Objects.requireNonNull(url.queryParameter(parameterName))));
                } else if (Pagination.PARAM_COUNT.equals(parameterName) &&
                        paginationBody.get(Pagination.PARAM_COUNT) == null) {
                    paginationBody.put(Pagination.PARAM_COUNT, Integer.parseInt(Objects.requireNonNull(url.queryParameter(parameterName))));
                }
            }
        }
    }
}
