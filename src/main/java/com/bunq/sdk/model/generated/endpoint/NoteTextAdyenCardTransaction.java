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
 * Used to manage text notes.
 */
public class NoteTextAdyenCardTransaction extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-text/%s";

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

  public NoteTextAdyenCardTransaction() {
  this(null);
  }

  public NoteTextAdyenCardTransaction(String content) {
    this.contentFieldForRequest = content;
  }  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer adyenCardTransactionId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer adyenCardTransactionId) {
    return create(adyenCardTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer adyenCardTransactionId, Integer monetaryAccountId) {
    return create(adyenCardTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer adyenCardTransactionId, Integer monetaryAccountId, String content) {
    return create(adyenCardTransactionId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId, noteTextAdyenCardTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer adyenCardTransactionId) {
    return update(adyenCardTransactionId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId) {
    return update(adyenCardTransactionId, noteTextAdyenCardTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId, Integer monetaryAccountId) {
    return update(adyenCardTransactionId, noteTextAdyenCardTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId, Integer monetaryAccountId, String content) {
    return update(adyenCardTransactionId, noteTextAdyenCardTransactionId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextAdyenCardTransaction> delete(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId, noteTextAdyenCardTransactionId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextAdyenCardTransaction> delete(Integer adyenCardTransactionId) {
    return delete(adyenCardTransactionId, null, null, null);
  }

  public static BunqResponse<NoteTextAdyenCardTransaction> delete(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId) {
    return delete(adyenCardTransactionId, noteTextAdyenCardTransactionId, null, null);
  }

  public static BunqResponse<NoteTextAdyenCardTransaction> delete(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId, Integer monetaryAccountId) {
    return delete(adyenCardTransactionId, noteTextAdyenCardTransactionId, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<List<NoteTextAdyenCardTransaction>> list(Integer adyenCardTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId), params, customHeaders);

    return fromJsonList(NoteTextAdyenCardTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextAdyenCardTransaction>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextAdyenCardTransaction>> list(Integer adyenCardTransactionId) {
    return list(adyenCardTransactionId, null, null, null);
  }

  public static BunqResponse<List<NoteTextAdyenCardTransaction>> list(Integer adyenCardTransactionId, Integer monetaryAccountId) {
    return list(adyenCardTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextAdyenCardTransaction>> list(Integer adyenCardTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return list(adyenCardTransactionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextAdyenCardTransaction> get(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId, noteTextAdyenCardTransactionId), params, customHeaders);

    return fromJson(NoteTextAdyenCardTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextAdyenCardTransaction> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextAdyenCardTransaction> get(Integer adyenCardTransactionId) {
    return get(adyenCardTransactionId, null, null, null, null);
  }

  public static BunqResponse<NoteTextAdyenCardTransaction> get(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId) {
    return get(adyenCardTransactionId, noteTextAdyenCardTransactionId, null, null, null);
  }

  public static BunqResponse<NoteTextAdyenCardTransaction> get(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId, Integer monetaryAccountId) {
    return get(adyenCardTransactionId, noteTextAdyenCardTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextAdyenCardTransaction> get(Integer adyenCardTransactionId, Integer noteTextAdyenCardTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(adyenCardTransactionId, noteTextAdyenCardTransactionId, monetaryAccountId, params, null);
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
  public static NoteTextAdyenCardTransaction fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextAdyenCardTransaction.class, reader);
  }

}
