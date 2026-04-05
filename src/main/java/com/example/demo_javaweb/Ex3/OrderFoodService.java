package com.example.demo_javaweb.Ex3;


import org.springframework.stereotype.Service;

@Service
public class OrderFoodService {

    private  final  InventoryRepository inventoryRepository;
    private   final UserAccountRepository userAccountRepository;
    public OrderFoodService (InventoryRepository inventoryRepository, UserAccountRepository userAccountRepository) {
        this.inventoryRepository = inventoryRepository;
        this.userAccountRepository = userAccountRepository;

    }

    public  String order(String user, String food, double price) {
        return food;
    }

}
