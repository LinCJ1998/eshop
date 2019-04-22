package com.a612.springmvc.service;

import com.a612.springmvc.entity.Userinfo;

public interface RegistService {
    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    int selectCountByName(String username);

    int selectCountByEmail(String email);
}
