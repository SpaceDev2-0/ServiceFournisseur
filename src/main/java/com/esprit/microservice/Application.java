package com.esprit.microservice;

import java.util.stream.Stream;
import com.esprit.microservice.Repository.FournisseurRepository;
import com.esprit.microservice.Entity.Fournisseur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
		ApplicationRunner init(FournisseurRepository repository) {
		return args->{
			Stream.of("Mariem","Sarra","Mohammed").forEach(Nom -> {
				repository.save(new Fournisseur(Nom));
			});
			repository.findAll().forEach(System.out::println);
		};
	}

}
