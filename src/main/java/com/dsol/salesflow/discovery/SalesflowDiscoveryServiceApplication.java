package com.dsol.salesflow.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SalesflowDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesflowDiscoveryServiceApplication.class, args);
	}

}
