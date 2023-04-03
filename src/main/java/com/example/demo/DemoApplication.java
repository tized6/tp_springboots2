package com.example.demo;
import com.example.demo.data.Voiture;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {

	private Logger logger = new Logger();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


	public void run(String... args) throws Exception{
		voitureRepository.save(new Voiture("Ford","4000000"));

	}
