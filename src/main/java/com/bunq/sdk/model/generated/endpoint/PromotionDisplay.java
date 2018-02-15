package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
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
 * The public endpoint for retrieving and updating a promotion display model.
 */
public class PromotionDisplay extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/promotion-display/%s";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/promotion-display/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE_GET = "PromotionDisplay";

  /**
   * The id of the promotion.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The alias of the user you received the promotion from.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private MonetaryAccountReference counterpartyAlias;

  /**
   * The event description of the promotion appearing on time line.
   */
  @Expose
  @SerializedName("event_description")
  private String eventDescription;

  /**
   * The status of the promotion. (CREATED, CLAIMED, EXPIRED, DISCARDED)
   */
  @Expose
  @SerializedName("status")
  private String status;

  public static BunqResponse<PromotionDisplay> get(ApiContext apiContext, Integer userId, Integer promotionDisplayId) {
    return get(apiContext, userId, promotionDisplayId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<PromotionDisplay> get(ApiContext apiContext, Integer userId, Integer promotionDisplayId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, promotionDisplayId), new HashMap<>(), customHeaders);

    return fromJson(PromotionDisplay.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer promotionDisplayId) {
    return update(apiContext, requestMap, userId, promotionDisplayId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer promotionDisplayId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, promotionDisplayId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  /**
   * The id of the promotion.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The alias of the user you received the promotion from.
   */
  public MonetaryAccountReference getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(MonetaryAccountReference counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The event description of the promotion appearing on time line.
   */
  public String getEventDescription() {
    return this.eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  /**
   * The status of the promotion. (CREATED, CLAIMED, EXPIRED, DISCARDED)
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.eventDescription != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PromotionDisplay fromJsonReader(JsonReader reader) {
    return fromJsonReader(PromotionDisplay.class, reader);
  }

}
