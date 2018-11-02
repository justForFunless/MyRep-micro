package com.example.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "hello-for-feign")
public interface HelloFeign {
    @RequestMapping(value="getName/{name}",method = RequestMethod.GET)

     String getName(@PathVariable("name") String name);
}
