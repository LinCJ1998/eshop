package com.a612.springmvc.controller;

import com.a612.springmvc.entity.Message;
import com.a612.springmvc.entity.Userinfo;
import com.a612.springmvc.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class RegistController {
    @Autowired
    RegistService registService;
    @RequestMapping("/regist")
    public String regist(Model model, HttpServletRequest request){
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String loginPassword = request.getParameter("login_password");
        String confirmPassword = request.getParameter("confirm_password");
        //UserId自增
        if (confirmPassword.equals(loginPassword)){
            Userinfo userinfo=new Userinfo(null,username,loginPassword,email,"5",new Date(),new Date());
            int nameCount=registService.selectCountByName(username);
            //数据库中名字为usernamed的记录数，为0则注册成功
            if (nameCount==0) {
                int emailCount=registService.selectCountByEmail(email);
                System.out.println(emailCount);
                if (emailCount==0) {
                    registService.insertSelective(userinfo);
                    return "success";
                }
            }
        }
        return "error";
    }
}
