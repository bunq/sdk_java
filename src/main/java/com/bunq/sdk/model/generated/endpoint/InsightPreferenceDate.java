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
 * Used to allow users to set insight/budget preferences.
 */
public class InsightPreferenceDate extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/insight-preference-date";

  /**
   * Field constants.
   */
  public static final String FIELD_DAY_OF_MONTH = "day_of_month";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "InsightPreferenceDate";

  /**
   * The day of month at which budgeting/insights should start.
   */
  @Expose
  @SerializedName("day_of_month")
  private Integer dayOfMonth;

  /**
   * The day of month at which budgeting/insights should start.
   */
  @Expose
  @SerializedName("day_of_month_field_for_request")
  private Integer dayOfMonthFieldForRequest;

  public InsightPreferenceDate() {
  this(null);
  }

  public InsightPreferenceDate(Integer dayOfMonth) {
    this.dayOfMonthFieldForRequest = dayOfMonth;
  }  /**
   */
  public static BunqResponse<List<InsightPreferenceDate>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(InsightPreferenceDate.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<InsightPreferenceDate>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<InsightPreferenceDate>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The day of month at which budgeting/insights should start.
   */
  public Integer getDayOfMonth() {
    return this.dayOfMonth;
  }

  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.dayOfMonth != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static InsightPreferenceDate fromJsonReader(JsonReader reader) {
    return fromJsonReader(InsightPreferenceDate.class, reader);
  }

}
