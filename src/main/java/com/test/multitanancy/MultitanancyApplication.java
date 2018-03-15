package com.test.multitanancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MultitanancyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultitanancyApplication.class, args);
	}
}
