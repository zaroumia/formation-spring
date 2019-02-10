package fr.zaroumia.formation.spring.service_028;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.zaroumia.formation.spring.modele.Formation;
import fr.zaroumia.formation.spring.service.FormationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration_028.class)
public class FormationServiceImplTest {

	@Autowired
	private FormationService beanUnderTest;

	@Test
	public void shouldFindAllResturn() {
		List<Formation> result = beanUnderTest.findAll();
		assertThat(result).hasSize(3);
	}

}
