package com.max.bracelet.braceletapi.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.max.bracelet.braceletapi.demo.entity.Atreatservant;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author smallmax
 * @since 2021-08-13
 */
public interface AtreatservantDao extends BaseMapper<Atreatservant> {

    /**
     * <p>
     * 根据报销单编号查询报销单展示信息
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @Select({
            "<script> " +
                    "SELECT "   +
                    "    treatmaster.tm_id, "   +
                    "    treatmaster.re_id, "   +
                    "    treatmaster.buy_date, "   +
                    "    treatmaster.p_id, "   +
                    "    person.name, "   +
                    "    person.sinum, "   +
                    "    person.username, "   +
                    "    person.medical_category, "   +
                    "    person.password, "   +
                    "    codename.cvalue, "   +
                    "    medicalmaster.buy_doc, "   +
                    "    medicalmaster.buy_place, "   +
                    "    treatmaster.all_price, "   +
                    "    treatmaster.pay_price, "   +
                    "    treatmaster.tm_price, "   +
                    "    treatmaster.approval_date, "   +
                    "    treatmaster.approval_state "   +
                    "FROM   treatmaster"   +
                    "   INNER JOIN person ON treatmaster.p_id = person.p_id "   +
                    "   INNER JOIN medicalmaster ON treatmaster.re_id = medicalmaster.re_id "   +
                    "   INNER JOIN codename ON codename.ckey = person.medical_category "   +
                    "WHERE  treatmaster.re_id=#{re_id} " +
            "</script>"
    })
    public Map<String, String> getPerson(@Param("re_id") String re_id);

    /**
     * <p>
     * 连接查询报销明细表，药品表
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @Select({
            "<script> " +
                    "SELECT "   +
                    "    treatservant.id, "   +
                    "    treatservant.re_id, "   +
                    "    treatservant.m_id, "   +
                    "    treatservant.price, "   +
                    "    medical.m_name, "   +
                    "    medical.m_type, "   +
                    "    codename.cvalue, "   +
                    "    medical.m_price, "   +
                    "    medical.m_factory, "   +
                    "    medical.m_option,  "   +
                    "    treatservant.count, "   +
                    "    treatservant.approve_state, "   +
                    "    treatservant.option "   +
                    "FROM   treatservant"   +
                    "   INNER JOIN medical ON treatservant.m_id = medical.m_id "   +
                    "   INNER JOIN codename ON codename.ckey = medical.m_type "   +
                    "WHERE  re_id = #{re_id} " +
            "</script>"
    })
    public List<Map<String,Object>> selectDetail(@Param("re_id") String re_id);

    /**
     * <p>
     * 同意报销
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @Update({
            "<script> " +
                    "UPDATE treatservant"   +
                    "    set "   +
                    "price = #{price},"+
                    "approve_state = #{approve_state},"+
                    "`option` = #{option}"+
                    "WHERE  id = #{id} " +
            "</script>"
    })
    public int updateState(@Param("price")Float price,@Param("id") String id,@Param("approve_state") String approve_state,@Param("option")String option);
}
