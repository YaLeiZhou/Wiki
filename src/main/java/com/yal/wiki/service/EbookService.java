package com.yal.wiki.service;

import com.yal.wiki.mapper.EbookMapper;
import com.yal.wiki.pojo.Ebook;
import com.yal.wiki.pojo.EbookExample;
import com.yal.wiki.req.EbookReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;
    public List<Ebook> list(EbookReq ebookReq){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+ebookReq.getName()+"%");
        return ebookMapper.selectByExample(ebookExample);
    }
}
