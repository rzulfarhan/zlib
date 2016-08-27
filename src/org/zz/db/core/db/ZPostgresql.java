/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zz.db.core.db;

/**
 *
 * @author Reza Zulfarhan
 * descriptions : this class for postgresql
 * 
 */

import java.sql.*;

public class ZPostgresql {
    private String username, password, url, databasename;
    public Connection conn;
    public ZPostgresql() {
        try {
            Class.forName("org.mysql.Driver").newInstance();
            databasename = "zlibme";
            url = "jdbc:postgresql://localhost:5432/" + databasename;
            System.out.println(url);
            username = "postgres";
            password = "admin123!";

            try {
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("Connections success");
            } catch (SQLException e) {
                System.out.println("Connections failed, please check your database name, username and password");
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Cant access database driver");
            System.out.println(e);

        }
    }

    public static void main(String[] args){
        new ZPostgresql();
    }

}
