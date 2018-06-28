package com.documendation.designpatterns;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//事务
@MapperScan("com.documendation.designpatterns.mapper")
public class DesignpatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternsApplication.class, args);
    }
}
