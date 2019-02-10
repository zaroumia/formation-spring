package fr.zaroumia.formation.spring.dao._002;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.zaroumia.formation.spring.commons.FormationResultSetExtractor;
import fr.zaroumia.formation.spring.commons.FormationRowCallBackHandler;
import fr.zaroumia.formation.spring.commons.FormationRowMapper;
import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;

@Repository
public class FormationDaoImpl implements FormationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource dataSource;

	@Override
	public int getCountFormations() {
		return jdbcTemplate.queryForObject("Select count(*) from formations ", Integer.class);

	}

	// TODO RowMapper
	@Override
	public List<Formation> findAll() {
		return jdbcTemplate.query("select * from formations", new FormationRowMapper());
	}

	// TODO SelectAllFormations
	// public List<Formation> findAll() {
	// return new SelectAllFormations(dataSource).execute();
	// }

	// TODO ResultSetExtractor
	@Override
	public Formation findAvecLangues(final Long id) {
		return jdbcTemplate
				.query("select f.id, f.titre, f.descriptif, l.langue from formations f, langues l where f.id=l.id_formation and f.id="
						+ id, new FormationResultSetExtractor());

	}

	// TODO RowCallbackHandler
	@Override
	public void extractToCsv() {
		jdbcTemplate.query("select * from formations", new FormationRowCallBackHandler());
	}

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
	public int getCountFormationsParLangue(final String langue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String findTitreParId(final Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
