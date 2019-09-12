package com.org.abn.recipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="com.org.abn.*")
public class CrudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProjectApplication.class, args);
	}
}
