package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.EventObject;
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
 * Used to view events. Events are automatically created and contain information about
 * everything that happens to your bunq account. In the bunq app events are shown in your
 * 'overview'. Examples of when events are created or modified: payment sent, payment received,
 * request for payment received or connect invite received.
 */
public class Event extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/event/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/event";

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
  private EventObject object;

  /**
   * The event status. Can be: FINALIZED or AWAITING_REPLY. An example of FINALIZED event is a
   * payment received event, while an AWAITING_REPLY event is a request received event.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * Fields of the external model which we have stored so we know what they were at the time of
   * the event.
   */
  @Expose
  @SerializedName("object_data_at_event")
  private EventObject objectDataAtEvent;

  /**
   * Indicator whether this is the latest event for the object.
   */
  @Expose
  @SerializedName("is_event_latest_for_object")
  private Boolean isEventLatestForObject;

  /**
   * Get a specific event for a given user.
   */
  public static BunqResponse<Event> get(Integer eventId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), eventId), params, customHeaders);

    return fromJson(Event.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<Event> get() {
    return get(null, null, null);
  }

  public static BunqResponse<Event> get(Integer eventId) {
    return get(eventId, null, null);
  }

  public static BunqResponse<Event> get(Integer eventId, Map<String, String> params) {
    return get(eventId, params, null);
  }

  /**
   * Get a collection of events for a given user. You can add query the parameters
   * monetary_account_id, status and/or display_user_event to filter the response. When
   * monetary_account_id={id,id} is provided only events that relate to these monetary account ids
   * are returned. When status={AWAITING_REPLY/FINALIZED} is provided the response only contains
   * events with the status AWAITING_REPLY or FINALIZED. When display_user_event={true/false} is
   * set to false user events are excluded from the response, when not provided user events are
   * displayed. User events are events that are not related to a monetary account (for example:
   * connect invites).
   */
  public static BunqResponse<List<Event>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(Event.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<Event>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<Event>> list(Map<String, String> params) {
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
  public EventObject getObject() {
    return this.object;
  }

  public void setObject(EventObject object) {
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
   * Fields of the external model which we have stored so we know what they were at the time of
   * the event.
   */
  public EventObject getObjectDataAtEvent() {
    return this.objectDataAtEvent;
  }

  public void setObjectDataAtEvent(EventObject objectDataAtEvent) {
    this.objectDataAtEvent = objectDataAtEvent;
  }

  /**
   * Indicator whether this is the latest event for the object.
   */
  public Boolean getIsEventLatestForObject() {
    return this.isEventLatestForObject;
  }

  public void setIsEventLatestForObject(Boolean isEventLatestForObject) {
    this.isEventLatestForObject = isEventLatestForObject;
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

    if (this.objectDataAtEvent != null) {
      return false;
    }

    if (this.isEventLatestForObject != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Event fromJsonReader(JsonReader reader) {
    return fromJsonReader(Event.class, reader);
  }

}
