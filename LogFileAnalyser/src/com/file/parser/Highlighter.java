package com.file.parser;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class Highlighter extends DefaultTableCellRenderer {
    private final String searchWord;

    public Highlighter(String searchWord){
        this.searchWord = searchWord.toLowerCase();
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
           Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

           if(!isSelected){
               String rowData = "";

               for(int i = 0;i < table.getColumnCount();i++){
                   Object cellVal = table.getValueAt(row , i);
                   if(cellVal != null){
                       rowData += cellVal.toString().toLowerCase() +" ";
                   }
               }

               if(rowData.contains(searchWord)){
                   cell.setBackground(new Color(255, 240, 209));
                   cell.setForeground(new Color(59, 48, 48));
               }
               else{
                   cell.setBackground(new Color(242 , 242 , 242));
                   cell.setForeground(new Color(0 ,0 ,0));
               }
           }

           return cell;
    }
}
