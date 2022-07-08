package com.example.newsrussia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NewsRussiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsRussiaApplication.class, args);
    }

}
