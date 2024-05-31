package com.example.awsevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AwseventApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwseventApplication.class, args);
	}

}
