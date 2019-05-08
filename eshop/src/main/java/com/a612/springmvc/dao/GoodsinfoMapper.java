package com.a612.springmvc.dao;

import com.a612.springmvc.entity.Goodsinfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;

public interface GoodsinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Delete({
            "delete from goodsinfo",
            "where goodsId = #{goodsid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer goodsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Insert({
            "insert into goodsinfo (goodsId, goodsTypeid, ",
            "goodsName, goodsMoney, ",
            "goodsNote)",
            "values (#{goodsid,jdbcType=INTEGER}, #{goodstypeid,jdbcType=INTEGER}, ",
            "#{goodsname,jdbcType=VARCHAR}, #{goodsmoney,jdbcType=REAL}, ",
            "#{goodsnote,jdbcType=LONGVARCHAR})"
    })
    int insert(Goodsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    int insertSelective(Goodsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Select({
            "select",
            "goodsId, goodsTypeid, goodsName, goodsMoney, goodsNote",
            "from goodsinfo",
            "where goodsId = #{goodsid,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    Goodsinfo selectByPrimaryKey(Integer goodsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    int updateByPrimaryKeySelective(Goodsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Update({
            "update goodsinfo",
            "set goodsTypeid = #{goodstypeid,jdbcType=INTEGER},",
            "goodsName = #{goodsname,jdbcType=VARCHAR},",
            "goodsMoney = #{goodsmoney,jdbcType=REAL},",
            "goodsNote = #{goodsnote,jdbcType=LONGVARCHAR}",
            "where goodsId = #{goodsid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Goodsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsinfo
     *
     * @mbggenerated Thu May 02 17:20:43 CST 2019
     */
    @Update({
            "update goodsinfo",
            "set goodsTypeid = #{goodstypeid,jdbcType=INTEGER},",
            "goodsName = #{goodsname,jdbcType=VARCHAR},",
            "goodsMoney = #{goodsmoney,jdbcType=REAL}",
            "where goodsId = #{goodsid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Goodsinfo record);

    ArrayList<Goodsinfo> selectAllByGoodsId(Integer goodsId);

}