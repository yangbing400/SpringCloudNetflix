package com.six.spring.cloud.eureka.feign.service;

import com.six.spring.cloud.eureka.feign.service.hystrix.ClientServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-eureka-client",fallback = ClientServiceHystrix.class)
public interface ClientService {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "message") String message);

}
