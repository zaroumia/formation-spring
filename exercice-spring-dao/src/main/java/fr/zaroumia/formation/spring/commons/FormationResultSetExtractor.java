package fr.zaroumia.formation.spring.commons;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import fr.zaroumia.formation.spring.modele.Formation;

public class FormationResultSetExtractor implements ResultSetExtractor<Formation> {

	@Override
	public Formation extractData(final ResultSet rs) throws SQLException, DataAccessException {
		Formation formation = null;
		while (rs.next()) {
			if (formation == null) {
				formation = new Formation(rs.getLong(1), rs.getString(2), rs.getString(3));
			}

			formation.getLangues().add(rs.getString(4));

		}
		return formation;
	}

}
