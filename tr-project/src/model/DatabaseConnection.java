package model;
/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String URL_DB_TEST = "jdbc:mysql://localhost/db5";
	private static DatabaseConnection dbc = null;
	private Statement sqlSt;

	private DatabaseConnection(String url, String userName, String password)
			throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_NAME);
		Connection connection = DriverManager.getConnection(url, userName,
				password);
		this.sqlSt = connection.createStatement();
	}

	public static Statement getDatabaseConnection(String userName,
			String password) throws ClassNotFoundException, SQLException {
		if (dbc == null) {
			dbc = new DatabaseConnection("jdbc:mysql://localhost/db5",
					userName, password);
		}
		return dbc.sqlSt;
	}

	public static Statement getDatabaseConnection(String url, String userName,
			String password) throws ClassNotFoundException, SQLException {
		if (dbc == null) {
			dbc = new DatabaseConnection(url, userName, password);
		}
		return dbc.sqlSt;
	}
}