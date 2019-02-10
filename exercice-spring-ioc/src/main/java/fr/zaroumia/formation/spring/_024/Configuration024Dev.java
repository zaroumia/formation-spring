package fr.zaroumia.formation.spring._024;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import fr.zaroumia.formation.spring._015.ConsoleLogger;
import fr.zaroumia.formation.spring._015.Logger;

@Configuration
@Profile("dev")
public class Configuration024Dev {

	@Bean
	public Logger logger() {
		return new ConsoleLogger();
	}
}
