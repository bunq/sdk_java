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
public class NoteAttachmentWhitelistResult extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_ATTACHMENT_ID = "attachment_id";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-attachment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-attachment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/whitelist/%s/whitelist-result/%s/note-attachment/%s";
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

  public NoteAttachmentWhitelistResult() {
    this(null, null);
  }

  public NoteAttachmentWhitelistResult(Integer attachmentId) {
    this(attachmentId, null);
  }

  public NoteAttachmentWhitelistResult(Integer attachmentId, String description) {
    this.descriptionFieldForRequest = description;
    this.attachmentIdFieldForRequest = attachmentId;
  }

  /**
   * @param attachmentId The reference to the uploaded file to attach to this note.
   * @param description  Optional description of the attachment.
   */
  public static BunqResponse<Integer> create(Integer whitelistId, Integer whitelistResultId, Integer attachmentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_ATTACHMENT_ID, attachmentId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer whitelistId) {
    return create(whitelistId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer whitelistId, Integer whitelistResultId) {
    return create(whitelistId, whitelistResultId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer whitelistId, Integer whitelistResultId, Integer attachmentId) {
    return create(whitelistId, whitelistResultId, attachmentId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer whitelistId, Integer whitelistResultId, Integer attachmentId, Integer monetaryAccountId) {
    return create(whitelistId, whitelistResultId, attachmentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer whitelistId, Integer whitelistResultId, Integer attachmentId, Integer monetaryAccountId, String description) {
    return create(whitelistId, whitelistResultId, attachmentId, monetaryAccountId, description, null);
  }

  /**
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> update(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId, noteAttachmentWhitelistResultId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer whitelistId) {
    return update(whitelistId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer whitelistId, Integer whitelistResultId) {
    return update(whitelistId, whitelistResultId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId) {
    return update(whitelistId, whitelistResultId, noteAttachmentWhitelistResultId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId, Integer monetaryAccountId) {
    return update(whitelistId, whitelistResultId, noteAttachmentWhitelistResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId, Integer monetaryAccountId, String description) {
    return update(whitelistId, whitelistResultId, noteAttachmentWhitelistResultId, monetaryAccountId, description, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentWhitelistResult> delete(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId, noteAttachmentWhitelistResultId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> delete(Integer whitelistId) {
    return delete(whitelistId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> delete(Integer whitelistId, Integer whitelistResultId) {
    return delete(whitelistId, whitelistResultId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> delete(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId) {
    return delete(whitelistId, whitelistResultId, noteAttachmentWhitelistResultId, null, null);
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> delete(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId, Integer monetaryAccountId) {
    return delete(whitelistId, whitelistResultId, noteAttachmentWhitelistResultId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteAttachmentWhitelistResult>> list(Integer whitelistId, Integer whitelistResultId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId), params, customHeaders);

    return fromJsonList(NoteAttachmentWhitelistResult.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteAttachmentWhitelistResult>> list() {
    return list(null, null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentWhitelistResult>> list(Integer whitelistId) {
    return list(whitelistId, null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentWhitelistResult>> list(Integer whitelistId, Integer whitelistResultId) {
    return list(whitelistId, whitelistResultId, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentWhitelistResult>> list(Integer whitelistId, Integer whitelistResultId, Integer monetaryAccountId) {
    return list(whitelistId, whitelistResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteAttachmentWhitelistResult>> list(Integer whitelistId, Integer whitelistResultId, Integer monetaryAccountId, Map<String, String> params) {
    return list(whitelistId, whitelistResultId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentWhitelistResult> get(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), whitelistId, whitelistResultId, noteAttachmentWhitelistResultId), params, customHeaders);

    return fromJson(NoteAttachmentWhitelistResult.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> get() {
    return get(null, null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> get(Integer whitelistId) {
    return get(whitelistId, null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> get(Integer whitelistId, Integer whitelistResultId) {
    return get(whitelistId, whitelistResultId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> get(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId) {
    return get(whitelistId, whitelistResultId, noteAttachmentWhitelistResultId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> get(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId, Integer monetaryAccountId) {
    return get(whitelistId, whitelistResultId, noteAttachmentWhitelistResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteAttachmentWhitelistResult> get(Integer whitelistId, Integer whitelistResultId, Integer noteAttachmentWhitelistResultId, Integer monetaryAccountId, Map<String, String> params) {
    return get(whitelistId, whitelistResultId, noteAttachmentWhitelistResultId, monetaryAccountId, params, null);
  }

  /**
   */
  public static NoteAttachmentWhitelistResult fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteAttachmentWhitelistResult.class, reader);
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

}
