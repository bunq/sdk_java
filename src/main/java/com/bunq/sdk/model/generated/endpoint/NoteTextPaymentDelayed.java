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
public class NoteTextPaymentDelayed extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/payment-delayed/%s/note-text";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/payment-delayed/%s/note-text/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/payment-delayed/%s/note-text/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/payment-delayed/%s/note-text";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment-delayed/%s/note-text/%s";

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

  public NoteTextPaymentDelayed() {
  this(null);
  }

  public NoteTextPaymentDelayed(String content) {
    this.contentFieldForRequest = content;
  }  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> create(Integer paymentDelayedId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentDelayedId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer paymentDelayedId) {
    return create(paymentDelayedId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer paymentDelayedId, Integer monetaryAccountId) {
    return create(paymentDelayedId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer paymentDelayedId, Integer monetaryAccountId, String content) {
    return create(paymentDelayedId, monetaryAccountId, content, null);
  }

  /**
   * @param content The content of the note.
   */
  public static BunqResponse<Integer> update(Integer paymentDelayedId, Integer noteTextPaymentDelayedId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CONTENT, content);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentDelayedId, noteTextPaymentDelayedId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer paymentDelayedId) {
    return update(paymentDelayedId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer paymentDelayedId, Integer noteTextPaymentDelayedId) {
    return update(paymentDelayedId, noteTextPaymentDelayedId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer paymentDelayedId, Integer noteTextPaymentDelayedId, Integer monetaryAccountId) {
    return update(paymentDelayedId, noteTextPaymentDelayedId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer paymentDelayedId, Integer noteTextPaymentDelayedId, Integer monetaryAccountId, String content) {
    return update(paymentDelayedId, noteTextPaymentDelayedId, monetaryAccountId, content, null);
  }

  /**
   */
  public static BunqResponse<NoteTextPaymentDelayed> delete(Integer paymentDelayedId, Integer noteTextPaymentDelayedId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentDelayedId, noteTextPaymentDelayedId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteTextPaymentDelayed> delete(Integer paymentDelayedId) {
    return delete(paymentDelayedId, null, null, null);
  }

  public static BunqResponse<NoteTextPaymentDelayed> delete(Integer paymentDelayedId, Integer noteTextPaymentDelayedId) {
    return delete(paymentDelayedId, noteTextPaymentDelayedId, null, null);
  }

  public static BunqResponse<NoteTextPaymentDelayed> delete(Integer paymentDelayedId, Integer noteTextPaymentDelayedId, Integer monetaryAccountId) {
    return delete(paymentDelayedId, noteTextPaymentDelayedId, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<List<NoteTextPaymentDelayed>> list(Integer paymentDelayedId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentDelayedId), params, customHeaders);

    return fromJsonList(NoteTextPaymentDelayed.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteTextPaymentDelayed>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteTextPaymentDelayed>> list(Integer paymentDelayedId) {
    return list(paymentDelayedId, null, null, null);
  }

  public static BunqResponse<List<NoteTextPaymentDelayed>> list(Integer paymentDelayedId, Integer monetaryAccountId) {
    return list(paymentDelayedId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteTextPaymentDelayed>> list(Integer paymentDelayedId, Integer monetaryAccountId, Map<String, String> params) {
    return list(paymentDelayedId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteTextPaymentDelayed> get(Integer paymentDelayedId, Integer noteTextPaymentDelayedId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentDelayedId, noteTextPaymentDelayedId), params, customHeaders);

    return fromJson(NoteTextPaymentDelayed.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteTextPaymentDelayed> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteTextPaymentDelayed> get(Integer paymentDelayedId) {
    return get(paymentDelayedId, null, null, null, null);
  }

  public static BunqResponse<NoteTextPaymentDelayed> get(Integer paymentDelayedId, Integer noteTextPaymentDelayedId) {
    return get(paymentDelayedId, noteTextPaymentDelayedId, null, null, null);
  }

  public static BunqResponse<NoteTextPaymentDelayed> get(Integer paymentDelayedId, Integer noteTextPaymentDelayedId, Integer monetaryAccountId) {
    return get(paymentDelayedId, noteTextPaymentDelayedId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteTextPaymentDelayed> get(Integer paymentDelayedId, Integer noteTextPaymentDelayedId, Integer monetaryAccountId, Map<String, String> params) {
    return get(paymentDelayedId, noteTextPaymentDelayedId, monetaryAccountId, params, null);
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
  public static NoteTextPaymentDelayed fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteTextPaymentDelayed.class, reader);
  }

}
