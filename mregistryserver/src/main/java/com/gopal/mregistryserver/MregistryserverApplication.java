package com.gopal.mregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MregistryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MregistryserverApplication.class, args);
	}

}
