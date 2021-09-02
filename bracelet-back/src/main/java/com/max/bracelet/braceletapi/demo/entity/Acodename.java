package com.max.bracelet.braceletapi.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
@TableName("codename")
public class Acodename implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ckey")
    private String ckey;

    @TableField("cgroup")
    private String cgroup;

    @TableField("cvalue")
    private String cvalue;

    @TableField("coption")
    private String coption;

}
