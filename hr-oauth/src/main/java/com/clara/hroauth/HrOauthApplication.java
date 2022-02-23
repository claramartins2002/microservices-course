package com.clara.hroauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class HrOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrOauthApplication.class, args);
	}

}
