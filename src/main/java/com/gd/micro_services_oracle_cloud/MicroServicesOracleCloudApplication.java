package com.gd.micro_services_oracle_cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MicroServicesOracleCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesOracleCloudApplication.class, args);
	}

}
