package com.file.db;

import com.file.util.Encryption;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

    public static boolean registerUser(String username, String email, String password) {
          String hashedPassword = Encryption.hashPassword(password);

          try(Connection con = MyConnection.getConnection()){
              String query = "INSERT INTO users (username , email , password) VALUES (? , ? , ?)";

              PreparedStatement stmt = con.prepareStatement(query);
              stmt.setString(1 , username);
              stmt.setString(2 , email);
              stmt.setString(3 , hashedPassword);

              int rows = stmt.executeUpdate();

              return rows > 0;
          }
          catch(SQLException e){
              e.printStackTrace();
              return false;
          }
    }

    public static boolean loginUser(String username , String password){
        try(Connection con = MyConnection.getConnection()){
            String query = "SELECT password FROM users WHERE username = ?";

            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1 , username);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                String hashed = rs.getString("password");
                return Encryption.checkPassword(password , hashed);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }

        return false;
    }

    public static boolean isUsernameOrEmailExists(String username, String email) {
        try(Connection con = MyConnection.getConnection()){
             String query = "SELECT * FROM users WHERE username = ? OR email = ?";
             PreparedStatement stmt = con.prepareStatement(query);
             stmt.setString(1 , username);
             stmt.setString(2 , email);

            ResultSet rs = stmt.executeQuery();

            return rs.next();
        }
        catch(SQLException e){
            e.printStackTrace();
            return true;
        }
    }
}
