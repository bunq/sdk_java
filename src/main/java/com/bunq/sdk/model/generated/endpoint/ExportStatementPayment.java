package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
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
 * Used to create a statement export of a single payment.
 */
public class ExportStatementPayment extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/event/%s/statement";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/event/%s/statement/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ExportStatementPayment";

  /**
   * The id of the single payment statement model.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the statement model's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the statement model's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The status of the export.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   */
  public static BunqResponse<Integer> create(Integer eventId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), eventId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null);
  }

  public static BunqResponse<Integer> create(Integer eventId) {
    return create(eventId, null, null);
  }

  public static BunqResponse<Integer> create(Integer eventId, Integer monetaryAccountId) {
    return create(eventId, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<ExportStatementPayment> get(Integer eventId, Integer exportStatementPaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), eventId, exportStatementPaymentId), params, customHeaders);

    return fromJson(ExportStatementPayment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ExportStatementPayment> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<ExportStatementPayment> get(Integer eventId) {
    return get(eventId, null, null, null, null);
  }

  public static BunqResponse<ExportStatementPayment> get(Integer eventId, Integer exportStatementPaymentId) {
    return get(eventId, exportStatementPaymentId, null, null, null);
  }

  public static BunqResponse<ExportStatementPayment> get(Integer eventId, Integer exportStatementPaymentId, Integer monetaryAccountId) {
    return get(eventId, exportStatementPaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<ExportStatementPayment> get(Integer eventId, Integer exportStatementPaymentId, Integer monetaryAccountId, Map<String, String> params) {
    return get(eventId, exportStatementPaymentId, monetaryAccountId, params, null);
  }

  /**
   * The id of the single payment statement model.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the statement model's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the statement model's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The status of the export.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
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

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ExportStatementPayment fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportStatementPayment.class, reader);
  }

}
