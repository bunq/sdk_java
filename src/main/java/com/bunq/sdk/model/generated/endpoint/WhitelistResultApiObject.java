package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.ErrorObject;
import com.bunq.sdk.model.generated.object.RequestInquiryReferenceObject;
import com.bunq.sdk.model.generated.object.WhitelistResultViewAnchoredObjectObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Whitelist an SDD so that when one comes in, it is automatically accepted.
 */
public class WhitelistResultApiObject extends BunqModel {

  /**
   * The ID of the whitelist entry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The account from which payments will be deducted when a transaction is matched with this
   * whitelist.
   */
  @Expose
  @SerializedName("monetary_account_paying_id")
  private Integer monetaryAccountPayingId;

  /**
   * The status of the WhitelistResult.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The subStatus of the WhitelistResult.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The message when the whitelist result has failed due to user error.
   */
  @Expose
  @SerializedName("error_message")
  private List<ErrorObject> errorMessage;

  /**
   * The corresponding whitelist.
   */
  @Expose
  @SerializedName("whitelist")
  private WhitelistApiObject whitelist;

  /**
   * The details of the external object the event was created for.
   */
  @Expose
  @SerializedName("object")
  private WhitelistResultViewAnchoredObjectObject object;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReferenceObject> requestReferenceSplitTheBill;

  /**
   * The ID of the whitelist entry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The account from which payments will be deducted when a transaction is matched with this
   * whitelist.
   */
  public Integer getMonetaryAccountPayingId() {
    return this.monetaryAccountPayingId;
  }

  public void setMonetaryAccountPayingId(Integer monetaryAccountPayingId) {
    this.monetaryAccountPayingId = monetaryAccountPayingId;
  }

  /**
   * The status of the WhitelistResult.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The subStatus of the WhitelistResult.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The message when the whitelist result has failed due to user error.
   */
  public List<ErrorObject> getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(List<ErrorObject> errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * The corresponding whitelist.
   */
  public WhitelistApiObject getWhitelist() {
    return this.whitelist;
  }

  public void setWhitelist(WhitelistApiObject whitelist) {
    this.whitelist = whitelist;
  }

  /**
   * The details of the external object the event was created for.
   */
  public WhitelistResultViewAnchoredObjectObject getObject() {
    return this.object;
  }

  public void setObject(WhitelistResultViewAnchoredObjectObject object) {
    this.object = object;
  }

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  public List<RequestInquiryReferenceObject> getRequestReferenceSplitTheBill() {
    return this.requestReferenceSplitTheBill;
  }

  public void setRequestReferenceSplitTheBill(List<RequestInquiryReferenceObject> requestReferenceSplitTheBill) {
    this.requestReferenceSplitTheBill = requestReferenceSplitTheBill;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.monetaryAccountPayingId != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.errorMessage != null) {
      return false;
    }

    if (this.whitelist != null) {
      return false;
    }

    if (this.object != null) {
      return false;
    }

    if (this.requestReferenceSplitTheBill != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static WhitelistResultApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(WhitelistResultApiObject.class, reader);
  }

}
