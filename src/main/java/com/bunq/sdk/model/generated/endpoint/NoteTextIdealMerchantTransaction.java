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
public class NoteTextIdealMerchantTransaction extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CONTENT = "content";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/ideal-merchant-transaction/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/ideal-merchant-transaction/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/ideal-merchant-transaction/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/ideal-merchant-transaction/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/ideal-merchant-transaction/%s/note-text/%s";
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

  public NoteTextIdealMerchantTransaction() {
    this(null);
  }

  public NoteTextIdealMerchantTransaction(String content) {
    this.contentFieldForRequest = content;
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer idealMerchantTransactionId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), idealMerchantTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer idealMerchantTransactionId) {
    return create(idealMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer idealMerchantTransactionId, Integer monetaryAccountId) {
    return create(idealMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer idealMerchantTransactionId, Integer monetaryAccountId, String content) {
    return create(idealMerchantTransactionId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), idealMerchantTransactionId, noteTextIdealMerchantTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer idealMerchantTransactionId) {
    return update(idealMerchantTransactionId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId) {
    return update(idealMerchantTransactionId, noteTextIdealMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId, Integer monetaryAccountId) {
    return update(idealMerchantTransactionId, noteTextIdealMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId, Integer monetaryAccountId, String content) {
    return update(idealMerchantTransactionId, noteTextIdealMerchantTransactionId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextIdealMerchantTransaction> delete(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), idealMerchantTransactionId, noteTextIdealMerchantTransactionId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextIdealMerchantTransaction> delete(Integer idealMerchantTransactionId) {
    return delete(idealMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<NoteTextIdealMerchantTransaction> delete(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId) {
    return delete(idealMerchantTransactionId, noteTextIdealMerchantTransactionId, null, null);
  }

  public static BunqResponse<NoteTextIdealMerchantTransaction> delete(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId, Integer monetaryAccountId) {
    return delete(idealMerchantTransactionId, noteTextIdealMerchantTransactionId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteTextIdealMerchantTransaction>> list(Integer idealMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), idealMerchantTransactionId), params, customHeaders);

    return fromJsonList(NoteTextIdealMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextIdealMerchantTransaction>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextIdealMerchantTransaction>> list(Integer idealMerchantTransactionId) {
    return list(idealMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<List<NoteTextIdealMerchantTransaction>> list(Integer idealMerchantTransactionId, Integer monetaryAccountId) {
    return list(idealMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextIdealMerchantTransaction>> list(Integer idealMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return list(idealMerchantTransactionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextIdealMerchantTransaction> get(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), idealMerchantTransactionId, noteTextIdealMerchantTransactionId), params, customHeaders);

    return fromJson(NoteTextIdealMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextIdealMerchantTransaction> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextIdealMerchantTransaction> get(Integer idealMerchantTransactionId) {
    return get(idealMerchantTransactionId, null, null, null, null);
  }

  public static BunqResponse<NoteTextIdealMerchantTransaction> get(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId) {
    return get(idealMerchantTransactionId, noteTextIdealMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<NoteTextIdealMerchantTransaction> get(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId, Integer monetaryAccountId) {
    return get(idealMerchantTransactionId, noteTextIdealMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextIdealMerchantTransaction> get(Integer idealMerchantTransactionId, Integer noteTextIdealMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(idealMerchantTransactionId, noteTextIdealMerchantTransactionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static NoteTextIdealMerchantTransaction fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextIdealMerchantTransaction.class, reader);
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
