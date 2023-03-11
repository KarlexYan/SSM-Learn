package com.karlexyan.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
// 设置表名
@TableName("tb_user")
public class User {
    //设置主键生成策略
//    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    // 映射列名，设置不允许查询
    @TableField(value = "password",select = false)
    private String password;
    private Integer age;
    private String tel;
    // 设置属性值在数据库表字段中不存在
    @TableField(exist = false)
    private Integer online;
    //逻辑删除字段，标记当前记录是否被删除
//    @TableLogic(value = "0",delval = "1")
    private Integer detected;
}
