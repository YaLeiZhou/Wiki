package com.yal.wiki.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * @RestController注解用于声明返回文本数据，一般返回JSON
     * @Controller注解用于声明返回界面
     * @RestController = @Controller + ResponseBody
     */


    @GetMapping("/hello")
    //@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello(){
        return "hello world!";
    }
}
