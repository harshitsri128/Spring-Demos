package com.upgrad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.upgrad");
        Calculator service = (Calculator) applicationContext.getBean("calculator");
        service.compute("add",4,6);
        service.compute("subtract",4,6);
        service.compute("multiply",4,6);
        service.compute("divide",4,6);
    }
}
