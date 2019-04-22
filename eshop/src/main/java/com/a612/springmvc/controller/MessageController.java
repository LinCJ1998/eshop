package com.a612.springmvc.controller;

import com.a612.springmvc.entity.Goodstype;
import com.a612.springmvc.entity.Message;
import com.a612.springmvc.service.GoodstypeService;
import com.a612.springmvc.service.MessageService;
import com.a612.springmvc.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/mvc")
public class MessageController{
    @Autowired(required = true)
    private MessageService messageService;
    @Autowired(required = true)
    private GoodstypeService goodstypeService;
    @RequestMapping("/hello")
    public String hello(){
        Message message=new Message(18,"2","3","4");
        messageService.insert(message);
        return "hello";
    }
    @RequestMapping("/login")
    public String login(Model model, HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("root") && password.equals("root")){
            model.addAttribute("msg", "success");
            return "success";
        }else{
            return "error";
        }
    }
    @RequestMapping("/inserttype")
    public String insert(Model model, HttpServletRequest request){
        Goodstype goodstype=new Goodstype(1,"2","3");
        goodstypeService.insertSelective(goodstype);
        return "hello";
    }

}
