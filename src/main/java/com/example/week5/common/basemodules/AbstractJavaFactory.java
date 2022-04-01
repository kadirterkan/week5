package com.example.week5.common.basemodules;

import com.example.week5.common.entities.dto.MessageResponse;
import com.example.week5.common.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractJavaFactory {

    @Autowired
    protected MessageService messageService;

    public abstract MessageResponse create();

    protected abstract MessageResponse checker();
}
