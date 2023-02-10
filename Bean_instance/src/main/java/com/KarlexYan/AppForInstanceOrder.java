package com.KarlexYan;

import com.KarlexYan.dao.OrderDao;
import com.KarlexYan.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        // 通过静态工厂创建对象
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao1 = (OrderDao) ac.getBean("orderDao");
        orderDao1.save();
    }
}
