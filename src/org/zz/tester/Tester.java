package org.zz.tester;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

import org.zz.db.core.db.ZMysql;

public class Tester {

	@SuppressWarnings("unchecked")
	public Tester() throws SQLException {
		@SuppressWarnings("rawtypes")
		HashMap Mysqlmaps = new HashMap();
		Mysqlmaps.put("dbname", "zdev");
		Mysqlmaps.put("dbusername", "zdev");
		Mysqlmaps.put("dbpassword", "zdev");
		Mysqlmaps.put("dburl", "zdev");
		Mysqlmaps.put("dbport", "zdev");

		ZMysql mysql = new ZMysql();
		Connection connection = mysql.Open(Mysqlmaps);
		
	}

	public static void main(String args[]) throws SQLException {
		new Tester();
	}
}
