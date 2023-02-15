package com.hiworks.searchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class SearchApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApiApplication.class, args);
	}

}
