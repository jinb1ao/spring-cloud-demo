package com.personal.serviceribbon.controller;

import com.personal.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Description:
 * date: 2020/7/30 14:45
 * author:Jin Biao
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    
    @RequestMapping("/hi")
    public String hello(@RequestParam String name){
        return helloService.hiService(name);
    }
}
