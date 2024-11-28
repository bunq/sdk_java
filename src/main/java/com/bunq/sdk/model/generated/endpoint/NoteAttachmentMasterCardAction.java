package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AttachmentMonetaryAccountPayment;
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
 * Used to manage attachment notes.
 */
public class NoteAttachmentMasterCardAction extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/mastercard-action/%s/note-attachment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/mastercard-action/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/mastercard-action/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/mastercard-action/%s/note-attachment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/mastercard-action/%s/note-attachment/%s";

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

  public NoteAttachmentMasterCardAction() {
  this(null, null);
  }

  public NoteAttachmentMasterCardAction(String description) {
  this(description, null);
  }

  public NoteAttachmentMasterCardAction(String description, Integer attachmentId) {
    this.descriptionFieldForRequest = description;
    this.attachmentIdFieldForRequest = attachmentId;
  }  /**
   * @param description Optional description of the attachment.
   * @param attachmentId The reference to the uploaded file to attach to this note.
   */
  public static BunqResponse<Integer> create(Integer mastercardActionId, String description, Integer attachmentId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_ATTACHMENT_ID, attachmentId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), mastercardActionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer mastercardActionId) {
    return create(mastercardActionId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer mastercardActionId, String description) {
    return create(mastercardActionId, description, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer mastercardActionId, String description, Integer attachmentId) {
    return create(mastercardActionId, description, attachmentId, null, null);
  }

  public static BunqResponse<Integer> create(Integer mastercardActionId, String description, Integer attachmentId, Integer monetaryAccountId) {
    return create(mastercardActionId, description, attachmentId, monetaryAccountId, null);
  }

  /**
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> update(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DESCRIPTION, description);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), mastercardActionId, noteAttachmentMasterCardActionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer mastercardActionId) {
    return update(mastercardActionId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId) {
    return update(mastercardActionId, noteAttachmentMasterCardActionId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId, Integer monetaryAccountId) {
    return update(mastercardActionId, noteAttachmentMasterCardActionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId, Integer monetaryAccountId, String description) {
    return update(mastercardActionId, noteAttachmentMasterCardActionId, monetaryAccountId, description, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentMasterCardAction> delete(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), mastercardActionId, noteAttachmentMasterCardActionId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteAttachmentMasterCardAction> delete(Integer mastercardActionId) {
    return delete(mastercardActionId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentMasterCardAction> delete(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId) {
    return delete(mastercardActionId, noteAttachmentMasterCardActionId, null, null);
  }

  public static BunqResponse<NoteAttachmentMasterCardAction> delete(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId, Integer monetaryAccountId) {
    return delete(mastercardActionId, noteAttachmentMasterCardActionId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteAttachmentMasterCardAction>> list(Integer mastercardActionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), mastercardActionId), params, customHeaders);

    return fromJsonList(NoteAttachmentMasterCardAction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteAttachmentMasterCardAction>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentMasterCardAction>> list(Integer mastercardActionId) {
    return list(mastercardActionId, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentMasterCardAction>> list(Integer mastercardActionId, Integer monetaryAccountId) {
    return list(mastercardActionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteAttachmentMasterCardAction>> list(Integer mastercardActionId, Integer monetaryAccountId, Map<String, String> params) {
    return list(mastercardActionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentMasterCardAction> get(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), mastercardActionId, noteAttachmentMasterCardActionId), params, customHeaders);

    return fromJson(NoteAttachmentMasterCardAction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteAttachmentMasterCardAction> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentMasterCardAction> get(Integer mastercardActionId) {
    return get(mastercardActionId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentMasterCardAction> get(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId) {
    return get(mastercardActionId, noteAttachmentMasterCardActionId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentMasterCardAction> get(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId, Integer monetaryAccountId) {
    return get(mastercardActionId, noteAttachmentMasterCardActionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteAttachmentMasterCardAction> get(Integer mastercardActionId, Integer noteAttachmentMasterCardActionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(mastercardActionId, noteAttachmentMasterCardActionId, monetaryAccountId, params, null);
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
  public static NoteAttachmentMasterCardAction fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteAttachmentMasterCardAction.class, reader);
  }

}
