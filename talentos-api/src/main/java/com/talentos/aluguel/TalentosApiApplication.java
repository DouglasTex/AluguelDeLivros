package com.talentos.aluguel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TalentosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalentosApiApplication.class, args);
	}

}