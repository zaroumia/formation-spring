package fr.zaroumia.formation.spring.service_030;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.dao.FormationDaoImpl;
import fr.zaroumia.formation.spring.modele.Formation;
import fr.zaroumia.formation.spring.service.FormationService;
import fr.zaroumia.formation.spring.service.FormationServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@ActiveProfiles({ "dev", "prod" })
public class FormationServiceImplTest {

	@Autowired
	private FormationService beanUnderTest;

	@Test
	public void shouldFindAllResturn() {
		List<Formation> result = beanUnderTest.findAll();
		assertThat(result).hasSize(3);
	}

	@Configuration
	static class TestConfiguration_030 {

		@Bean
		public FormationDao formationDao() {
			return new FormationDaoImpl();
		}

		@Bean
		public FormationService formationService(final FormationDao formationDao) {
			return new FormationServiceImpl(formationDao, "zarouamia");
		}
	}

}
