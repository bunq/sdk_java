package com.bunq.sdk.json;

import com.bunq.sdk.http.Pagination;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Console;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

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

  @Override
  public Pagination deserialize(JsonElement json, Type typeOfT,
      JsonDeserializationContext context) throws JsonParseException {
    try {
      JsonObject responseJson = json.getAsJsonObject();
      Map<String, Integer> paginationBody = parsePaginationBody(responseJson);
      Pagination pagination = new Pagination();
      pagination.setOlderId(paginationBody.get(Pagination.PARAM_OLDER_ID));
      pagination.setNewerId(paginationBody.get(Pagination.PARAM_NEWER_ID));
      pagination.setFutureId(paginationBody.get(Pagination.PARAM_FUTURE_ID));
      pagination.setCount(paginationBody.get(Pagination.PARAM_COUNT));

      return pagination;
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

  private void updatePaginationBodyFromResponseField(
      Map<String, Integer> paginationBody,
      String idField,
      JsonObject responseJson,
      String responseField,
      String responseParam
  ) throws URISyntaxException {
    if (responseJson.has(responseField) && !responseJson.get(responseField).isJsonNull()) {
      URI uri = new URI(responseJson.get(responseField).getAsString());
      List<NameValuePair> params = URLEncodedUtils.parse(uri, Charset.defaultCharset());

      for (NameValuePair param : params) {
        if (responseParam.equals(param.getName())) {
          paginationBody.put(idField, Integer.parseInt(param.getValue()));
        } else if (Pagination.PARAM_COUNT.equals(param.getName()) &&
            paginationBody.get(Pagination.PARAM_COUNT) == null) {
          paginationBody.put(Pagination.PARAM_COUNT, Integer.parseInt(param.getValue()));
        }
      }
    }
  }

}
