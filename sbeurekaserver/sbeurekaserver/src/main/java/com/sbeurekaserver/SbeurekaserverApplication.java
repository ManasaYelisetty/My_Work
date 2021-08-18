package com.sbeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbeurekaserverApplication.class, args);
	}

}
