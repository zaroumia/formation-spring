package fr.zaroumia.formation.spring.dao._003;

import java.util.List;

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

	@Override
	public int getCountFormations() {
		return jdbcTemplate.queryForObject("Select count(*) from formations ", Integer.class);

	}

	// ResultSetExtractor
	@Override
	public Formation findAvecLangues(final Long id) {
		String query = "select f.id, f.titre, f.descriptif, l.langue from formations f , langues l where f.id= l.id_formation and f.id="
				+ id;
		return jdbcTemplate.query(query, new FormationResultSetExtractor());
	}

	// RowCallbackHandler
	@Override
	public void extractToCsv() {
		jdbcTemplate.query("select * from formations", new FormationRowCallBackHandler());

	}

	// RowMapper
	@Override
	public List<Formation> findAll() {
		return jdbcTemplate.query("select * from formations", new FormationRowMapper());
	}

	@Override
	public void create(final Formation formation) {
		String query = "INSERT INTO formations values(?,?,?)";
		jdbcTemplate.update(query, formation.getId(), formation.getTitre(), formation.getDescriptif());
	}

	@Override
	public void update(final Formation formation) {

		String query = "Update formations set titre=? , descriptif=? where id=?";
		jdbcTemplate.update(query, formation.getTitre(), formation.getDescriptif(), formation.getId());
	}

	@Override
	public void delete(final Formation formation) {
		String query = "delete from formations where id=?";
		jdbcTemplate.update(query, formation.getId());
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
