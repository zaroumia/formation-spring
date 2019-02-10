package fr.zaroumia.formation.spring.dao._001;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;

@Repository
public class FormationDaoImpl implements FormationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(final Formation formation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(final Formation formation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(final Formation formation) {
		// TODO Auto-generated method stub

	}

	@Override
	public Formation find(final Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountFormations() {
		return jdbcTemplate.queryForObject("SELECT count(*) FROM formations ", Integer.class);
	}

	@Override
	public int getCountFormationsParLangue(final String langue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void extractToCsv() {
		// TODO Auto-generated method stub

	}

	@Override
	public Formation findAvecLangues(final Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findTitreParId(final Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
