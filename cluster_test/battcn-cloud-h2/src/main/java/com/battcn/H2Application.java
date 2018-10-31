package com.battcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class H2Application {


    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }
}
