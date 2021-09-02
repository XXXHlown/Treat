package com.max.bracelet.braceletapi.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("person")
public class Alogin {
    private static final long serialVersionUID = 1L;

    @TableId("p_id")
    private String pId;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("sinum")
    private String sinum;

    @TableField("banknum")
    private String banknum;

    @TableField("name")
    private String name;

    @TableField("medical_category")
    private String medicalcategor;

    @TableField("root_type")
    private String rootType;

    @TableField("gender")
    private String gender;

}
