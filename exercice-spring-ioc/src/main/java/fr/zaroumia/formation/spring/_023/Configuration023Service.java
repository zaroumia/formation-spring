package fr.zaroumia.formation.spring._023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.service.FormationService;
import fr.zaroumia.formation.spring.service.FormationServiceImpl;

@Configuration
public class Configuration023Service {

	@Autowired
	private FormationDao formationDao;

	@Bean
	public FormationService formationService() {
		return new FormationServiceImpl(formationDao, "zaroumia");
	}
}
