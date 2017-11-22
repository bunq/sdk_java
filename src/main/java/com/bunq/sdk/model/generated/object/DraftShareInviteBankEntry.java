package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class DraftShareInviteBankEntry extends BunqModel {

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

  public DraftShareInviteBankEntry(ShareDetail shareDetail) {
    this.shareDetail = shareDetail;
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
  public boolean areAllFieldNull() {
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

}
