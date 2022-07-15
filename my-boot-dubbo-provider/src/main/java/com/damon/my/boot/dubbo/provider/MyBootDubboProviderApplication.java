package com.damon.my.boot.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo  //启动dubbo，扫描dubbo的注解
@SpringBootApplication
public class MyBootDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBootDubboProviderApplication.class, args);
    }

}
