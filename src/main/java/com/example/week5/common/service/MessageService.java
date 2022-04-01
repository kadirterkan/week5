package com.example.week5.common.service;

import com.example.week5.common.entities.dto.MessageResponse;
import com.example.week5.common.entities.enums.MessageType;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public MessageResponse createSuccessMessage(String message) {
        return new MessageResponse(MessageType.SUCCESS, message);
    }

    public MessageResponse createErrorMessage(String message) {
        return new MessageResponse(MessageType.ERROR, message);
    }
}
