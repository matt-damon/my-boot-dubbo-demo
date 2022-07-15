package com.damon.boot.api;

import java.util.concurrent.CompletableFuture;

public interface SiteService {
    //同步调用方法
    String getName(String name);

    //异步调用方法
    default CompletableFuture<String> siteNameAsync(String name) { return null; }
}
