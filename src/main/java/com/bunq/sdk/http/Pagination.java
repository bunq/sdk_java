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
    private static final String ERROR_NO_NEXT_PAGE =
            "Could not generate next page URL params: next page not found.";

    /**
     * URL Param constants.
     */
    public static final String PARAM_OLDER_ID = "older_id";
    public static final String PARAM_NEWER_ID = "newer_id";
    public static final String PARAM_FUTURE_ID = "future_id";
    public static final String PARAM_COUNT = "count";

    private Long olderId;
    private Long newerId;
    private Long futureId;
    private Long count;

    /**
     * Get the URL params required to request the next page of the listing.
     */
    public Map<String, String> getUrlParamsNextPage() {
        assertHasNextPage();

        Map<String, String> params = new HashMap<>();
        params.put(PARAM_NEWER_ID, Long.toString(getNextId()));
        addCountToParamsIfNeeded(params);

        return params;
    }

    private void assertHasNextPage() {
        if (getNextId() == null) {
            throw new BunqException(ERROR_NO_NEXT_PAGE);
        }
    }

    private Long getNextId() {
        if (hasNextPageAssured()) {
            return newerId;
        } else {
            return futureId;
        }
    }

    public boolean hasNextPageAssured() {
        return newerId != null;
    }

    private void addCountToParamsIfNeeded(Map<String, String> params) {
        if (count != null) {
            params.put(PARAM_COUNT, Long.toString(count));
        }
    }

    /**
     * Get the URL params required to request the previous page of the listing.
     */
    public Map<String, String> getUrlParamsPreviousPage() {
        assertHasPreviousPage();

        Map<String, String> params = new HashMap<>();
        params.put(PARAM_OLDER_ID, Long.toString(olderId));
        addCountToParamsIfNeeded(params);

        return params;
    }

    private void assertHasPreviousPage() {
        if (!hasPreviousPage()) {
            throw new BunqException(ERROR_NO_PREVIOUS_PAGE);
        }
    }

    public boolean hasPreviousPage() {
        return olderId != null;
    }

    /**
     * Get the URL params required to request the latest page with count of this pagination.
     */
    public Map<String, String> getUrlParamsCountOnly() {
        Map<String, String> params = new HashMap<>();
        addCountToParamsIfNeeded(params);

        return params;
    }

    public Long getOlderId() {
        return olderId;
    }

    public void setOlderId(Long olderId) {
        this.olderId = olderId;
    }

    public Long getNewerId() {
        return newerId;
    }

    public void setNewerId(Long newerId) {
        this.newerId = newerId;
    }

    public Long getFutureId() {
        return futureId;
    }

    public void setFutureId(Long futureId) {
        this.futureId = futureId;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
