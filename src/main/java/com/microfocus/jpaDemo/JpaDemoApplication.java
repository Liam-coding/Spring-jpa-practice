package com.microfocus.jpaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(JpaDemoApplication.class, args);
        System.out.println("aaa");
    }

}
