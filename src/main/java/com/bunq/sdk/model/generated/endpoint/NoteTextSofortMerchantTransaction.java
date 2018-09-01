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
public class NoteTextSofortMerchantTransaction extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-text/%s";

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

  public NoteTextSofortMerchantTransaction() {
  this(null);
  }

  public NoteTextSofortMerchantTransaction(String content) {
    this.contentFieldForRequest = content;
  }  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer sofortMerchantTransactionId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer sofortMerchantTransactionId) {
    return create(sofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer sofortMerchantTransactionId, Integer monetaryAccountId) {
    return create(sofortMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer sofortMerchantTransactionId, Integer monetaryAccountId, String content) {
    return create(sofortMerchantTransactionId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId, noteTextSofortMerchantTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId) {
    return update(sofortMerchantTransactionId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId) {
    return update(sofortMerchantTransactionId, noteTextSofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId, Integer monetaryAccountId) {
    return update(sofortMerchantTransactionId, noteTextSofortMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId, Integer monetaryAccountId, String content) {
    return update(sofortMerchantTransactionId, noteTextSofortMerchantTransactionId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextSofortMerchantTransaction> delete(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId, noteTextSofortMerchantTransactionId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextSofortMerchantTransaction> delete(Integer sofortMerchantTransactionId) {
    return delete(sofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<NoteTextSofortMerchantTransaction> delete(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId) {
    return delete(sofortMerchantTransactionId, noteTextSofortMerchantTransactionId, null, null);
  }

  public static BunqResponse<NoteTextSofortMerchantTransaction> delete(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId, Integer monetaryAccountId) {
    return delete(sofortMerchantTransactionId, noteTextSofortMerchantTransactionId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteTextSofortMerchantTransaction>> list(Integer sofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId), params, customHeaders);

    return fromJsonList(NoteTextSofortMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextSofortMerchantTransaction>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextSofortMerchantTransaction>> list(Integer sofortMerchantTransactionId) {
    return list(sofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<List<NoteTextSofortMerchantTransaction>> list(Integer sofortMerchantTransactionId, Integer monetaryAccountId) {
    return list(sofortMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextSofortMerchantTransaction>> list(Integer sofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return list(sofortMerchantTransactionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextSofortMerchantTransaction> get(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId, noteTextSofortMerchantTransactionId), params, customHeaders);

    return fromJson(NoteTextSofortMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextSofortMerchantTransaction> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextSofortMerchantTransaction> get(Integer sofortMerchantTransactionId) {
    return get(sofortMerchantTransactionId, null, null, null, null);
  }

  public static BunqResponse<NoteTextSofortMerchantTransaction> get(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId) {
    return get(sofortMerchantTransactionId, noteTextSofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<NoteTextSofortMerchantTransaction> get(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId, Integer monetaryAccountId) {
    return get(sofortMerchantTransactionId, noteTextSofortMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextSofortMerchantTransaction> get(Integer sofortMerchantTransactionId, Integer noteTextSofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(sofortMerchantTransactionId, noteTextSofortMerchantTransactionId, monetaryAccountId, params, null);
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
  public static NoteTextSofortMerchantTransaction fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextSofortMerchantTransaction.class, reader);
  }

}
