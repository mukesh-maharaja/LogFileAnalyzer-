package com.file.report;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReportView {

    public static String readFileContent(String filepath) throws IOException {
           StringBuilder sb = new StringBuilder();

           try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){

               String line;
               while((line = reader.readLine()) != null){
                   sb.append(line).append("\n");
               }
           }

           return sb.toString();
    }
}
