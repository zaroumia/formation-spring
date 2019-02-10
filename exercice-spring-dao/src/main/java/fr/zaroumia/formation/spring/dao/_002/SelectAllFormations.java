package fr.zaroumia.formation.spring.dao._002;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.object.MappingSqlQuery;

import fr.zaroumia.formation.spring.modele.Formation;

public class SelectAllFormations extends MappingSqlQuery<Formation> {

	private static final String QUERY = "select * from formations";

	public SelectAllFormations(final DataSource dataSource) {
		super(dataSource, QUERY);
	}

	@Override
	protected Formation mapRow(final ResultSet rs, final int rowNum) throws SQLException {
		return new Formation(rs.getLong(1), rs.getString(2), rs.getString(3));

	}

}
