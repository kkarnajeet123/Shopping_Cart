package com.vastika.rating.data.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@CrossOrigin("*")
public class ShoppingCart1Application {
	
	  @Bean public WebMvcConfigurer corConfigurer () { return new
	  WebMvcConfigurer() {
	  
	 
	  @SuppressWarnings("unused")
	public void addCorsMapping(CorsRegistry registry) {
	  registry.addMapping("/").allowedHeaders("*").allowedOrigins("*").
	  allowCredentials(true); } }; }
	 

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCart1Application.class, args);
	}

}
