package com.karlexyan.dao;

import com.karlexyan.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

// @Mapper声明Mapper映射接口
@Mapper
public interface BookDao {

    @Insert("insert into tb_book (type, name, description) VALUES (#{type},#{name},#{description})")
    public int save(Book book);

    @Delete("delete from tb_book where id = #{id}")
    public int delete(Integer id);

    @Update("update tb_book set type = #{type} , name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Select("select * from tb_book")
    public List<Book> getAll();

    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);
}
