package com.lsl.mystudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MystudyApplication {

    @RequestMapping("/")
    String index() {
        return "hello spring boota";
    }
    public static void main(String[] args) {
        SpringApplication.run(MystudyApplication.class, args);

    }

}
