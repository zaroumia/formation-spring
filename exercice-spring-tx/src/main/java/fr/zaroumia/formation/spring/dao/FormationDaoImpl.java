package fr.zaroumia.formation.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.zaroumia.formation.spring.modele.Formation;

@Repository
public class FormationDaoImpl implements FormationDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public void create(final Formation formation) {

		String query = "insert into formations values(:id,:titre, :descriptif)";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("titre", formation.getTitre());
		params.addValue("descriptif", formation.getDescriptif());
		params.addValue("id", formation.getId());
		jdbcTemplate.update(query, params);
	}

	@Override
	public void createLangue(final Formation formation, final String langue) {
		String query = "insert into langues values(:id,:langue)";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", formation.getId());
		params.addValue("langue", langue);
		jdbcTemplate.update(query, params);
	}

	@Override
	public void update(final Formation formation) {
		String query = "update formations set titre=:titre, descriptif=:descriptif where id=:id";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("titre", formation.getTitre());
		params.addValue("descriptif", formation.getDescriptif());
		params.addValue("id", formation.getId());
		jdbcTemplate.update(query, params);

	}

	@Override
	public void delete(final Formation formation) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", formation.getId());
		jdbcTemplate.update(" delete from formations where id=:id", params);
	}

	@Override
	public Formation find(final Long id) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);
		String query = "select * from formations f where  f.id=:id";
		return jdbcTemplate.query(query, params, new FormationRowMapper()).get(0);
	}

	@Override
	public List<Formation> findAll() {
		return jdbcTemplate.query("select * from formations", new FormationRowMapper());
	}

	@Override
	public String findTitreParId(final Long id) {
		String query = "Select f.titre from formations f where f.id=:id";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);
		return jdbcTemplate.queryForObject(query, params, String.class);
	}

}
