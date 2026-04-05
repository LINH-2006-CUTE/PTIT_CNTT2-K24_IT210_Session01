package com.example.demo_javaweb.Ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Play {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/play-test")
    public double testScope() {
        PlaySession session1 = context.getBean(PlaySession.class);
        session1.addTime(60);

        PlaySession session2 = context.getBean(PlaySession.class);
        session2.addTime(30);

        return session1.getPlayTime() + session2.getPlayTime();
    }
}