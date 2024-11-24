package com.file.report;

import java.io.*;
import java.nio.file.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class GenerateReport {


    public static void processChunk(List<String> chunk, ConcurrentHashMap<String, AtomicLong> logLevelCounts,
                                     AtomicLong totalResponseTime, AtomicLong peakMemoryUsage,
                                     List<Date> timestamps) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (String entry : chunk) {
            // Extract log level
            if (entry.contains("INFO")) logLevelCounts.computeIfAbsent("INFO", k -> new AtomicLong()).incrementAndGet();
            else if (entry.contains("DEBUG")) logLevelCounts.computeIfAbsent("DEBUG", k -> new AtomicLong()).incrementAndGet();
            else if (entry.contains("ERROR")) logLevelCounts.computeIfAbsent("ERROR", k -> new AtomicLong()).incrementAndGet();
            else if (entry.contains("WARN")) logLevelCounts.computeIfAbsent("WARN", k -> new AtomicLong()).incrementAndGet();

            // Extract response time
            if (entry.contains("Response time:")) {
                String[] parts = entry.split("Response time:");
                if (parts.length > 1) {
                    long responseTime = Long.parseLong(parts[1].trim().replace("ms", ""));
                    totalResponseTime.addAndGet(responseTime);
                }
            }

            // Extract memory usage
            if (entry.contains("Memory usage:")) {
                String[] parts = entry.split("Memory usage:");
                if (parts.length > 1) {
                    long memoryUsage = Long.parseLong(parts[1].trim().replace("MB", ""));
                    peakMemoryUsage.updateAndGet(val -> Math.max(val, memoryUsage));
                }
            }

            // Extract timestamps
            if (entry.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}.*")) {
                String timestampStr = entry.split(" ")[0] + " " + entry.split(" ")[1];
                timestamps.add(sdf.parse(timestampStr));
            }
        }
    }

    public static void generateReport(String filePath, String logFilePath, long fileSizeInKB, String logFormat,
                                       long totalEntries, Date firstEntry, Date lastEntry,
                                       ConcurrentHashMap<String, AtomicLong> logLevelCounts,
                                       long totalResponseTime, long peakMemoryUsage) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("==== Log Analysis Report ====");
            writer.newLine();
            writer.write("Log File Name: " + new File(logFilePath).getName());
            writer.newLine();
            writer.write("Log File Size: " + fileSizeInKB + " KB");
            writer.newLine();
            writer.write("Log Format: " + logFormat);
            writer.newLine();
            writer.newLine();

            writer.write("==== Overview ====");
            writer.newLine();
            writer.write("Total Log Entries: " + totalEntries);
            writer.newLine();
            writer.write("First Log Entry: " + sdf.format(firstEntry));
            writer.newLine();
            writer.write("Last Log Entry: " + sdf.format(lastEntry));
            writer.newLine();
            writer.newLine();

            writer.write("==== Log Level Counts ====");
            writer.newLine();
            for (Map.Entry<String, AtomicLong> entry : logLevelCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue().get());
                writer.newLine();
            }
            writer.newLine();

            writer.write("==== Performance Metrics ====");
            writer.newLine();
            writer.write("Average Response Time: " + (totalEntries > 0 ? (totalResponseTime / totalEntries) : 0) + " ms");
            writer.newLine();
            writer.write("Peak Memory Usage: " + peakMemoryUsage + " MB");
            writer.newLine();
            writer.newLine();

            writer.write("==== Recommendations ====");
            writer.newLine();
            writer.write("1. Address frequent errors and warnings as listed above.");
            writer.newLine();
            writer.write("2. Optimize system performance based on response times and memory usage trends.");
            writer.newLine();
            writer.write("3. Review log monitoring strategies for early anomaly detection.");
            writer.newLine();
        }
    }
}

