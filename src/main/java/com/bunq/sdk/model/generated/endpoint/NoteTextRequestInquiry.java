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
public class NoteTextRequestInquiry extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CONTENT = "content";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/request-inquiry/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/request-inquiry/%s/note-text/%s";
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

  public NoteTextRequestInquiry() {
    this(null);
  }

  public NoteTextRequestInquiry(String content) {
    this.contentFieldForRequest = content;
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId) {
    return create(requestInquiryId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer monetaryAccountId) {
    return create(requestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer monetaryAccountId, String content) {
    return create(requestInquiryId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer noteTextRequestInquiryId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId, noteTextRequestInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId) {
    return update(requestInquiryId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer noteTextRequestInquiryId) {
    return update(requestInquiryId, noteTextRequestInquiryId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer noteTextRequestInquiryId, Integer monetaryAccountId) {
    return update(requestInquiryId, noteTextRequestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer noteTextRequestInquiryId, Integer monetaryAccountId, String content) {
    return update(requestInquiryId, noteTextRequestInquiryId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextRequestInquiry> delete(Integer requestInquiryId, Integer noteTextRequestInquiryId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId, noteTextRequestInquiryId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextRequestInquiry> delete(Integer requestInquiryId) {
    return delete(requestInquiryId, null, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiry> delete(Integer requestInquiryId, Integer noteTextRequestInquiryId) {
    return delete(requestInquiryId, noteTextRequestInquiryId, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiry> delete(Integer requestInquiryId, Integer noteTextRequestInquiryId, Integer monetaryAccountId) {
    return delete(requestInquiryId, noteTextRequestInquiryId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteTextRequestInquiry>> list(Integer requestInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId), params, customHeaders);

    return fromJsonList(NoteTextRequestInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextRequestInquiry>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextRequestInquiry>> list(Integer requestInquiryId) {
    return list(requestInquiryId, null, null, null);
  }

  public static BunqResponse<List<NoteTextRequestInquiry>> list(Integer requestInquiryId, Integer monetaryAccountId) {
    return list(requestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextRequestInquiry>> list(Integer requestInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return list(requestInquiryId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextRequestInquiry> get(Integer requestInquiryId, Integer noteTextRequestInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId, noteTextRequestInquiryId), params, customHeaders);

    return fromJson(NoteTextRequestInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextRequestInquiry> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiry> get(Integer requestInquiryId) {
    return get(requestInquiryId, null, null, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiry> get(Integer requestInquiryId, Integer noteTextRequestInquiryId) {
    return get(requestInquiryId, noteTextRequestInquiryId, null, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiry> get(Integer requestInquiryId, Integer noteTextRequestInquiryId, Integer monetaryAccountId) {
    return get(requestInquiryId, noteTextRequestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiry> get(Integer requestInquiryId, Integer noteTextRequestInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return get(requestInquiryId, noteTextRequestInquiryId, monetaryAccountId, params, null);
  }

  /**
   */
  public static NoteTextRequestInquiry fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextRequestInquiry.class, reader);
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
