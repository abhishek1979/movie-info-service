package com.abhishek.movienfoservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class MovieInfoServiceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("MovieInfoServiceApplication is up!");
		
	}

	
}
