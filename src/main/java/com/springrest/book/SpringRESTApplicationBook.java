package com.springrest.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringRESTApplicationBook {

	public static void main(String[] args) {
		SpringApplication.run(SpringRESTApplicationBook.class, args);
	}

	@Lazy
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
