package com.file.gui;


import com.file.parser.Highlighter;
import com.file.parser.LogFileViewer;
import com.file.parser.LogParser;
import com.file.report.ExportReport;
import com.file.report.GenerateReport;
import com.file.report.ReportView;
import com.file.util.Validation;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author mukes
 */
public class Analyze extends javax.swing.JFrame {

    /**
     * Creates new form Analyze
     */
    boolean buttonFlag = false;

    public Analyze() {
        initComponents();

        JTableHeader header = jTable1.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(
                        table, value, isSelected, hasFocus, row, column);
                label.setBackground(new Color(59, 48, 48));
                label.setFont(new Font("Algerian" , Font.BOLD , 14));
                label.setForeground(new Color(255, 240, 209));
                label.setOpaque(true);
                return label;
            }
        });


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 240, 209));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukes\\Downloads\\LogLens (1).png")); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 240, 209));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        jButton1.setText("<BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "TIMESTAMP", "THREAD", "LEVEL", "LOGGER", "MESSAGE"
                }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });

        uploadButton.setBackground(new java.awt.Color(0, 0, 0));
        uploadButton.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        uploadButton.setForeground(new java.awt.Color(255, 255, 255));
        uploadButton.setText("UPLOAD FILE");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 240, 209));
        jButton4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton4.setText("HELP...!");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton5.setText("GENERATE REPORT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton5MouseMoved(evt);
            }
        });
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });


        jButton6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton6.setText("VIEW REPORT");
        jButton6.setMaximumSize(new java.awt.Dimension(159, 26));
        jButton6.setMinimumSize(new java.awt.Dimension(159, 26));
        jButton6.setBounds(jButton5.getBounds());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton6MouseMoved(evt);
            }
        });
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });


        jButton7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton7.setText("EXPORT REPORT");
        jButton7.setMaximumSize(new java.awt.Dimension(159, 26));
        jButton7.setMinimumSize(new java.awt.Dimension(159, 26));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton7MouseMoved(evt);
            }
        });
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });


        jButton8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton8.setText("STORAGE SYSTEM");
        jButton8.setMaximumSize(new java.awt.Dimension(159, 26));
        jButton8.setMinimumSize(new java.awt.Dimension(159, 26));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton8MouseMoved(evt);
            }
        });
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 67, 67));
        jLabel1.setText(">ANALYZE");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)
                                                .addGap(155, 155, 155))
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1)
                                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                                .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton2))
                                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                                .addGap(724, 724, 724)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                                                .addGap(159, 159, 159))))
        );
        MainPanelLayout.setVerticalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jButton4))))
                                .addGap(27, 27, 27)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(uploadButton)
                                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton5)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(131, 131, 131))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // home h = new home();
        // AboutUs ab = new AboutUs();
        this.setVisible(false);
        // h.setVisible(true);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String[] steps = {
                "Upload File for Loading data",
                "Parse Data for Processing data",
                "Generate Report for Analyze the file make charts and files",
                "view Report for view the charts and report",
                "Storage system for store report or files for future use",
                "Export Report for Saving results...",
                "Process completed successfully!"
        };

        // Show each step in a JOptionPane
        for (int i = 0; i < steps.length; i++) {
            JOptionPane.showMessageDialog(null, "Step " + (i + 1) + ": " + steps[i], "Step " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
        }
    }
    String filePath;
    boolean generated = false;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // Step 1: Load log entries
        String logFilePath = filePath; // Log file path
        String reportFilePath = "C:\\Users\\mukes\\OneDrive\\Documents\\NetBeansProjects\\JavaPractice\\log_report.txt"; // Report output path

        try{
        List<String> logEntries = Files.readAllLines(Paths.get(logFilePath));
        if (logEntries.isEmpty()) {
            JOptionPane.showMessageDialog(null,"The log file is empty. No report generated.");
            return;
        }

        // Step 2: Analyze log entries using multithreading
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Shared data structures
        ConcurrentHashMap<String, AtomicLong> logLevelCounts = new ConcurrentHashMap<>();
        AtomicLong totalResponseTime = new AtomicLong(0);
        AtomicLong peakMemoryUsage = new AtomicLong(0);
        List<Date> timestamps = Collections.synchronizedList(new ArrayList<>());

        int chunkSize = (logEntries.size() + numThreads - 1) / numThreads;
        List<Future<Void>> futures = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, logEntries.size());
            List<String> chunk = logEntries.subList(start, end);

            futures.add(executor.submit(() -> {
                GenerateReport.processChunk(chunk, logLevelCounts, totalResponseTime, peakMemoryUsage, timestamps);
                return null;
            }));
        }

        for (Future<Void> future : futures) {
            future.get(); // Wait for all threads to complete
        }
        executor.shutdown();

        // Step 3: Aggregate results
        long totalEntries = logEntries.size();
        Date firstEntry = Collections.min(timestamps);
        Date lastEntry = Collections.max(timestamps);
        String logFormat = "Plaintext"; // Assume plaintext for simplicity
        long fileSizeInKB = Files.size(Paths.get(logFilePath)) / 1024;

        // Step 4: Generate the report
        GenerateReport.generateReport(reportFilePath, logFilePath, fileSizeInKB, logFormat, totalEntries, firstEntry,
                lastEntry, logLevelCounts, totalResponseTime.get(), peakMemoryUsage.get());

        JOptionPane.showMessageDialog(null,"Detailed log analysis report generated successfully: " + reportFilePath);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
    }

        buttonFlag = true;
        generated =true;
    }
    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(Color.WHITE);
    }

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
    }
    private void jButton5MouseMoved(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton5.setBackground(Color.BLACK);
        jButton5.setForeground(Color.WHITE);
    }

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
    }
    private void jButton6MouseMoved(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton6.setBackground(Color.BLACK);
        jButton6.setForeground(Color.WHITE);
    }

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton6.setBackground(Color.WHITE);
        jButton6.setForeground(Color.BLACK);
    }

    private void jButton7MouseMoved(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton7.setBackground(Color.BLACK);
        jButton7.setForeground(Color.WHITE);
    }

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton7.setBackground(Color.WHITE);
        jButton7.setForeground(Color.BLACK);
    }
    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton8.setBackground(Color.WHITE);
        jButton8.setForeground(Color.BLACK);
    }

    private void jButton8MouseMoved(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jButton8.setBackground(Color.BLACK);
        jButton8.setForeground(Color.WHITE);
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(buttonFlag != true){
            JOptionPane.showMessageDialog(null ,  "You Need to Upload File First","Failure", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(generated != true){
            JOptionPane.showMessageDialog(null ,  "To view Report You Need to Generate report First","Failure", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JFrame frame = new JFrame("Log Report Viewer");
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        JTextArea p = new JTextArea();
        p.setSize(600,900);
        p.setBackground(new Color(242,242,242));
        p.setForeground(new Color(0,0,0));
        p.setEditable(false);
        p.setFont(new Font("Times New Roman" , Font.PLAIN, 15));
        JScrollPane scrollPane = new JScrollPane(p);
        frame.add(scrollPane, BorderLayout.CENTER);

        String pathofGeneratedFile = "C:\\Users\\mukes\\OneDrive\\Documents\\NetBeansProjects\\JavaPractice\\log_report.txt";
        try {
            String fileContent = ReportView.readFileContent(pathofGeneratedFile);
            p.setText(fileContent);
        } catch (IOException e) {
            p.setText("Error loading file content: " + e.getMessage());
        }
        frame.setVisible(true);
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Storage s = new Storage();
        this.setVisible(false);
        s.setVisible(true);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String exportedReportPath = "C:\\Users\\mukes\\OneDrive\\Documents\\NetBeansProjects\\JavaPractice\\log_report.txt";
        ExportReport.export(exportedReportPath);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String searchWord = jTextField1.getText().trim();
        jTable1.repaint();
        jTable1.setDefaultRenderer(Object.class, new Highlighter(searchWord));
    }

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:


        final int totalFileSize = 100;
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(MainPanel);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();

            if (!Validation.validateLogFile(selectedFile)) {
                JOptionPane.showMessageDialog(null, "Please select a valid .log file.", "Invalid File", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Create a progress bar
            JProgressBar progressBar = new JProgressBar(0, totalFileSize);
            progressBar.setStringPainted(true);
            progressBar.setBackground(Color.BLACK);
            progressBar.setForeground(Color.GREEN);
            progressBar.setFont(new Font("Algerian", Font.BOLD, 14));
            progressBar.setOpaque(true);
            progressBar.setBounds(uploadButton.getBounds()); // Match button size and position

            // Replace the button with the progress bar
            MainPanel.remove(uploadButton);
            MainPanel.add(progressBar);
            MainPanel.revalidate();
            MainPanel.repaint();

            LogParser task = new LogParser(selectedFile, progressBar);
            new Thread(() -> {
                try {
                    List<String[]> parsedData = task.processFile();

                    SwingUtilities.invokeLater(() -> {
//                        for (String[] row : parsedData) {
//                            tableModel.addRow(row);
//                        }
                        LogFileViewer.loadDataToTable(parsedData , jTable1);
                        JOptionPane.showMessageDialog(null, "File upload and parsing complete!", "Success", JOptionPane.INFORMATION_MESSAGE);

                        // Reset UI
                        MainPanel.remove(progressBar);
                        MainPanel.add(uploadButton);
                        uploadButton.setEnabled(true);
                        MainPanel.revalidate();
                        MainPanel.repaint();
                    });

                } catch (ExecutionException | InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            buttonFlag = true;
        }
        
    }



    // Variables declaration - do not modify
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton uploadButton;
    // End of variables declaration
}

