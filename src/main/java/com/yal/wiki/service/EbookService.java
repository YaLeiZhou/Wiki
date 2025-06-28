package com.yal.wiki.service;

import com.yal.wiki.mapper.EbookMapper;
import com.yal.wiki.pojo.Ebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;
    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
