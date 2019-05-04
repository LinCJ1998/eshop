package com.a612.springmvc.service.impl;

import com.a612.springmvc.dao.GoodsinfoMapper;
import com.a612.springmvc.entity.Goodsinfo;
import com.a612.springmvc.service.GoodsInfoService;
import com.a612.springmvc.service.GoodstypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService{
    @Autowired
    private GoodsinfoMapper mapper;


    @Override
    public ArrayList<Goodsinfo> selectAllByGoodsId(Integer goodsId) {
        ArrayList<Goodsinfo> list=mapper.selectAllByGoodsId(goodsId);
        return list;
    }


}
