package fr.zaroumia.formation.spring._017;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.dao.FormationDaoImpl;

@Configuration
@ComponentScan("fr.zaroumia.formation.spring._017")
public class Configuration017 {

	@Bean
	public FormationDao formationDao() {
		return new FormationDaoImpl();
	}

	@Bean
	public FormationDao formationDao2() {
		return new FormationDaoImpl();
	}

}
