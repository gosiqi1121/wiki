package com.wiki.demo.service;

import com.wiki.demo.domain.Ebook;
import com.wiki.demo.domain.EbookExample;
import com.wiki.demo.mapper.EbookMapper;
import com.wiki.demo.req.EbookReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        return ebookMapper.selectByExample(ebookExample);
    }
}
