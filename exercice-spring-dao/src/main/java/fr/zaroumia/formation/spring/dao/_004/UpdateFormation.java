package fr.zaroumia.formation.spring.dao._004;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class UpdateFormation extends SqlUpdate {

	private static final String QUERY = "Update formations set titre=:titre , descriptif=:descriptif where id=:id";

	public UpdateFormation(final DataSource dataSource) {
		super(dataSource, QUERY);
		declareParameter(new SqlParameter("titre", Types.VARCHAR));
		declareParameter(new SqlParameter("descriptif", Types.VARCHAR));
		declareParameter(new SqlParameter("id", Types.INTEGER));
	}

}
