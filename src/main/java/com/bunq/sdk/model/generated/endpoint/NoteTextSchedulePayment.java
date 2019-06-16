package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to manage text notes.
 */
public class NoteTextSchedulePayment extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_CONTENT = "content";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment/%s/note-text";
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment/%s/note-text/%s";
    protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment/%s/note-text/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule-payment/%s/note-text";
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-payment/%s/note-text/%s";
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

    public NoteTextSchedulePayment() {
        this(null);
    }

    public NoteTextSchedulePayment(String content) {
        this.contentFieldForRequest = content;
    }

    /**
     * @param content The content of the note.
     */
    public static BunqResponse<Integer> create(Integer schedulePaymentId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_CONTENT, content);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer schedulePaymentId) {
        return create(schedulePaymentId, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer schedulePaymentId, Integer monetaryAccountId) {
        return create(schedulePaymentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<Integer> create(Integer schedulePaymentId, Integer monetaryAccountId, String content) {
        return create(schedulePaymentId, monetaryAccountId, content, null);
    }

    /**
     * @param content The content of the note.
     */
    public static BunqResponse<Integer> update(Integer schedulePaymentId, Integer noteTextSchedulePaymentId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_CONTENT, content);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId, noteTextSchedulePaymentId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> update(Integer schedulePaymentId) {
        return update(schedulePaymentId, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer schedulePaymentId, Integer noteTextSchedulePaymentId) {
        return update(schedulePaymentId, noteTextSchedulePaymentId, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer schedulePaymentId, Integer noteTextSchedulePaymentId, Integer monetaryAccountId) {
        return update(schedulePaymentId, noteTextSchedulePaymentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<Integer> update(Integer schedulePaymentId, Integer noteTextSchedulePaymentId, Integer monetaryAccountId, String content) {
        return update(schedulePaymentId, noteTextSchedulePaymentId, monetaryAccountId, content, null);
    }

    /**
     *
     */
    public static BunqResponse<NoteTextSchedulePayment> delete(Integer schedulePaymentId, Integer noteTextSchedulePaymentId, Integer monetaryAccountId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId, noteTextSchedulePaymentId), customHeaders);

        return new BunqResponse<>(null, responseRaw.getHeaders());
    }

    public static BunqResponse<NoteTextSchedulePayment> delete(Integer schedulePaymentId) {
        return delete(schedulePaymentId, null, null, null);
    }

    public static BunqResponse<NoteTextSchedulePayment> delete(Integer schedulePaymentId, Integer noteTextSchedulePaymentId) {
        return delete(schedulePaymentId, noteTextSchedulePaymentId, null, null);
    }

    public static BunqResponse<NoteTextSchedulePayment> delete(Integer schedulePaymentId, Integer noteTextSchedulePaymentId, Integer monetaryAccountId) {
        return delete(schedulePaymentId, noteTextSchedulePaymentId, monetaryAccountId, null);
    }

    /**
     * Manage the notes for a given user.
     */
    public static BunqResponse<List<NoteTextSchedulePayment>> list(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), params, customHeaders);

        return fromJsonList(NoteTextSchedulePayment.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<NoteTextSchedulePayment>> list() {
        return list(null, null, null, null);
    }

    public static BunqResponse<List<NoteTextSchedulePayment>> list(Integer schedulePaymentId) {
        return list(schedulePaymentId, null, null, null);
    }

    public static BunqResponse<List<NoteTextSchedulePayment>> list(Integer schedulePaymentId, Integer monetaryAccountId) {
        return list(schedulePaymentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<List<NoteTextSchedulePayment>> list(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> params) {
        return list(schedulePaymentId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static BunqResponse<NoteTextSchedulePayment> get(Integer schedulePaymentId, Integer noteTextSchedulePaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId, noteTextSchedulePaymentId), params, customHeaders);

        return fromJson(NoteTextSchedulePayment.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<NoteTextSchedulePayment> get() {
        return get(null, null, null, null, null);
    }

    public static BunqResponse<NoteTextSchedulePayment> get(Integer schedulePaymentId) {
        return get(schedulePaymentId, null, null, null, null);
    }

    public static BunqResponse<NoteTextSchedulePayment> get(Integer schedulePaymentId, Integer noteTextSchedulePaymentId) {
        return get(schedulePaymentId, noteTextSchedulePaymentId, null, null, null);
    }

    public static BunqResponse<NoteTextSchedulePayment> get(Integer schedulePaymentId, Integer noteTextSchedulePaymentId, Integer monetaryAccountId) {
        return get(schedulePaymentId, noteTextSchedulePaymentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<NoteTextSchedulePayment> get(Integer schedulePaymentId, Integer noteTextSchedulePaymentId, Integer monetaryAccountId, Map<String, String> params) {
        return get(schedulePaymentId, noteTextSchedulePaymentId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static NoteTextSchedulePayment fromJsonReader(JsonReader reader) {
        return fromJsonReader(NoteTextSchedulePayment.class, reader);
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
     *
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

}
