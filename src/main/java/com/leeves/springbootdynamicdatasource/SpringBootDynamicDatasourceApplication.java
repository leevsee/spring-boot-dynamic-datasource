package com.leeves.springbootdynamicdatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.leeves.springbootdynamicdatasource.dao")
@SpringBootApplication
public class SpringBootDynamicDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDynamicDatasourceApplication.class, args);
    }

}
