package com.example.demo_javaweb.btth;
import org.springframework.stereotype.Component;

@Component("popupService")
public class PopupNotification extends NotificationService {
    public void notify(String message) {
        System.out.println("Popup: " + message);
    }
}
