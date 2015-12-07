package fr.uvsq.coo.ex4_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:derby:PersonnelDB";
		// String tablePersonnel = "Personnel";

		// jdbc Connection
		Connection conn = null;
		Statement stmt = null;

		try {
			// Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			// Get a connection
			conn = DriverManager.getConnection(dbURL);
			stmt = conn.createStatement();

			// int i = stmt
			// .executeUpdate("create table Personnel(id int, nomPersonnel varchar(40), prenomPersonnel varchar(40), dateNAissance Date, poste varchar(40)) ");

			// stmt.executeUpdate("insert into Personnel values(0,'Dubois','Lea','1985-04-02','Secretaire')");
			ResultSet results = stmt.executeQuery("select * from Personnel");
			ResultSetMetaData rsmd = results.getMetaData();
			int numberCols = rsmd.getColumnCount();
			for (int i = 1; i <= numberCols; i++) {
				// print Column Names
				System.out.print(rsmd.getColumnLabel(i) + "\t\t");
			}

			System.out
					.println("\n-------------------------------------------------");

			while (results.next()) {
				int id = results.getInt(1);
				String restName = results.getString(2);
				String cityName = results.getString(3);
				System.out.println(id + "\t\t" + restName + "\t\t" + cityName);
			}
			results.close();
			stmt.close();
		} catch (Exception except) {
			except.printStackTrace();
		}

	}

}
