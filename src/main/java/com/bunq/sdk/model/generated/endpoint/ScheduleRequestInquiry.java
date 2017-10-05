package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
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
 * Used to schedule request inquiry.
 */
public class ScheduleRequestInquiry extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_REQUEST_INQUIRY = "request_inquiry";
  public static final String FIELD_SCHEDULE = "schedule";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ScheduleRequestInquiry";

  /**
   * The request inquiry.
   */
  @Expose
  @SerializedName("request_inquiry")
  private ScheduleRequestInquiryEntry requestInquiry;

  /**
   * The schedule details.
   */
  @Expose
  @SerializedName("schedule")
  private Schedule schedule;

  /**
   * The request inquiry.
   */
  public ScheduleRequestInquiryEntry getRequestInquiry() {
    return this.requestInquiry;
  }

  public void setRequestInquiry(ScheduleRequestInquiryEntry requestInquiry) {
    this.requestInquiry = requestInquiry;
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

}
