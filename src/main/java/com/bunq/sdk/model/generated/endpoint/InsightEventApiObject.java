package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.EventObjectObject;
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
 * Used to get events based on time and insight category.
 */
public class InsightEventApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/insights-search";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Event";

  /**
   * The id of the event.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the event's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the event's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The performed action. Can be: CREATE or UPDATE.
   */
  @Expose
  @SerializedName("action")
  private String action;

  /**
   * The id of the user the event applied to (if it was a user event).
   */
  @Expose
  @SerializedName("user_id")
  private String userId;

  /**
   * The id of the monetary account the event applied to (if it was a monetary account event).
   */
  @Expose
  @SerializedName("monetary_account_id")
  private String monetaryAccountId;

  /**
   * The details of the external object the event was created for.
   */
  @Expose
  @SerializedName("object")
  private EventObjectObject object;

  /**
   * The event status. Can be: FINALIZED or AWAITING_REPLY. An example of FINALIZED event is a
   * payment received event, while an AWAITING_REPLY event is a request received event.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   */
  public static BunqResponse<List<InsightEventApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(InsightEventApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<InsightEventApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<InsightEventApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The id of the event.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the event's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the event's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The performed action. Can be: CREATE or UPDATE.
   */
  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  /**
   * The id of the user the event applied to (if it was a user event).
   */
  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * The id of the monetary account the event applied to (if it was a monetary account event).
   */
  public String getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(String monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The details of the external object the event was created for.
   */
  public EventObjectObject getObject() {
    return this.object;
  }

  public void setObject(EventObjectObject object) {
    this.object = object;
  }

  /**
   * The event status. Can be: FINALIZED or AWAITING_REPLY. An example of FINALIZED event is a
   * payment received event, while an AWAITING_REPLY event is a request received event.
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

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.action != null) {
      return false;
    }

    if (this.userId != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.object != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static InsightEventApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(InsightEventApiObject.class, reader);
  }

}
