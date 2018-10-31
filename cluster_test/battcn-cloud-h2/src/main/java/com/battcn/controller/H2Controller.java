package com.battcn.controller;

import com.battcn.H2Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class H2Controller {

    static Logger LOGGER = LoggerFactory.getLogger(H2Application.class);

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


    @RequestMapping("/hello2")
    public String home(@RequestParam String email) {
        // 改写法之前有说过是VIP模式
        return restTemplate().getForObject("http://localhost/hello?email=" + email, String.class);
    }
}
