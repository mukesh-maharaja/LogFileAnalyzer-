package com.file.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public static Connection getConnection() {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/FileAnalyzer";
        // Username and password for database
        String username = "root";
        String password = "Mukesh@123";
        Connection connection = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create a connection to the database
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found. Please add the MySQL connector library to your project.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database.");
            e.printStackTrace();
        }

        return connection;
    }

    public static void main(String[] args) {
        // Test the connection
        Connection conn = getConnection();
        if (conn != null) {
            try {
                // Close the connection after use
                conn.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
