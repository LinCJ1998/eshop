package com.a612.springmvc.service;

import com.a612.springmvc.entity.Goodsinfo;

import java.util.ArrayList;

public interface GoodsInfoService {
    ArrayList<Goodsinfo> selectAllByGoodsId(Integer goodsId);
}
