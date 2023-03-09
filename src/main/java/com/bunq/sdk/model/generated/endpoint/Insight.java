package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
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
 * Used to get insights about transactions between given time range.
 */
public class Insight extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/insights";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "InsightCategory";

  /**
   * The category.
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * The translated category.
   */
  @Expose
  @SerializedName("category_translated")
  private String categoryTranslated;

  /**
   * The color of the category.
   */
  @Expose
  @SerializedName("category_color")
  private String categoryColor;

  /**
   * The icon of the category.
   */
  @Expose
  @SerializedName("category_icon")
  private String categoryIcon;

  /**
   * The total amount of the transactions in the category.
   */
  @Expose
  @SerializedName("amount_total")
  private Amount amountTotal;

  /**
   * The number of the transactions in the category.
   */
  @Expose
  @SerializedName("number_of_transactions")
  private Integer numberOfTransactions;

  /**
   */
  public static BunqResponse<List<Insight>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(Insight.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<Insight>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<Insight>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The category.
   */
  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * The translated category.
   */
  public String getCategoryTranslated() {
    return this.categoryTranslated;
  }

  public void setCategoryTranslated(String categoryTranslated) {
    this.categoryTranslated = categoryTranslated;
  }

  /**
   * The color of the category.
   */
  public String getCategoryColor() {
    return this.categoryColor;
  }

  public void setCategoryColor(String categoryColor) {
    this.categoryColor = categoryColor;
  }

  /**
   * The icon of the category.
   */
  public String getCategoryIcon() {
    return this.categoryIcon;
  }

  public void setCategoryIcon(String categoryIcon) {
    this.categoryIcon = categoryIcon;
  }

  /**
   * The total amount of the transactions in the category.
   */
  public Amount getAmountTotal() {
    return this.amountTotal;
  }

  public void setAmountTotal(Amount amountTotal) {
    this.amountTotal = amountTotal;
  }

  /**
   * The number of the transactions in the category.
   */
  public Integer getNumberOfTransactions() {
    return this.numberOfTransactions;
  }

  public void setNumberOfTransactions(Integer numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.category != null) {
      return false;
    }

    if (this.categoryTranslated != null) {
      return false;
    }

    if (this.categoryColor != null) {
      return false;
    }

    if (this.categoryIcon != null) {
      return false;
    }

    if (this.amountTotal != null) {
      return false;
    }

    if (this.numberOfTransactions != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Insight fromJsonReader(JsonReader reader) {
    return fromJsonReader(Insight.class, reader);
  }

}
