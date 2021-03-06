package com.a612.springmvc.dao;

import com.a612.springmvc.entity.Userinfo;
import org.apache.ibatis.annotations.Insert;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Mon Apr 22 17:30:40 CST 2019
     */
    @Insert({
        "insert into userinfo (user_id, user_name, ",
        "user_pwd, user_email, ",
        "user_sex, user_registetime, ",
        "user_lastdate)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{userPwd,jdbcType=VARCHAR}, #{userEmail,jdbcType=CHAR}, ",
        "#{userSex,jdbcType=VARCHAR}, #{userRegistetime,jdbcType=TIMESTAMP}, ",
        "#{userLastdate,jdbcType=TIMESTAMP})"
    })
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Mon Apr 22 17:30:40 CST 2019
     */
    int insertSelective(Userinfo record);

    //根据用户名在数据库查询出现的次数
    int selectCountByName(String username);

    //根据用户名在数据库查询匹配的记录数
    int selectCountByEmail(String email);

    //根据用户名和密码在数据库查询匹配的记录数
    int SelectCountMatchPasswordByName(Userinfo userinfo);
}