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
@TableName("medical")
public class Amedical implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("m_id")
    private String mId;

    @TableField("m_name")
    private String mName;

    @TableField("m_type")
    private String mType;

    @TableField("m_price")
    private Float mPrice;

    @TableField("m_factory")
    private String mFactory;

    @TableField("m_option")
    private String mOption;
}
