package com.learn.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String getString() throws  Exception{

        if (false){

            throw  new Exception("异常测试数据");
        }
        return "测试数据ewewewa1====q";
    }

}
