package fr.zaroumia.formation.spring.service_028;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.dao.FormationDaoImpl;
import fr.zaroumia.formation.spring.service.FormationService;
import fr.zaroumia.formation.spring.service.FormationServiceImpl;

@Configuration
public class TestConfiguration_028 {

	@Bean
	public FormationDao formationDao() {
		return new FormationDaoImpl();
	}

	@Bean
	public FormationService formationService(final FormationDao formationDao) {
		return new FormationServiceImpl(formationDao, "zarouamia");
	}
}
