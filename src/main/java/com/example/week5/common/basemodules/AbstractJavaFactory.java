package com.example.week5.common.basemodules;

import com.example.week5.common.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractJavaFactory {

    @Autowired
    private MessageService messageService;
}
