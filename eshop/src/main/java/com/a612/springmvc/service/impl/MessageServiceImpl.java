package com.a612.springmvc.service.impl;

import com.a612.springmvc.dao.MessageMapper;
import com.a612.springmvc.entity.Message;
import com.a612.springmvc.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    private MessageMapper mapper;

    @Override
    public int insert(Message message) {
        mapper.insert(message);
        return 0;
    }

}
