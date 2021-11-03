package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.layer2.Employee;

@SpringBootApplication
public class SpringOrm1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrm1Application.class, args);
		System.out.println("app started...");
	}
 
}
