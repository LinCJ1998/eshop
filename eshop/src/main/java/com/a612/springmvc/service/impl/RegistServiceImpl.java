package com.a612.springmvc.service.impl;

import com.a612.springmvc.dao.UserinfoMapper;
import com.a612.springmvc.entity.Userinfo;
import com.a612.springmvc.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistServiceImpl implements RegistService {
    @Autowired
    UserinfoMapper mapper;

    @Override
    public int insert(Userinfo record) {
        mapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Userinfo record) {
        mapper.insertSelective(record);
        return 0;
    }

    @Override
    public int selectCountByName(String username) {
        return mapper.selectCountByName(username);
    }

    @Override
    public int selectCountByEmail(String email) {
        return mapper.selectCountByEmail(email);
    }
}
