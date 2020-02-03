package com.logaggregator.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.logaggregator.*"})
public class LogAggregationEfkStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogAggregationEfkStackApplication.class, args);
	}

}
