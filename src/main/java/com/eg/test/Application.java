package com.eg.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@Slf4j
//@ServletComponentScan
public class Application {
    public static void main(String[] args) {
//        log.info("应用启动了.......");
        SpringApplication.run(Application.class,args);
    }
}
