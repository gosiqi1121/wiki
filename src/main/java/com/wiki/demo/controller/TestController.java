package com.wiki.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController return a string; @Controller: return a page
@RestController

public class TestController {
    //GET POST PUT DELETE
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
