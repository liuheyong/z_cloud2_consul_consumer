package com.cloud2.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZCloud2ConsulConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZCloud2ConsulConsumerApplication.class).web(true).run(args);
    }

}
