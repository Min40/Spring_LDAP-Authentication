package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
// Enable if you want to use Spring Security + LDAP Authentication XML Configuration
// @ImportResource("classpath:spring-security-config.xml") 
public class SpringDemoApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}