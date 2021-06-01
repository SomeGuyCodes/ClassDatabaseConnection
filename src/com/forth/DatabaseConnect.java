package com.forth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

    public class DatabaseConnect {

        public static void main(String[] args) {

            // TODO Auto-generated method stub
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://studentdatabase.cwokrilc5p7r.us-east-2.rds.amazonaws.com:3306/studentDATA";
            final String USER = "admin123";
            final String PASS = "admin123";

            Connection conn = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Connecting to database...");

                conn = DriverManager.getConnection(DB_URL,USER,PASS);

                System.out.println("Creating table in given database...");
                Statement stmt = conn.createStatement();
                String sql = "INSERT INTO `testTable` (`AccountID`,`firstName`,`lastName`,`age`) VALUES ( 4,'Jay','C',21);";
/*
		      String sql = "CREATE TABLE testTable " +
		                   "(AccountId INTEGER not NULL, " +
		                   " firstName VARCHAR(255), " +
		                   " lastName VARCHAR(255), " +
		                   " age INTEGER(30));";
*/
                stmt.executeUpdate(sql);
                System.out.println("Created table in given database...");

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }



