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
 * Get the available categories.
 */
public class AdditionalTransactionInformationCategory extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/additional-transaction-information-category";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "AdditionalTransactionInformationCategory";

  /**
   * The category.
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * Who created this category.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * Whether this category is active. Only relevant for user-defined categories.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sort order of the category.
   */
  @Expose
  @SerializedName("order")
  private Integer order;

  /**
   * The description of the category.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The translation of the description of the category.
   */
  @Expose
  @SerializedName("description_translated")
  private String descriptionTranslated;

  /**
   * The color of the category.
   */
  @Expose
  @SerializedName("color")
  private String color;

  /**
   * The icon of the category.
   */
  @Expose
  @SerializedName("icon")
  private String icon;

  /**
   */
  public static BunqResponse<List<AdditionalTransactionInformationCategory>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(AdditionalTransactionInformationCategory.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<AdditionalTransactionInformationCategory>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<AdditionalTransactionInformationCategory>> list(Map<String, String> params) {
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
   * Who created this category.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * Whether this category is active. Only relevant for user-defined categories.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sort order of the category.
   */
  public Integer getOrder() {
    return this.order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The description of the category.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The translation of the description of the category.
   */
  public String getDescriptionTranslated() {
    return this.descriptionTranslated;
  }

  public void setDescriptionTranslated(String descriptionTranslated) {
    this.descriptionTranslated = descriptionTranslated;
  }

  /**
   * The color of the category.
   */
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The icon of the category.
   */
  public String getIcon() {
    return this.icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.category != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.order != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.descriptionTranslated != null) {
      return false;
    }

    if (this.color != null) {
      return false;
    }

    if (this.icon != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AdditionalTransactionInformationCategory fromJsonReader(JsonReader reader) {
    return fromJsonReader(AdditionalTransactionInformationCategory.class, reader);
  }

}
