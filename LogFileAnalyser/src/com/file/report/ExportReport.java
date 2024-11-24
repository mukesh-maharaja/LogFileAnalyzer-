package com.file.report;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ExportReport {

        public static void export(String path){
            String customFileName = JOptionPane.showInputDialog(
                    null,
                    "Enter a name for the exported report (without extension):",
                    "Export Report",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (customFileName == null || customFileName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Export canceled. File name cannot be empty.");
                return;
            }

            String exportDirectory = "D:\\Exported_Reports\\";
            File directory = new File(exportDirectory);
            if(!directory.exists()){
                directory.mkdirs();
            }

            String exportFilePath = exportDirectory + customFileName.trim() +".txt";
            File exportFile = new File(exportFilePath);

            if (exportFile.exists()) {
                int overwriteOption = JOptionPane.showConfirmDialog(
                        null,
                        "File already exists. Do you want to overwrite it?",
                        "Overwrite Confirmation",
                        JOptionPane.YES_NO_OPTION
                );

                if (overwriteOption != JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Export canceled.");
                    return;
                }
            }

            try{
                Files.copy(Paths.get(path) ,exportFile.toPath() , StandardCopyOption.REPLACE_EXISTING);
                JOptionPane.showMessageDialog(null, "Report exported successfully to: " + exportFilePath);
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error exporting report: " + e.getMessage());
            }
        }
}
