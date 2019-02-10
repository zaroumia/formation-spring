package fr.zaroumia.formation.spring._019;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.dao.FormationDaoImpl;

@Configuration
@ComponentScan("fr.zaroumia.formation.spring._019")
public class Configuration019 {

	@Bean
	public FormationDao formationDao() {
		return new FormationDaoImpl();
	}

}
