package com.sbeurekaclientdept;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
//@EnableEurekaClient
public class SbeurekaclientdeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbeurekaclientdeptApplication.class, args);
	}

	@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
	
	
}
