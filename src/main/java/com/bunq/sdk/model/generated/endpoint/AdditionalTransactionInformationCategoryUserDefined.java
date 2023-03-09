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
 * Manage user-defined categories.
 */
public class AdditionalTransactionInformationCategoryUserDefined extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/additional-transaction-information-category-user-defined";

  /**
   * Field constants.
   */
  public static final String FIELD_CATEGORY = "category";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_COLOR = "color";
  public static final String FIELD_ICON = "icon";

  /**
   * The category.
   */
  @Expose
  @SerializedName("category_field_for_request")
  private String categoryFieldForRequest;

  /**
   * Whether this category is active. Only relevant for user-defined categories.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The description of the category.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The color of the category.
   */
  @Expose
  @SerializedName("color_field_for_request")
  private String colorFieldForRequest;

  /**
   * The icon of the category.
   */
  @Expose
  @SerializedName("icon_field_for_request")
  private String iconFieldForRequest;

  public AdditionalTransactionInformationCategoryUserDefined() {
  this(null, null, null, null, null);
  }

  public AdditionalTransactionInformationCategoryUserDefined(String status) {
  this(status, null, null, null, null);
  }

  public AdditionalTransactionInformationCategoryUserDefined(String status, String category) {
  this(status, category, null, null, null);
  }

  public AdditionalTransactionInformationCategoryUserDefined(String status, String category, String description) {
  this(status, category, description, null, null);
  }

  public AdditionalTransactionInformationCategoryUserDefined(String status, String category, String description, String color) {
  this(status, category, description, color, null);
  }

  public AdditionalTransactionInformationCategoryUserDefined(String status, String category, String description, String color, String icon) {
    this.categoryFieldForRequest = category;
    this.statusFieldForRequest = status;
    this.descriptionFieldForRequest = description;
    this.colorFieldForRequest = color;
    this.iconFieldForRequest = icon;
  }  /**
   * @param status Whether this category is active. Only relevant for user-defined categories.
   * @param category The category.
   * @param description The description of the category.
   * @param color The color of the category.
   * @param icon The icon of the category.
   */
  public static BunqResponse<Integer> create(String status, String category, String description, String color, String icon, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CATEGORY, category);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_COLOR, color);
requestMap.put(FIELD_ICON, icon);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String status) {
    return create(status, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String status, String category) {
    return create(status, category, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String status, String category, String description) {
    return create(status, category, description, null, null, null);
  }

  public static BunqResponse<Integer> create(String status, String category, String description, String color) {
    return create(status, category, description, color, null, null);
  }

  public static BunqResponse<Integer> create(String status, String category, String description, String color, String icon) {
    return create(status, category, description, color, icon, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static AdditionalTransactionInformationCategoryUserDefined fromJsonReader(JsonReader reader) {
    return fromJsonReader(AdditionalTransactionInformationCategoryUserDefined.class, reader);
  }

}
