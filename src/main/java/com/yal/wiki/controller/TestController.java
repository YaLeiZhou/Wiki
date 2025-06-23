package com.yal.wiki.controller;


import com.yal.wiki.pojo.Test;
import com.yal.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    /**
     * @RestController注解用于声明返回文本数据，一般返回JSON
     * @Controller注解用于声明返回界面
     * @RestController = @Controller + ResponseBody
     */
    @Autowired
    private TestService testService;

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


    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
