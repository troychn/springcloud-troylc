package com.tsc.tcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
* 访问配置文件的地址：http://localhost:7001/space/dev/config-label-test
* 基中space/dev为配置文件名space-dev，config-label-test为git上对应的分支
*
* */

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
