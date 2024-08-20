package com.learn.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QuizQuestionApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizQuestionApigatewayApplication.class, args);
	}

}
