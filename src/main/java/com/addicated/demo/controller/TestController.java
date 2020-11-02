package com.addicated.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Adi
 * @time: 2020/10/28 9:29
 **/
@RestController
public class TestController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello,addicated";
    }
}
