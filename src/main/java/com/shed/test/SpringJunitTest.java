package com.shed.test;

import com.shed.config.SpringConfiguration;
import com.shed.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testUserService() {
        memberService.print();
    }

    @Test
    public void testC3P0() throws Exception {
        System.out.println("c3p0连接池对象: " + dataSource.getConnection());
    }
}
