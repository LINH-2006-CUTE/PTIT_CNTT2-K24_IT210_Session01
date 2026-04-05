package com.example.demo_javaweb.E1;

import org.springframework.stereotype.Service;

// code lỗi
@Service
public class RechargeService {
    private final Payment payment;
    private Payment gateway;

    public RechargeService(Payment payment) {

        // cách viết này khiến mâts khả năng linh hoạt của ưungs dụng , dùng new kiến Spring không thể can thiệp để thay đỏi đối tượng được vì nó tự tạo phụ thuộc của nó
        // theo IoC thì nó phải nhường quyền điều khiển này cho Ioc

//            this.gateway = new InternalPaymentGateway();
        //để cho sprign khởi tạo -> RechargeService linh hoạt hơn
        this.payment = payment;

    }

    public void processRecharge(String username, double amount) {
        gateway.pay(amount);
        System.out.println("Nạp " + amount + " cho " + username);
    }
}

