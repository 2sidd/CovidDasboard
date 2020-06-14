package com.sidd.coronadashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronadashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronadashboardApplication.class, args);
	}

}
