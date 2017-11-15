package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class ChatMessageContent extends BunqModel {

  /**
   * Error constants.
   */
  private static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   */
  @Expose
  @SerializedName("ChatMessageContentAnchorEvent")
  private ChatMessageContentAnchorEvent chatMessageContentAnchorEvent;

  /**
   */
  @Expose
  @SerializedName("ChatMessageContentAttachment")
  private ChatMessageContentAttachment chatMessageContentAttachment;

  /**
   */
  @Expose
  @SerializedName("ChatMessageContentGeolocation")
  private ChatMessageContentGeolocation chatMessageContentGeolocation;

  /**
   */
  @Expose
  @SerializedName("ChatMessageContentStatusConversationTitle")
  private ChatMessageContentStatusConversationTitle chatMessageContentStatusConversationTitle;

  /**
   */
  @Expose
  @SerializedName("ChatMessageContentStatusConversation")
  private ChatMessageContentStatusConversation chatMessageContentStatusConversation;

  /**
   */
  @Expose
  @SerializedName("ChatMessageContentStatusMembership")
  private ChatMessageContentStatusMembership chatMessageContentStatusMembership;

  /**
   */
  @Expose
  @SerializedName("ChatMessageContentText")
  private ChatMessageContentText chatMessageContentText;

  /**
   */
  public ChatMessageContentAnchorEvent getChatMessageContentAnchorEvent() {
    return this.chatMessageContentAnchorEvent;
  }

  public void setChatMessageContentAnchorEvent(ChatMessageContentAnchorEvent chatMessageContentAnchorEvent) {
    this.chatMessageContentAnchorEvent = chatMessageContentAnchorEvent;
  }

  /**
   */
  public ChatMessageContentAttachment getChatMessageContentAttachment() {
    return this.chatMessageContentAttachment;
  }

  public void setChatMessageContentAttachment(ChatMessageContentAttachment chatMessageContentAttachment) {
    this.chatMessageContentAttachment = chatMessageContentAttachment;
  }

  /**
   */
  public ChatMessageContentGeolocation getChatMessageContentGeolocation() {
    return this.chatMessageContentGeolocation;
  }

  public void setChatMessageContentGeolocation(ChatMessageContentGeolocation chatMessageContentGeolocation) {
    this.chatMessageContentGeolocation = chatMessageContentGeolocation;
  }

  /**
   */
  public ChatMessageContentStatusConversationTitle getChatMessageContentStatusConversationTitle() {
    return this.chatMessageContentStatusConversationTitle;
  }

  public void setChatMessageContentStatusConversationTitle(ChatMessageContentStatusConversationTitle chatMessageContentStatusConversationTitle) {
    this.chatMessageContentStatusConversationTitle = chatMessageContentStatusConversationTitle;
  }

  /**
   */
  public ChatMessageContentStatusConversation getChatMessageContentStatusConversation() {
    return this.chatMessageContentStatusConversation;
  }

  public void setChatMessageContentStatusConversation(ChatMessageContentStatusConversation chatMessageContentStatusConversation) {
    this.chatMessageContentStatusConversation = chatMessageContentStatusConversation;
  }

  /**
   */
  public ChatMessageContentStatusMembership getChatMessageContentStatusMembership() {
    return this.chatMessageContentStatusMembership;
  }

  public void setChatMessageContentStatusMembership(ChatMessageContentStatusMembership chatMessageContentStatusMembership) {
    this.chatMessageContentStatusMembership = chatMessageContentStatusMembership;
  }

  /**
   */
  public ChatMessageContentText getChatMessageContentText() {
    return this.chatMessageContentText;
  }

  public void setChatMessageContentText(ChatMessageContentText chatMessageContentText) {
    this.chatMessageContentText = chatMessageContentText;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.chatMessageContentAnchorEvent != null) {
      return this.chatMessageContentAnchorEvent;
    }

    if (this.chatMessageContentAttachment != null) {
      return this.chatMessageContentAttachment;
    }

    if (this.chatMessageContentGeolocation != null) {
      return this.chatMessageContentGeolocation;
    }

    if (this.chatMessageContentStatusConversationTitle != null) {
      return this.chatMessageContentStatusConversationTitle;
    }

    if (this.chatMessageContentStatusConversation != null) {
      return this.chatMessageContentStatusConversation;
    }

    if (this.chatMessageContentStatusMembership != null) {
      return this.chatMessageContentStatusMembership;
    }

    if (this.chatMessageContentText != null) {
      return this.chatMessageContentText;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

}
