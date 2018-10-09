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
public class NoteTextRequestInquiryBatch extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry-batch/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry-batch/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/request-inquiry-batch/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry-batch/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/request-inquiry-batch/%s/note-text/%s";

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

  public NoteTextRequestInquiryBatch() {
    this(null);
  }

  public NoteTextRequestInquiryBatch(String content) {
    this.contentFieldForRequest = content;
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer requestInquiryBatchId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryBatchId) {
    return create(requestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryBatchId, Integer monetaryAccountId) {
    return create(requestInquiryBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryBatchId, Integer monetaryAccountId, String content) {
    return create(requestInquiryBatchId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryBatchId, noteTextRequestInquiryBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryBatchId) {
    return update(requestInquiryBatchId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId) {
    return update(requestInquiryBatchId, noteTextRequestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId, Integer monetaryAccountId) {
    return update(requestInquiryBatchId, noteTextRequestInquiryBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId, Integer monetaryAccountId, String content) {
    return update(requestInquiryBatchId, noteTextRequestInquiryBatchId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextRequestInquiryBatch> delete(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryBatchId, noteTextRequestInquiryBatchId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextRequestInquiryBatch> delete(Integer requestInquiryBatchId) {
    return delete(requestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiryBatch> delete(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId) {
    return delete(requestInquiryBatchId, noteTextRequestInquiryBatchId, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiryBatch> delete(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId, Integer monetaryAccountId) {
    return delete(requestInquiryBatchId, noteTextRequestInquiryBatchId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteTextRequestInquiryBatch>> list(Integer requestInquiryBatchId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryBatchId), params, customHeaders);

    return fromJsonList(NoteTextRequestInquiryBatch.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextRequestInquiryBatch>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextRequestInquiryBatch>> list(Integer requestInquiryBatchId) {
    return list(requestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<List<NoteTextRequestInquiryBatch>> list(Integer requestInquiryBatchId, Integer monetaryAccountId) {
    return list(requestInquiryBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextRequestInquiryBatch>> list(Integer requestInquiryBatchId, Integer monetaryAccountId, Map<String, String> params) {
    return list(requestInquiryBatchId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextRequestInquiryBatch> get(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryBatchId, noteTextRequestInquiryBatchId), params, customHeaders);

    return fromJson(NoteTextRequestInquiryBatch.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextRequestInquiryBatch> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiryBatch> get(Integer requestInquiryBatchId) {
    return get(requestInquiryBatchId, null, null, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiryBatch> get(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId) {
    return get(requestInquiryBatchId, noteTextRequestInquiryBatchId, null, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiryBatch> get(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId, Integer monetaryAccountId) {
    return get(requestInquiryBatchId, noteTextRequestInquiryBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextRequestInquiryBatch> get(Integer requestInquiryBatchId, Integer noteTextRequestInquiryBatchId, Integer monetaryAccountId, Map<String, String> params) {
    return get(requestInquiryBatchId, noteTextRequestInquiryBatchId, monetaryAccountId, params, null);
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
  public static NoteTextRequestInquiryBatch fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextRequestInquiryBatch.class, reader);
  }

}
