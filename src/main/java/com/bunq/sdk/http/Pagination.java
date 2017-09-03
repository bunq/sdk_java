package com.bunq.sdk.http;

import com.bunq.sdk.exception.BunqException;
import java.util.HashMap;
import java.util.Map;

public class Pagination {

  /**
   * Error constants.
   */
  private static final String ERROR_NO_PREVIOUS_PAGE =
      "Could not generate previous page URL params: there is no previous page.";

  /**
   * URL Param constants.
   */
  public static final String PARAM_OLDER_ID = "older_id";
  public static final String PARAM_NEWER_ID = "newer_id";
  public static final String PARAM_FUTURE_ID = "future_id";
  public static final String PARAM_COUNT = "count";

  /**
   * Field constants.
   */
  private static final String FIELD_OLDER_URL = "older_url";
  private static final String FIELD_NEWER_URL = "newer_url";
  private static final String FIELD_FUTURE_URL = "future_url";

  private Integer olderId;
  private Integer newerId;
  private Integer futureId;
  private Integer count;

  /**
   * Get the URL params required to request the next page of the listing.
   */
  public Map<String, String> getUrlParamsNextPage() {
    Map<String, String> params = new HashMap<>();
    params.put(PARAM_NEWER_ID, Integer.toString(getNextId()));
    addCountToParamsIfNeeded(params);

    return params;
  }

  private Integer getNextId() {
    if (hasNextItemAssured()) {
      return newerId;
    } else {
      return futureId;
    }
  }

  public boolean hasNextItemAssured() {
    return newerId != null;
  }

  private void addCountToParamsIfNeeded(Map<String, String> params) {
    if (count != null) {
      params.put(PARAM_COUNT, Integer.toString(count));
    }
  }

  public Map<String, String> getUrlParamsPreviousPage() {
    if (!hasPreviousItem()) {
      throw new BunqException(ERROR_NO_PREVIOUS_PAGE);
    }

    Map<String, String> params = new HashMap<>();
    params.put(PARAM_OLDER_ID, Integer.toString(olderId));
    addCountToParamsIfNeeded(params);

    return params;
  }

  public boolean hasPreviousItem() {
    return olderId != null;
  }

  public Map<String, String> getUrlParamsCountOnly() {
    Map<String, String> params = new HashMap<>();
    addCountToParamsIfNeeded(params);

    return params;
  }

  public Integer getOlderId() {
    return olderId;
  }

  public void setOlderId(Integer olderId) {
    this.olderId = olderId;
  }

  public Integer getNewerId() {
    return newerId;
  }

  public void setNewerId(Integer newerId) {
    this.newerId = newerId;
  }

  public Integer getFutureId() {
    return futureId;
  }

  public void setFutureId(Integer futureId) {
    this.futureId = futureId;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

}
