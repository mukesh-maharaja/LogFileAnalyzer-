package com.file.util;
import org.mindrot.jbcrypt.BCrypt;

public class Encryption {

    public static String hashPassword(String password){

        return BCrypt.hashpw(password , BCrypt.gensalt(12));
    }

    public static boolean checkPassword(String password , String hashed){
        return BCrypt.checkpw(password , hashed);
    }
}
