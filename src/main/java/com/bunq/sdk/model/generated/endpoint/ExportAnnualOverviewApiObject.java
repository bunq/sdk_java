package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
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
 * Used to create new and read existing annual overviews of all the user's monetary accounts.
 * Once created, annual overviews can be downloaded in PDF format via the
 * 'export-annual-overview/{id}/content' endpoint.
 */
public class ExportAnnualOverviewApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/export-annual-overview";
  protected static final String ENDPOINT_URL_READ = "user/%s/export-annual-overview/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/export-annual-overview/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/export-annual-overview";

  /**
   * Field constants.
   */
  public static final String FIELD_YEAR = "year";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ExportAnnualOverview";

  /**
   * The id of the annual overview as created on the server.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the annual overview 's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the annual overview 's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The year for which the overview is.
   */
  @Expose
  @SerializedName("year")
  private Integer year;

  /**
   * The status of the annual overview export.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The user to which this annual overview belongs.
   */
  @Expose
  @SerializedName("alias_user")
  private LabelUserObject aliasUser;

  /**
   * The year for which the overview is.
   */
  @Expose
  @SerializedName("year_field_for_request")
  private Integer yearFieldForRequest;

  public ExportAnnualOverviewApiObject() {
  this(null);
  }

  public ExportAnnualOverviewApiObject(Integer year) {
    this.yearFieldForRequest = year;
  }  /**
   * Create a new annual overview for a specific year. An overview can be generated only for a
   * past year.
   * @param year The year for which the overview is.
   */
  public static BunqResponse<Integer> create(Integer year, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_YEAR, year);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null);
  }

  public static BunqResponse<Integer> create(Integer year) {
    return create(year, null);
  }

  /**
   * Get an annual overview for a user by its id.
   */
  public static BunqResponse<ExportAnnualOverviewApiObject> get(Integer exportAnnualOverviewId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), exportAnnualOverviewId), params, customHeaders);

    return fromJson(ExportAnnualOverviewApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ExportAnnualOverviewApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<ExportAnnualOverviewApiObject> get(Integer exportAnnualOverviewId) {
    return get(exportAnnualOverviewId, null, null);
  }

  public static BunqResponse<ExportAnnualOverviewApiObject> get(Integer exportAnnualOverviewId, Map<String, String> params) {
    return get(exportAnnualOverviewId, params, null);
  }

  /**
   */
  public static BunqResponse<ExportAnnualOverviewApiObject> delete(Integer exportAnnualOverviewId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), exportAnnualOverviewId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<ExportAnnualOverviewApiObject> delete(Integer exportAnnualOverviewId) {
    return delete(exportAnnualOverviewId, null);
  }

  /**
   * List all the annual overviews for a user.
   */
  public static BunqResponse<List<ExportAnnualOverviewApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(ExportAnnualOverviewApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ExportAnnualOverviewApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<ExportAnnualOverviewApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The id of the annual overview as created on the server.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the annual overview 's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the annual overview 's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The year for which the overview is.
   */
  public Integer getYear() {
    return this.year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  /**
   * The status of the annual overview export.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The user to which this annual overview belongs.
   */
  public LabelUserObject getAliasUser() {
    return this.aliasUser;
  }

  public void setAliasUser(LabelUserObject aliasUser) {
    this.aliasUser = aliasUser;
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

    if (this.year != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.aliasUser != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ExportAnnualOverviewApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportAnnualOverviewApiObject.class, reader);
  }

}
