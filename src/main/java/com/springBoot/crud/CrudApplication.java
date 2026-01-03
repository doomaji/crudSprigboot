package com.springBoot.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.springBoot.crud", "web"})
@EntityScan(basePackages = "web.model")
@EnableJpaRepositories(basePackages = "web")
public class CrudApplication {


	static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
