package com.example.springconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConfigApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringConfigApplication.class, args);
//关闭banner
//          new SpringApplicationBuilder(SpringConfigApplication.class)
//            .bannerMode(Banner.Mode.OFF).run(args);
    }

}
