package com.atguigu.springbootmavenproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
SpringBootApplication
    @EnableAutoConfiguration:开启自动配置
    @ComponentScan：默认扫描的是当前主配置类所在包及所在包的子包
    @SpringBootConfiguration：
*/
@SpringBootApplication
public class SpringBootMavenProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMavenProjectApplication.class, args);
    }

}
