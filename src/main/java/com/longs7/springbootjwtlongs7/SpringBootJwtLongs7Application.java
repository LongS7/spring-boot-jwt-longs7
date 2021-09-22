package com.longs7.springbootjwtlongs7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SpringBootJwtLongs7Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtLongs7Application.class, args);
	}

}
