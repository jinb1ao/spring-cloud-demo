package com.personal.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: FeignController
 * Description:
 * date: 2020/7/30 15:47
 * author:Jin Biao
 */
@RestController
public class FeignController {
    @Autowired
    SchedualService schedualService;
    
    @RequestMapping("/hi")
    public String sayHi(@RequestParam("name") String name){
        return schedualService.sayHi(name);
    }
}
