package com.example.demo_javaweb.btth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo_javaweb.config.WebConfig; // Hoặc file config của bạn

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        PlaySessionService service = context.getBean(PlaySessionService.class);
        service.checkAccount("Linh", 3000);
        service.checkAccount("", 1000);
    }
}