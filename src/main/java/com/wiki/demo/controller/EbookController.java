package com.wiki.demo.controller;

import com.wiki.demo.domain.Ebook;
import com.wiki.demo.req.EbookReq;
import com.wiki.demo.resp.CommonResp;
import com.wiki.demo.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//@RestController return a string; @Controller: return a page
@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<Ebook> > resp = new CommonResp<>();
        List<Ebook> list =  ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
    }
