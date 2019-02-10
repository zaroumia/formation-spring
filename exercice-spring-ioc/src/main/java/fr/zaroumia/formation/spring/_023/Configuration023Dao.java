package fr.zaroumia.formation.spring._023;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.dao.FormationDaoImpl;

@Configuration
public class Configuration023Dao {

	@Bean
	public FormationDao formationDao() {
		return new FormationDaoImpl();
	}
}
