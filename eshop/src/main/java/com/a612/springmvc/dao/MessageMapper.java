package com.a612.springmvc.dao;

import com.a612.springmvc.entity.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageMapper {
    int insert(Message message);
}
