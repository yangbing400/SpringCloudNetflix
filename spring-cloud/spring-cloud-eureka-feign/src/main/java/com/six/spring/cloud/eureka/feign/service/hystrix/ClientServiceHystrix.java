package com.six.spring.cloud.eureka.feign.service.hystrix;

import com.six.spring.cloud.eureka.feign.service.ClientService;
import org.springframework.stereotype.Component;

@Component
public class ClientServiceHystrix implements ClientService {
    @Override
    public String sayHello(String message) {
     return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
