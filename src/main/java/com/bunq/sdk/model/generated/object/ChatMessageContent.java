package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class ChatMessageContent extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.chatMessageContentAnchorEvent != null) {
      return false;
    }

    if (this.chatMessageContentAttachment != null) {
      return false;
    }

    if (this.chatMessageContentGeolocation != null) {
      return false;
    }

    if (this.chatMessageContentStatusConversationTitle != null) {
      return false;
    }

    if (this.chatMessageContentStatusConversation != null) {
      return false;
    }

    if (this.chatMessageContentStatusMembership != null) {
      return false;
    }

    if (this.chatMessageContentText != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ChatMessageContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatMessageContent.class, reader);
  }

}
