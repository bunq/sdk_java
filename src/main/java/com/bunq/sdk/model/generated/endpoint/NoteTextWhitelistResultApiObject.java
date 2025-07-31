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
public class NoteTextWhitelistResultApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-text/%s";

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

  public NoteTextWhitelistResultApiObject() {
  this(null);
  }

  public NoteTextWhitelistResultApiObject(String content) {
    this.contentFieldForRequest = content;
  }  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Long> create(Long whitelistId, Long whitelistResultId, Long monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Long> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Long> create(Long whitelistId) {
    return create(whitelistId, null, null, null, null);
  }

  public static BunqResponse<Long> create(Long whitelistId, Long whitelistResultId) {
    return create(whitelistId, whitelistResultId, null, null, null);
  }

  public static BunqResponse<Long> create(Long whitelistId, Long whitelistResultId, Long monetaryAccountId) {
    return create(whitelistId, whitelistResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Long> create(Long whitelistId, Long whitelistResultId, Long monetaryAccountId, String content) {
    return create(whitelistId, whitelistResultId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Long> update(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId, Long monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId, noteTextWhitelistResultId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Long> update(Long whitelistId) {
    return update(whitelistId, null, null, null, null, null);
  }

  public static BunqResponse<Long> update(Long whitelistId, Long whitelistResultId) {
    return update(whitelistId, whitelistResultId, null, null, null, null);
  }

  public static BunqResponse<Long> update(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId) {
    return update(whitelistId, whitelistResultId, noteTextWhitelistResultId, null, null, null);
  }

  public static BunqResponse<Long> update(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId, Long monetaryAccountId) {
    return update(whitelistId, whitelistResultId, noteTextWhitelistResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Long> update(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId, Long monetaryAccountId, String content) {
    return update(whitelistId, whitelistResultId, noteTextWhitelistResultId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextWhitelistResultApiObject> delete(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId, Long monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId, noteTextWhitelistResultId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> delete(Long whitelistId) {
    return delete(whitelistId, null, null, null, null);
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> delete(Long whitelistId, Long whitelistResultId) {
    return delete(whitelistId, whitelistResultId, null, null, null);
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> delete(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId) {
    return delete(whitelistId, whitelistResultId, noteTextWhitelistResultId, null, null);
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> delete(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId, Long monetaryAccountId) {
    return delete(whitelistId, whitelistResultId, noteTextWhitelistResultId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteTextWhitelistResultApiObject>> list(Long whitelistId, Long whitelistResultId, Long monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId), params, customHeaders);

    return fromJsonList(NoteTextWhitelistResultApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextWhitelistResultApiObject>> list() {
    return list(null, null, null, null, null);
  }

  public static BunqResponse<List<NoteTextWhitelistResultApiObject>> list(Long whitelistId) {
    return list(whitelistId, null, null, null, null);
  }

  public static BunqResponse<List<NoteTextWhitelistResultApiObject>> list(Long whitelistId, Long whitelistResultId) {
    return list(whitelistId, whitelistResultId, null, null, null);
  }

  public static BunqResponse<List<NoteTextWhitelistResultApiObject>> list(Long whitelistId, Long whitelistResultId, Long monetaryAccountId) {
    return list(whitelistId, whitelistResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextWhitelistResultApiObject>> list(Long whitelistId, Long whitelistResultId, Long monetaryAccountId, Map<String, String> params) {
    return list(whitelistId, whitelistResultId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextWhitelistResultApiObject> get(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId, Long monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId, noteTextWhitelistResultId), params, customHeaders);

    return fromJson(NoteTextWhitelistResultApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> get() {
    return get(null, null, null, null, null, null);
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> get(Long whitelistId) {
    return get(whitelistId, null, null, null, null, null);
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> get(Long whitelistId, Long whitelistResultId) {
    return get(whitelistId, whitelistResultId, null, null, null, null);
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> get(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId) {
    return get(whitelistId, whitelistResultId, noteTextWhitelistResultId, null, null, null);
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> get(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId, Long monetaryAccountId) {
    return get(whitelistId, whitelistResultId, noteTextWhitelistResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextWhitelistResultApiObject> get(Long whitelistId, Long whitelistResultId, Long noteTextWhitelistResultId, Long monetaryAccountId, Map<String, String> params) {
    return get(whitelistId, whitelistResultId, noteTextWhitelistResultId, monetaryAccountId, params, null);
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
  public static NoteTextWhitelistResultApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextWhitelistResultApiObject.class, reader);
  }

}
