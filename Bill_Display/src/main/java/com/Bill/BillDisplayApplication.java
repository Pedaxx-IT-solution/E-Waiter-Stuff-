package com.Bill;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BillDisplayApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BillDisplayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	System.out.println("started");
	
	
		
	}

}
