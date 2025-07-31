package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelUserObject;
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
 * Used to manage text notes.
 */
public class NoteTextSchedulePaymentBatchApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-text/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_CONTENT = "content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "NoteText";

  /**
   * The id of the note.
   */
  @Expose
  @SerializedName("id")
  private Long id;

  /**
   * The timestamp of the note's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the note's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The label of the user who created this note.
   */
  @Expose
  @SerializedName("label_user_creator")
  private LabelUserObject labelUserCreator;

  /**
   * The content of the note.
   */
  @Expose
  @SerializedName("content")
  private String content;

  /**
   * The content of the note.
   */
  @Expose
  @SerializedName("content_field_for_request")
  private String contentFieldForRequest;

  public NoteTextSchedulePaymentBatchApiObject() {
  this(null);
  }

  public NoteTextSchedulePaymentBatchApiObject(String content) {
    this.contentFieldForRequest = content;
  }  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Long> create(Long schedulePaymentBatchId, Long monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Long> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Long> create(Long schedulePaymentBatchId) {
    return create(schedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<Long> create(Long schedulePaymentBatchId, Long monetaryAccountId) {
    return create(schedulePaymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Long> create(Long schedulePaymentBatchId, Long monetaryAccountId, String content) {
    return create(schedulePaymentBatchId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Long> update(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId, Long monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId, noteTextSchedulePaymentBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Long> update(Long schedulePaymentBatchId) {
    return update(schedulePaymentBatchId, null, null, null, null);
  }

  public static BunqResponse<Long> update(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId) {
    return update(schedulePaymentBatchId, noteTextSchedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<Long> update(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId, Long monetaryAccountId) {
    return update(schedulePaymentBatchId, noteTextSchedulePaymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Long> update(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId, Long monetaryAccountId, String content) {
    return update(schedulePaymentBatchId, noteTextSchedulePaymentBatchId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> delete(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId, Long monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId, noteTextSchedulePaymentBatchId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> delete(Long schedulePaymentBatchId) {
    return delete(schedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> delete(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId) {
    return delete(schedulePaymentBatchId, noteTextSchedulePaymentBatchId, null, null);
  }

  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> delete(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId, Long monetaryAccountId) {
    return delete(schedulePaymentBatchId, noteTextSchedulePaymentBatchId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteTextSchedulePaymentBatchApiObject>> list(Long schedulePaymentBatchId, Long monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId), params, customHeaders);

    return fromJsonList(NoteTextSchedulePaymentBatchApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextSchedulePaymentBatchApiObject>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextSchedulePaymentBatchApiObject>> list(Long schedulePaymentBatchId) {
    return list(schedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<List<NoteTextSchedulePaymentBatchApiObject>> list(Long schedulePaymentBatchId, Long monetaryAccountId) {
    return list(schedulePaymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextSchedulePaymentBatchApiObject>> list(Long schedulePaymentBatchId, Long monetaryAccountId, Map<String, String> params) {
    return list(schedulePaymentBatchId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> get(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId, Long monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId, noteTextSchedulePaymentBatchId), params, customHeaders);

    return fromJson(NoteTextSchedulePaymentBatchApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> get(Long schedulePaymentBatchId) {
    return get(schedulePaymentBatchId, null, null, null, null);
  }

  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> get(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId) {
    return get(schedulePaymentBatchId, noteTextSchedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> get(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId, Long monetaryAccountId) {
    return get(schedulePaymentBatchId, noteTextSchedulePaymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextSchedulePaymentBatchApiObject> get(Long schedulePaymentBatchId, Long noteTextSchedulePaymentBatchId, Long monetaryAccountId, Map<String, String> params) {
    return get(schedulePaymentBatchId, noteTextSchedulePaymentBatchId, monetaryAccountId, params, null);
  }

  /**
   * The id of the note.
   */
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The timestamp of the note's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the note's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The label of the user who created this note.
   */
  public LabelUserObject getLabelUserCreator() {
    return this.labelUserCreator;
  }

  public void setLabelUserCreator(LabelUserObject labelUserCreator) {
    this.labelUserCreator = labelUserCreator;
  }

  /**
   * The content of the note.
   */
  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
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

    if (this.labelUserCreator != null) {
      return false;
    }

    if (this.content != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NoteTextSchedulePaymentBatchApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextSchedulePaymentBatchApiObject.class, reader);
  }

}
