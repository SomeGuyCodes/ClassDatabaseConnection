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
            final String DB_URL = "jdbc:mysql://studentdatabase.cwokrilc5p7r.us-east-2.rds.amazonaws.com:3306/StudentData";
            final String USER = "admin123";
            final String PASS = "admin123";

            Connection conn = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Connecting to database...");

                conn = DriverManager.getConnection(DB_URL,USER,PASS);

                System.out.println("Creating table in given database...");
                Statement stmt = conn.createStatement();
                /*String sql = "INSERT INTO `studentInfo` (`AccountId`,`firstname`,`lastName`,`phoneNumber`" +
                        "" +
                        ",`ssn`,`gpa`,`email`) VALUES ( 1234,'Tom','Cruise',2138456709,893578820,3.4,'www.thecruise@scientology.net');";*/

		     /* String sql = "CREATE TABLE studentInfo " +
		                   "(AccountId INTEGER not NULL, " +
		                   " firstName VARCHAR(255), " +
		                   " lastName VARCHAR(255), " +
		                   " phoneNumber INTEGER(30)," +
                           " ssn INTEGER(30)," +
                           " gpa DOUBLE(2,1)," +
                           " email VARCHAR(255));"; */
                String sql = "SELECT COUNT(*) FROM studentInfo;";
                ResultSet rs = stmt.executeQuery(sql);
                //stmt.executeQuery(sql);
                //stmt.executeUpdate(sql);
                System.out.println("Created table in given database...");
                rs.next();
                int count = rs.getInt(1);
                System.out.println(count);

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }



