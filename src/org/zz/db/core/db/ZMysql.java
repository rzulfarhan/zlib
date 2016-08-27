package org.zz.db.core.db;

/**
 *
 * @author Reza Zulfarhan
 * descriptions : this class for mysql
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class ZMysql {

	private String username, password, url, databasename;
	public Connection conn;

	@SuppressWarnings("rawtypes")
	public Connection Open(HashMap dbconfig) throws SQLException {
		Connection connection = null;
		String dburl = "http://localhost";
		String dbport = "3306";
		String dbname = (String) dbconfig.get("dbname");
		String dbusername = "root";
		String dbpassword = "";

		/*
		 * Connection connection = null; try {
		 * Class.forName("com.mysql.jdbc.Driver").newInstance(); connection =
		 * DriverManager.getConnection(url+databasename, username, password);
		 * return connection; } catch (SQLException se) {
		 * System.out.println("No Connection Open : " + se); return null; }
		 * catch (Exception ex) {
		 * System.out.println("Cound not open connection : " + ex); return null;
		 * }
		 */
		return null;
	}

}
