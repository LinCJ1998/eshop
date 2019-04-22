package com.a612.springmvc.controller;

import com.a612.springmvc.entity.Userinfo;
import com.a612.springmvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping("/login")
    public String login(Model model, HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Userinfo userinfo=new Userinfo();
        userinfo.setUserName(username);
        userinfo.setUserPwd(password);
        int nameCount=loginService.selectCountByName(username);
        System.out.println("nameCount:"+nameCount);
        if(nameCount==1){
            int nameAndPassWordCount=loginService.SelectCountMatchPasswordByName(userinfo);
            System.out.println("UserPwd:"+userinfo.getUserPwd());
            System.out.println("nameAndPassWordCount:"+nameAndPassWordCount);
            if (nameAndPassWordCount==1){
                return "main";
            }
        }

        return "error";
    }
}
