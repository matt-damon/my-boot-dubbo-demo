package com.damon.my.boot.dubbo.consumer;

import com.damon.boot.api.SiteService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;


@EnableAutoConfiguration
public class DefaultDubboConsumer {

    @Reference(version = "async")
    private SiteService siteService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DefaultDubboConsumer.class);
        SiteService siteService = context.getBean(SiteService.class);
        String name = siteService.getName("dubbo");
        System.out.println(name);
    }
}
