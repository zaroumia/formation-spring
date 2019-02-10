package fr.zaroumia.formation.spring._018;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.dao.FormationDaoImpl;

@Configuration
@ComponentScan("fr.zaroumia.formation.spring._018")
public class Configuration018 {

	@Bean
	public FormationDao formationDao1() {
		return new FormationDaoImpl();
	}

	@Bean
	public FormationDao formationDao2() {
		return new FormationDaoImpl();
	}
}
