package com.example.cotroller;

import com.example.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestContro{
    @Autowired
    HelloFeign helloFeign;
    @RequestMapping("/{name}")
    public String find(@PathVariable (value = "name") String name){
        return "whats your name?     "+helloFeign.getName(name);
    }
    @RequestMapping("/123")
    public String test2(){
        return "whats your name?";
    }
}
