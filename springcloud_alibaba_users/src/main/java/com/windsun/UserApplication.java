package com.windsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 项目名称：springcloud_alibaba_parents
 * 类 名 称：UserApplication
 * 类 描 述：
 * 创建时间：2021/6/28 19:04
 * 创 建 人：wangsheng
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
