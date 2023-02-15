package com.KarlexYan.dao.impl;

import com.KarlexYan.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id,String gender) {
        System.out.println("id:" + id);
        // 骗一手触发异常，能够正常运行
        if (true) throw new NullPointerException();
        return "KarlexYan";
    }
}
