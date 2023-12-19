package com.bunq.sdk.model.generated.object;

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

/**
 */
public class RegistryMembershipSetting extends BunqModel {

  /**
   * The setting for for adding automatically card transactions to the registry.
   */
  @Expose
  @SerializedName("auto_add_card_transaction")
  private String autoAddCardTransaction;

  /**
   * The time when auto add card gets active
   */
  @Expose
  @SerializedName("time_auto_add_card_transaction_start")
  private String timeAutoAddCardTransactionStart;

  /**
   * The time when auto add card gets inactive
   */
  @Expose
  @SerializedName("time_auto_add_card_transaction_end")
  private String timeAutoAddCardTransactionEnd;

  /**
   * The ids of the cards that have been added to registry membership setting.
   */
  @Expose
  @SerializedName("card_ids")
  private List<String> cardIds;

  /**
   * The cards of which payments will be automatically added to this Registry.
   */
  @Expose
  @SerializedName("card_labels")
  private List<LabelCard> cardLabels;

  /**
   * The setting for for adding automatically card transactions to the registry.
   */
  @Expose
  @SerializedName("auto_add_card_transaction_field_for_request")
  private String autoAddCardTransactionFieldForRequest;

  /**
   * The time when auto add card gets active
   */
  @Expose
  @SerializedName("time_auto_add_card_transaction_start_field_for_request")
  private String timeAutoAddCardTransactionStartFieldForRequest;

  /**
   * The time when auto add card gets inactive
   */
  @Expose
  @SerializedName("time_auto_add_card_transaction_end_field_for_request")
  private String timeAutoAddCardTransactionEndFieldForRequest;

  /**
   * The ids of the cards that have been added to registry membership setting.
   */
  @Expose
  @SerializedName("card_ids_field_for_request")
  private List<String> cardIdsFieldForRequest;

  public RegistryMembershipSetting() {
  this(null, null, null, null);
  }

  public RegistryMembershipSetting(String autoAddCardTransaction) {
  this(autoAddCardTransaction, null, null, null);
  }

  public RegistryMembershipSetting(String autoAddCardTransaction, String timeAutoAddCardTransactionStart) {
  this(autoAddCardTransaction, timeAutoAddCardTransactionStart, null, null);
  }

  public RegistryMembershipSetting(String autoAddCardTransaction, String timeAutoAddCardTransactionStart, String timeAutoAddCardTransactionEnd) {
  this(autoAddCardTransaction, timeAutoAddCardTransactionStart, timeAutoAddCardTransactionEnd, null);
  }

  public RegistryMembershipSetting(String autoAddCardTransaction, String timeAutoAddCardTransactionStart, String timeAutoAddCardTransactionEnd, List<String> cardIds) {
    this.autoAddCardTransactionFieldForRequest = autoAddCardTransaction;
    this.timeAutoAddCardTransactionStartFieldForRequest = timeAutoAddCardTransactionStart;
    this.timeAutoAddCardTransactionEndFieldForRequest = timeAutoAddCardTransactionEnd;
    this.cardIdsFieldForRequest = cardIds;
  }

  /**
   * The setting for for adding automatically card transactions to the registry.
   */
  public String getAutoAddCardTransaction() {
    return this.autoAddCardTransaction;
  }

  public void setAutoAddCardTransaction(String autoAddCardTransaction) {
    this.autoAddCardTransaction = autoAddCardTransaction;
  }

  /**
   * The time when auto add card gets active
   */
  public String getTimeAutoAddCardTransactionStart() {
    return this.timeAutoAddCardTransactionStart;
  }

  public void setTimeAutoAddCardTransactionStart(String timeAutoAddCardTransactionStart) {
    this.timeAutoAddCardTransactionStart = timeAutoAddCardTransactionStart;
  }

  /**
   * The time when auto add card gets inactive
   */
  public String getTimeAutoAddCardTransactionEnd() {
    return this.timeAutoAddCardTransactionEnd;
  }

  public void setTimeAutoAddCardTransactionEnd(String timeAutoAddCardTransactionEnd) {
    this.timeAutoAddCardTransactionEnd = timeAutoAddCardTransactionEnd;
  }

  /**
   * The ids of the cards that have been added to registry membership setting.
   */
  public List<String> getCardIds() {
    return this.cardIds;
  }

  public void setCardIds(List<String> cardIds) {
    this.cardIds = cardIds;
  }

  /**
   * The cards of which payments will be automatically added to this Registry.
   */
  public List<LabelCard> getCardLabels() {
    return this.cardLabels;
  }

  public void setCardLabels(List<LabelCard> cardLabels) {
    this.cardLabels = cardLabels;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.autoAddCardTransaction != null) {
      return false;
    }

    if (this.timeAutoAddCardTransactionStart != null) {
      return false;
    }

    if (this.timeAutoAddCardTransactionEnd != null) {
      return false;
    }

    if (this.cardIds != null) {
      return false;
    }

    if (this.cardLabels != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RegistryMembershipSetting fromJsonReader(JsonReader reader) {
    return fromJsonReader(RegistryMembershipSetting.class, reader);
  }

}
