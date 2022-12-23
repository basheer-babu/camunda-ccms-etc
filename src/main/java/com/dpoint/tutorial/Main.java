package com.dpoint.tutorial;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableProcessApplication
@EnableAutoConfiguration
@EnableConfigurationProperties
@EntityScan(basePackages = "com.dpoint.tutorial")
public class Main {
    public static void main(String args[]) {
        SpringApplication.run(Main.class);
        System.out.println("camundaaaaaa");
    }

}
