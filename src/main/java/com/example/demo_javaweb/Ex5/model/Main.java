package com.example.demo_javaweb.Ex5.model;

import com.example.demo_javaweb.Ex5.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SystemConfig config = context.getBean(SystemConfig.class);
        config.displayInfo();
    }
}