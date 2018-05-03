package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * Used to read a single publicly visible tab.
 */
public class Tab extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "tab/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Tab";

  /**
   * The uuid of the tab.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The label of the party that owns this tab.
   */
  @Expose
  @SerializedName("alias")
  private MonetaryAccountReference alias;

  /**
   * The avatar of this tab.
   */
  @Expose
  @SerializedName("avatar")
  private String avatar;

  /**
   * The reference of the tab, as defined by the owner.
   */
  @Expose
  @SerializedName("reference")
  private String reference;

  /**
   * The short description of the tab.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status of the tab.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The moment when this tab expires.
   */
  @Expose
  @SerializedName("expiration")
  private String expiration;

  /**
   * The total amount of the tab.
   */
  @Expose
  @SerializedName("amount_total")
  private Amount amountTotal;

  /**
   * Get a publicly visible tab.
   */
  public static BunqResponse<Tab> get(String tabUuid, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, tabUuid), params, customHeaders);

    return fromJson(Tab.class, responseRaw, OBJECT_TYPE_GET);
  }
  public static BunqResponse<Tab> get() {
    return get(null, null, null);
  }

  public static BunqResponse<Tab> get(String tabUuid) {
    return get(tabUuid, null, null);
  }

  public static BunqResponse<Tab> get(String tabUuid, Map<String, String> params) {
    return get(tabUuid, params, null);
  }

  /**
   * The uuid of the tab.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The label of the party that owns this tab.
   */
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The avatar of this tab.
   */
  public String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  /**
   * The reference of the tab, as defined by the owner.
   */
  public String getReference() {
    return this.reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The short description of the tab.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The status of the tab.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The moment when this tab expires.
   */
  public String getExpiration() {
    return this.expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  /**
   * The total amount of the tab.
   */
  public Amount getAmountTotal() {
    return this.amountTotal;
  }

  public void setAmountTotal(Amount amountTotal) {
    this.amountTotal = amountTotal;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    if (this.reference != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.expiration != null) {
      return false;
    }

    if (this.amountTotal != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Tab fromJsonReader(JsonReader reader) {
    return fromJsonReader(Tab.class, reader);
  }

}
