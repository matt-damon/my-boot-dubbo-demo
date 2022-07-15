package com.damon.my.boot.dubbo.provider.impl;

import com.damon.boot.api.SiteService;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.CompletableFuture;

@Service(version = "async")
public class AsyncSiteServiceImpl implements SiteService {
    @Override
    public String getName(String name) {
        return "async boot," + name;
    }

    @Override
    public CompletableFuture<String> siteNameAsync(String name) {
        System.out.println("异步调用:" + name);
        return CompletableFuture.supplyAsync(() -> getName(name));
    }
}
