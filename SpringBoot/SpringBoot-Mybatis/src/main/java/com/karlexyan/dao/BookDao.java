package com.karlexyan.dao;

import com.karlexyan.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

// @Mapper声明这是个Mapper接口
@Mapper
public interface BookDao {

    @Select("select * from tb_book where id = #{id}")
    public Book selectById(@Param("id") Integer id);
}
