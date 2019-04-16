package com.a612.springmvc.controller;

import com.a612.springmvc.entity.Message;
import com.a612.springmvc.service.MessageService;
import com.a612.springmvc.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class MessageController{
    @Autowired(required = true)
    private MessageService messageService;
    @RequestMapping("/hello")
    public String hello(){
        Message message=new Message(15,"2","3","4");
        messageService.insert(message);
        return "hello";
    }

}
