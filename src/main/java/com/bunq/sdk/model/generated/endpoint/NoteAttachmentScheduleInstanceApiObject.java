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
public class NoteAttachmentScheduleInstanceApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-attachment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-attachment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s/note-attachment/%s";

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

  public NoteAttachmentScheduleInstanceApiObject() {
  this(null, null);
  }

  public NoteAttachmentScheduleInstanceApiObject(Integer attachmentId) {
  this(attachmentId, null);
  }

  public NoteAttachmentScheduleInstanceApiObject(Integer attachmentId, String description) {
    this.descriptionFieldForRequest = description;
    this.attachmentIdFieldForRequest = attachmentId;
  }  /**
   * @param attachmentId The reference to the uploaded file to attach to this note.
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> create(Integer scheduleId, Integer scheduleInstanceId, Integer attachmentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_ATTACHMENT_ID, attachmentId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleId) {
    return create(scheduleId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleId, Integer scheduleInstanceId) {
    return create(scheduleId, scheduleInstanceId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleId, Integer scheduleInstanceId, Integer attachmentId) {
    return create(scheduleId, scheduleInstanceId, attachmentId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleId, Integer scheduleInstanceId, Integer attachmentId, Integer monetaryAccountId) {
    return create(scheduleId, scheduleInstanceId, attachmentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer scheduleId, Integer scheduleInstanceId, Integer attachmentId, Integer monetaryAccountId, String description) {
    return create(scheduleId, scheduleInstanceId, attachmentId, monetaryAccountId, description, null);
  }

  /**
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DESCRIPTION, description);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer scheduleId) {
    return update(scheduleId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId) {
    return update(scheduleId, scheduleInstanceId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId) {
    return update(scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId, Integer monetaryAccountId) {
    return update(scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId, Integer monetaryAccountId, String description) {
    return update(scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId, monetaryAccountId, description, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> delete(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> delete(Integer scheduleId) {
    return delete(scheduleId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> delete(Integer scheduleId, Integer scheduleInstanceId) {
    return delete(scheduleId, scheduleInstanceId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> delete(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId) {
    return delete(scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId, null, null);
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> delete(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId, Integer monetaryAccountId) {
    return delete(scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteAttachmentScheduleInstanceApiObject>> list(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId), params, customHeaders);

    return fromJsonList(NoteAttachmentScheduleInstanceApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteAttachmentScheduleInstanceApiObject>> list() {
    return list(null, null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentScheduleInstanceApiObject>> list(Integer scheduleId) {
    return list(scheduleId, null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentScheduleInstanceApiObject>> list(Integer scheduleId, Integer scheduleInstanceId) {
    return list(scheduleId, scheduleInstanceId, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentScheduleInstanceApiObject>> list(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId) {
    return list(scheduleId, scheduleInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteAttachmentScheduleInstanceApiObject>> list(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, Map<String, String> params) {
    return list(scheduleId, scheduleInstanceId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> get(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId), params, customHeaders);

    return fromJson(NoteAttachmentScheduleInstanceApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> get() {
    return get(null, null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> get(Integer scheduleId) {
    return get(scheduleId, null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> get(Integer scheduleId, Integer scheduleInstanceId) {
    return get(scheduleId, scheduleInstanceId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> get(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId) {
    return get(scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> get(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId, Integer monetaryAccountId) {
    return get(scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteAttachmentScheduleInstanceApiObject> get(Integer scheduleId, Integer scheduleInstanceId, Integer noteAttachmentScheduleInstanceId, Integer monetaryAccountId, Map<String, String> params) {
    return get(scheduleId, scheduleInstanceId, noteAttachmentScheduleInstanceId, monetaryAccountId, params, null);
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
  public static NoteAttachmentScheduleInstanceApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteAttachmentScheduleInstanceApiObject.class, reader);
  }

}
