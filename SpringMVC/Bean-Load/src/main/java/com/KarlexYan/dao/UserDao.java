package com.KarlexYan.dao;

import com.KarlexYan.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    @Insert("insert into tb_user (name, age) values (#{name},#{age})")
    public void save(User user);

}
