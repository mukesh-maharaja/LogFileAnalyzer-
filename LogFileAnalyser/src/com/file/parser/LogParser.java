package com.file.parser;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LogParser{
    private final File logFile;
    private final JProgressBar progressBar;

    public LogParser(File logFile , JProgressBar progressBar) {
        this.logFile = logFile;
        this.progressBar = progressBar;
    }

    public List<String[]> processFile() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<List<String[]>> task = this::parseLogFile;

        Future<List<String[]>> future = executor.submit(task);

        // Simulate progress bar update
        new Thread(() -> {
            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(5);
                    progressBar.setValue(i);
                    progressBar.setString(i + "%");
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }).start();

        // Wait for the parsing to complete
        List<String[]> result = future.get();

        executor.shutdown();
        return result;
    }

    public List<String[]> parseLogFile() throws IOException {
        List<String[]> data = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(logFile))){
            String line;

            while((line = reader.readLine()) != null){
                String[] parsedEntry = parseLogEntry(line);
                if (parsedEntry != null) {
                    data.add(parsedEntry);
                }
            }
        }

        return data;
    }


    public String[] parseLogEntry(String logEntry){
        try {
            int firstSpace = logEntry.indexOf(" ");
            int secondSpace = logEntry.indexOf(" ", firstSpace + 1);
            String timestamp = logEntry.substring(0, secondSpace);

            int threadStart = logEntry.indexOf("[");
            int threadEnd = logEntry.indexOf("]");
            String thread = logEntry.substring(threadStart + 1, threadEnd);

            int levelEnd = logEntry.indexOf(" ", threadEnd + 2);
            String level = logEntry.substring(threadEnd + 2, levelEnd);

            int loggerEnd = logEntry.indexOf(" - ");
            String logger = logEntry.substring(levelEnd + 1, loggerEnd);

            String message = logEntry.substring(loggerEnd + 3);

            return new String[]{timestamp, thread, level, logger, message};

        } catch (Exception e) {
            return null;
        }
    }
}
