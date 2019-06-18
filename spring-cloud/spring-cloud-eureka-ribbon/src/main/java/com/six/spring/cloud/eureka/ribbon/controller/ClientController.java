package com.six.spring.cloud.eureka.ribbon.controller;

import com.six.spring.cloud.eureka.ribbon.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message) {
        return clientService.sayHello(message);
    }

}
