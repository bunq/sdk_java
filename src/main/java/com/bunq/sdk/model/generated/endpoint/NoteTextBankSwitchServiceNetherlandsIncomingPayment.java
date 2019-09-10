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
public class NoteTextBankSwitchServiceNetherlandsIncomingPayment extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_CONTENT = "content";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/switch-service-payment/%s/note-text";
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/switch-service-payment/%s/note-text/%s";
    protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/switch-service-payment/%s/note-text/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/switch-service-payment/%s/note-text";
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/switch-service-payment/%s/note-text/%s";
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

    public NoteTextBankSwitchServiceNetherlandsIncomingPayment() {
        this(null);
    }

    public NoteTextBankSwitchServiceNetherlandsIncomingPayment(String content) {
        this.contentFieldForRequest = content;
    }

    /**
     * @param content The content of the note.
     */
    public static BunqResponse<Integer> create(Integer switchServicePaymentId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_CONTENT, content);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), switchServicePaymentId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer switchServicePaymentId) {
        return create(switchServicePaymentId, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer switchServicePaymentId, Integer monetaryAccountId) {
        return create(switchServicePaymentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<Integer> create(Integer switchServicePaymentId, Integer monetaryAccountId, String content) {
        return create(switchServicePaymentId, monetaryAccountId, content, null);
    }

    /**
     * @param content The content of the note.
     */
    public static BunqResponse<Integer> update(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId, String content, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_CONTENT, content);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> update(Integer switchServicePaymentId) {
        return update(switchServicePaymentId, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId) {
        return update(switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId) {
        return update(switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<Integer> update(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId, String content) {
        return update(switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId, monetaryAccountId, content, null);
    }

    /**
     *
     */
    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> delete(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId), customHeaders);

        return new BunqResponse<>(null, responseRaw.getHeaders());
    }

    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> delete(Integer switchServicePaymentId) {
        return delete(switchServicePaymentId, null, null, null);
    }

    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> delete(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId) {
        return delete(switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId, null, null);
    }

    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> delete(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId) {
        return delete(switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId, monetaryAccountId, null);
    }

    /**
     * Manage the notes for a given user.
     */
    public static BunqResponse<List<NoteTextBankSwitchServiceNetherlandsIncomingPayment>> list(Integer switchServicePaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), switchServicePaymentId), params, customHeaders);

        return fromJsonList(NoteTextBankSwitchServiceNetherlandsIncomingPayment.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<NoteTextBankSwitchServiceNetherlandsIncomingPayment>> list() {
        return list(null, null, null, null);
    }

    public static BunqResponse<List<NoteTextBankSwitchServiceNetherlandsIncomingPayment>> list(Integer switchServicePaymentId) {
        return list(switchServicePaymentId, null, null, null);
    }

    public static BunqResponse<List<NoteTextBankSwitchServiceNetherlandsIncomingPayment>> list(Integer switchServicePaymentId, Integer monetaryAccountId) {
        return list(switchServicePaymentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<List<NoteTextBankSwitchServiceNetherlandsIncomingPayment>> list(Integer switchServicePaymentId, Integer monetaryAccountId, Map<String, String> params) {
        return list(switchServicePaymentId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> get(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId), params, customHeaders);

        return fromJson(NoteTextBankSwitchServiceNetherlandsIncomingPayment.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> get() {
        return get(null, null, null, null, null);
    }

    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> get(Integer switchServicePaymentId) {
        return get(switchServicePaymentId, null, null, null, null);
    }

    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> get(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId) {
        return get(switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId, null, null, null);
    }

    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> get(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId) {
        return get(switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<NoteTextBankSwitchServiceNetherlandsIncomingPayment> get(Integer switchServicePaymentId, Integer noteTextBankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId, Map<String, String> params) {
        return get(switchServicePaymentId, noteTextBankSwitchServiceNetherlandsIncomingPaymentId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static NoteTextBankSwitchServiceNetherlandsIncomingPayment fromJsonReader(JsonReader reader) {
        return fromJsonReader(NoteTextBankSwitchServiceNetherlandsIncomingPayment.class, reader);
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
