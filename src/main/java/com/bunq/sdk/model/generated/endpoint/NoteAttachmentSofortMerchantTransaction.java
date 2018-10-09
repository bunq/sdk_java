package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.AttachmentMonetaryAccountPayment;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to manage attachment notes.
 */
public class NoteAttachmentSofortMerchantTransaction extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-attachment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-attachment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s/note-attachment/%s";

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
  private LabelUser labelUserCreator;

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
  private List<AttachmentMonetaryAccountPayment> attachment;

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

  public NoteAttachmentSofortMerchantTransaction() {
    this(null, null);
  }

  public NoteAttachmentSofortMerchantTransaction(Integer attachmentId) {
    this(attachmentId, null);
  }

  public NoteAttachmentSofortMerchantTransaction(Integer attachmentId, String description) {
    this.descriptionFieldForRequest = description;
    this.attachmentIdFieldForRequest = attachmentId;
  }

  /**
   * @param attachmentId The reference to the uploaded file to attach to this note.
   * @param description  Optional description of the attachment.
   */
  public static BunqResponse<Integer> create(Integer sofortMerchantTransactionId, Integer attachmentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_ATTACHMENT_ID, attachmentId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer sofortMerchantTransactionId) {
    return create(sofortMerchantTransactionId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer sofortMerchantTransactionId, Integer attachmentId) {
    return create(sofortMerchantTransactionId, attachmentId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer sofortMerchantTransactionId, Integer attachmentId, Integer monetaryAccountId) {
    return create(sofortMerchantTransactionId, attachmentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer sofortMerchantTransactionId, Integer attachmentId, Integer monetaryAccountId, String description) {
    return create(sofortMerchantTransactionId, attachmentId, monetaryAccountId, description, null);
  }

  /**
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId) {
    return update(sofortMerchantTransactionId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId) {
    return update(sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId, Integer monetaryAccountId) {
    return update(sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId, Integer monetaryAccountId, String description) {
    return update(sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId, monetaryAccountId, description, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> delete(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> delete(Integer sofortMerchantTransactionId) {
    return delete(sofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> delete(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId) {
    return delete(sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId, null, null);
  }

  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> delete(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId, Integer monetaryAccountId) {
    return delete(sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteAttachmentSofortMerchantTransaction>> list(Integer sofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId), params, customHeaders);

    return fromJsonList(NoteAttachmentSofortMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteAttachmentSofortMerchantTransaction>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentSofortMerchantTransaction>> list(Integer sofortMerchantTransactionId) {
    return list(sofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentSofortMerchantTransaction>> list(Integer sofortMerchantTransactionId, Integer monetaryAccountId) {
    return list(sofortMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteAttachmentSofortMerchantTransaction>> list(Integer sofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return list(sofortMerchantTransactionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> get(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId), params, customHeaders);

    return fromJson(NoteAttachmentSofortMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> get(Integer sofortMerchantTransactionId) {
    return get(sofortMerchantTransactionId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> get(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId) {
    return get(sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> get(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId, Integer monetaryAccountId) {
    return get(sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteAttachmentSofortMerchantTransaction> get(Integer sofortMerchantTransactionId, Integer noteAttachmentSofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(sofortMerchantTransactionId, noteAttachmentSofortMerchantTransactionId, monetaryAccountId, params, null);
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
  public List<AttachmentMonetaryAccountPayment> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentMonetaryAccountPayment> attachment) {
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
  public static NoteAttachmentSofortMerchantTransaction fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteAttachmentSofortMerchantTransaction.class, reader);
  }

}
