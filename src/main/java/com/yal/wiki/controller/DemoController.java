package com.yal.wiki.controller;


import com.yal.wiki.pojo.Demo;
import com.yal.wiki.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    /**
     * @RestController注解用于声明返回文本数据，一般返回JSON
     * @Controller注解用于声明返回界面
     * @RestController = @Controller + ResponseBody
     */
    @Autowired
    private DemoService demoService;

    @GetMapping("/list")
    public List<Demo> list(){
        System.out.println(demoService.list());
        return demoService.list();
    }
}
