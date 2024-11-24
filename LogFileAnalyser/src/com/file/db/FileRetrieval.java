package com.file.db;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FileRetrieval {

    public static void retrieveFile(String username, int fileId, String outputDir) {

        String verifyUserSql = "SELECT id FROM users WHERE username = ?";
        String retrieveFileSql = "SELECT file_name, file_content FROM files WHERE file_id = ? AND user_id = ?";

        try (Connection connection = MyConnection.getConnection();
             PreparedStatement verifyUserStmt = connection.prepareStatement(verifyUserSql);
             PreparedStatement retrieveFileStmt = connection.prepareStatement(retrieveFileSql)) {

            // Verify username and password
            verifyUserStmt.setString(1, username);
            ResultSet userResult = verifyUserStmt.executeQuery();

            if (userResult.next()) {
                int userId = userResult.getInt("id");

                // Retrieve file
                retrieveFileStmt.setInt(1, fileId);
                retrieveFileStmt.setInt(2, userId);
                ResultSet fileResult = retrieveFileStmt.executeQuery();

                if (fileResult.next()) {
                    String fileName = fileResult.getString("file_name");
                    InputStream inputStream = fileResult.getBinaryStream("file_content");

                    try (FileOutputStream outputStream = new FileOutputStream(outputDir + "/" + fileName)) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;

                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                        System.out.println("File retrieved successfully!");
                    }
                } else {
                    System.out.println("File not found or you do not have access.");
                }
            } else {
                System.out.println("Invalid username or password.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

