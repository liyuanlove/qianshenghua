package com.qianshenghua.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/helloConsumer", method = RequestMethod.GET)
    public String helloConsumer(){
        return restTemplate.getForEntity("http://QSHWEB/hello", String.class).getBody();
    }
}
