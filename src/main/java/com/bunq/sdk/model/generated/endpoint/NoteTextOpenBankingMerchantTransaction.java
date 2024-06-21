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
public class NoteTextOpenBankingMerchantTransaction extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/open-banking-merchant-transaction/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/open-banking-merchant-transaction/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/open-banking-merchant-transaction/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/open-banking-merchant-transaction/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/open-banking-merchant-transaction/%s/note-text/%s";

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

  public NoteTextOpenBankingMerchantTransaction() {
  this(null);
  }

  public NoteTextOpenBankingMerchantTransaction(String content) {
    this.contentFieldForRequest = content;
  }  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer openBankingMerchantTransactionId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), openBankingMerchantTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer openBankingMerchantTransactionId) {
    return create(openBankingMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer openBankingMerchantTransactionId, Integer monetaryAccountId) {
    return create(openBankingMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer openBankingMerchantTransactionId, Integer monetaryAccountId, String content) {
    return create(openBankingMerchantTransactionId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer openBankingMerchantTransactionId) {
    return update(openBankingMerchantTransactionId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId) {
    return update(openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId, Integer monetaryAccountId) {
    return update(openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId, Integer monetaryAccountId, String content) {
    return update(openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> delete(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> delete(Integer openBankingMerchantTransactionId) {
    return delete(openBankingMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> delete(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId) {
    return delete(openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId, null, null);
  }

  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> delete(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId, Integer monetaryAccountId) {
    return delete(openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<List<NoteTextOpenBankingMerchantTransaction>> list(Integer openBankingMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), openBankingMerchantTransactionId), params, customHeaders);

    return fromJsonList(NoteTextOpenBankingMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextOpenBankingMerchantTransaction>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextOpenBankingMerchantTransaction>> list(Integer openBankingMerchantTransactionId) {
    return list(openBankingMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<List<NoteTextOpenBankingMerchantTransaction>> list(Integer openBankingMerchantTransactionId, Integer monetaryAccountId) {
    return list(openBankingMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextOpenBankingMerchantTransaction>> list(Integer openBankingMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return list(openBankingMerchantTransactionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> get(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId), params, customHeaders);

    return fromJson(NoteTextOpenBankingMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> get(Integer openBankingMerchantTransactionId) {
    return get(openBankingMerchantTransactionId, null, null, null, null);
  }

  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> get(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId) {
    return get(openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> get(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId, Integer monetaryAccountId) {
    return get(openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextOpenBankingMerchantTransaction> get(Integer openBankingMerchantTransactionId, Integer noteTextOpenBankingMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(openBankingMerchantTransactionId, noteTextOpenBankingMerchantTransactionId, monetaryAccountId, params, null);
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
  public static NoteTextOpenBankingMerchantTransaction fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextOpenBankingMerchantTransaction.class, reader);
  }

}
