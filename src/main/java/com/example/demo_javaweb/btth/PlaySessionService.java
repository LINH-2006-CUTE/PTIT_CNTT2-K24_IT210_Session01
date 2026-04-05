package com.example.demo_javaweb.btth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PlaySessionService {
    private NotificationService notificationService;

    @Autowired
    public void setNotificationService(@Qualifier("popupService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void checkAccount(String username, double balance) {
        if (username == null || username.isEmpty()) {
            System.out.println("Lỗi: Tên người dùng không được để trống");
            return;
        }
        if (balance < 0) {
            System.out.println("Lỗi: Số dư tài khoản không hợp lệ ");
            return;
        }

        if (balance < 5000) {
            notificationService.notify("Tài khoản " + username + " sắp hết tiền");
        } else {
            System.out.println("Số dư đủ");
        }
    }
}