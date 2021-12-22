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
 * Used to create new and read existing card statement exports. Statement exports can be created
 * in either CSV or PDF file format.
 */
public class ExportStatementCard extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/card/%s/export-statement-card/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/card/%s/export-statement-card";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ExportStatementCard";

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
   * The regional format of a CSV statement.
   */
  @Expose
  @SerializedName("regional_format")
  private String regionalFormat;

  /**
   * The card for which this statement was created.
   */
  @Expose
  @SerializedName("card_id")
  private Integer cardId;

  /**
   */
  public static BunqResponse<ExportStatementCard> get(Integer cardId, Integer exportStatementCardId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), cardId, exportStatementCardId), params, customHeaders);

    return fromJson(ExportStatementCard.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ExportStatementCard> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<ExportStatementCard> get(Integer cardId) {
    return get(cardId, null, null, null);
  }

  public static BunqResponse<ExportStatementCard> get(Integer cardId, Integer exportStatementCardId) {
    return get(cardId, exportStatementCardId, null, null);
  }

  public static BunqResponse<ExportStatementCard> get(Integer cardId, Integer exportStatementCardId, Map<String, String> params) {
    return get(cardId, exportStatementCardId, params, null);
  }

  /**
   */
  public static BunqResponse<List<ExportStatementCard>> list(Integer cardId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), cardId), params, customHeaders);

    return fromJsonList(ExportStatementCard.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ExportStatementCard>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<ExportStatementCard>> list(Integer cardId) {
    return list(cardId, null, null);
  }

  public static BunqResponse<List<ExportStatementCard>> list(Integer cardId, Map<String, String> params) {
    return list(cardId, params, null);
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
   * The regional format of a CSV statement.
   */
  public String getRegionalFormat() {
    return this.regionalFormat;
  }

  public void setRegionalFormat(String regionalFormat) {
    this.regionalFormat = regionalFormat;
  }

  /**
   * The card for which this statement was created.
   */
  public Integer getCardId() {
    return this.cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
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

    if (this.regionalFormat != null) {
      return false;
    }

    if (this.cardId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ExportStatementCard fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportStatementCard.class, reader);
  }

}
