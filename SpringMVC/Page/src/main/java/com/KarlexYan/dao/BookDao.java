package com.KarlexYan.dao;

import com.KarlexYan.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface BookDao {

    @Insert("insert into tb_book (type, name, description) VALUES (#{type},#{name},#{description})")
    public void save(Book book);

    @Delete("delete from tb_book where id = #{id}")
    public void delete(Integer id);

    @Update("update tb_book set type = #{type} , name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);

    @Select("select * from tb_book")
    public List<Book> getAll();

    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);
}
