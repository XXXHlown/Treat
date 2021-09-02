package com.max.bracelet.braceletapi.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.max.bracelet.braceletapi.demo.entity.Atreatmaster;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDate;
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
public interface AtreatmasterDao extends BaseMapper<Atreatmaster> {

    /**
     * <p>
     * 个人页面根据审批状态查询报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @Select({
            "<script> " +
                    "SELECT "   +
                    "    treatmaster.tm_id, "   +
                    "    treatmaster.p_id, "   +
                    "    person.name, "   +
                    "    person.sinum, "   +
                    "    treatmaster.re_id, "   +
                    "    treatmaster.all_price, "   +
                    "    treatmaster.pay_price, "   +
                    "    treatmaster.tm_price, "   +
                    "    treatmaster.buy_date, "   +
                    "    treatmaster.approval_date, "   +
                    "    codename.cvalue, "   +
                    "    treatmaster.approval_state, "   +
                    "    treatmaster.approval_suggestion "   +
                    "FROM   treatmaster"   +
                    "   INNER JOIN person ON treatmaster.p_id = person.p_id "   +
                    "   INNER JOIN codename ON codename.ckey = treatmaster.approval_state "   +
                    "WHERE  username = #{username} " +
                    "     AND approval_state = #{approval_state} " +
            "</script>"
    })
    public List<Map<String, Object>> selectByPersonalState(@Param("username") String username,
                                                           @Param("approval_state") String approval_state);

    /**
     * <p>
     * 分页查询提交未审批的报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @Select({
            "<script> " +
                    "SELECT "   +
                    "    treatmaster.tm_id, "   +
                    "    treatmaster.p_id, "   +
                    "    person.name, "   +
                    "    person.sinum, "   +
                    "    treatmaster.re_id, "   +
                    "    treatmaster.all_price, "   +
                    "    treatmaster.pay_price, "   +
                    "    treatmaster.tm_price, "   +
                    "    treatmaster.buy_date, "   +
                    "    treatmaster.approval_date, "   +
                    "    treatmaster.approval_state, "   +
                    "    codename.cvalue, "   +
                    "    treatmaster.approval_suggestion "   +
                    "FROM   treatmaster"   +
                    "   INNER JOIN person ON treatmaster.p_id = person.p_id "   +
                    "   INNER JOIN codename ON codename.ckey = treatmaster.approval_state "   +
                    "WHERE  treatmaster.approval_state='S02' " +
            "</script>"
    })
    public List<Map<String, Object>> selectBySecond();

    /**
     * <p>
     * 分页查询审批未报销的报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @Select({
            "<script> " +
                    "SELECT "   +
                    "    treatmaster.tm_id, "   +
                    "    treatmaster.p_id, "   +
                    "    person.name, "   +
                    "    person.sinum, "   +
                    "    treatmaster.re_id, "   +
                    "    treatmaster.all_price, "   +
                    "    treatmaster.pay_price, "   +
                    "    treatmaster.tm_price, "   +
                    "    treatmaster.buy_date, "   +
                    "    treatmaster.approval_date, "   +
                    "    codename.cvalue, "   +
                    "    treatmaster.approval_state, "   +
                    "    treatmaster.approval_suggestion "   +
                    "FROM   treatmaster"   +
                    "   INNER JOIN person ON treatmaster.p_id = person.p_id "   +
                    "   INNER JOIN codename ON codename.ckey = treatmaster.approval_state "   +
                    "WHERE  treatmaster.approval_state='S03' " +
            "</script>"
    })
    public List<Map<String, Object>> selectByThird();

    /**
     * <p>
     * 根据社保卡号分页查询提交未审批的报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @Select({
            "<script> " +
                    "SELECT "   +
                    "    treatmaster.tm_id, "   +
                    "    treatmaster.p_id, "   +
                    "    person.name, "   +
                    "    person.sinum, "   +
                    "    treatmaster.re_id, "   +
                    "    treatmaster.all_price, "   +
                    "    treatmaster.pay_price, "   +
                    "    treatmaster.tm_price, "   +
                    "    treatmaster.buy_date, "   +
                    "    treatmaster.approval_date, "   +
                    "    codename.cvalue, "   +
                    "    treatmaster.approval_state, "   +
                    "    treatmaster.approval_suggestion "   +
                    "FROM   treatmaster"   +
                    "   INNER JOIN person ON treatmaster.p_id = person.p_id "   +
                    "   INNER JOIN codename ON codename.ckey = treatmaster.approval_state "   +
                    "WHERE  treatmaster.approval_state='S02' " +
                    "AND CONCAT(treatmaster.tm_id,treatmaster.p_id,person.sinum,treatmaster.re_id) " +
                    "    LIKE CONCAT('%', #{sinum},'%')" +
            "</script>"
    })
    public List<Map<String, Object>> selectBySecondNum(@Param("sinum") String sinum);

    /**
     * <p>
     * 根据社保卡号分页查询审批未报销的报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @Select({
            "<script> " +
                    "SELECT "   +
                    "    treatmaster.tm_id, "   +
                    "    treatmaster.p_id, "   +
                    "    person.name, "   +
                    "    person.sinum, "   +
                    "    treatmaster.re_id, "   +
                    "    treatmaster.all_price, "   +
                    "    treatmaster.pay_price, "   +
                    "    treatmaster.tm_price, "   +
                    "    treatmaster.buy_date, "   +
                    "    treatmaster.approval_date, "   +
                    "    codename.cvalue, "   +
                    "    treatmaster.approval_state, "   +
                    "    treatmaster.approval_suggestion "   +
                    "FROM   treatmaster"   +
                    "   INNER JOIN person ON treatmaster.p_id = person.p_id "   +
                    "   INNER JOIN codename ON codename.ckey = treatmaster.approval_state "   +
                    "WHERE  treatmaster.approval_state='S03' " +
                    "AND CONCAT(treatmaster.tm_id,treatmaster.p_id,person.sinum,treatmaster.re_id) " +
                    "    LIKE CONCAT('%', #{sinum},'%')" +
            "</script>"
    })
    public List<Map<String, Object>> selectByThirdNum(@Param("sinum") String sinum);

    /**
     * <p>
     * 主表审批状态进一步更新
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @Update({
            "<script> " +
                    "UPDATE treatmaster"   +
                    "    set "   +
                    "  <if test='approval_state ==\"S03\" '>" +
                    "     approval_state='S04' " +
                    "  </if> "   +
                    "  <if test='approval_state ==\"S02\" '>" +
                    "     approval_state='S03' " +
                    "  </if> "   +
                    "  <if test='approval_state ==\"S01\" '>" +
                    "     approval_state='S02', approval_date= #{approval_date}" +
                    "  </if> "   +
                    "WHERE  re_id = #{re_id} " +
            "</script>"
    })
    public int updateState(@Param("re_id") String re_id, @Param("approval_state")String approval_state, @Param("approval_date")LocalDate approval_date);

    /**
     * 更新报销金额，实付金额
     */
    @Update({
            "<script> " +
                    "UPDATE treatmaster"   +
                    "    set "   +
                    "pay_price = #{pay_price},"+
                    "tm_price = #{tm_price},  "+
                    "approval_state = 'S03'   "+
                    "WHERE  re_id = #{re_id} " +
            "</script>"
    })
    public int updatePrice(@Param("pay_price")Float pay_price,@Param("tm_price")Float tm_price,@Param("re_id")String re_id);
}
