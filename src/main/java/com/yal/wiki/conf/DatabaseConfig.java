//package com.yal.wiki.conf;
//
//import com.yal.wiki.utils.JasyptEncryptorUtils;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//public class DatabaseConfig {
//
//    @Value("${spring.datasource.url}")
//    private String dbUrl;
//
//    @Value("${spring.datasource.username}")
//    private String dbUsername;
//
//    @Value("${spring.datasource.password}")
//    private String dbEncryptedPassword;
//
//    @Bean
//    public DataSource dataSource() {
//        // 使用 JasyptEncryptorUtils 解密数据库密码
//        String dbPassword = JasyptEncryptorUtils.decode(dbEncryptedPassword);
//
//        return DataSourceBuilder.create()
//                .url(dbUrl)
//                .username(dbUsername)
//                .password(dbPassword)
//                .build();
//    }
//}
