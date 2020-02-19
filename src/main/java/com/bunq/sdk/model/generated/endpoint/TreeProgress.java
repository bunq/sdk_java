package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * See how many trees this user has planted.
 */
public class TreeProgress extends BunqModel {

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_LISTING = "user/%s/tree-progress";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "TreeProgress";

    /**
     * The number of trees this user and all users have planted.
     */
    @Expose
    @SerializedName("number_of_tree")
    private BigDecimal numberOfTree;

    /**
     * The progress towards the next tree.
     */
    @Expose
    @SerializedName("progress_tree_next")
    private BigDecimal progressTreeNext;

    /**
     *
     */
    public static BunqResponse<List<TreeProgress>> list(Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

        return fromJsonList(TreeProgress.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<TreeProgress>> list() {
        return list(null, null);
    }

    public static BunqResponse<List<TreeProgress>> list(Map<String, String> params) {
        return list(params, null);
    }

    /**
     *
     */
    public static TreeProgress fromJsonReader(JsonReader reader) {
        return fromJsonReader(TreeProgress.class, reader);
    }

    /**
     * The number of trees this user and all users have planted.
     */
    public BigDecimal getNumberOfTree() {
        return this.numberOfTree;
    }

    public void setNumberOfTree(BigDecimal numberOfTree) {
        this.numberOfTree = numberOfTree;
    }

    /**
     * The progress towards the next tree.
     */
    public BigDecimal getProgressTreeNext() {
        return this.progressTreeNext;
    }

    public void setProgressTreeNext(BigDecimal progressTreeNext) {
        this.progressTreeNext = progressTreeNext;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.numberOfTree != null) {
            return false;
        }

        if (this.progressTreeNext != null) {
            return false;
        }

        return true;
    }

}
