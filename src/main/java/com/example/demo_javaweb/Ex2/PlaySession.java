package com.example.demo_javaweb.Ex2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PlaySession {
    private double playTime = 0;
// một Bean mặc định trong Spring (Singleton) à Spring chỉ khởi tạo một thực thể duy nhất của PlaySession cho toàn bộ hệ thống Cyber Center
    // nên là nó tác động chung lên playTime dẫn đến việc dữ liệu của người dùng này bị ghi đè hoặc cộng dồn vào người dùng khác, gây ra hiện tượng tính nhầm tiền
    public void addTime(double time) {
        this.playTime += time;
    }

    public double getPlayTime() {
        return playTime;
    }
}