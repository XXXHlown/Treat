package com.max.bracelet.braceletapi.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
/**
 * <p>
 *
 * </p>
 *
 * @author xxx
 * @since 2021-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("treatservant")
public class Atreatservant implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @TableField("re_id")
    private String reId;

    @TableField("m_id")
    private String mId;

    @TableField("count")
    private Integer count;

    @TableField("approve_state")
    private String approveState;

    @TableField("option")
    private String option;

    @TableField("price")
    private Float price;
}
