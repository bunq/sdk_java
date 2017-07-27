package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

  public static List<CardName> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  /**
   * Return all the accepted card names for a specific user.
   */
  public static List<CardName> list(ApiContext apiContext, Integer userId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId), customHeaders);

    return fromJsonList(CardName.class, new String(responseBytes), OBJECT_TYPE);
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

}
