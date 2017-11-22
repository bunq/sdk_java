package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * It is possible to order a card replacement with the bunq API.<br/><br/>You can order up to
 * three free card replacements per year. Additional replacement requests will be
 * billed.<br/><br/>The card replacement will have the same expiry date and the same pricing as
 * the old card, but it will have a new card number. You can change the description and PIN
 * through the card replacement endpoint.
 */
public class CardReplace extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/card/%s/replace";

  /**
   * Field constants.
   */
  public static final String FIELD_PIN_CODE = "pin_code";
  public static final String FIELD_SECOND_LINE = "second_line";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CardReplace";

  /**
   * The id of the new card.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer cardId) {
    return create(apiContext, requestMap, userId, cardId, new HashMap<>());
  }

  /**
   * Request a card replacement.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer cardId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    requestBytes = SecurityUtils.encrypt(apiContext, requestBytes, customHeaders);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, cardId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  /**
   * The id of the new card.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    return true;
  }

}
