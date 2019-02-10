package fr.zaroumia.formation.spring.dao._004;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.zaroumia.formation.spring.commons.FormationResultSetExtractor;
import fr.zaroumia.formation.spring.commons.FormationRowCallBackHandler;
import fr.zaroumia.formation.spring.commons.FormationRowMapper;
import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;

@Repository
public class FormationDaoImpl implements FormationDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource dataSource;

	@Override
	public int getCountFormations() {
		return jdbcTemplate.queryForObject("Select count(*) from formations ", new HashMap<>(), Integer.class);

	}

	// ResultSetExtractor
	@Override
	public Formation findAvecLangues(final Long id) {
		String query = "select f.id, f.titre, f.descriptif, l.langue from formations f , langues l where f.id= l.id_formation and f.id=:id";
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);

		return jdbcTemplate.query(query, params, new FormationResultSetExtractor());
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
		String query = "INSERT INTO formations values(:id,:titre,:descriptif)";
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("id", formation.getId());
		mapSqlParameterSource.addValue("titre", formation.getTitre());
		mapSqlParameterSource.addValue("descriptif", formation.getDescriptif());
		jdbcTemplate.update(query, mapSqlParameterSource);
	}

	@Override
	public void update(final Formation formation) {

		String query = "Update formations set titre=:titre ,descriptif=:descriptif where id=:id";
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("id", formation.getId());
		mapSqlParameterSource.addValue("titre", formation.getTitre());
		mapSqlParameterSource.addValue("descriptif", formation.getDescriptif());
		jdbcTemplate.update(query, mapSqlParameterSource);
	}

	// @Override
	// public void update(final Formation formation) {
	//
	// Map<String, Object> paramMap = new HashMap<>();
	// paramMap.put("id", formation.getId());
	// paramMap.put("titre", formation.getTitre());
	// paramMap.put("descriptif", formation.getDescriptif());
	// new UpdateFormation(dataSource).updateByNamedParam(paramMap);
	// }

	@Override
	public void delete(final Formation formation) {
		String query = "delete from formations where id=:id";
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("id", formation.getId());
		jdbcTemplate.update(query, mapSqlParameterSource);
	}

	@Override
	public Formation find(final Long id) {
		String query = "Select * from formations where id=:id";
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("id", id);
		return jdbcTemplate.query(query, mapSqlParameterSource, new FormationRowMapper()).get(0);
	}

	@Override
	public int getCountFormationsParLangue(final String langue) {
		String query = "select count(*) from formations f , langues l where f.id= l.id_formation and l.langue=:langue";
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("langue", langue);

		return jdbcTemplate.queryForObject(query, mapSqlParameterSource, Integer.class);

	}

	@Override
	public String findTitreParId(final Long id) {
		String query = "Select titre from formations where id=:id";
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("id", id);

		return jdbcTemplate.queryForObject(query, mapSqlParameterSource, String.class);
	}

	@Override
	public void create(final Collection<Formation> formations) {
		BatchCreateFormation batchCreateFormation = new BatchCreateFormation(dataSource);

		for (Formation formation : formations) {
			Map<String, Object> paramMap = new HashMap<>();
			paramMap.put("id", formation.getId());
			paramMap.put("titre", formation.getTitre());
			paramMap.put("descriptif", formation.getDescriptif());
			batchCreateFormation.updateByNamedParam(paramMap);
		}
	}

}
