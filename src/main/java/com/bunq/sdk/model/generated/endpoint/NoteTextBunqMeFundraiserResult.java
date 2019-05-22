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
public class NoteTextBunqMeFundraiserResult extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CONTENT = "content";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/bunqme-fundraiser-result/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/bunqme-fundraiser-result/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/bunqme-fundraiser-result/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/bunqme-fundraiser-result/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/bunqme-fundraiser-result/%s/note-text/%s";
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

  public NoteTextBunqMeFundraiserResult() {
    this(null);
  }

  public NoteTextBunqMeFundraiserResult(String content) {
    this.contentFieldForRequest = content;
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer bunqmeFundraiserResultId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bunqmeFundraiserResultId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer bunqmeFundraiserResultId) {
    return create(bunqmeFundraiserResultId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer bunqmeFundraiserResultId, Integer monetaryAccountId) {
    return create(bunqmeFundraiserResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer bunqmeFundraiserResultId, Integer monetaryAccountId, String content) {
    return create(bunqmeFundraiserResultId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer bunqmeFundraiserResultId) {
    return update(bunqmeFundraiserResultId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId) {
    return update(bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId, Integer monetaryAccountId) {
    return update(bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId, Integer monetaryAccountId, String content) {
    return update(bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextBunqMeFundraiserResult> delete(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextBunqMeFundraiserResult> delete(Integer bunqmeFundraiserResultId) {
    return delete(bunqmeFundraiserResultId, null, null, null);
  }

  public static BunqResponse<NoteTextBunqMeFundraiserResult> delete(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId) {
    return delete(bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId, null, null);
  }

  public static BunqResponse<NoteTextBunqMeFundraiserResult> delete(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId, Integer monetaryAccountId) {
    return delete(bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteTextBunqMeFundraiserResult>> list(Integer bunqmeFundraiserResultId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bunqmeFundraiserResultId), params, customHeaders);

    return fromJsonList(NoteTextBunqMeFundraiserResult.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextBunqMeFundraiserResult>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextBunqMeFundraiserResult>> list(Integer bunqmeFundraiserResultId) {
    return list(bunqmeFundraiserResultId, null, null, null);
  }

  public static BunqResponse<List<NoteTextBunqMeFundraiserResult>> list(Integer bunqmeFundraiserResultId, Integer monetaryAccountId) {
    return list(bunqmeFundraiserResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextBunqMeFundraiserResult>> list(Integer bunqmeFundraiserResultId, Integer monetaryAccountId, Map<String, String> params) {
    return list(bunqmeFundraiserResultId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextBunqMeFundraiserResult> get(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId), params, customHeaders);

    return fromJson(NoteTextBunqMeFundraiserResult.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextBunqMeFundraiserResult> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextBunqMeFundraiserResult> get(Integer bunqmeFundraiserResultId) {
    return get(bunqmeFundraiserResultId, null, null, null, null);
  }

  public static BunqResponse<NoteTextBunqMeFundraiserResult> get(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId) {
    return get(bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId, null, null, null);
  }

  public static BunqResponse<NoteTextBunqMeFundraiserResult> get(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId, Integer monetaryAccountId) {
    return get(bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextBunqMeFundraiserResult> get(Integer bunqmeFundraiserResultId, Integer noteTextBunqMeFundraiserResultId, Integer monetaryAccountId, Map<String, String> params) {
    return get(bunqmeFundraiserResultId, noteTextBunqMeFundraiserResultId, monetaryAccountId, params, null);
  }

  /**
   */
  public static NoteTextBunqMeFundraiserResult fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextBunqMeFundraiserResult.class, reader);
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
