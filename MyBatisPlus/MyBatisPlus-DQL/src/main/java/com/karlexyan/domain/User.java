package com.karlexyan.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Value;

@Data
// 设置表名
@TableName("tb_user")
public class User {
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
}
