package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.Map;

/**
 * The public endpoint for retrieving and updating a promotion display model.
 */
public class PromotionDisplay extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/promotion-display/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/promotion-display/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PromotionDisplay";

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

  /**
   */
  public static BunqResponse<PromotionDisplay> get(Integer promotionDisplayId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), promotionDisplayId), params, customHeaders);

    return fromJson(PromotionDisplay.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PromotionDisplay> get() {
    return get(null, null, null);
  }

  public static BunqResponse<PromotionDisplay> get(Integer promotionDisplayId) {
    return get(promotionDisplayId, null, null);
  }

  public static BunqResponse<PromotionDisplay> get(Integer promotionDisplayId, Map<String, String> params) {
    return get(promotionDisplayId, params, null);
  }

  /**
   * @param status The status of the promotion. User can set it to discarded.
   */
  public static BunqResponse<Integer> update(Integer promotionDisplayId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), promotionDisplayId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer promotionDisplayId) {
    return update(promotionDisplayId, null, null);
  }

  public static BunqResponse<Integer> update(Integer promotionDisplayId, String status) {
    return update(promotionDisplayId, status, null);
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
