package com.tsc.tcloud.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProducerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerAApplication.class, args);
	}
}
