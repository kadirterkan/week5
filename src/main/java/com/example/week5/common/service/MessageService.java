package com.example.week5.common.service;

import com.example.week5.common.entities.dto.MessageResponse;
import com.example.week5.common.entities.enums.MessageType;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public MessageResponse createMessage(MessageType messageType, String message) {
        return new MessageResponse(messageType, message);
    }
}
