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
public class NoteAttachmentDraftPayment extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/draft-payment/%s/note-attachment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/draft-payment/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/draft-payment/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/draft-payment/%s/note-attachment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/draft-payment/%s/note-attachment/%s";

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

  public NoteAttachmentDraftPayment() {
    this(null, null);
  }

  public NoteAttachmentDraftPayment(Integer attachmentId) {
    this(attachmentId, null);
  }

  public NoteAttachmentDraftPayment(Integer attachmentId, String description) {
    this.descriptionFieldForRequest = description;
    this.attachmentIdFieldForRequest = attachmentId;
  }

  /**
   * @param attachmentId The reference to the uploaded file to attach to this note.
   * @param description  Optional description of the attachment.
   */
  public static BunqResponse<Integer> create(Integer draftPaymentId, Integer attachmentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_ATTACHMENT_ID, attachmentId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), draftPaymentId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer draftPaymentId) {
    return create(draftPaymentId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer draftPaymentId, Integer attachmentId) {
    return create(draftPaymentId, attachmentId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer draftPaymentId, Integer attachmentId, Integer monetaryAccountId) {
    return create(draftPaymentId, attachmentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer draftPaymentId, Integer attachmentId, Integer monetaryAccountId, String description) {
    return create(draftPaymentId, attachmentId, monetaryAccountId, description, null);
  }

  /**
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> update(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), draftPaymentId, noteAttachmentDraftPaymentId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer draftPaymentId) {
    return update(draftPaymentId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId) {
    return update(draftPaymentId, noteAttachmentDraftPaymentId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId, Integer monetaryAccountId) {
    return update(draftPaymentId, noteAttachmentDraftPaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId, Integer monetaryAccountId, String description) {
    return update(draftPaymentId, noteAttachmentDraftPaymentId, monetaryAccountId, description, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentDraftPayment> delete(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), draftPaymentId, noteAttachmentDraftPaymentId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteAttachmentDraftPayment> delete(Integer draftPaymentId) {
    return delete(draftPaymentId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentDraftPayment> delete(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId) {
    return delete(draftPaymentId, noteAttachmentDraftPaymentId, null, null);
  }

  public static BunqResponse<NoteAttachmentDraftPayment> delete(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId, Integer monetaryAccountId) {
    return delete(draftPaymentId, noteAttachmentDraftPaymentId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteAttachmentDraftPayment>> list(Integer draftPaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), draftPaymentId), params, customHeaders);

    return fromJsonList(NoteAttachmentDraftPayment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteAttachmentDraftPayment>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentDraftPayment>> list(Integer draftPaymentId) {
    return list(draftPaymentId, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentDraftPayment>> list(Integer draftPaymentId, Integer monetaryAccountId) {
    return list(draftPaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteAttachmentDraftPayment>> list(Integer draftPaymentId, Integer monetaryAccountId, Map<String, String> params) {
    return list(draftPaymentId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentDraftPayment> get(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), draftPaymentId, noteAttachmentDraftPaymentId), params, customHeaders);

    return fromJson(NoteAttachmentDraftPayment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteAttachmentDraftPayment> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentDraftPayment> get(Integer draftPaymentId) {
    return get(draftPaymentId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentDraftPayment> get(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId) {
    return get(draftPaymentId, noteAttachmentDraftPaymentId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentDraftPayment> get(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId, Integer monetaryAccountId) {
    return get(draftPaymentId, noteAttachmentDraftPaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteAttachmentDraftPayment> get(Integer draftPaymentId, Integer noteAttachmentDraftPaymentId, Integer monetaryAccountId, Map<String, String> params) {
    return get(draftPaymentId, noteAttachmentDraftPaymentId, monetaryAccountId, params, null);
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
  public static NoteAttachmentDraftPayment fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteAttachmentDraftPayment.class, reader);
  }

}
