package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: lanyong_csd
 * @Create: 2019/10/13 19:22
 * @Company: Si-tech
 * @Description:
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurecaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurecaApplication.class,args);
    }
}
