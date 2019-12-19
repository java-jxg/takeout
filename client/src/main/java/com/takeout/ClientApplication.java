package com.takeout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableFeignClients
public class ClientApplication {
    public static void main(String[] args) {
        System.out.println("启动Client");
        SpringApplication.run(ClientApplication.class,args);
    }
}
