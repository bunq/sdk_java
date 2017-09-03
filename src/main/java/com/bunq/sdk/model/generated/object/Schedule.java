package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 */
public class Schedule extends BunqModel {

  /**
   * The schedule start time (UTC).
   */
  @Expose
  @SerializedName("time_start")
  private String timeStart;

  /**
   * The schedule end time (UTC).
   */
  @Expose
  @SerializedName("time_end")
  private String timeEnd;

  /**
   * The schedule recurrence unit, options: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY
   */
  @Expose
  @SerializedName("recurrence_unit")
  private String recurrenceUnit;

  /**
   * The schedule recurrence size. For example size 4 and unit WEEKLY means the recurrence is
   * every 4 weeks.
   */
  @Expose
  @SerializedName("recurrence_size")
  private Integer recurrenceSize;

  /**
   * The schedule status, options: ACTIVE, FINISHED, CANCELLED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The scheduled object.
   */
  @Expose
  @SerializedName("object")
  private BunqModel object;

  public Schedule(String timeStart, String recurrenceUnit, Integer recurrenceSize) {
    this.timeStart = timeStart;
    this.recurrenceUnit = recurrenceUnit;
    this.recurrenceSize = recurrenceSize;
  }

  /**
   * The schedule start time (UTC).
   */
  public String getTimeStart() {
    return this.timeStart;
  }

  public void setTimeStart(String timeStart) {
    this.timeStart = timeStart;
  }

  /**
   * The schedule end time (UTC).
   */
  public String getTimeEnd() {
    return this.timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  /**
   * The schedule recurrence unit, options: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY
   */
  public String getRecurrenceUnit() {
    return this.recurrenceUnit;
  }

  public void setRecurrenceUnit(String recurrenceUnit) {
    this.recurrenceUnit = recurrenceUnit;
  }

  /**
   * The schedule recurrence size. For example size 4 and unit WEEKLY means the recurrence is
   * every 4 weeks.
   */
  public Integer getRecurrenceSize() {
    return this.recurrenceSize;
  }

  public void setRecurrenceSize(Integer recurrenceSize) {
    this.recurrenceSize = recurrenceSize;
  }

  /**
   * The schedule status, options: ACTIVE, FINISHED, CANCELLED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The scheduled object.
   */
  public BunqModel getObject() {
    return this.object;
  }

  public void setObject(BunqModel object) {
    this.object = object;
  }

}
