package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to manage text notes.
 */
public class NoteTextScheduleInstance extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CONTENT = "content";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-text/%s";
  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "NoteText";

  /**
   * The id of the note.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

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
  private LabelUser labelUserCreator;

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

  public NoteTextScheduleInstance() {
    this(null);
  }

  public NoteTextScheduleInstance(String content) {
    this.contentFieldForRequest = content;
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleId) {
    return create(scheduleId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleId, Integer scheduleInstanceId) {
    return create(scheduleId, scheduleInstanceId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId) {
    return create(scheduleId, scheduleInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, String content) {
    return create(scheduleId, scheduleInstanceId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId, noteTextScheduleInstanceId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer scheduleId) {
    return update(scheduleId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId) {
    return update(scheduleId, scheduleInstanceId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId) {
    return update(scheduleId, scheduleInstanceId, noteTextScheduleInstanceId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId, Integer monetaryAccountId) {
    return update(scheduleId, scheduleInstanceId, noteTextScheduleInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId, Integer monetaryAccountId, String content) {
    return update(scheduleId, scheduleInstanceId, noteTextScheduleInstanceId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextScheduleInstance> delete(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId, noteTextScheduleInstanceId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextScheduleInstance> delete(Integer scheduleId) {
    return delete(scheduleId, null, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleInstance> delete(Integer scheduleId, Integer scheduleInstanceId) {
    return delete(scheduleId, scheduleInstanceId, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleInstance> delete(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId) {
    return delete(scheduleId, scheduleInstanceId, noteTextScheduleInstanceId, null, null);
  }

  public static BunqResponse<NoteTextScheduleInstance> delete(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId, Integer monetaryAccountId) {
    return delete(scheduleId, scheduleInstanceId, noteTextScheduleInstanceId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteTextScheduleInstance>> list(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId), params, customHeaders);

    return fromJsonList(NoteTextScheduleInstance.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextScheduleInstance>> list() {
    return list(null, null, null, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleInstance>> list(Integer scheduleId) {
    return list(scheduleId, null, null, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleInstance>> list(Integer scheduleId, Integer scheduleInstanceId) {
    return list(scheduleId, scheduleInstanceId, null, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleInstance>> list(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId) {
    return list(scheduleId, scheduleInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleInstance>> list(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, Map<String, String> params) {
    return list(scheduleId, scheduleInstanceId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextScheduleInstance> get(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId, noteTextScheduleInstanceId), params, customHeaders);

    return fromJson(NoteTextScheduleInstance.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextScheduleInstance> get() {
    return get(null, null, null, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleInstance> get(Integer scheduleId) {
    return get(scheduleId, null, null, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleInstance> get(Integer scheduleId, Integer scheduleInstanceId) {
    return get(scheduleId, scheduleInstanceId, null, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleInstance> get(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId) {
    return get(scheduleId, scheduleInstanceId, noteTextScheduleInstanceId, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleInstance> get(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId, Integer monetaryAccountId) {
    return get(scheduleId, scheduleInstanceId, noteTextScheduleInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextScheduleInstance> get(Integer scheduleId, Integer scheduleInstanceId, Integer noteTextScheduleInstanceId, Integer monetaryAccountId, Map<String, String> params) {
    return get(scheduleId, scheduleInstanceId, noteTextScheduleInstanceId, monetaryAccountId, params, null);
  }

  /**
   */
  public static NoteTextScheduleInstance fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextScheduleInstance.class, reader);
  }

  /**
   * The id of the note.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
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
  public LabelUser getLabelUserCreator() {
    return this.labelUserCreator;
  }

  public void setLabelUserCreator(LabelUser labelUserCreator) {
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

}
