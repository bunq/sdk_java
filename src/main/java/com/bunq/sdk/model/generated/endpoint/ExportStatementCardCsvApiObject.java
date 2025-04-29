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
 * Used to serialize ExportStatementCardCsv
 */
public class ExportStatementCardCsvApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/card/%s/export-statement-card-csv";
  protected static final String ENDPOINT_URL_READ = "user/%s/card/%s/export-statement-card-csv/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/card/%s/export-statement-card-csv";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/card/%s/export-statement-card-csv/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_DATE_START = "date_start";
  public static final String FIELD_DATE_END = "date_end";
  public static final String FIELD_REGIONAL_FORMAT = "regional_format";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ExportStatementCardCsv";

  /**
   * The id of the customer statement model.
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
   * The date from when this statement shows transactions.
   */
  @Expose
  @SerializedName("date_start")
  private String dateStart;

  /**
   * The date until which statement shows transactions.
   */
  @Expose
  @SerializedName("date_end")
  private String dateEnd;

  /**
   * The status of the export.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The regional format of a CSV statement.
   */
  @Expose
  @SerializedName("regional_format")
  private String regionalFormat;

  /**
   * The card for which this statement was created.
   */
  @Expose
  @SerializedName("card_id")
  private Integer cardId;

  /**
   * The start date for making statements.
   */
  @Expose
  @SerializedName("date_start_field_for_request")
  private String dateStartFieldForRequest;

  /**
   * The end date for making statements.
   */
  @Expose
  @SerializedName("date_end_field_for_request")
  private String dateEndFieldForRequest;

  /**
   * Required for CSV exports. The regional format of the statement, can be UK_US
   * (comma-separated) or EUROPEAN (semicolon-separated).
   */
  @Expose
  @SerializedName("regional_format_field_for_request")
  private String regionalFormatFieldForRequest;

  public ExportStatementCardCsvApiObject() {
  this(null, null, null);
  }

  public ExportStatementCardCsvApiObject(String dateStart) {
  this(dateStart, null, null);
  }

  public ExportStatementCardCsvApiObject(String dateStart, String dateEnd) {
  this(dateStart, dateEnd, null);
  }

  public ExportStatementCardCsvApiObject(String dateStart, String dateEnd, String regionalFormat) {
    this.dateStartFieldForRequest = dateStart;
    this.dateEndFieldForRequest = dateEnd;
    this.regionalFormatFieldForRequest = regionalFormat;
  }  /**
   * @param dateStart The start date for making statements.
   * @param dateEnd The end date for making statements.
   * @param regionalFormat Required for CSV exports. The regional format of the statement, can be
   * UK_US (comma-separated) or EUROPEAN (semicolon-separated).
   */
  public static BunqResponse<Integer> create(Integer cardId, String dateStart, String dateEnd, String regionalFormat, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DATE_START, dateStart);
requestMap.put(FIELD_DATE_END, dateEnd);
requestMap.put(FIELD_REGIONAL_FORMAT, regionalFormat);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), cardId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId) {
    return create(cardId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String dateStart) {
    return create(cardId, dateStart, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String dateStart, String dateEnd) {
    return create(cardId, dateStart, dateEnd, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String dateStart, String dateEnd, String regionalFormat) {
    return create(cardId, dateStart, dateEnd, regionalFormat, null);
  }

  /**
   */
  public static BunqResponse<ExportStatementCardCsvApiObject> get(Integer cardId, Integer exportStatementCardCsvId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), cardId, exportStatementCardCsvId), params, customHeaders);

    return fromJson(ExportStatementCardCsvApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ExportStatementCardCsvApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<ExportStatementCardCsvApiObject> get(Integer cardId) {
    return get(cardId, null, null, null);
  }

  public static BunqResponse<ExportStatementCardCsvApiObject> get(Integer cardId, Integer exportStatementCardCsvId) {
    return get(cardId, exportStatementCardCsvId, null, null);
  }

  public static BunqResponse<ExportStatementCardCsvApiObject> get(Integer cardId, Integer exportStatementCardCsvId, Map<String, String> params) {
    return get(cardId, exportStatementCardCsvId, params, null);
  }

  /**
   */
  public static BunqResponse<List<ExportStatementCardCsvApiObject>> list(Integer cardId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), cardId), params, customHeaders);

    return fromJsonList(ExportStatementCardCsvApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ExportStatementCardCsvApiObject>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<ExportStatementCardCsvApiObject>> list(Integer cardId) {
    return list(cardId, null, null);
  }

  public static BunqResponse<List<ExportStatementCardCsvApiObject>> list(Integer cardId, Map<String, String> params) {
    return list(cardId, params, null);
  }

  /**
   */
  public static BunqResponse<ExportStatementCardCsvApiObject> delete(Integer cardId, Integer exportStatementCardCsvId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), cardId, exportStatementCardCsvId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<ExportStatementCardCsvApiObject> delete(Integer cardId) {
    return delete(cardId, null, null);
  }

  public static BunqResponse<ExportStatementCardCsvApiObject> delete(Integer cardId, Integer exportStatementCardCsvId) {
    return delete(cardId, exportStatementCardCsvId, null);
  }

  /**
   * The id of the customer statement model.
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
   * The date from when this statement shows transactions.
   */
  public String getDateStart() {
    return this.dateStart;
  }

  public void setDateStart(String dateStart) {
    this.dateStart = dateStart;
  }

  /**
   * The date until which statement shows transactions.
   */
  public String getDateEnd() {
    return this.dateEnd;
  }

  public void setDateEnd(String dateEnd) {
    this.dateEnd = dateEnd;
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
   * The regional format of a CSV statement.
   */
  public String getRegionalFormat() {
    return this.regionalFormat;
  }

  public void setRegionalFormat(String regionalFormat) {
    this.regionalFormat = regionalFormat;
  }

  /**
   * The card for which this statement was created.
   */
  public Integer getCardId() {
    return this.cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
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

    if (this.dateStart != null) {
      return false;
    }

    if (this.dateEnd != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.regionalFormat != null) {
      return false;
    }

    if (this.cardId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ExportStatementCardCsvApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportStatementCardCsvApiObject.class, reader);
  }

}
