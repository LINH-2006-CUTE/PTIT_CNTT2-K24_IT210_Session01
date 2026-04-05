package com.example.demo_javaweb.E1;

import org.springframework.stereotype.Component;

@Component
public class ZaloPay implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán qua ZaloPay");
    }
}