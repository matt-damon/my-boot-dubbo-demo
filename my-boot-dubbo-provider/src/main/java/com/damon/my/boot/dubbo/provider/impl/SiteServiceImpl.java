package com.damon.my.boot.dubbo.provider.impl;

import com.damon.boot.api.SiteService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "default") // dubbo下的，作用：1.暴露服务接口；2.声明服务具体的实现bean，注入到IOC容器
public class SiteServiceImpl implements SiteService {
    @Override
    public String getName(String name) {
        return "default boot," + name;
    }
}
