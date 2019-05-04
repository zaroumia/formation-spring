package fr.zaroumia.formation.spring.dao;

import java.util.Collection;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.zaroumia.formation.spring.model.Formateur;

@Repository
public class FormateurDaoImpl implements FormateurDao {

	private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public FormateurDaoImpl(final NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		super();
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public void create(final Formateur f) {
		String query = "insert into formateurs values (:id, :nom, :prenom, :age)";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", f.getId());
		params.addValue("nom", f.getNom());
		params.addValue("prenom", f.getPrenom());
		params.addValue("age", f.getAge());
		namedParameterJdbcTemplate.update(query, params);
	}

	@Override
	public void update(final Formateur f) {
		String query = "update formateurs set nom= :nom, prenom=:prenom, age=:age where id=:id";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", f.getId());
		params.addValue("nom", f.getNom());
		params.addValue("prenom", f.getPrenom());
		params.addValue("age", f.getAge());
		namedParameterJdbcTemplate.update(query, params);
	}

	@Override
	public void delete(final Formateur f) {
		String query = "delete from formateurs where id=:id";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", f.getId());
		namedParameterJdbcTemplate.update(query, params);
	}

	@Override
	public Formateur find(final Long id) {
		String query = "select * from formateurs where id=:id";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);
		return namedParameterJdbcTemplate.queryForObject(query, params, new FormateurRowMapper());
	}

	@Override
	public Collection<Formateur> findAll() {
		String query = "select * from formateurs ";
		return namedParameterJdbcTemplate.query(query, new FormateurRowMapper());
	}

}
