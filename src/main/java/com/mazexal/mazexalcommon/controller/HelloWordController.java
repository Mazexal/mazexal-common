package com.mazexal.mazexalcommon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用
 *
 * @author <a href="donglingcao@2dfire.com">donglingcao</a>
 * @date 2018/11/30
 */
@RestController
@RequestMapping("/helloword")
public class HelloWordController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/sayhello") //提供路由信息，”/“路径的HTTP Request都会被映射到sayHello方法进行处理。
    public String sayHello() {
        for (int i = 0; i < 10000; i++) {
            logger.info("info execute index method");
            logger.warn("warn execute index method");
            logger.error("error execute index method");
        }
        return "Hello,World!";
    }

}
