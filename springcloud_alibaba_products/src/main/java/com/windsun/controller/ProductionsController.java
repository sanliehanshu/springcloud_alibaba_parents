package com.windsun.controller;

import cn.hutool.Hutool;
import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/products")
public class ProductionsController {

    @GetMapping("/testNum")
    public String testNum(){
        int num = new Random().nextInt(1000)+1;
        log.info("服务名：{},num：{}","production",num);
        return "production，num："+num;
    }

    @GetMapping("/testName")
    public String testName(){
        int num = new Random().nextInt(1000)+1;
        String str = RandomUtil.randomString(5);
        log.info("服务名：{},str：{}","production",str);
        return "production，str："+str;
    }
}
