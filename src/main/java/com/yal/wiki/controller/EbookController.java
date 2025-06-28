package com.yal.wiki.controller;


import com.yal.wiki.pojo.Ebook;
import com.yal.wiki.req.EbookReq;
import com.yal.wiki.resp.CommonResp;
import com.yal.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    /**
     * @RestController注解用于声明返回文本数据，一般返回JSON
     * @Controller注解用于声明返回界面
     * @RestController = @Controller + ResponseBody
     */
    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq ebookReq){
        CommonResp<List<Ebook>> commonResp = new CommonResp<>();
        List<Ebook> list = ebookService.list(ebookReq);
        commonResp.setContent(list);
        return commonResp;
    }
}
