package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AttachmentMonetaryAccountPaymentObject;
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
 * Used to manage attachment notes.
 */
public class NoteAttachmentAdyenCardTransactionApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-attachment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-attachment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/adyen-card-transaction/%s/note-attachment/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_ATTACHMENT_ID = "attachment_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "NoteAttachment";

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
  private LabelUserObject labelUserCreator;

  /**
   * Optional description of the attachment.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The attachment attached to the note.
   */
  @Expose
  @SerializedName("attachment")
  private List<AttachmentMonetaryAccountPaymentObject> attachment;

  /**
   * Optional description of the attachment.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The reference to the uploaded file to attach to this note.
   */
  @Expose
  @SerializedName("attachment_id_field_for_request")
  private Integer attachmentIdFieldForRequest;

  public NoteAttachmentAdyenCardTransactionApiObject() {
  this(null, null);
  }

  public NoteAttachmentAdyenCardTransactionApiObject(Integer attachmentId) {
  this(attachmentId, null);
  }

  public NoteAttachmentAdyenCardTransactionApiObject(Integer attachmentId, String description) {
    this.descriptionFieldForRequest = description;
    this.attachmentIdFieldForRequest = attachmentId;
  }  /**
   * @param attachmentId The reference to the uploaded file to attach to this note.
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> create(Integer adyenCardTransactionId, Integer attachmentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_ATTACHMENT_ID, attachmentId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer adyenCardTransactionId) {
    return create(adyenCardTransactionId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer adyenCardTransactionId, Integer attachmentId) {
    return create(adyenCardTransactionId, attachmentId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer adyenCardTransactionId, Integer attachmentId, Integer monetaryAccountId) {
    return create(adyenCardTransactionId, attachmentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer adyenCardTransactionId, Integer attachmentId, Integer monetaryAccountId, String description) {
    return create(adyenCardTransactionId, attachmentId, monetaryAccountId, description, null);
  }

  /**
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> update(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DESCRIPTION, description);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId, noteAttachmentAdyenCardTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer adyenCardTransactionId) {
    return update(adyenCardTransactionId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId) {
    return update(adyenCardTransactionId, noteAttachmentAdyenCardTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId, Integer monetaryAccountId) {
    return update(adyenCardTransactionId, noteAttachmentAdyenCardTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId, Integer monetaryAccountId, String description) {
    return update(adyenCardTransactionId, noteAttachmentAdyenCardTransactionId, monetaryAccountId, description, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> delete(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId, noteAttachmentAdyenCardTransactionId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> delete(Integer adyenCardTransactionId) {
    return delete(adyenCardTransactionId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> delete(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId) {
    return delete(adyenCardTransactionId, noteAttachmentAdyenCardTransactionId, null, null);
  }

  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> delete(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId, Integer monetaryAccountId) {
    return delete(adyenCardTransactionId, noteAttachmentAdyenCardTransactionId, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<List<NoteAttachmentAdyenCardTransactionApiObject>> list(Integer adyenCardTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId), params, customHeaders);

    return fromJsonList(NoteAttachmentAdyenCardTransactionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteAttachmentAdyenCardTransactionApiObject>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentAdyenCardTransactionApiObject>> list(Integer adyenCardTransactionId) {
    return list(adyenCardTransactionId, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentAdyenCardTransactionApiObject>> list(Integer adyenCardTransactionId, Integer monetaryAccountId) {
    return list(adyenCardTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteAttachmentAdyenCardTransactionApiObject>> list(Integer adyenCardTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return list(adyenCardTransactionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> get(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), adyenCardTransactionId, noteAttachmentAdyenCardTransactionId), params, customHeaders);

    return fromJson(NoteAttachmentAdyenCardTransactionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> get(Integer adyenCardTransactionId) {
    return get(adyenCardTransactionId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> get(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId) {
    return get(adyenCardTransactionId, noteAttachmentAdyenCardTransactionId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> get(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId, Integer monetaryAccountId) {
    return get(adyenCardTransactionId, noteAttachmentAdyenCardTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteAttachmentAdyenCardTransactionApiObject> get(Integer adyenCardTransactionId, Integer noteAttachmentAdyenCardTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(adyenCardTransactionId, noteAttachmentAdyenCardTransactionId, monetaryAccountId, params, null);
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
  public LabelUserObject getLabelUserCreator() {
    return this.labelUserCreator;
  }

  public void setLabelUserCreator(LabelUserObject labelUserCreator) {
    this.labelUserCreator = labelUserCreator;
  }

  /**
   * Optional description of the attachment.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The attachment attached to the note.
   */
  public List<AttachmentMonetaryAccountPaymentObject> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentMonetaryAccountPaymentObject> attachment) {
    this.attachment = attachment;
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

    if (this.description != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NoteAttachmentAdyenCardTransactionApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteAttachmentAdyenCardTransactionApiObject.class, reader);
  }

}
