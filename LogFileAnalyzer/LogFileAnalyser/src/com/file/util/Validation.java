package com.file.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

     public static boolean isValidEmail(String email){
         String email_regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
         Pattern pattern = Pattern.compile(email_regex);
         Matcher matcher = pattern.matcher(email);
         return matcher.matches();
     }

     public static boolean isStrongPassword(String password){
          int upper = 0;
          int lower = 0;
          int dig = 0;
          int spl = 0;
          for (int i = 0;i < password.length();i++){
              char ch = password.charAt(i);

              if(Character.isUpperCase(ch)){
                  upper++;
              }
              if(Character.isLowerCase(ch)){
                  lower++;
              }
              if(Character.isDigit(ch)){
                  dig++;
              }
              if(!Character.isLetter(ch) && !Character.isWhitespace(ch) && !Character.isDigit(ch)){
                  spl++;
              }
          }

          return password.length() >= 8 && spl > 0 && dig > 0 && upper > 0 && lower > 0;
     }


     public static boolean validateLogFile(File file){
         if(!file.getName().endsWith(".log")){
             return false;
         }
         try(BufferedReader reader = new BufferedReader(new FileReader(file))){
             String firstLine = reader.readLine();

             return firstLine != null && firstLine.matches("\\d{4}-\\d{2}-\\d{2}.*");
         }
         catch (IOException e){
             e.printStackTrace();
             return false;
         }
     }
}
