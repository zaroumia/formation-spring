package fr.zaroumia.formation.spring.service_025;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;
import fr.zaroumia.formation.spring.service.FormationServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class FormationServiceImplTest {

	@InjectMocks
	private FormationServiceImpl classUnderTest;

	@Mock
	private FormationDao formationDao;

	@Test
	public void shouldFindAllReturnEmptyList() {

		// Given
		when(formationDao.findAll()).thenReturn(new ArrayList<>());

		// When
		List<Formation> result = classUnderTest.findAll();

		// Then
		assertThat(result).isEmpty();
	}

	@Test
	public void shouldFindAllReturnNotEmptyList() {

		// Given
		Formation formation = new Formation(1L, "F1", "D1");
		List<Formation> formations = new ArrayList<>();
		formations.add(formation);
		when(formationDao.findAll()).thenReturn(formations);

		// When
		List<Formation> result = classUnderTest.findAll();

		// Then
		assertThat(result).isEqualTo(formations);
	}
}
