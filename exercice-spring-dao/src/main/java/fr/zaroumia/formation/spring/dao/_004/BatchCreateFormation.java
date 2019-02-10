package fr.zaroumia.formation.spring.dao._004;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.BatchSqlUpdate;

public class BatchCreateFormation extends BatchSqlUpdate {

	private static final String QUERY = "INSERT INTO formations values(:id,:titre,:descriptif)";

	BatchCreateFormation(final DataSource dataSource) {
		super(dataSource, QUERY);

		declareParameter(new SqlParameter(Types.INTEGER, "id"));
		declareParameter(new SqlParameter(Types.VARCHAR, "titre"));
		declareParameter(new SqlParameter(Types.VARCHAR, "descriptif"));
	}
}
