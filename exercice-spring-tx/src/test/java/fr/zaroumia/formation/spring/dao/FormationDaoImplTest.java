package fr.zaroumia.formation.spring.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;

import fr.zaroumia.formation.spring.AppConfiguration;
import fr.zaroumia.formation.spring.DaoConfiguration;
import fr.zaroumia.formation.spring.modele.Formation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfiguration.class, DaoConfiguration.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ActiveProfiles("test")
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class FormationDaoImplTest {

	@Autowired
	private FormationDao beanUnderTest;

	@Test
	@Transactional
	@Rollback
	public void should1FindNewlyCreatedFormation() {
		Formation formation = new Formation(4l, "nouvelle formation", "un descriptif");
		beanUnderTest.create(formation);

		assertThat(beanUnderTest.find(4l)).isNotNull();
	}

	@BeforeTransaction
	public void beforeTx() {
		assertThat(beanUnderTest.findAll()).hasSize(3);
	}

	@AfterTransaction
	public void afterTx() {
		assertThat(beanUnderTest.findAll()).hasSize(3);
	}

	@Test
	// @Sql(scripts = "classpath:db/nouvelle-formation.sql")
	@SqlGroup({ @Sql(statements = { "INSERT INTO formations VALUES (5, 'nouvelle formation', 'descriptif');" }) })
	public void shouldFindTitreByIdReturn() {
		assertThat(beanUnderTest.findTitreParId(5L)).isEqualTo("nouvelle formation");
	}

	@Test
	public void should2FindAllReturn3Items() {
		assertThat(beanUnderTest.findAll()).hasSize(3);
	}

}
