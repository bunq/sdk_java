package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Schedule;
import com.bunq.sdk.model.generated.object.ScheduleRequestInquiryEntry;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to schedule request inquiry batches.
 */
public class ScheduleRequestInquiryBatch extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_REQUEST_INQUIRIES = "request_inquiries";
  public static final String FIELD_SCHEDULE = "schedule";
  public static final String FIELD_TOTAL_AMOUNT_INQUIRED = "total_amount_inquired";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ScheduleRequestInquiryBatch";

  /**
   * The request batch details.
   */
  @Expose
  @SerializedName("request_inquiries")
  private List<ScheduleRequestInquiryEntry> requestInquiries;

  /**
   * The schedule details.
   */
  @Expose
  @SerializedName("schedule")
  private Schedule schedule;

  /**
   * The total amount originally inquired for this batch.
   */
  @Expose
  @SerializedName("total_amount_inquired")
  private Amount totalAmountInquired;

  /**
   * The request batch details.
   */
  public List<ScheduleRequestInquiryEntry> getRequestInquiries() {
    return this.requestInquiries;
  }

  public void setRequestInquiries(List<ScheduleRequestInquiryEntry> requestInquiries) {
    this.requestInquiries = requestInquiries;
  }

  /**
   * The schedule details.
   */
  public Schedule getSchedule() {
    return this.schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  /**
   * The total amount originally inquired for this batch.
   */
  public Amount getTotalAmountInquired() {
    return this.totalAmountInquired;
  }

  public void setTotalAmountInquired(Amount totalAmountInquired) {
    this.totalAmountInquired = totalAmountInquired;
  }

}
