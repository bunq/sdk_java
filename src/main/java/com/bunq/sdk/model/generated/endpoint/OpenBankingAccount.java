package com.bunq.sdk.model.generated.endpoint;

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

/**
 * Post processor for open banking account to be returned in the monetary account external post
 * processor.
 */
public class OpenBankingAccount extends BunqModel {

  /**
   * The status of this account.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The iban of this account.
   */
  @Expose
  @SerializedName("iban")
  private String iban;

  /**
   * The timestamp of the last time the account was synced with our open banking partner.
   */
  @Expose
  @SerializedName("time_synced_last")
  private String timeSyncedLast;

  /**
   * The bank provider the account comes from.
   */
  @Expose
  @SerializedName("provider_bank")
  private OpenBankingProviderBank providerBank;

  /**
   * The booked balance of the account.
   */
  @Expose
  @SerializedName("balance_booked")
  private Amount balanceBooked;

  /**
   * The available balance of the account, if provided by the other bank.
   */
  @Expose
  @SerializedName("balance_available")
  private Amount balanceAvailable;

  /**
   * The status of this account.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The iban of this account.
   */
  public String getIban() {
    return this.iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  /**
   * The timestamp of the last time the account was synced with our open banking partner.
   */
  public String getTimeSyncedLast() {
    return this.timeSyncedLast;
  }

  public void setTimeSyncedLast(String timeSyncedLast) {
    this.timeSyncedLast = timeSyncedLast;
  }

  /**
   * The bank provider the account comes from.
   */
  public OpenBankingProviderBank getProviderBank() {
    return this.providerBank;
  }

  public void setProviderBank(OpenBankingProviderBank providerBank) {
    this.providerBank = providerBank;
  }

  /**
   * The booked balance of the account.
   */
  public Amount getBalanceBooked() {
    return this.balanceBooked;
  }

  public void setBalanceBooked(Amount balanceBooked) {
    this.balanceBooked = balanceBooked;
  }

  /**
   * The available balance of the account, if provided by the other bank.
   */
  public Amount getBalanceAvailable() {
    return this.balanceAvailable;
  }

  public void setBalanceAvailable(Amount balanceAvailable) {
    this.balanceAvailable = balanceAvailable;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.iban != null) {
      return false;
    }

    if (this.timeSyncedLast != null) {
      return false;
    }

    if (this.providerBank != null) {
      return false;
    }

    if (this.balanceBooked != null) {
      return false;
    }

    if (this.balanceAvailable != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static OpenBankingAccount fromJsonReader(JsonReader reader) {
    return fromJsonReader(OpenBankingAccount.class, reader);
  }

}
