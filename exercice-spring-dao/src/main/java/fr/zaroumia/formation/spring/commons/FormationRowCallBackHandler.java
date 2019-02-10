package fr.zaroumia.formation.spring.commons;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

public class FormationRowCallBackHandler implements RowCallbackHandler {

	@Override
	public void processRow(final ResultSet rs) throws SQLException {

		StringBuilder stringBuilder = new StringBuilder().append(rs.getString(1)).append(";").append(rs.getString(2))
				.append(";").append(rs.getString(3)).append("\n");
		Path path = Paths.get("src/main/resources", "formations.csv");

		try {
			if (!Files.exists(path)) {
				Files.createFile(path);
			}

			Files.write(path, stringBuilder.toString().getBytes(), StandardOpenOption.APPEND);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
