package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
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
import javax.lang.model.type.NullType;

/**
 * View endpoint for place opening periods.
 */
public class PlacePhotoLookupContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "place-lookup/%s/photo/%s/content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PlacePhotoLookupContent";

  /**
   */
  public static BunqResponse<byte[]> list(Integer placeLookupId, Integer photoId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, placeLookupId, photoId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer placeLookupId) {
    return list(placeLookupId, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer placeLookupId, Integer photoId) {
    return list(placeLookupId, photoId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer placeLookupId, Integer photoId, Map<String, String> params) {
    return list(placeLookupId, photoId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static PlacePhotoLookupContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(PlacePhotoLookupContent.class, reader);
  }

}
