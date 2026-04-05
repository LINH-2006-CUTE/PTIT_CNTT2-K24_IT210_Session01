package com.example.demo_javaweb.config;

import com.example.demo_javaweb.E1.RechargeService;
import com.example.demo_javaweb.E1.ZaloPay;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.w3c.dom.ranges.RangeException;

@Configuration  // chỉ ra lớp cấu hình
@EnableWebMvc
@ComponentScan(basePackages = "com.example.demo_javaweb") // Spring sẽ tìm code ở đây
public class WebConfig {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/views/");  //nơi cất file JSP
        viewResolver.setSuffix(".jsp");  // đuôi file
        return viewResolver;
    }
}
