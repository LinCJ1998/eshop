package com.a612.springmvc.service;

import com.a612.springmvc.entity.Userinfo;

public interface LoginService {
    int selectCountByName(String userName);

    int SelectCountMatchPasswordByName(Userinfo userinfo);
}
