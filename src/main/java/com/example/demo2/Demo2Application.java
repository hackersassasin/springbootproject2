package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Demo2Application extends  SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
        
        @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Demo2Application.class);
    }
}
    