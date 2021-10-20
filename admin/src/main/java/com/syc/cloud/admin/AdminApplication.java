package com.syc.cloud.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 33992
 * @since 2021/10/20
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = {AdminApplication.class})
@MapperScan(basePackages = "com.syc.cloud.admin.dao")
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
