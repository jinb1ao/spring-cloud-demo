package com.personal.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: HelloService
 * Description:
 * date: 2020/7/30 14:40
 * author:Jin Biao
 */
@Service
public class HelloService {
    
    @Autowired
    RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }
    
    public String hiError(String name){
        return "Sorry,the service " + name + "error!";
    }
}
