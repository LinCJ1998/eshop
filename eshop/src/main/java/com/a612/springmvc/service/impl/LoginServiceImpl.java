package com.a612.springmvc.service.impl;

import com.a612.springmvc.dao.UserinfoMapper;
import com.a612.springmvc.entity.Userinfo;
import com.a612.springmvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserinfoMapper mapper;
    @Override
    public int selectCountByName(String username) {
        return mapper.selectCountByName(username);
    }

    @Override
    public int SelectCountMatchPasswordByName(Userinfo userinfo) {
        return mapper.SelectCountMatchPasswordByName(userinfo);
    }
}
