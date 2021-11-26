package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
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
 * Used to create new and read existing statement exports. Statement exports can be created in
 * either CSV, MT940 or PDF file format.
 */
public class ExportStatement extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/customer-statement";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/customer-statement/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/customer-statement";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/customer-statement/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_STATEMENT_FORMAT = "statement_format";
  public static final String FIELD_DATE_START = "date_start";
  public static final String FIELD_DATE_END = "date_end";
  public static final String FIELD_REGIONAL_FORMAT = "regional_format";
  public static final String FIELD_INCLUDE_ATTACHMENT = "include_attachment";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CustomerStatement";

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
   * MT940 Statement number. Unique per monetary account.
   */
  @Expose
  @SerializedName("statement_number")
  private Integer statementNumber;

  /**
   * The format of statement.
   */
  @Expose
  @SerializedName("statement_format")
  private String statementFormat;

  /**
   * The regional format of a CSV statement.
   */
  @Expose
  @SerializedName("regional_format")
  private String regionalFormat;

  /**
   * The monetary account for which this statement was created.
   */
  @Expose
  @SerializedName("alias_monetary_account")
  private LabelMonetaryAccount aliasMonetaryAccount;

  /**
   * The format type of statement. Allowed values: MT940, CSV, PDF.
   */
  @Expose
  @SerializedName("statement_format_field_for_request")
  private String statementFormatFieldForRequest;

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

  /**
   * Only for PDF exports. Includes attachments to mutations in the export, such as scanned
   * receipts.
   */
  @Expose
  @SerializedName("include_attachment_field_for_request")
  private Boolean includeAttachmentFieldForRequest;

  public ExportStatement() {
  this(null, null, null, null, null);
  }

  public ExportStatement(String statementFormat) {
  this(statementFormat, null, null, null, null);
  }

  public ExportStatement(String statementFormat, String dateStart) {
  this(statementFormat, dateStart, null, null, null);
  }

  public ExportStatement(String statementFormat, String dateStart, String dateEnd) {
  this(statementFormat, dateStart, dateEnd, null, null);
  }

  public ExportStatement(String statementFormat, String dateStart, String dateEnd, String regionalFormat) {
  this(statementFormat, dateStart, dateEnd, regionalFormat, null);
  }

  public ExportStatement(String statementFormat, String dateStart, String dateEnd, String regionalFormat, Boolean includeAttachment) {
    this.statementFormatFieldForRequest = statementFormat;
    this.dateStartFieldForRequest = dateStart;
    this.dateEndFieldForRequest = dateEnd;
    this.regionalFormatFieldForRequest = regionalFormat;
    this.includeAttachmentFieldForRequest = includeAttachment;
  }  /**
   * @param statementFormat The format type of statement. Allowed values: MT940, CSV, PDF.
   * @param dateStart The start date for making statements.
   * @param dateEnd The end date for making statements.
   * @param regionalFormat Required for CSV exports. The regional format of the statement, can be
   * UK_US (comma-separated) or EUROPEAN (semicolon-separated).
   * @param includeAttachment Only for PDF exports. Includes attachments to mutations in the
   * export, such as scanned receipts.
   */
  public static BunqResponse<Integer> create(String statementFormat, String dateStart, String dateEnd, Integer monetaryAccountId, String regionalFormat, Boolean includeAttachment, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATEMENT_FORMAT, statementFormat);
requestMap.put(FIELD_DATE_START, dateStart);
requestMap.put(FIELD_DATE_END, dateEnd);
requestMap.put(FIELD_REGIONAL_FORMAT, regionalFormat);
requestMap.put(FIELD_INCLUDE_ATTACHMENT, includeAttachment);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String statementFormat) {
    return create(statementFormat, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String statementFormat, String dateStart) {
    return create(statementFormat, dateStart, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String statementFormat, String dateStart, String dateEnd) {
    return create(statementFormat, dateStart, dateEnd, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String statementFormat, String dateStart, String dateEnd, Integer monetaryAccountId) {
    return create(statementFormat, dateStart, dateEnd, monetaryAccountId, null, null, null);
  }

  public static BunqResponse<Integer> create(String statementFormat, String dateStart, String dateEnd, Integer monetaryAccountId, String regionalFormat) {
    return create(statementFormat, dateStart, dateEnd, monetaryAccountId, regionalFormat, null, null);
  }

  public static BunqResponse<Integer> create(String statementFormat, String dateStart, String dateEnd, Integer monetaryAccountId, String regionalFormat, Boolean includeAttachment) {
    return create(statementFormat, dateStart, dateEnd, monetaryAccountId, regionalFormat, includeAttachment, null);
  }

  /**
   */
  public static BunqResponse<ExportStatement> get(Integer exportStatementId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), exportStatementId), params, customHeaders);

    return fromJson(ExportStatement.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ExportStatement> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<ExportStatement> get(Integer exportStatementId) {
    return get(exportStatementId, null, null, null);
  }

  public static BunqResponse<ExportStatement> get(Integer exportStatementId, Integer monetaryAccountId) {
    return get(exportStatementId, monetaryAccountId, null, null);
  }

  public static BunqResponse<ExportStatement> get(Integer exportStatementId, Integer monetaryAccountId, Map<String, String> params) {
    return get(exportStatementId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<List<ExportStatement>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(ExportStatement.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ExportStatement>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<ExportStatement>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<ExportStatement>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<ExportStatement> delete(Integer exportStatementId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), exportStatementId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<ExportStatement> delete(Integer exportStatementId) {
    return delete(exportStatementId, null, null);
  }

  public static BunqResponse<ExportStatement> delete(Integer exportStatementId, Integer monetaryAccountId) {
    return delete(exportStatementId, monetaryAccountId, null);
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
   * MT940 Statement number. Unique per monetary account.
   */
  public Integer getStatementNumber() {
    return this.statementNumber;
  }

  public void setStatementNumber(Integer statementNumber) {
    this.statementNumber = statementNumber;
  }

  /**
   * The format of statement.
   */
  public String getStatementFormat() {
    return this.statementFormat;
  }

  public void setStatementFormat(String statementFormat) {
    this.statementFormat = statementFormat;
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
   * The monetary account for which this statement was created.
   */
  public LabelMonetaryAccount getAliasMonetaryAccount() {
    return this.aliasMonetaryAccount;
  }

  public void setAliasMonetaryAccount(LabelMonetaryAccount aliasMonetaryAccount) {
    this.aliasMonetaryAccount = aliasMonetaryAccount;
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

    if (this.statementNumber != null) {
      return false;
    }

    if (this.statementFormat != null) {
      return false;
    }

    if (this.regionalFormat != null) {
      return false;
    }

    if (this.aliasMonetaryAccount != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ExportStatement fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportStatement.class, reader);
  }

}
