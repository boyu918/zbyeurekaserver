package com.zby.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zby
 * @time 2019/5/27 15:51
 */
@EnableEurekaServer
@SpringBootApplication
@EnableEurekaClient
public class SysApplication {
    //测试 进行合并之类的
    public static void main(String[] args) {
        SpringApplication.run(SysApplication.class,args);
    }
}
