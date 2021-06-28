package com.windsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 项目名称：springcloud_alibaba_parents
 * 类 名 称：ProductsApplication
 * 类 描 述：
 * 创建时间：2021/6/28 22:06
 * 创 建 人：wangsheng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class,args);
    }
}
