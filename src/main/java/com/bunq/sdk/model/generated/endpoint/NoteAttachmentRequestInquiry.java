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
public class NoteAttachmentRequestInquiry extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry/%s/note-attachment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/request-inquiry/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry/%s/note-attachment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/request-inquiry/%s/note-attachment/%s";

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

  public NoteAttachmentRequestInquiry() {
    this(null, null);
  }

  public NoteAttachmentRequestInquiry(Integer attachmentId) {
    this(attachmentId, null);
  }

  public NoteAttachmentRequestInquiry(Integer attachmentId, String description) {
    this.descriptionFieldForRequest = description;
    this.attachmentIdFieldForRequest = attachmentId;
  }

  /**
   * @param attachmentId The reference to the uploaded file to attach to this note.
   * @param description  Optional description of the attachment.
   */
  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer attachmentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_ATTACHMENT_ID, attachmentId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId) {
    return create(requestInquiryId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer attachmentId) {
    return create(requestInquiryId, attachmentId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer attachmentId, Integer monetaryAccountId) {
    return create(requestInquiryId, attachmentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer attachmentId, Integer monetaryAccountId, String description) {
    return create(requestInquiryId, attachmentId, monetaryAccountId, description, null);
  }

  /**
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId, noteAttachmentRequestInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId) {
    return update(requestInquiryId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId) {
    return update(requestInquiryId, noteAttachmentRequestInquiryId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId, Integer monetaryAccountId) {
    return update(requestInquiryId, noteAttachmentRequestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId, Integer monetaryAccountId, String description) {
    return update(requestInquiryId, noteAttachmentRequestInquiryId, monetaryAccountId, description, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentRequestInquiry> delete(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId, noteAttachmentRequestInquiryId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteAttachmentRequestInquiry> delete(Integer requestInquiryId) {
    return delete(requestInquiryId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentRequestInquiry> delete(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId) {
    return delete(requestInquiryId, noteAttachmentRequestInquiryId, null, null);
  }

  public static BunqResponse<NoteAttachmentRequestInquiry> delete(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId, Integer monetaryAccountId) {
    return delete(requestInquiryId, noteAttachmentRequestInquiryId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteAttachmentRequestInquiry>> list(Integer requestInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId), params, customHeaders);

    return fromJsonList(NoteAttachmentRequestInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteAttachmentRequestInquiry>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentRequestInquiry>> list(Integer requestInquiryId) {
    return list(requestInquiryId, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentRequestInquiry>> list(Integer requestInquiryId, Integer monetaryAccountId) {
    return list(requestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteAttachmentRequestInquiry>> list(Integer requestInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return list(requestInquiryId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentRequestInquiry> get(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId, noteAttachmentRequestInquiryId), params, customHeaders);

    return fromJson(NoteAttachmentRequestInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteAttachmentRequestInquiry> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentRequestInquiry> get(Integer requestInquiryId) {
    return get(requestInquiryId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentRequestInquiry> get(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId) {
    return get(requestInquiryId, noteAttachmentRequestInquiryId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentRequestInquiry> get(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId, Integer monetaryAccountId) {
    return get(requestInquiryId, noteAttachmentRequestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteAttachmentRequestInquiry> get(Integer requestInquiryId, Integer noteAttachmentRequestInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return get(requestInquiryId, noteAttachmentRequestInquiryId, monetaryAccountId, params, null);
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
  public static NoteAttachmentRequestInquiry fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteAttachmentRequestInquiry.class, reader);
  }

}
