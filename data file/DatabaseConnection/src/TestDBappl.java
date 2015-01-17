import java.sql.*;

import database.DatabaseConnection;


public class TestDBappl {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Statement statement = DatabaseConnection.getDatabaseConnection("root", "12345.com");

	}
}
