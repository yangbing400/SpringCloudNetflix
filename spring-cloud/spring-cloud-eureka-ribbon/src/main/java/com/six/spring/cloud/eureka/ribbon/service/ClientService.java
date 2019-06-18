package com.six.spring.cloud.eureka.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ClientService {

    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "helloError")
    public String sayHello(String message) {
        return restTemplate.getForObject("http://spring-cloud-eureka-client/hello?message=" + message, String.class);
    }
    public String helloError(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
