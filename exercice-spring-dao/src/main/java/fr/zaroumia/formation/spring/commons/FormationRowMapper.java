package fr.zaroumia.formation.spring.commons;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.zaroumia.formation.spring.modele.Formation;

public class FormationRowMapper implements RowMapper<Formation> {

	@Override
	public Formation mapRow(final ResultSet rs, final int rowNum) throws SQLException {
		return new Formation(rs.getLong(1), rs.getString(2), rs.getString(3));
	}

}
