package com.springeurekaclientdept1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class Springeurekaclientdept1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springeurekaclientdept1Application.class, args);
	}
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
