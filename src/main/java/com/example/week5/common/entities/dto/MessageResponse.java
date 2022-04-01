package com.example.week5.common.entities.dto;

import com.example.week5.common.entities.enums.MessageType;

public class MessageResponse {
    private final MessageType messageType;
    private final String message;

    public MessageResponse(MessageType messageType, String message) {
        this.messageType = messageType;
        this.message = message;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getMessage() {
        return message;
    }
}
