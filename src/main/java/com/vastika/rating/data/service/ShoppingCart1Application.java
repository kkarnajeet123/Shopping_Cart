package com.vastika.rating.data.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vastika.rating.data.service.Repository.AuthenticationRepository;


@SpringBootApplication

public class ShoppingCart1Application {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCart1Application.class, args);
	}

}
