package fr.zaroumia.formation.spring._021;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.dao.FormationDaoImpl;

@Configuration
@ComponentScan("fr.zaroumia.formation.spring._021")
public class Configuration021 {

	@Bean
	@Scope("prototype")
	public FormationDao formationDao() {
		return new FormationDaoImpl();
	}

}
