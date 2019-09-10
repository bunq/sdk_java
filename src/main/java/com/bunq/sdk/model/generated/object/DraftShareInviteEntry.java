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
public class DraftShareInviteEntry extends BunqModel {

  /**
   * The share details. Only one of these objects is returned.
   */
  @Expose
  @SerializedName("share_detail")
  private ShareDetail shareDetail;

  /**
   * The start date of this share.
   */
  @Expose
  @SerializedName("start_date")
  private String startDate;

  /**
   * The expiration date of this share.
   */
  @Expose
  @SerializedName("end_date")
  private String endDate;

  /**
   * The share details. Only one of these objects may be passed.
   */
  @Expose
  @SerializedName("share_detail_field_for_request")
  private ShareDetail shareDetailFieldForRequest;

  /**
   * The start date of this share.
   */
  @Expose
  @SerializedName("start_date_field_for_request")
  private String startDateFieldForRequest;

  /**
   * The expiration date of this share.
   */
  @Expose
  @SerializedName("end_date_field_for_request")
  private String endDateFieldForRequest;

  public DraftShareInviteEntry() {
  this(null, null, null);
  }

  public DraftShareInviteEntry(ShareDetail shareDetail) {
  this(shareDetail, null, null);
  }

  public DraftShareInviteEntry(ShareDetail shareDetail, String startDate) {
  this(shareDetail, startDate, null);
  }

  public DraftShareInviteEntry(ShareDetail shareDetail, String startDate, String endDate) {
    this.shareDetailFieldForRequest = shareDetail;
    this.startDateFieldForRequest = startDate;
    this.endDateFieldForRequest = endDate;
  }

  /**
   * The share details. Only one of these objects is returned.
   */
  public ShareDetail getShareDetail() {
    return this.shareDetail;
  }

  public void setShareDetail(ShareDetail shareDetail) {
    this.shareDetail = shareDetail;
  }

  /**
   * The start date of this share.
   */
  public String getStartDate() {
    return this.startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * The expiration date of this share.
   */
  public String getEndDate() {
    return this.endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.shareDetail != null) {
      return false;
    }

    if (this.startDate != null) {
      return false;
    }

    if (this.endDate != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static DraftShareInviteEntry fromJsonReader(JsonReader reader) {
    return fromJsonReader(DraftShareInviteEntry.class, reader);
  }

}
