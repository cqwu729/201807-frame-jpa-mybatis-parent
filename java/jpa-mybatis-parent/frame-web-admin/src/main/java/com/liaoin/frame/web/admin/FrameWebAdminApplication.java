package com.liaoin.frame.web.admin;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import tk.mybatis.spring.annotation.MapperScan;
//import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.liaoin.frame"})
@EntityScan("com.liaoin.frame.entity")
//@EnableJpaRepositories("com.liaoin.frame.dao.jpa")
@MapperScan("com.liaoin.frame.dao.mybatis")
@EnableSwagger2Doc
public class FrameWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameWebAdminApplication.class, args);
    }
}
