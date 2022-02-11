package com.shed.test;

import com.shed.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TestDemo {

    @Test
    public void testUserService() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.print();
    }

    @Test
    public void testDruid() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) app.getBean("druidDataSource");
        System.out.println("Druid连接池对象: " + dataSource.getConnection());
    }

    @Test
    public void testC3P0() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) app.getBean("c3p0DataSource");
        System.out.println("c3p0连接池对象: " + dataSource.getConnection());
    }
}
