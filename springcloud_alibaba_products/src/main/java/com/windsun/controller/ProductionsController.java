package com.windsun.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * 项目名称：springcloud_alibaba_parents
 * 类 名 称：ProductionsController
 * 类 描 述：
 * 创建时间：2021/6/28 22:08
 * 创 建 人：wangsheng
 */
@RestController
@Slf4j
public class ProductionsController {

    @GetMapping("/products")
    public String products(){
        int num = new Random().nextInt(1000)+1;
        log.info("服务名：{},num：{}","production",num);
        return "production，num："+num;
    }
}
