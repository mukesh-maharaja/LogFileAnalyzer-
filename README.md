# Log File Analyzer 📜🔍

**Log File Analyzer** is a multithreaded Java application designed to parse, analyze, and generate insightful reports from log files, specifically tailored for Log4j log formats. This tool offers functionalities to upload, view, filter, and export reports, making log management efficient and user-friendly.

---

## Features ✨

1. **Log Parsing**:  
   - Reads and processes Log4j-formatted log files to extract meaningful information.
   
2. **Log Analysis**:  
   - Identifies key events like errors, warnings, and custom patterns.
   - Filters logs by date, severity, or keywords.
   
3. **Report Generation**:  
   - Generates summaries, such as the number of errors, warnings, and other custom metrics.
   - Provides visualized statistics for deeper insights.

4. **View Reports**:  
   - Displays detailed or summarized reports in the terminal.

5. **Export Reports**:  
   - Saves analyzed data and summaries to external files in formats like `.txt`, `.csv`, or `.json`.

6. **File Upload Support**:  
   - Allows users to upload and process multiple log files.

7. **Multithreading for Efficiency**:  
   - Processes large log files efficiently by leveraging multithreading to handle parsing and analysis concurrently.

---

## How to Use 🕹️

### 1. Run the Program
- **Compile**:  
  ```bash
  javac LogFileAnalyzer.java
  ```
- **Run**:  
  ```bash
  java LogFileAnalyzer
  ```

### 2. Functionalities
- **Upload Log File**:  
  Upload a log file for parsing and analysis.
  
- **Analyze Log File**:  
  Perform filtering and analysis with commands like:
  - Filter by severity: `ERROR`, `WARNING`, `INFO`
  - Filter by date range: `2024-11-01 to 2024-11-19`
  - Search for keywords: `"database"`

- **Generate Report**:  
  Create a summary of the analyzed logs (e.g., error counts, top occurrences).

- **View Report**:  
  Display the generated report in the terminal.

- **Export Report**:  
  Save the report to a `.txt`, `.csv`, or `.json` file for external use.

---

## Example Usage 🎯

### Sample Log File (`logs.log`):
```
2024-11-19 10:15:32 ERROR Failed to connect to the database.
2024-11-19 10:16:12 INFO  Connection established successfully.
2024-11-19 10:18:45 WARNING Disk space running low.
2024-11-19 10:20:00 ERROR Application crashed unexpectedly.
```

### Commands:
**Filter by Severity**:
```bash
java LogFileAnalyzer --filter ERROR
```

**Generate Report**:
```bash
java LogFileAnalyzer --generate-report logs.log
```

**Export Report**:
```bash
java LogFileAnalyzer --export logs_report.csv
```

---

## Requirements 🛠️
- **Java 8 or Later**: Ensure you have the Java Development Kit (JDK) installed.
- **Log4j Log Files**: The application is optimized for Log4j format but can be adapted for other formats.

---

## Installation 🚀

1. Clone the Repository:
   ```bash
   git clone https://github.com/your-username/LogFileAnalyzer.git
   cd LogFileAnalyzer
   ```

2. Compile the Code:
   ```bash
   javac LogFileAnalyzer.java
   ```

3. Run the Application:
   ```bash
   java LogFileAnalyzer
   ```

---

## Implementation Details ⚙️

1. **Multithreading**:
   - Log parsing and analysis are handled in separate threads to improve performance for large files.

2. **Log Parsing**:
   - Uses regular expressions to extract date, severity, and message fields.
   - Supports Log4j patterns like `YYYY-MM-DD HH:MM:SS [SEVERITY] Message`.

3. **Report Generation**:
   - Summarizes the frequency of events like errors or warnings.
   - Customizable to include additional metrics.

4. **File Handling**:
   - Supports uploading multiple files sequentially or in batches.

---

## To-Do List 📝
- Add support for JSON and XML log formats.
- Integrate a GUI for user-friendly interactions.
- Implement email notifications for critical events detected in logs.
- Add real-time log monitoring features.

---

## Contributing 🤝
Contributions are welcome! If you have suggestions or want to enhance functionality, feel free to create a pull request.

---

## License 📜
This project is licensed under the MIT License. See the `LICENSE` file for details.

