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
 * Aggregation of how many card payments have been done with a Green Card in the current
 * calendar month.
 */
public class MasterCardActionGreenAggregation extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/mastercard-action-green-aggregation";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "MasterCardActionGreenAggregation";

  /**
   * The date of the aggregation.
   */
  @Expose
  @SerializedName("date")
  private String date;

  /**
   * The percentage of card payments that were done with a Green Card.
   */
  @Expose
  @SerializedName("percentage")
  private String percentage;

  /**
   */
  public static BunqResponse<List<MasterCardActionGreenAggregation>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(MasterCardActionGreenAggregation.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<MasterCardActionGreenAggregation>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<MasterCardActionGreenAggregation>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The date of the aggregation.
   */
  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  /**
   * The percentage of card payments that were done with a Green Card.
   */
  public String getPercentage() {
    return this.percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.date != null) {
      return false;
    }

    if (this.percentage != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MasterCardActionGreenAggregation fromJsonReader(JsonReader reader) {
    return fromJsonReader(MasterCardActionGreenAggregation.class, reader);
  }

}
