package com.yal.wiki.service;

import com.yal.wiki.mapper.TestMapper;
import com.yal.wiki.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;
    public List<Test> list(){
        return testMapper.list();
    }
}
