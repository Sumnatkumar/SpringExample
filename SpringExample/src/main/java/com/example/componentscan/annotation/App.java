package com.example.componentscan.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Use class-based lookup instead of name-based
        Employee employee = context.getBean(Employee.class);

        System.out.println(employee.toString());
    }
}
