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
public class CustomerStatementExport extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/customer-statement";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/customer-statement/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/customer-statement";
  private static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/customer-statement/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_STATEMENT_FORMAT = "statement_format";
  public static final String FIELD_DATE_START = "date_start";
  public static final String FIELD_DATE_END = "date_end";
  public static final String FIELD_REGIONAL_FORMAT = "regional_format";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CustomerStatementExport";

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
  private MonetaryAccountReference aliasMonetaryAccount;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<CustomerStatementExport> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer customerStatementExportId) {
    return get(apiContext, userId, monetaryAccountId, customerStatementExportId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<CustomerStatementExport> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer customerStatementExportId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, customerStatementExportId), new HashMap<>(), customHeaders);

    return fromJson(CustomerStatementExport.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<CustomerStatementExport>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<CustomerStatementExport>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<CustomerStatementExport>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(CustomerStatementExport.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer customerStatementExportId) {
    return delete(apiContext, userId, monetaryAccountId, customerStatementExportId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer customerStatementExportId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, userId, monetaryAccountId, customerStatementExportId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
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
  public MonetaryAccountReference getAliasMonetaryAccount() {
    return this.aliasMonetaryAccount;
  }

  public void setAliasMonetaryAccount(MonetaryAccountReference aliasMonetaryAccount) {
    this.aliasMonetaryAccount = aliasMonetaryAccount;
  }

  /**
   */
  public boolean areAllFieldNull() {
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

}
