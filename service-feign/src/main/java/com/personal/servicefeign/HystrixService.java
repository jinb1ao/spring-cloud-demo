package com.personal.servicefeign;

import org.springframework.stereotype.Component;

/**
 * ClassName: HystrixService
 * Description:
 * date: 2020/7/30 16:41
 * author:Jin Biao
 */
@Component
public class HystrixService implements SchedualService {
    
    @Override
    public String sayHi(String name) {
        return "Sorry," + name + " is error!";
    }
}
