package fr.zaroumia.formation.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.zaroumia.formation.spring.model.Formateur;

public class FormateurRowMapper implements RowMapper<Formateur> {

	@Override
	public Formateur mapRow(final ResultSet rs, final int rowNum) throws SQLException {
		Formateur f = new Formateur();
		f.setId(rs.getLong(1));
		f.setNom(rs.getString(2));
		f.setPrenom(rs.getString(3));
		f.setAge(rs.getInt(4));
		return f;
	}

}
