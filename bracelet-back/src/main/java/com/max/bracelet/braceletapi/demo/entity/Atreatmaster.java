package com.max.bracelet.braceletapi.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;

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
@TableName("treatmaster")
public class Atreatmaster implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("tm_id")
    private String tm_id;

    @TableField("re_id")
    private String re_id;

    @TableField("p_id")
    private String p_id;

    @TableField("all_price")
    private Float all_price;

    @TableField("pay_price")
    private Float pay_price;

    @TableField("tm_price")
    private Float tm_price;

    @TableField("buy_date")
    private LocalDate buy_date;

    @TableField("approval_state")
    private String approvalState;

    @TableField("approval_date")
    private LocalDate approval_date;

    @TableField("approval_suggestion")
    private String approval_suggestion;

}
