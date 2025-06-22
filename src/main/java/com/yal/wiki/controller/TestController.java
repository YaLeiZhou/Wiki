package com.yal.wiki.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * @RestController注解用于声明返回文本数据，一般返回JSON
     * @Controller注解用于声明返回界面
     * @RestController = @Controller + ResponseBody
     */

    @Value("${test.age:19}")
    private String age;

    @GetMapping("/hello")
    //@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello(){
        return "hello world! "+ age;
    }

    @PostMapping("/hello2")
    //@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello(String name){
        return "hello world! welcome "+ name;
    }
}
