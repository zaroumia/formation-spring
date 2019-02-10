package fr.zaroumia.formation.spring.dao._000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.zaroumia.formation.spring.modele.Formation;

public class JdbcMain {

	// JDBC database URL
	static final String DB_URL = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7268119";

	// Database credentials
	static final String USERNAME = "sql7268119";
	static final String PASSWORD = "******";

	public static void main(final String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {

			// Ouvrir une connexion
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

			// créer un statement
			stmt = conn.createStatement();

			// Exécuter une requête
			String sql = "SELECT id, titre, descriptif  FROM formations";
			rs = stmt.executeQuery(sql);

			// Extraire les données
			while (rs.next()) {
				long id = rs.getLong("id");
				String titre = rs.getString("titre");
				String descriptif = rs.getString("descriptif");

				Formation formation = new Formation(id, titre, descriptif);

				System.out.println(formation);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// Fermer la connexion
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se2) {
			}

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

}
