package com.yal.wiki.service;

import com.yal.wiki.mapper.EbookMapper;
import com.yal.wiki.pojo.Ebook;
import com.yal.wiki.pojo.EbookExample;
import com.yal.wiki.req.EbookReq;
import com.yal.wiki.resp.EbookResp;
import com.yal.wiki.utils.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;
    public List<EbookResp> list(EbookReq ebookReq){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if(!ObjectUtils.isEmpty(ebookReq.getName()))
        {
        criteria.andNameLike("%"+ebookReq.getName()+"%");
        }
        List<Ebook> ebooksList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebooksList) {
//            EbookResp ebookResp = new EbookResp();
//            //ebookResp.setName(ebook.getName());
//            BeanUtils.copyProperties(ebook,ebookResp);
//            ebookResp.setViewCount(50);

            //CopyUtil.copy(ebook,EbookResp.class);

//            respList.add(ebookResp);
        }
        List<EbookResp> ebookResps = CopyUtil.copyList(ebooksList, EbookResp.class);
        return ebookResps;
    }
}
