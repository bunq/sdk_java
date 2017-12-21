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
 * Endpoint for getting all the accepted card names for a user. As bunq do not allow total
 * freedom in choosing the name that is going to be printed on the card, the following formats
 * are accepted: Name Surname, N. Surname, N Surname or Surname.
 */
public class CardName extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/card-name";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CardUserNameArray";

  /**
   * All possible variations (of suitable length) of user's legal name for the debit card.
   */
  @Expose
  @SerializedName("possible_card_name_array")
  private List<String> possibleCardNameArray;

  public static BunqResponse<List<CardName>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  public static BunqResponse<List<CardName>> list(ApiContext apiContext, Integer userId, Map<String, String> params) {
    return list(apiContext, userId, params, new HashMap<>());
  }

  /**
   * Return all the accepted card names for a specific user.
   */
  public static BunqResponse<List<CardName>> list(ApiContext apiContext, Integer userId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId), params, customHeaders);

    return fromJsonList(CardName.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * All possible variations (of suitable length) of user's legal name for the debit card.
   */
  public List<String> getPossibleCardNameArray() {
    return this.possibleCardNameArray;
  }

  public void setPossibleCardNameArray(List<String> possibleCardNameArray) {
    this.possibleCardNameArray = possibleCardNameArray;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.possibleCardNameArray != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardName fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardName.class, reader);
  }

}
