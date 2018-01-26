package com.bunq.sdk.model.generated.endpoint;

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
 * Represents conversation references.
 */
public class ChatConversationReference extends BunqModel {

  /**
   * Object type.
   */

  /**
   * The id of this conversation.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp the conversation reference was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp the conversation reference was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The id of this conversation.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp the conversation reference was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp the conversation reference was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
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

    return true;
  }

  /**
   */
  public static ChatConversationReference fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatConversationReference.class, reader);
  }

}
