package fr.zaroumia.formation.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfiguration.class, DaoConfiguration.class })
@ActiveProfiles("test")
public class FormationDaoImplTest {

	@Autowired
	private FormationDao beanUnderTest;

	@Test
	@Transactional
	@Rollback
	public void shouldCreateRunWithoutError() {
		Formation formation = new Formation("formation 1", "descriptif");
		beanUnderTest.create(formation);

		assertThat(formation.getId()).isNotNull();
		assertThat(beanUnderTest.find(formation.getId())).isNotNull();
	}

	@Test
	@Transactional
	@Rollback
	public void shouldUpdateRunWithoutError() {
		Formation formation = new Formation("formation 1", "descriptif");
		beanUnderTest.create(formation);

		formation.setTitre("titre modifié");
		beanUnderTest.update(formation);

		assertThat(beanUnderTest.find(formation.getId()).getTitre()).isEqualTo("titre modifié");
	}

	@Test
	@Transactional
	@Rollback
	public void shouldDeleteRunWithoutError() {
		Formation formation = new Formation("formation 1", "descriptif");
		beanUnderTest.create(formation);

		beanUnderTest.delete(formation);

		assertThat(beanUnderTest.find(formation.getId())).isNull();
	}

}
