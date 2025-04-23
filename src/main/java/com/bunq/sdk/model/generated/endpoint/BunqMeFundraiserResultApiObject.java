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
 * bunq.me fundraiser result containing all payments.
 */
public class BunqMeFundraiserResultApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/bunqme-fundraiser-result/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "BunqMeFundraiserResult";

  /**
   * The id of the bunq.me.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the bunq.me was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the bunq.me was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("bunqme_fundraiser_profile")
  private BunqMeFundraiserProfileApiObject bunqmeFundraiserProfile;

  /**
   * The list of payments, paid to the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("payments")
  private List<PaymentApiObject> payments;

  /**
   */
  public static BunqResponse<BunqMeFundraiserResultApiObject> get(Integer bunqMeFundraiserResultId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bunqMeFundraiserResultId), params, customHeaders);

    return fromJson(BunqMeFundraiserResultApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<BunqMeFundraiserResultApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<BunqMeFundraiserResultApiObject> get(Integer bunqMeFundraiserResultId) {
    return get(bunqMeFundraiserResultId, null, null, null);
  }

  public static BunqResponse<BunqMeFundraiserResultApiObject> get(Integer bunqMeFundraiserResultId, Integer monetaryAccountId) {
    return get(bunqMeFundraiserResultId, monetaryAccountId, null, null);
  }

  public static BunqResponse<BunqMeFundraiserResultApiObject> get(Integer bunqMeFundraiserResultId, Integer monetaryAccountId, Map<String, String> params) {
    return get(bunqMeFundraiserResultId, monetaryAccountId, params, null);
  }

  /**
   * The id of the bunq.me.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the bunq.me was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the bunq.me was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The bunq.me fundraiser profile.
   */
  public BunqMeFundraiserProfileApiObject getBunqmeFundraiserProfile() {
    return this.bunqmeFundraiserProfile;
  }

  public void setBunqmeFundraiserProfile(BunqMeFundraiserProfileApiObject bunqmeFundraiserProfile) {
    this.bunqmeFundraiserProfile = bunqmeFundraiserProfile;
  }

  /**
   * The list of payments, paid to the bunq.me fundraiser profile.
   */
  public List<PaymentApiObject> getPayments() {
    return this.payments;
  }

  public void setPayments(List<PaymentApiObject> payments) {
    this.payments = payments;
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

    if (this.bunqmeFundraiserProfile != null) {
      return false;
    }

    if (this.payments != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeFundraiserResultApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeFundraiserResultApiObject.class, reader);
  }

}
