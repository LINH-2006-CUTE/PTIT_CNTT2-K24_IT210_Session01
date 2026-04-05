package com.example.demo_javaweb.Ex5.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemConfig {

    @Value("Linh")
    private String branchName;

    @Value("10:00")
    private String openingHour;

    public void displayInfo() {
        System.out.println("Tên: " + branchName);
        System.out.println("Giờ mở cửa: " + openingHour);
    }
}