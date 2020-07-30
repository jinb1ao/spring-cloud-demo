package com.personal.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: SchedualService
 * Description:
 * date: 2020/7/30 15:24
 * author:Jin Biao
 */
@FeignClient(value = "service-hi",fallback = HystrixService.class)
@Service
public interface SchedualService {
    
    @GetMapping(value = "/hi")
    String sayHi(@RequestParam("name") String name);
}
