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
 * Used to manage text notes for a scheduled request.
 */
public class NoteTextScheduleRequestBatchApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-request-inquiry-batch/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-request-inquiry-batch/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-request-inquiry-batch/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule-request-inquiry-batch/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-request-inquiry-batch/%s/note-text/%s";

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

  public NoteTextScheduleRequestBatchApiObject() {
  this(null);
  }

  public NoteTextScheduleRequestBatchApiObject(String content) {
    this.contentFieldForRequest = content;
  }  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer scheduleRequestInquiryBatchId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleRequestInquiryBatchId) {
    return create(scheduleRequestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleRequestInquiryBatchId, Integer monetaryAccountId) {
    return create(scheduleRequestInquiryBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleRequestInquiryBatchId, Integer monetaryAccountId, String content) {
    return create(scheduleRequestInquiryBatchId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryBatchId) {
    return update(scheduleRequestInquiryBatchId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId) {
    return update(scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId, Integer monetaryAccountId) {
    return update(scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId, Integer monetaryAccountId, String content) {
    return update(scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> delete(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> delete(Integer scheduleRequestInquiryBatchId) {
    return delete(scheduleRequestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> delete(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId) {
    return delete(scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> delete(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId, Integer monetaryAccountId) {
    return delete(scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given schedule request.
   */
  public static BunqResponse<List<NoteTextScheduleRequestBatchApiObject>> list(Integer scheduleRequestInquiryBatchId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryBatchId), params, customHeaders);

    return fromJsonList(NoteTextScheduleRequestBatchApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextScheduleRequestBatchApiObject>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleRequestBatchApiObject>> list(Integer scheduleRequestInquiryBatchId) {
    return list(scheduleRequestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleRequestBatchApiObject>> list(Integer scheduleRequestInquiryBatchId, Integer monetaryAccountId) {
    return list(scheduleRequestInquiryBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleRequestBatchApiObject>> list(Integer scheduleRequestInquiryBatchId, Integer monetaryAccountId, Map<String, String> params) {
    return list(scheduleRequestInquiryBatchId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> get(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId), params, customHeaders);

    return fromJson(NoteTextScheduleRequestBatchApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> get(Integer scheduleRequestInquiryBatchId) {
    return get(scheduleRequestInquiryBatchId, null, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> get(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId) {
    return get(scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> get(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId, Integer monetaryAccountId) {
    return get(scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequestBatchApiObject> get(Integer scheduleRequestInquiryBatchId, Integer noteTextScheduleRequestBatchId, Integer monetaryAccountId, Map<String, String> params) {
    return get(scheduleRequestInquiryBatchId, noteTextScheduleRequestBatchId, monetaryAccountId, params, null);
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
  public static NoteTextScheduleRequestBatchApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextScheduleRequestBatchApiObject.class, reader);
  }

}
