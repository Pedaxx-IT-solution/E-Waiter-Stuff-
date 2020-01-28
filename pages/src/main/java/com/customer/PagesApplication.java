package com.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PagesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PagesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("started");
		
	}

}
