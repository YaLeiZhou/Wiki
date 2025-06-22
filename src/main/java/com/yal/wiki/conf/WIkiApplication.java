package com.yal.wiki.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.yal.wiki")
@SpringBootApplication
public class WIkiApplication {

    /**
     * @SpringBootApplication 会自动扫描本类所在包下的所有类和子类，需要排除的类直接定义在Springboot启动类所在包外面即可.
     */

    private static final Logger log=LoggerFactory.getLogger(WIkiApplication.class);
    public static void main(String[] args) {
//        SpringApplication.run(WIkiApplication.class, args);
        SpringApplication app=new SpringApplication(WIkiApplication.class);
        Environment env = app.run(args).getEnvironment();

        log.info("启动成功！！");
        log.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));

    }

}
