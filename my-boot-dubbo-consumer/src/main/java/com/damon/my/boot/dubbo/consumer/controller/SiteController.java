package com.damon.my.boot.dubbo.consumer.controller;

import com.damon.boot.api.SiteService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/site")
public class SiteController {

    @Reference(version = "default") //dubbo注解，相当于reference标签，1.从注册中心订阅服务提供者的地址列表； 2.从IOC容器里拿到代理对象；
    private SiteService siteService;

    @GetMapping("/name")
    public String getName(String name) {
        return siteService.getName(name);
    }
}
