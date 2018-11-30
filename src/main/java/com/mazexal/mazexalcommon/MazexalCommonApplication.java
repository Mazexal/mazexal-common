package com.mazexal.mazexalcommon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mazexal.mazexalcommon.dao")
public class MazexalCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MazexalCommonApplication.class, args);
    }
}
