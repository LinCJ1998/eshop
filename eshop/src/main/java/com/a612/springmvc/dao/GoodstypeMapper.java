package com.a612.springmvc.dao;

import com.a612.springmvc.entity.Goodstype;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface GoodstypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Delete({
        "delete from goodstype",
        "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Insert({
        "insert into goodstype (typeid, typename, ",
        "typenote)",
        "values (#{typeid,jdbcType=INTEGER}, #{typename,jdbcType=VARCHAR}, ",
        "#{typenote,jdbcType=LONGVARCHAR})"
    })
    int insert(Goodstype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    int insertSelective(Goodstype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Select({
        "select",
        "typeid, typename, typenote",
        "from goodstype",
        "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    Goodstype selectByPrimaryKey(Integer typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    int updateByPrimaryKeySelective(Goodstype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Update({
        "update goodstype",
        "set typename = #{typename,jdbcType=VARCHAR},",
          "typenote = #{typenote,jdbcType=LONGVARCHAR}",
        "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Goodstype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Update({
        "update goodstype",
        "set typename = #{typename,jdbcType=VARCHAR}",
        "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Goodstype record);
}