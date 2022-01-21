package com.wiki.demo.service;

import com.wiki.demo.domain.Demo;
import com.wiki.demo.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;
    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
