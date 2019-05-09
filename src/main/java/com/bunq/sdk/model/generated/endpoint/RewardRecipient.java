package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Used to view Rewards.
 */
public class RewardRecipient extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/reward-recipient/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/reward-recipient";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "RewardRecipient";

  /**
   * The id of the reward.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The time the reward was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The time the reward was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The status of the reward.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The subStatus of the reward.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The type of the reward.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The alias of the other user eligible for the reward award.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelUser counterpartyAlias;

  /**
   * The amount that will be/was awarded as reward for the reward.
   */
  @Expose
  @SerializedName("amount_reward")
  private Amount amountReward;

  /**
   */
  public static BunqResponse<RewardRecipient> get(Integer rewardRecipientId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), rewardRecipientId), params, customHeaders);

    return fromJson(RewardRecipient.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<RewardRecipient> get() {
    return get(null, null, null);
  }

  public static BunqResponse<RewardRecipient> get(Integer rewardRecipientId) {
    return get(rewardRecipientId, null, null);
  }

  public static BunqResponse<RewardRecipient> get(Integer rewardRecipientId, Map<String, String> params) {
    return get(rewardRecipientId, params, null);
  }

  /**
   */
  public static BunqResponse<List<RewardRecipient>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(RewardRecipient.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<RewardRecipient>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<RewardRecipient>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The id of the reward.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The time the reward was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The time the reward was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The status of the reward.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The subStatus of the reward.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The type of the reward.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The alias of the other user eligible for the reward award.
   */
  public LabelUser getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelUser counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The amount that will be/was awarded as reward for the reward.
   */
  public Amount getAmountReward() {
    return this.amountReward;
  }

  public void setAmountReward(Amount amountReward) {
    this.amountReward = amountReward;
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

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.amountReward != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RewardRecipient fromJsonReader(JsonReader reader) {
    return fromJsonReader(RewardRecipient.class, reader);
  }

}
