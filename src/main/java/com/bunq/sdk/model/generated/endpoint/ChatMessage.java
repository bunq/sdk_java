package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

/**
 * Endpoint for retrieving the messages that are part of a conversation.
 */
public class ChatMessage extends BunqModel {

    /**
     *
     */
    public static ChatMessage fromJsonReader(JsonReader reader) {
        return fromJsonReader(ChatMessage.class, reader);
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        return true;
    }

}
