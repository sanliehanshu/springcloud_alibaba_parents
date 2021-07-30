package com.windsun.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 项目名称：springcloud_alibaba_parents
 * 类 名 称：ProductsClient
 * 类 描 述：
 * 创建时间：2021/6/28 22:29
 * 创 建 人：wangsheng
 */
@FeignClient("PRODUCTIONS")
public interface ProductsClient {

    @GetMapping("/products/testNum")
    String testNum();

    @GetMapping("/products/testName")
    String testName();
}
