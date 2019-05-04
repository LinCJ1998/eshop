package com.a612.springmvc.service.impl;

import com.a612.springmvc.dao.GoodstypeMapper;
import com.a612.springmvc.entity.Goodstype;
import com.a612.springmvc.service.GoodstypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodstypeServiceImpl implements GoodstypeService{
    @Autowired
    private GoodstypeMapper mapper;
    @Override
    public int insertSelective(Goodstype goodstype) {
        mapper.insertSelective(goodstype);
        return 0;
    }


}
