package com.a612.springmvc.controller;

import com.a612.springmvc.entity.Goodsinfo;
import com.a612.springmvc.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    GoodsInfoService goodsInfoService;

    @RequestMapping("/category")
    public String selectAllByGoodsId(Model model, HttpServletRequest request) {
        Integer goodsId= Integer.valueOf(request.getParameter("goodsId"));
        ArrayList<Goodsinfo> list=goodsInfoService.selectAllByGoodsId(1);
        for (Goodsinfo goodsinfo:list
             ) {
            System.out.println(goodsinfo.getGoodsName());
        }
        List<String> l=new LinkedList<String>();
        l.add("11");
        l.add("22");
        model.addAttribute("list",list);
        model.addAttribute("Info",new String("Hello World"));
        model.addAttribute("greetings", "I came from Model not ModelAttribute");
        model.addAttribute("goodsInfo",list.get(0));
        System.out.println("category");
        return "category";
    }
}
