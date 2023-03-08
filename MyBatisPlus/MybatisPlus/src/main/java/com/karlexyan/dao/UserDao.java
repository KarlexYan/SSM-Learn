package com.karlexyan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.karlexyan.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
