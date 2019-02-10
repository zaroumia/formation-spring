package fr.zaroumia.formation.spring._024;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import fr.zaroumia.formation.spring._015.DatabaseLogger;
import fr.zaroumia.formation.spring._015.Logger;

@Configuration
@Profile("prod")
public class Configuration024Prod {

	@Bean
	public Logger logger() {
		return new DatabaseLogger();
	}
}
