package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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
   * Field constants.
   */
  public static final String FIELD_YEAR = "year";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/export-annual-overview";
  private static final String ENDPOINT_URL_READ = "user/%s/export-annual-overview/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/export-annual-overview";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ExportAnnualOverview";

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

  public static Integer create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId) {
    return create(apiContext, requestMap, userId, new HashMap<>());
  }

  /**
   * Create a new annual overview for a specific year. An overview can be generated only for a
   * past year.
   */
  public static Integer create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    byte[] responseBytes = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId), requestBytes, customHeaders);

    return processForId(new String(responseBytes));
  }

  public static ExportAnnualOverview get(ApiContext apiContext, Integer userId,
      Integer exportAnnualOverviewId) {
    return get(apiContext, userId, exportAnnualOverviewId, new HashMap<>());
  }

  /**
   * Get an annual overview for a user by its id.
   */
  public static ExportAnnualOverview get(ApiContext apiContext, Integer userId,
      Integer exportAnnualOverviewId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, exportAnnualOverviewId), customHeaders);

    return fromJson(ExportAnnualOverview.class, new String(responseBytes), OBJECT_TYPE);
  }

  public static List<ExportAnnualOverview> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  /**
   * List all the annual overviews for a user.
   */
  public static List<ExportAnnualOverview> list(ApiContext apiContext, Integer userId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId), customHeaders);

    return fromJsonList(ExportAnnualOverview.class, new String(responseBytes), OBJECT_TYPE);
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

}
