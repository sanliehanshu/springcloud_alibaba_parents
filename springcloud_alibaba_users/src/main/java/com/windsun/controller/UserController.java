package com.windsun.controller;

import com.windsun.feignclient.ProductsClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 项目名称：springcloud_alibaba_parents
 * 类 名 称：UserController
 * 类 描 述：
 * 创建时间：2021/6/28 19:10
 * 创 建 人：wangsheng
 */
@RestController
@Slf4j
@RefreshScope
@RequestMapping("/user")
public class UserController {

    @Value("${windsun}")
    private String name;

    @Resource
    private ProductsClient productsClient;

    @GetMapping("/testNum")
    public String testNum(){
        log.info("user name：{}",name);
        String result = productsClient.testNum();
        log.info("openfeign 调用结果："+result);
        return "user,ok!!,"+name+" ,openfeign 调用结果："+result;
    }

    @GetMapping("/testName")
    public String testName(){
        log.info("user name：{}",name);
        String result = productsClient.testName();
        log.info("openfeign 调用结果："+result);
        return "user,ok!!,"+name+" ,openfeign 调用结果："+result;
    }
}
