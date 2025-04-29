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
public class OauthCallbackUrlObject extends BunqModel {

  /**
   * The id of the callback URL.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the callback URL's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the callback URL's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The Callback URL.
   */
  @Expose
  @SerializedName("url")
  private String url;

  /**
   * The id of the callback URL.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the callback URL's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the callback URL's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The Callback URL.
   */
  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
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

    if (this.url != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static OauthCallbackUrlObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(OauthCallbackUrlObject.class, reader);
  }

}
