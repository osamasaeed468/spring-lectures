package com.springcore.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ambiguityConfig.xml");
        Addition add = (Addition) context.getBean("add");

        System.out.println(add);
        add.doSum();
    }
}
