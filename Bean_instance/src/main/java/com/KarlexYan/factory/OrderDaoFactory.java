package com.KarlexYan.factory;

import com.KarlexYan.dao.OrderDao;
import com.KarlexYan.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
