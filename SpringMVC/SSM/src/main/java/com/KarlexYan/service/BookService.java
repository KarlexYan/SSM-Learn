package com.KarlexYan.service;

import com.KarlexYan.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete (Integer id);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);
}
