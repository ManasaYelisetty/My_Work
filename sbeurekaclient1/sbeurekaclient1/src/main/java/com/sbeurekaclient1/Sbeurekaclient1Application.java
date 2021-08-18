package com.sbeurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Sbeurekaclient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sbeurekaclient1Application.class, args);
	}

}
