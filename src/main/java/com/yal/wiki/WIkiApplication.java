package com.yal.wiki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WIkiApplication {
    
    private static final Logger log=LoggerFactory.getLogger(WIkiApplication.class);
    public static void main(String[] args) {
//        SpringApplication.run(WIkiApplication.class, args);
        SpringApplication app=new SpringApplication(WIkiApplication.class);
        Environment env = app.run(args).getEnvironment();

        log.info("启动成功！！");
        log.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));

    }

}
