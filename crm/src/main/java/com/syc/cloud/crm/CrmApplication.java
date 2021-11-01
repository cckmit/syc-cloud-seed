package com.syc.cloud.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 33992
 * @since 2021/10/26
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.syc.cloud.crm.dao")
public class CrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }
}
