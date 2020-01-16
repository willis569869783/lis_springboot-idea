package com.entor;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(basePackages = { "com.entor.mapper" })
@SpringBootApplication
@EnableCaching
@EnableTransactionManagement
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
