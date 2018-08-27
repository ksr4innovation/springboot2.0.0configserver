package com.snkit.cloudbusconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudbusconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudbusconfigserverApplication.class, args);
	}
}
