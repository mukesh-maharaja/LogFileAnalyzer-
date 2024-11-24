package com.file.db;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FileStorage {

    public static void storeFile(String username, String filePath) {

        String verifyUserSql = "SELECT id FROM users WHERE username = ?";
        String insertFileSql = "INSERT INTO files (user_id, file_name, file_content) VALUES (?, ?, ?)";

        try (Connection connection = MyConnection.getConnection();
             PreparedStatement verifyUserStmt = connection.prepareStatement(verifyUserSql);
             PreparedStatement insertFileStmt = connection.prepareStatement(insertFileSql);
             FileInputStream inputStream = new FileInputStream(new File(filePath))) {

            verifyUserStmt.setString(1, username);
            ResultSet resultSet = verifyUserStmt.executeQuery();

            if (resultSet.next()) {
                int userId = resultSet.getInt("id");

                File file = new File(filePath);
                insertFileStmt.setInt(1, userId);
                insertFileStmt.setString(2, file.getName());
                insertFileStmt.setBinaryStream(3, inputStream, (int) file.length());

                int rowsInserted = insertFileStmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("File uploaded successfully!");
                }
            } else {
                System.out.println("Invalid username or password.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

