package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * scanBasePackages : @Controller,@Component,@RestController
 */
@SpringBootApplication(scanBasePackages = "com.sujata")
public class RestApiDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiDemoProjectApplication.class, args);
	}

}
