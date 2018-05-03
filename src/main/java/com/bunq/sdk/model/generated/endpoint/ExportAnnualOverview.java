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
 * Used to create new and read existing annual overviews of all the user's monetary accounts.
 * Once created, annual overviews can be downloaded in PDF format via the
 * 'export-annual-overview/{id}/content' endpoint.
 */
public class ExportAnnualOverview extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/export-annual-overview";
  protected static final String ENDPOINT_URL_READ = "user/%s/export-annual-overview/%s";
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
   * The user to which this annual overview belongs.
   */
  @Expose
  @SerializedName("alias_user")
  private LabelUser aliasUser;

  /**
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

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
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
  public static BunqResponse<ExportAnnualOverview> get(Integer exportAnnualOverviewId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), exportAnnualOverviewId), params, customHeaders);

    return fromJson(ExportAnnualOverview.class, responseRaw, OBJECT_TYPE_GET);
  }
  public static BunqResponse<ExportAnnualOverview> get() {
    return get(null, null, null);
  }

  public static BunqResponse<ExportAnnualOverview> get(Integer exportAnnualOverviewId) {
    return get(exportAnnualOverviewId, null, null);
  }

  public static BunqResponse<ExportAnnualOverview> get(Integer exportAnnualOverviewId, Map<String, String> params) {
    return get(exportAnnualOverviewId, params, null);
  }

  /**
   * List all the annual overviews for a user.
   */
  public static BunqResponse<List<ExportAnnualOverview>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(ExportAnnualOverview.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ExportAnnualOverview>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<ExportAnnualOverview>> list(Map<String, String> params) {
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
   * The user to which this annual overview belongs.
   */
  public LabelUser getAliasUser() {
    return this.aliasUser;
  }

  public void setAliasUser(LabelUser aliasUser) {
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

    if (this.aliasUser != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ExportAnnualOverview fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportAnnualOverview.class, reader);
  }

}
