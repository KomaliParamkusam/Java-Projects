package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.controller","com.example.cfgs","com.example.model"})
public class SpringSpotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSpotifyApplication.class, args);
	}

}
