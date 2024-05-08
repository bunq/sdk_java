package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelUser;
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
public class NoteTextScheduleRequest extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-request-inquiry/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-request-inquiry/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-request-inquiry/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule-request-inquiry/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-request-inquiry/%s/note-text/%s";

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

  public NoteTextScheduleRequest() {
  this(null);
  }

  public NoteTextScheduleRequest(String content) {
    this.contentFieldForRequest = content;
  }  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer scheduleRequestInquiryId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleRequestInquiryId) {
    return create(scheduleRequestInquiryId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleRequestInquiryId, Integer monetaryAccountId) {
    return create(scheduleRequestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleRequestInquiryId, Integer monetaryAccountId, String content) {
    return create(scheduleRequestInquiryId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryId, noteTextScheduleRequestId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryId) {
    return update(scheduleRequestInquiryId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId) {
    return update(scheduleRequestInquiryId, noteTextScheduleRequestId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId, Integer monetaryAccountId) {
    return update(scheduleRequestInquiryId, noteTextScheduleRequestId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId, Integer monetaryAccountId, String content) {
    return update(scheduleRequestInquiryId, noteTextScheduleRequestId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextScheduleRequest> delete(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryId, noteTextScheduleRequestId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextScheduleRequest> delete(Integer scheduleRequestInquiryId) {
    return delete(scheduleRequestInquiryId, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequest> delete(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId) {
    return delete(scheduleRequestInquiryId, noteTextScheduleRequestId, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequest> delete(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId, Integer monetaryAccountId) {
    return delete(scheduleRequestInquiryId, noteTextScheduleRequestId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given schedule request.
   */
  public static BunqResponse<List<NoteTextScheduleRequest>> list(Integer scheduleRequestInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryId), params, customHeaders);

    return fromJsonList(NoteTextScheduleRequest.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextScheduleRequest>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleRequest>> list(Integer scheduleRequestInquiryId) {
    return list(scheduleRequestInquiryId, null, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleRequest>> list(Integer scheduleRequestInquiryId, Integer monetaryAccountId) {
    return list(scheduleRequestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextScheduleRequest>> list(Integer scheduleRequestInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return list(scheduleRequestInquiryId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextScheduleRequest> get(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleRequestInquiryId, noteTextScheduleRequestId), params, customHeaders);

    return fromJson(NoteTextScheduleRequest.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextScheduleRequest> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequest> get(Integer scheduleRequestInquiryId) {
    return get(scheduleRequestInquiryId, null, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequest> get(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId) {
    return get(scheduleRequestInquiryId, noteTextScheduleRequestId, null, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequest> get(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId, Integer monetaryAccountId) {
    return get(scheduleRequestInquiryId, noteTextScheduleRequestId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextScheduleRequest> get(Integer scheduleRequestInquiryId, Integer noteTextScheduleRequestId, Integer monetaryAccountId, Map<String, String> params) {
    return get(scheduleRequestInquiryId, noteTextScheduleRequestId, monetaryAccountId, params, null);
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

  /**
   */
  public static NoteTextScheduleRequest fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextScheduleRequest.class, reader);
  }

}
