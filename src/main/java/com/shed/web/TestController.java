package com.shed.web;

import com.shed.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestController {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext("com.shed");
        MemberService memberService = (MemberService) app.getBean("userService");
        memberService.print();
        System.out.println("--------------------------------");
        System.out.println(app.getBean("dataSource"));

    }
}
