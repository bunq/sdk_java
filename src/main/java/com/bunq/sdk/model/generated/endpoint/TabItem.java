package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.AttachmentPublic;
import com.bunq.sdk.model.generated.object.AttachmentTab;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to get items on a tab.
 */
public class TabItem extends BunqModel {

  /**
   * Object type.
   */

  /**
   * The id of the tab item.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The item's brief description.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The item's EAN code.
   */
  @Expose
  @SerializedName("ean_code")
  private String eanCode;

  /**
   * A struct with an AttachmentPublic UUID that used as an avatar for the TabItem.
   */
  @Expose
  @SerializedName("avatar_attachment")
  private AttachmentPublic avatarAttachment;

  /**
   * A list of AttachmentTab attached to the TabItem.
   */
  @Expose
  @SerializedName("tab_attachment")
  private List<AttachmentTab> tabAttachment;

  /**
   * The quantity of the item. Formatted as a number containing up to 15 digits, up to 15 decimals
   * and using a dot.
   */
  @Expose
  @SerializedName("quantity")
  private String quantity;

  /**
   * The money amount of the item.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The id of the tab item.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The item's brief description.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The item's EAN code.
   */
  public String getEanCode() {
    return this.eanCode;
  }

  public void setEanCode(String eanCode) {
    this.eanCode = eanCode;
  }

  /**
   * A struct with an AttachmentPublic UUID that used as an avatar for the TabItem.
   */
  public AttachmentPublic getAvatarAttachment() {
    return this.avatarAttachment;
  }

  public void setAvatarAttachment(AttachmentPublic avatarAttachment) {
    this.avatarAttachment = avatarAttachment;
  }

  /**
   * A list of AttachmentTab attached to the TabItem.
   */
  public List<AttachmentTab> getTabAttachment() {
    return this.tabAttachment;
  }

  public void setTabAttachment(List<AttachmentTab> tabAttachment) {
    this.tabAttachment = tabAttachment;
  }

  /**
   * The quantity of the item. Formatted as a number containing up to 15 digits, up to 15 decimals
   * and using a dot.
   */
  public String getQuantity() {
    return this.quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  /**
   * The money amount of the item.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.eanCode != null) {
      return false;
    }

    if (this.avatarAttachment != null) {
      return false;
    }

    if (this.tabAttachment != null) {
      return false;
    }

    if (this.quantity != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TabItem fromJsonReader(JsonReader reader) {
    return fromJsonReader(TabItem.class, reader);
  }

}
