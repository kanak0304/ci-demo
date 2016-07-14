package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiDemoApplication {

    @RequestMapping("/")
    String hello() {
        return "Hello World V1!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CiDemoApplication.class, args);
    }
}
