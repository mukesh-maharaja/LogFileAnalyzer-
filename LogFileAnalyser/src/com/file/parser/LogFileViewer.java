package com.file.parser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class LogFileViewer {

    public static void loadDataToTable(List<String[]> parsedData , JTable table1){
               if(parsedData.isEmpty()){
                   JOptionPane.showMessageDialog(null , "No data to load", "Info", JOptionPane.INFORMATION_MESSAGE);
                   return;
               }

        int columnCount = table1.getColumnCount();

        String[][] rowData = parsedData.toArray(new String[0][columnCount]);

        DefaultTableModel model = (DefaultTableModel) table1.getModel();

        model.setRowCount(0);

        for (String[] row : rowData) {
            model.addRow(row);
        }
    }
}
