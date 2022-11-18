package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.UserApiKeyAnchoredUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 * Used to view OAuth request detais in events.
 */
public class UserApiKey extends BunqModel {

    /**
     * The id of the user.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The timestamp of the user object's creation.
     */
    @Expose
    @SerializedName("created")
    private String created;

    /**
     * The timestamp of the user object's last update.
     */
    @Expose
    @SerializedName("updated")
    private String updated;

    /**
     * The user who requested access.
     */
    @Expose
    @SerializedName("requested_by_user")
    private UserApiKeyAnchoredUser requestedByUser;

    /**
     * The user who granted access.
     */
    @Expose
    @SerializedName("granted_by_user")
    private UserApiKeyAnchoredUser grantedByUser;

    /**
     * The id of the user.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The timestamp of the user object's creation.
     */
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * The timestamp of the user object's last update.
     */
    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * The user who requested access.
     */
    public UserApiKeyAnchoredUser getRequestedByUser() {
        return this.requestedByUser;
    }

    public void setRequestedByUser(UserApiKeyAnchoredUser requestedByUser) {
        this.requestedByUser = requestedByUser;
    }

    /**
     * The user who granted access.
     */
    public UserApiKeyAnchoredUser getGrantedByUser() {
        return this.grantedByUser;
    }

    public void setGrantedByUser(UserApiKeyAnchoredUser grantedByUser) {
        this.grantedByUser = grantedByUser;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.id != null) {
            return false;
        }

        if (this.created != null) {
            return false;
        }

        if (this.updated != null) {
            return false;
        }

        if (this.requestedByUser != null) {
            return false;
        }

        if (this.grantedByUser != null) {
            return false;
        }

        return true;
    }

    /**
     *
     */
    public static UserApiKey fromJsonReader(JsonReader reader) {
        return fromJsonReader(UserApiKey.class, reader);
    }

}
