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
public class NoteAttachmentSchedulePaymentApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment/%s/note-attachment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule-payment/%s/note-attachment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-payment/%s/note-attachment/%s";

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

  public NoteAttachmentSchedulePaymentApiObject() {
  this(null, null);
  }

  public NoteAttachmentSchedulePaymentApiObject(Integer attachmentId) {
  this(attachmentId, null);
  }

  public NoteAttachmentSchedulePaymentApiObject(Integer attachmentId, String description) {
    this.descriptionFieldForRequest = description;
    this.attachmentIdFieldForRequest = attachmentId;
  }  /**
   * @param attachmentId The reference to the uploaded file to attach to this note.
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> create(Integer schedulePaymentId, Integer attachmentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_ATTACHMENT_ID, attachmentId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer schedulePaymentId) {
    return create(schedulePaymentId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer schedulePaymentId, Integer attachmentId) {
    return create(schedulePaymentId, attachmentId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer schedulePaymentId, Integer attachmentId, Integer monetaryAccountId) {
    return create(schedulePaymentId, attachmentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer schedulePaymentId, Integer attachmentId, Integer monetaryAccountId, String description) {
    return create(schedulePaymentId, attachmentId, monetaryAccountId, description, null);
  }

  /**
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> update(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DESCRIPTION, description);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId, noteAttachmentSchedulePaymentId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentId) {
    return update(schedulePaymentId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId) {
    return update(schedulePaymentId, noteAttachmentSchedulePaymentId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId, Integer monetaryAccountId) {
    return update(schedulePaymentId, noteAttachmentSchedulePaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId, Integer monetaryAccountId, String description) {
    return update(schedulePaymentId, noteAttachmentSchedulePaymentId, monetaryAccountId, description, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> delete(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId, noteAttachmentSchedulePaymentId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> delete(Integer schedulePaymentId) {
    return delete(schedulePaymentId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> delete(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId) {
    return delete(schedulePaymentId, noteAttachmentSchedulePaymentId, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> delete(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId, Integer monetaryAccountId) {
    return delete(schedulePaymentId, noteAttachmentSchedulePaymentId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteAttachmentSchedulePaymentApiObject>> list(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), params, customHeaders);

    return fromJsonList(NoteAttachmentSchedulePaymentApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteAttachmentSchedulePaymentApiObject>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentSchedulePaymentApiObject>> list(Integer schedulePaymentId) {
    return list(schedulePaymentId, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentSchedulePaymentApiObject>> list(Integer schedulePaymentId, Integer monetaryAccountId) {
    return list(schedulePaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteAttachmentSchedulePaymentApiObject>> list(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> params) {
    return list(schedulePaymentId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> get(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId, noteAttachmentSchedulePaymentId), params, customHeaders);

    return fromJson(NoteAttachmentSchedulePaymentApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> get(Integer schedulePaymentId) {
    return get(schedulePaymentId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> get(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId) {
    return get(schedulePaymentId, noteAttachmentSchedulePaymentId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> get(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId, Integer monetaryAccountId) {
    return get(schedulePaymentId, noteAttachmentSchedulePaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentApiObject> get(Integer schedulePaymentId, Integer noteAttachmentSchedulePaymentId, Integer monetaryAccountId, Map<String, String> params) {
    return get(schedulePaymentId, noteAttachmentSchedulePaymentId, monetaryAccountId, params, null);
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
  public static NoteAttachmentSchedulePaymentApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteAttachmentSchedulePaymentApiObject.class, reader);
  }

}
