package com.hp.QppColumbia;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QppLatemApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/qdn_latam");
		SpringApplication.run(QppLatemApplication.class, args);
	}
}