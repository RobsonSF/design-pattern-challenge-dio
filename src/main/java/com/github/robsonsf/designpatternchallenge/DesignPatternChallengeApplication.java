package com.github.robsonsf.designpatternchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesignPatternChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternChallengeApplication.class, args);
	}

}
